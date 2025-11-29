package com.exemplo.demo.entities;

import jakarta.persistence.*;

@Entity
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    private String marca;
    private String modelo;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private Double valor;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer anoFabricacao, Integer anoModelo, Double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.valor = valor;
    }

    public Long getCodigo() {
        return codigo;
    }

    // Getters e Setters restantes
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Integer getAnoFabricacao() { return anoFabricacao; }
    public Integer getAnoModelo() { return anoModelo; }
    public Double getValor() { return valor; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAnoFabricacao(Integer anoFabricacao) { this.anoFabricacao = anoFabricacao; }
    public void setAnoModelo(Integer anoModelo) { this.anoModelo = anoModelo; }
    public void setValor(Double valor) { this.valor = valor; }
}
