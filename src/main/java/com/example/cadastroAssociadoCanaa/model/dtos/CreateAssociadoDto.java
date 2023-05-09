package com.example.cadastroAssociadoCanaa.model.dtos;

import com.example.cadastroAssociadoCanaa.model.enums.SexoEnum;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class CreateAssociadoDto {

    private String name;
    private String sexoEnum;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    private String rg;
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

    public CreateAssociadoDto(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSexoEnum() {
        return sexoEnum;
    }

    public void setSexoEnum(String sexoEnum) {
        this.sexoEnum = sexoEnum;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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

    public String getUfNationality() {
        return ufNationality;
    }

    public void setUfNationality(String ufNationality) {
        this.ufNationality = ufNationality;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
}
