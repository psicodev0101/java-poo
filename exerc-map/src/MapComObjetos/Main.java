package MapComObjetos;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //criando um hashmap para armazenar um ID para cada pessoa
        Map<Integer, Pessoa> dados = new HashMap<>();

        //criando pessoas
        Pessoa p1 = new Pessoa(21, "pedro");
        Pessoa p2 = new Pessoa(22, "paulo");
        Pessoa p3 = new Pessoa(23, "leandro");
        Pessoa p4 = new Pessoa(24, "rodrigo");

        //alimentando hashmap
        dados.put(01, p1);
        dados.put(02, p2);
        dados.put(03, p3);
        dados.put(04, p4);

        //imprimindo apenas primeiro objeto do map
        System.out.println(dados.get(01).getNome());
        System.out.println("-----");

        //imprimindo map completo formatado com ID, nome e idade
        for(int key : dados.keySet()) {
            System.out.println(key + " - "
                    + dados.get(key).getNome()
                    + ", " + dados.get(key).getIdade() + " anos");
        }
        System.out.println("-----");

        //se adicionar uma chave ja existente, ela sera sobrescrita
        Pessoa p5 = new Pessoa(25, "renato");
        dados.put(04, p5);

        //reimprimindo map completo formatado com ID, nome e idade
        for(int key : dados.keySet()) {
            System.out.println(key + " - "
                    + dados.get(key).getNome()
                    + ", " + dados.get(key).getIdade() + " anos");
        }

    }
}
