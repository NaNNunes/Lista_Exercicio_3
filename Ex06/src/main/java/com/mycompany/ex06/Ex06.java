/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex06;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex06 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input;
        double[] number = new double[4];
        
        while (true){
            try {
                for (int i = 0; i < 3; i++) {
                    System.out.printf("Informe a %d.a nota: ", (i+1));
                        data = new DataInputStream(System.in);
                        input = data.readLine();
                        number[i] = Double.parseDouble(input);
                        number[3] += number[i];
                }
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        System.out.printf("Media = %2.2f", number[3]/ 3);
        
    }
}
