/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex03;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex03 {

    public static void main(String[] args) throws IOException {
        final int numJogadores = 2;
        DataInputStream data;
        String input;
        double[] number = new double[numJogadores]; 
        
        while(true){
            try {
                for (int i = 0; i < numJogadores; i++) {
                    System.out.printf("Informe a pontuacao do %d.o jogador: ", (i+1));
                    data = new DataInputStream(System.in);
                    input = data.readLine();
                    number[i] = Double.parseDouble(input);
                }
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        System.out.println((number[0] > number[1]) ? "Jogador 1 ganhou" : "Jogador 2 Ganhou");
    }
}
