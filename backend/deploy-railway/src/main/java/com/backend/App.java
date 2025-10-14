package com.backend;

/**
 * Classe principal da aplicação backend.
 * Responsável por inicializar o sistema.
 */
public class App {
	/**
 	 * Exibe uma mensagem de inicialização no console.
     * @param args argumentos passados via linha de comando
     */
    public static void main(String[] args) {
        System.out.println("Servidor iniciado");
    }

    /**
     * Soma dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da soma de a e b
     */
    public int soma(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai dois números inteiros.
     * 
     * @param a primeiro número
     * @param b segundo número
     * @return resultado da subtração de a por b
     */
    public int sub(int a, int b) {
        return a - b;
    }
}