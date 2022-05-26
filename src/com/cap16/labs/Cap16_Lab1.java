package com.cap16.labs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cap16_Lab1 {

	public static void main(String[] args) {
		escrever("Capítulo 16\nLaboratório 1");
		ler();

	}
	public static void escrever(String texto) {
		try {
			FileOutputStream arquivo = new FileOutputStream("escrita-java"); 
			DataOutputStream dados = new DataOutputStream(arquivo);
			dados.writeChars(texto);
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ler() {
		try {
			FileInputStream arquivo = new FileInputStream("escrita-java");
			DataInputStream dados = new DataInputStream(arquivo);
			while(dados.available() > 0) {
				char c = dados.readChar();
				System.out.println(c);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());			
		}
	}

}
