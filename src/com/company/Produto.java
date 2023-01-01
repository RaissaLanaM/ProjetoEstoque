package com.company;

public class Produto {
    //Atributos
    private int idProduto;
    private String descricao;
    private double valor;
    private int saldo;

    //Metodos get set
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //Metodos void
    public void RegistrarEntrada(int qtd){
        saldo = saldo + qtd;
    }
    public void RegistrarSaida(int qtd){
        saldo = saldo - qtd;
    }
    public void ListarProduto(){
        System.out.println("Id do Produto:" + idProduto);
        System.out.println("Descrição:" + descricao);
        System.out.println("Valor:" + valor);
        System.out.println("Saldo:" + saldo);

    }
}
