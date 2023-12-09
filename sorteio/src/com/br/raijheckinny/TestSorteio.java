package com.br.raijheckinny;

import java.util.HashSet;
import java.util.Set;

public class TestSorteio {
    public static void main(String args[]){
        gerarSoteio();
    }

    private static void gerarSoteio() {
        //Gerar um sequencia de numero sem repetiçao
        Set<Integer> sorteio = new HashSet<Integer>();
        while(true){
            sorteio.add(numeroAleatorioMaximo100(25));
            if(sorteio.size() == 6){
                break;
            }
        }
        //Imprimir HashSet
        for( int numero : sorteio){
            System.out.println(numero);
        }
    }

    //Gerar numero de no Maximo 100 o parametro limita o maximo de numero gerado
    private static int numeroAleatorioMaximo100(int maximoDeGeracao) {
        while (true) {
            int numeroAleatorio = (int) (Math.random() * 100);
            if (numeroAleatorio <= maximoDeGeracao) {
                return numeroAleatorio;
            }
        }
    }
}
