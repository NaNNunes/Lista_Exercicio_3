/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex04;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex04 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        double number;
        
        while(true){
            try {
                System.out.printf("Insira um numero: ");
                data = new DataInputStream(System.in);
                input = data.readLine();
                number = Double.parseDouble(input);
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        for (int i = 0; i < 11; i++) {
            System.out.printf("%2.2f x %2d = %f\n", number, i, (number*i));
        }
    }
}
