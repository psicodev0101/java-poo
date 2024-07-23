import entities.Triangulo;
import util.ClassifTriangs;

public class Main {
    public static void main(String[] args) {

        Triangulo triangA = new Triangulo(5, 5, 8.2);
        triangA.tipo = ClassifTriangs.classificar(triangA);
        System.out.println(triangA);

    }
}
