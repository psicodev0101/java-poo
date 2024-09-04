package models;

import java.util.ArrayList;

public class DatabaseLeao {

    ArrayList<ContribuinteCpf> contribuintesCpf = new ArrayList<>();
    ArrayList<ContribuinteCnpj> contribuintesCnpj = new ArrayList<>();

    public void calcularImpostometro () {
        double totalImpostometro = 0D;
        for (Contribuinte contribuinte : contribuintesCpf) {
            totalImpostometro += contribuinte.taxa;
        }
        for (Contribuinte contribuinte : contribuintesCnpj) {
            totalImpostometro += contribuinte.taxa;
        }
        System.out.printf("TOTAL DE ARRECADACOES NO IMPOSTOMETRO: %.2f", totalImpostometro);
    }

    public void guardarContribuinte (Contribuinte contribuinte) {

        if (contribuinte instanceof ContribuinteCpf) {
            contribuintesCpf.add((ContribuinteCpf) contribuinte);
            System.out.println("Contribuinte salvo com sucesso em Contribuintes-CPF");
        } else if (contribuinte instanceof ContribuinteCnpj) {
            contribuintesCnpj.add((ContribuinteCnpj) contribuinte);
            System.out.println("Contribuinte salvo com sucesso em Contribuintes-CNPJ");
        } else {
            //lançar exception falha no armazenamento
        }
    }

}
