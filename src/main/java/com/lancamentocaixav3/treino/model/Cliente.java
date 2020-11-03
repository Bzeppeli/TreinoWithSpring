package com.lancamentocaixav3.treino.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataCadastro;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cpf_cnpj;

    @Column(nullable = false)
    private String logradouro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private String cep;

    private String telefone;

    private String email;

    private float saldo = 0;

    @OneToOne()
    @JoinColumn(unique = true)
    private Contabil contabil;

    public Cliente(int id, Date dataCadastro, String nome, String cpf_cnpj, String logradouro, String cidade, String uf, String cep, String telefone, String email, Contabil contabil, float saldo) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.contabil = contabil;
        this.saldo = saldo;
    }

    public Cliente(Date dataCadastro, String nome, String cpf_cnpj, String logradouro, String cidade, String uf, String cep, String telefone, String email, Contabil contabil, float saldo) {
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.uf = uf;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.contabil = contabil;
        this.saldo = saldo;
    }

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int id, String nome, String cpf_cnpj, Contabil contabil) {
        this.id = id;
        this.nome = nome;
        this.cpf_cnpj = cpf_cnpj;
        this.contabil = contabil;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contabil getContabil() {
        return contabil;
    }

    public void setContabil(Contabil contabil) {
        this.contabil = contabil;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", dataCadastro=" + dataCadastro +
                ", nome='" + nome + '\'' +
                ", cpf_cnpj='" + cpf_cnpj + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                ", cep='" + cep + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", saldo=" + saldo +
                ", contabil=" + contabil +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id == cliente.id &&
                Objects.equals(dataCadastro, cliente.dataCadastro) &&
                Objects.equals(nome, cliente.nome) &&
                Objects.equals(cpf_cnpj, cliente.cpf_cnpj) &&
                Objects.equals(logradouro, cliente.logradouro) &&
                Objects.equals(cidade, cliente.cidade) &&
                Objects.equals(uf, cliente.uf) &&
                Objects.equals(cep, cliente.cep) &&
                Objects.equals(telefone, cliente.telefone) &&
                Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataCadastro, nome, cpf_cnpj, logradouro, cidade, uf, cep, telefone, email);
    }
}
