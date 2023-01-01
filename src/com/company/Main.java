package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto();

        lerDadosDoTeclado(imput, produto1);

        lerDadosDoTeclado(imput, produto2);

        lerDadosDoTeclado(imput, produto3);
    }

    private static void lerDadosDoTeclado(Scanner imput, Produto produto) {
        System.out.println("Digite o Id do Produto");
        produto.setIdProduto(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a Descrição do produto");
        produto.setDescricao(imput.nextLine());
        System.out.println("Digite o valor do produto");
        produto.setValor(Double.parseDouble(imput.nextLine()));
        System.out.println("Digite a quantidade da entrada:");
        produto.RegistrarEntrada(Integer.parseInt(imput.nextLine()));
        System.out.println("Digite a quantidade da saída");
        produto.RegistrarSaida(Integer.parseInt(imput.nextLine()));
        produto.ListarProduto();
    }
}
