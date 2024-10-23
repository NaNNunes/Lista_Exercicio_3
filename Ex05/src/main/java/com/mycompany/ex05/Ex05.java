/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex05;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex05 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        int number;
        
        while (true){
            try {
                    System.out.printf("Insira o valor do timer: ");
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    number = Integer.parseInt(input);
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        System.out.println("Processo finalizando em:");
        for (int i = number; i >= 0; i--) {
            System.out.println(i); 
       }
        
    }
}
