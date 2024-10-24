/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex08;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author r.nunes
 */
public class Ex08 {

    public static void main(String[] args) throws IOException {
        DataInputStream data;
        String input = "";
        double[] numNotas;
        double notaMax;
        double notaCorte;
        double media;
        
        while(true){
            try {
                System.out.println("Numero de avaliacoes passadas, todas consideradas com 10 pontos: ");
                data = new DataInputStream(System.in);
                input = data.readLine();
                break;

            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        numNotas = new double[(Integer.parseInt(input) + 1)];
        notaMax = (numNotas.length - 1) * 10;
        
        while(true){
            try {
                for (int i = 0; i < (numNotas.length - 1); i++) {
                    do {
                        System.out.printf("Valor da %d.a nota: ", (i+1));        
                        data = new DataInputStream(System.in);
                        input = data.readLine();
                        numNotas[i] = Double.parseDouble(input);
                    } while (numNotas[i] > 10);
                    numNotas[(numNotas.length-1)] += numNotas[i];
                }
                break;
            } catch (Exception erro){
                System.out.println("Erro: " + erro.getMessage());
            }
        }
        
        notaCorte = (notaMax * 0.07);
        media = numNotas[numNotas.length -1] / (numNotas.length - 1);
        
        System.out.printf( (media >= notaCorte) ? "Aprovado" : "Reprovado");
    }
}
