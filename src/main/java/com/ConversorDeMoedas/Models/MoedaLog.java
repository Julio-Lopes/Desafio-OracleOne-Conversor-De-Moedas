package com.ConversorDeMoedas.Models;

import java.util.Date;

public class MoedaLog {
    private String nomeMoeda;
    private String nomeMoedaConverte;
    private double valor;
    private double valorConvertido;
    private Date dataConversao;
    
    public MoedaLog(String nomeMoeda, String nomeMoedaConverte, double valor, double valorConvertido,
            Date dataConversao) {
        this.nomeMoeda = nomeMoeda;
        this.nomeMoedaConverte = nomeMoedaConverte;
        this.valor = valor;
        this.valorConvertido = valorConvertido;
        this.dataConversao = dataConversao;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public void setNomeMoeda(String nomeMoeda) {
        this.nomeMoeda = nomeMoeda;
    }

    public String getNomeMoedaConverte() {
        return nomeMoedaConverte;
    }

    public void setNomeMoedaConverte(String nomeMoedaConverte) {
        this.nomeMoedaConverte = nomeMoedaConverte;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

    public void setValorConvertido(double valorConvertido) {
        this.valorConvertido = valorConvertido;
    }

    public Date getDataConversao() {
        return dataConversao;
    }

    public void setDataConversao(Date dataConversao) {
        this.dataConversao = dataConversao;
    }

    @Override
    public String toString() {
        return "MoedaLog [Nome da Moeda=" + nomeMoeda + ", Nome da Moeda convertida=" + nomeMoedaConverte + ", valor=" + valor
                + ", valor Convertido=" + valorConvertido + ", data da Conversao=" + dataConversao + "]";
    }
    
}