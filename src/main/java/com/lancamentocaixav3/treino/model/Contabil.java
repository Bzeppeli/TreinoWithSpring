package com.lancamentocaixav3.treino.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Contabil {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @OneToMany
    private List<LivroCaixa> livroCaixas;
    //private float saldo;

    public Contabil(int id, List<LivroCaixa> livroCaixas) {
        this.id = id;
        this.livroCaixas = livroCaixas;
        //this.saldo = saldo;
    }

    public Contabil(List<LivroCaixa> livroCaixas) {
        this.livroCaixas = livroCaixas;
        //this.saldo = saldo;
    }

    public Contabil() {
    }

    public Contabil(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LivroCaixa> getLivroCaixas() {
        return livroCaixas;
    }

    public void setLivroCaixas(List<LivroCaixa> livroCaixas) {
        this.livroCaixas = livroCaixas;
    }

    @Override
    public String toString() {
        return "Contabil{" +
                "id=" + id +
                ", livroCaixas=" + livroCaixas +
                '}';
    }
}
