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
        int estoque;
        int[] produtos;
        
        System.out.println("Informe a quantidade de produtos no estoque:");
        data = new DataInputStream(System.in);
        input = data.readLine();
        produtos = new int[estoque = Integer.parseInt(input)];
        
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = i+1;
        }
        
        System.out.println("Insira o id do produto: ");
    }
}
