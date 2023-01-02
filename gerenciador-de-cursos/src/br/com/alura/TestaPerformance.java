package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<>();

        long inicioInsercao = System.currentTimeMillis();

        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }

        long fimInsercao = System.currentTimeMillis();

        long tempoDeExecucaoInsercao = fimInsercao - inicioInsercao;

        System.out.println("Tempo gasto na inserção: " + tempoDeExecucaoInsercao);

        long inicioBusca = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fimBusca = System.currentTimeMillis();

        long tempoDeExecucaoBusca = fimBusca - inicioBusca;

        System.out.println("Tempo gasto na busca: " + tempoDeExecucaoBusca);
    }
}
