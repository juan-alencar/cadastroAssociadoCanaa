package com.example.cadastroAssociadoCanaa.controller;

import com.example.cadastroAssociadoCanaa.model.Associado;

import com.example.cadastroAssociadoCanaa.model.dtos.CreateAssociadoDto;
import com.example.cadastroAssociadoCanaa.model.enums.SexoEnum;
import com.example.cadastroAssociadoCanaa.repository.AssociadoRepository;
import com.example.cadastroAssociadoCanaa.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/associado")
@CrossOrigin(origins = "*")
public class AssociadoController {

    @Autowired
    private AssociadoRepository associadoRepository;

    @PostMapping()
    public ResponseEntity<Response<Associado>>create(HttpServletRequest request, @RequestBody CreateAssociadoDto createAssociado, BindingResult result){
        Response<Associado> response = new Response<Associado>();
        try {
            validateCreateAssociado(createAssociado.getEmail(), result);
            if (result.hasErrors()) {
                result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
                return ResponseEntity.badRequest().body(response);
            }
            
            Associado associado = new Associado();

            associado.setName(createAssociado.getName());
            associado.setSexoEnum(SexoEnum.valueOf(createAssociado.getSexoEnum()));
            associado.setCreatedAt(new Date());
            associado.setBirthDate(createAssociado.getBirthDate());
            associado.setRg(createAssociado.getRg());
            associado.setCpf(createAssociado.getCpf());
            associado.setProfession(createAssociado.getProfession());
            associado.setNaturalness(createAssociado.getNaturalness());
            associado.setNationality(createAssociado.getNationality());
            associado.setUfNationality(createAssociado.getUfNationality());
            associado.setVoterRegistration(createAssociado.getVoterRegistration());
            associado.setElectoralZone(createAssociado.getElectoralZone());
            associado.setCep(createAssociado.getCep());
            associado.setStreet(createAssociado.getStreet());
            associado.setHouseNumber(createAssociado.getHouseNumber());
            associado.setComplement(createAssociado.getComplement());
            associado.setDistrict(associado.getDistrict());
            associado.setCity(createAssociado.getCity());
            associado.setState(createAssociado.getState());
            associado.setPhone(createAssociado.getPhone());
            associado.setEmail(createAssociado.getEmail());
            associado.setNumberOfChildren(createAssociado.getNumberOfChildren());
            associado.setSpouseName(createAssociado.getSpouseName());
            associado.setTaxpayer(createAssociado.getTaxpayer());
            associado.setNote(createAssociado.getNote());

            Associado associadoPersisted = associadoRepository.save(associado);

            response.setData(associadoPersisted);

        } catch (DuplicateKeyException dE) {
            response.getErrors().add("E-mail already registered!");
            return ResponseEntity.badRequest().body(response);
        } catch (Exception e) {
            response.getErrors().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        
        return ResponseEntity.ok(response);
    }
    private void validateCreateAssociado(String email, BindingResult result) {
        if (email == null || email.isEmpty()) {
            result.addError(new ObjectError("Associado", "Email no information"));
            return;
        }
    }

    @GetMapping()
    public ResponseEntity<Response<List<Associado>>> getAll(){
        Response<List<Associado>> response = new Response<>();
        List<Associado> associados = associadoRepository.findAll();
        response.setData(associados);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Response<Associado>> getById(@PathVariable("id") Long id){
        Response<Associado> response = new Response<>();
        Optional<Associado> associado = associadoRepository.findById(id);
        response.setData(associado.get());
        return ResponseEntity.ok(response);
    }

    @PatchMapping()
    public ResponseEntity<Response<Associado>> update(HttpServletRequest request, @RequestBody Associado associado,
                                                 BindingResult result) {
        Response<Associado> response = new Response<Associado>();
        try {
            validateUpdate(associado, result);
            if (result.hasErrors()) {
                result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
                return ResponseEntity.badRequest().body(response);
            }

            Associado associadoPersisted = (Associado) associadoRepository.save(associado);
            response.setData(associadoPersisted);
        } catch (Exception e) {
            response.getErrors().add(e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }
        return ResponseEntity.ok(response);
    }
    private void validateUpdate(Associado user, BindingResult result) {
        if (user.getId() == null) {
            result.addError(new ObjectError("Associado", "Id no information"));
            return;
        }
        if (user.getEmail() == null) {
            result.addError(new ObjectError("Associado", "Email no information"));
            return;
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {

        Boolean deleted;

        try {
            associadoRepository.deleteById(id);
            deleted = true;
        } catch (Exception e) {
            deleted = false;
        }

        return ResponseEntity.ok().body(deleted);
    }


}
