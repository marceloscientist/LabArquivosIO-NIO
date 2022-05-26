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
			DataOutputStream dados = new DataOutputStream(new FileOutputStream("escrita-java"));
			dados.writeChars(texto);
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void ler() {
		try {
			DataInputStream dados = new DataInputStream(new FileInputStream("escrita-java"));
			while(dados.available() > 0) {
				char c = dados.readChar();
				System.out.println(c);
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());			
		}
	}

}
