package com.lancamentocaixav3.treino.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class LivroCaixa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date data;

    @Column(nullable = false)
    private String descicao;

    @Column(nullable = false)
    private char tipo;

    @Column(nullable = false)
    private float valor;

    public LivroCaixa(int id, Date data, String descicao, char tipo, float valor) {
        this.id = id;
        this.data = data;
        this.descicao = descicao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public LivroCaixa(Date data, String descicao, char tipo, float valor) {
        this.data = data;
        this.descicao = descicao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public LivroCaixa() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "LivroCaixa{" +
                "id=" + id +
                ", data=" + data +
                ", descicao='" + descicao + '\'' +
                ", tipo=" + tipo +
                ", valor=" + valor +
                '}';
    }


}
