package com.lancamentocaixav3.treino.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataCadastro;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String login;

    @Column(nullable = false)
    @JsonIgnore
    private String senha;

    private String telefone;

    private String email;

    @Column(nullable = false)
    private char perfil;

    @Column(nullable = false)
    private char status;

    @Column(nullable = false)
    private boolean admin;

    public Usuario(int id, Date dataCadastro, String nome, String login, String senha, String telefone, String email, char perfil, char status, boolean admin) {
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.perfil = perfil;
        this.status = status;
        this.admin = admin;
    }

    public Usuario(Date dataCadastro, String nome, String login, String senha, String telefone, String email, char perfil, char status, boolean admin) {
        this.dataCadastro = dataCadastro;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.telefone = telefone;
        this.email = email;
        this.perfil = perfil;
        this.status = status;
        this.admin = admin;
    }

    public Usuario() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public char getPerfil() {
        return perfil;
    }

    public void setPerfil(char perfil) {
        this.perfil = perfil;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", dataCadastro=" + dataCadastro +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", perfil=" + perfil +
                ", status=" + status +
                ", admin=" + admin +
                '}';
    }
}
