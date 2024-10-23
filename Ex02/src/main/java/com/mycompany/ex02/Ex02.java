/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex02;

import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex02 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        int valor = 0;
        boolean isContinue = true;
        
        do{
            while (true){
                try {
                    System.out.printf("Informe o valor: ");
                    data = new DataInputStream(System.in); 
                    input = data.readLine();
                    valor = Integer.parseInt(input);
                    break;
                } catch (Exception erro){
                    System.out.println("Erro: " + erro.getMessage());
                } 
            }
            
            if(valor % 2 == 0){
                System.out.printf("%d = Par\n", valor);
            } else {
                System.out.printf("%d = Impar\n", valor);
            }
            
            while (true){
               try {
                    System.out.println("Deseja continuar? (0 - stop)");
                    data = new DataInputStream(System.in); 
                    input = data.readLine();
                    valor = Integer.parseInt(input);
                    break;
                } catch (Exception erro){
                    System.out.println("Erro: " + erro.getMessage());
                } 
            }
            
            
            if (valor == 0){
                isContinue = false;
            }
            
        } while (isContinue);
        
    }
}
