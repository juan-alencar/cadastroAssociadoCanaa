package com.example.cadastroAssociadoCanaa.repository;

import com.example.cadastroAssociadoCanaa.model.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, Long> {

    Optional<Associado> findById(Long id);
}
