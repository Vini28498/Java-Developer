package edu.Vini.variáveis;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {

        int idade;  //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021;  //tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2.500;  //tipo "double", nome "salarioMinimo", valor 2.500.
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final int numero = 1; // Variavel imutável

    }

}