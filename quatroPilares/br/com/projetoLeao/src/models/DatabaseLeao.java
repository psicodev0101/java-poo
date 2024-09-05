package models;

import java.util.ArrayList;

public class DatabaseLeao {

    private final ArrayList<ContribuinteCpf> contribuintesCpf = new ArrayList<>();
    private final ArrayList<ContribuinteCnpj> contribuintesCnpj = new ArrayList<>();


//getters e Setters ------------------------------------------------------------------------
    public ArrayList<ContribuinteCpf> getContribuintesCpf () {
        return contribuintesCpf;
    }

    public ArrayList<ContribuinteCnpj> getContribuintesCnpj () {
        return contribuintesCnpj;
    }

//metodos -----------------------------------------------------------------------------------
    public void calcularImpostometro () {
        double totalImpostometro = 0D;
        for (Contribuinte contribuinte : contribuintesCpf) {
            totalImpostometro += contribuinte.taxa;
        }
        for (Contribuinte contribuinte : contribuintesCnpj) {
            totalImpostometro += contribuinte.taxa;
        }
        System.out.println("----------------------------------------------------------------");
        System.out.printf("TOTAL DE ARRECADACOES NO IMPOSTOMETRO: %.2f", totalImpostometro);
    }

    public void guardarContribuinte (Contribuinte contribuinte) {
        if (contribuinte instanceof ContribuinteCpf) {
            contribuintesCpf.add((ContribuinteCpf) contribuinte);
            System.out.println("Contribuinte salvo com sucesso em Contribuintes-CPF");
        } else {
            contribuintesCnpj.add((ContribuinteCnpj) contribuinte);
            System.out.println("Contribuinte salvo com sucesso em Contribuintes-CNPJ");
        }
    }

}
