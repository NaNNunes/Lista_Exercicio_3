/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex01;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex01 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        double[] number = new double[2]; 
        
        while (true){
            try {
                for (int i = 0; i < 2; i++) {
                    System.out.printf("Informe o %d.o numero: ", (i +1));
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    number[i] = Double.parseDouble(input);
                }
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        System.out.printf("A soma dos numeros = %f", number[0] + number[1]);
    }
}
