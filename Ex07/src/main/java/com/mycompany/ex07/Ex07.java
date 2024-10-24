/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex07;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */

public class Ex07 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        int number;
        int[] produtos;
        boolean isFind = false, isContinue = true;
        
        do {
            while(true){
                try {
                    System.out.println("Informe a quantidade de produtos no estoque:");
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    break;
                } catch (Exception erro){
                    System.out.println("Erro: " + erro.getMessage());
                }
            }
            produtos = new int[number = Integer.parseInt(input)];

            for (int i = 0; i < produtos.length; i++) {
                produtos[i] = i+1;
            }

            do {
                while(true){
                    try {
                        System.out.println("Insira o id do produto: ");
                        data = new DataInputStream(System.in);
                        input = data.readLine();
                        number = Integer.parseInt(input);
                                break;
                    } catch (Exception erro){
                        System.out.println("Erro: " + erro.getMessage());
                    }
                }

                for (int i = 0; i < produtos.length; i++) {
                    if (number == produtos[i]){
                        isFind = true;
                        break;
                    }
                }

                if (isFind){
                    System.out.println("Produto encontrado");
                } else {
                    System.out.println("Produto nao encontrado");
                    System.out.println("----------------------");
                }
            }while (!isFind);
            
            while (true){
               try {
                    System.out.println("----------------------------");
                    System.out.println("Deseja continuar? (0 - stop)");
                    data = new DataInputStream(System.in); 
                    input = data.readLine();
                    break;
                } catch (Exception erro){
                    System.out.println("Erro: " + erro.getMessage());
                } 
            }
            
            if (input.equals("0")){
                isContinue = false;
            }
            
        } while(isContinue);
    }
}
