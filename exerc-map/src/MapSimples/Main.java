package MapSimples;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //criando um hashmap para armazenar numeros e nomes
        Map<Integer, String> dados = new HashMap<>();

        //alimentando o hashmap
        dados.put(01, "pedro");
        dados.put(02, "paulo");
        dados.put(01, "pedro"); //repetido, sera ignorado

        //imprimindo apenas o primeiro valor
        System.out.println(dados.get(01));
        System.out.println("----------");


        //imprimindo os valores sem as chaves
        for(String valor : dados.values()) {
            System.out.println(valor);
        }
        System.out.println("----------");

        //imprimindo as chaves apenas
        for(int valor : dados.keySet()) {
            System.out.println(valor);
        }
        System.out.println("----------");

        //imprimindo o conjunto chave e valor completo
        for(int valor : dados.keySet()) {
            System.out.println(valor + ", " + dados.get(valor));
        }

    }
}
