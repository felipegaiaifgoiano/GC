package com.backend;

/**
 * Classe principal da aplicação backend.
 * Responsável por inicializar o sistema.
 */
public class App {
	/**
 	 * Exibe uma mensagem de inicialização no console.
 	*/
    public static void main(String[] args) {
        System.out.println("Servidor iniciado");
    }
    
	/**
 	 * Soma dois números.
 	*/
    public int soma(int a, int b) {
        return a + b;
    }

	/**
 	 * Subtrai dois números.
 	*/    
    public int sub(int a, int b) {
        return a - b;
    }
}