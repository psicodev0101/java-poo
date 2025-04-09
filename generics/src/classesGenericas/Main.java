package classesGenericas;

public class Main {
    public static void main(String[] args) {
        // classe box para armazenar inteiros
        BoxInteger boxInteger = new BoxInteger();
        // classe box para armazenar Strings (repeticao de codigo)
        BoxString boxString = new BoxString();

        /* usando a mesma logica em uma classe generica para armazenar
        * tanto strings quanto inteiros */
        BoxGeneric<Integer> boxGenericInteger = new BoxGeneric<>();
        BoxGeneric<String> boxGenericString = new BoxGeneric<>();

        //guardando dados inteiros:
        boxInteger.add(5);
        boxInteger.add(10);
        boxInteger.add(28);
        boxInteger.add(31);

        //guardando dados String:
        boxString.add("pedro");
        boxString.add("joao");
        boxString.add("jose");
        boxString.add("romario");

        //exibindo primeiro item de boxInteger
        System.out.println(boxInteger.getFirst());
        //exibindo primeiro item de boxString
        System.out.println(boxString.getFirst());

        //adicionando os mesmos numeros em classe generica
        boxGenericInteger.add(5);
        boxGenericInteger.add(10);
        boxGenericInteger.add(28);
        boxGenericInteger.add(31);

        //adicionando os mesmos nomes em classe generica
        boxGenericString.add("pedro");
        boxGenericString.add("joao");
        boxGenericString.add("jose");
        boxGenericString.add("romario");

        //exibindo primeiro item de boxGenericInteger
        System.out.println(boxGenericInteger.getFirst());
        //exibindo primeiro item de boxGenericString
        System.out.println(boxGenericString.getFirst());
    }
}
