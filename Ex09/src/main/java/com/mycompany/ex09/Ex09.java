/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex09;

import java.awt.HeadlessException;
import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author renan_8tvcd4n
 */
public class Ex09 {

    public static void main(String[] args) throws IOException {
        JOptionPane.showMessageDialog(null,"Olá, tudo bom?");// por que raios essa bomba de JOptionPane não funciona sem esse carinha aqui no inicio do codigo??????
        String output = input();
        output(output);
    }
    
    public static String input() throws IOException{
        DataInputStream data;
        String nome;
        String input = "";
        String output = "";
        String[][] itens;
        int qtdItem;
        double number;
        double soma = 0;
        
        // nome de cliente
        while(true){
            try {
                System.out.printf("Informe seu nome: ");
                data = new  DataInputStream(System.in);
                nome = (input = data.readLine());
                break;
            } catch (IOException erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }

        // qtd pedidos
        while(true){
            try {
                System.out.printf("Numero de produtos de solicitacao: ");
                data = new  DataInputStream(System.in);
                qtdItem = Integer.parseInt(input = data.readLine());
                itens = new String[qtdItem + 1][3];
                break;
            } catch (IOException | NumberFormatException erro){
                System.out.println("Favor insira um valor valido");
            }
        }
        
        // nome de cada produto
        while(true){
            try {
                for (int i = 0; i < qtdItem; i++) {
                    System.out.printf("Nome do item %d: ", (i+1));
                    data = new  DataInputStream(System.in);
                    itens[i][0] = (input = data.readLine());
                }
                break;
            } catch (IOException erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        // qtd de cada produto
        while(true){
            try {
                for (int i = 0; i < (qtdItem); i++) {
                    System.out.printf("Quantidade de %s: ", itens[i][0]);
                    data = new  DataInputStream(System.in);
                    number = Integer.parseInt(input = data.readLine());
                    itens[i][1] =  Integer.toString((int)number);
                }
                break;
            } catch (IOException | NumberFormatException erro){
                System.out.println("Favor insira um valor valido");
            }
        }
        
        // preco de cada item
        while(true){
            try {
                for (int i = 0; i < (qtdItem); i++) {
                    System.out.printf("O preco de %s: R$", itens[i][0]);
                    data = new  DataInputStream(System.in);
                    number = Double.parseDouble(input = data.readLine());
                    soma += number * (Double.parseDouble(itens[i][1]));
                    itens[i][2] = Double.toString(number);
                }
                break;
            } catch (IOException | NumberFormatException erro){
                System.out.println("Favor insira um valor valido");
            }
        }
        
        output = "Solicitante: " + nome + " | Valor total: R$ " + soma;
        
        data.close();
        export(nome, qtdItem, itens, soma);
        return output;
    }
    
    public static void output(String output){
        JOptionPane.showMessageDialog(null,output);
    }
    
    public static void export(String nome, int qtdItem, String[][] itens, double soma) throws IOException{
        FileWriter file;
        PrintWriter record;
        String path = ".\\";
        String fileName = nome + " Pedido";
        
        file = new FileWriter(path + fileName);
        record = new PrintWriter(file);
        record.println("Solicitante: " + nome);
        record.println("Produtos: ");
        for (int i = 0; i < qtdItem; i++) {
            record.printf("\n - %s | Quantidade: %s | Valor: R$%s\n", itens[i][0], itens[i][1], itens[i][2]);
        }
        record.println("-------------------------------------------");
        record.println("Valor Total: R$" + soma);
        record.close();
    }
}
