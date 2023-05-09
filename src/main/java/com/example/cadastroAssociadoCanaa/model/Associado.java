package com.example.cadastroAssociadoCanaa.model;

import com.example.cadastroAssociadoCanaa.model.enums.SexoEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Associado implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private SexoEnum sexoEnum;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Column(unique = true)
    private String rg;
    @Column(unique = true)
    private String cpf;
    private String profession;
    private String naturalness;
    private String nationality;
    private String ufNationality;
    private String voterRegistration;
    private String electoralZone;
    private String cep;
    private String street;
    private String houseNumber;
    private String complement;
    private String district;
    private String city;
    private String state;
    private String phone;
    private String email;
    private String numberOfChildren;
    private String spouseName;
    private Boolean taxpayer;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SexoEnum getSexoEnum() {
        return sexoEnum;
    }

    public void setSexoEnum(SexoEnum sexoEnum) {
        this.sexoEnum = sexoEnum;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getNaturalness() {
        return naturalness;
    }

    public void setNaturalness(String naturalness) {
        this.naturalness = naturalness;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String getVoterRegistration() {
        return voterRegistration;
    }

    public void setVoterRegistration(String voterRegistration) {
        this.voterRegistration = voterRegistration;
    }

    public String getElectoralZone() {
        return electoralZone;
    }

    public void setElectoralZone(String electoralZone) {
        this.electoralZone = electoralZone;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberOfChildren() {
        return numberOfChildren;
    }
    public void setNumberOfChildren(String numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public Boolean getTaxpayer() {
        return taxpayer;
    }

    public void setTaxpayer(Boolean taxpayer) {
        this.taxpayer = taxpayer;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Associado() {

    }
    public Associado(Associado createAssociado) {
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUfNationality() {
        return ufNationality;
    }

    public void setUfNationality(String ufNationality) {
        this.ufNationality = ufNationality;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Associado(Long id, String name, SexoEnum sexoEnum, Date createdAt, Date birthDate, String rg, String cpf, String profession, String naturalness, String nationality, String ufNationality, String voterRegistration, String electoralZone, String cep, String street, String houseNumber, String complement, String district, String city, String state, String phone, String email, String numberOfChildren, String spouseName, Boolean taxpayer, String note) {
        this.id = id;
        this.name = name;
        this.sexoEnum = sexoEnum;
        this.createdAt = createdAt;
        this.birthDate = birthDate;
        this.rg = rg;
        this.cpf = cpf;
        this.profession = profession;
        this.naturalness = naturalness;
        this.nationality = nationality;
        this.ufNationality = ufNationality;
        this.voterRegistration = voterRegistration;
        this.electoralZone = electoralZone;
        this.cep = cep;
        this.street = street;
        this.houseNumber = houseNumber;
        this.complement = complement;
        this.district = district;
        this.city = city;
        this.state = state;
        this.phone = phone;
        this.email = email;
        this.numberOfChildren = numberOfChildren;
        this.spouseName = spouseName;
        this.taxpayer = taxpayer;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Associado associado)) return false;
        return Objects.equals(id, associado.id) && Objects.equals(name, associado.name) && sexoEnum == associado.sexoEnum && Objects.equals(createdAt, associado.createdAt) && Objects.equals(birthDate, associado.birthDate) && Objects.equals(rg, associado.rg) && Objects.equals(cpf, associado.cpf) && Objects.equals(profession, associado.profession) && Objects.equals(naturalness, associado.naturalness) && Objects.equals(nationality, associado.nationality) && Objects.equals(ufNationality, associado.ufNationality) && Objects.equals(voterRegistration, associado.voterRegistration) && Objects.equals(electoralZone, associado.electoralZone) && Objects.equals(cep, associado.cep) && Objects.equals(street, associado.street) && Objects.equals(houseNumber, associado.houseNumber) && Objects.equals(complement, associado.complement) && Objects.equals(district, associado.district) && Objects.equals(city, associado.city) && Objects.equals(state, associado.state) && Objects.equals(phone, associado.phone) && Objects.equals(email, associado.email) && Objects.equals(numberOfChildren, associado.numberOfChildren) && Objects.equals(spouseName, associado.spouseName) && Objects.equals(taxpayer, associado.taxpayer) && Objects.equals(note, associado.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sexoEnum, createdAt, birthDate, rg, cpf, profession, naturalness, nationality, ufNationality, voterRegistration, electoralZone, cep, street, houseNumber, complement, district, city, state, phone, email, numberOfChildren, spouseName, taxpayer, note);
    }
}
