import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Quetão 01

//        Retangulo r1 = new Retangulo(23,32);
//        Retangulo r2 = new Retangulo(33,22);
//
//        r1.ExibirInformacoes();
//        r2.ExibirInformacoes();


        // Questão 02

//        Scanner scanner = new Scanner(System.in);
//        Retangulo[] retangulos = new Retangulo[5];
//
//        for (int i = 0; i < retangulos.length; i++) {
//            System.out.println("Retângulo " + (i + 1));
//            System.out.print("Digite a largura: ");
//            double largura = scanner.nextDouble();
//            System.out.print("Digite a altura: ");
//            double altura = scanner.nextDouble();
//            retangulos[i] = new Retangulo(largura, altura);
//            System.out.println();
//        }
//
//        for (Retangulo retangulo : retangulos) {
//            retangulo.ExibirInformacoes();
//            System.out.println();
//        }
//
//        Retangulo maiorArea = retangulos[0];
//        for (Retangulo retangulo : retangulos) {
//            if (retangulo.Area() > maiorArea.Area()) {
//                maiorArea = retangulo;
//            }
//        }
//        System.out.println("Retângulo com a maior área:");
//        maiorArea.ExibirInformacoes();
//
//        Retangulo menorPerimetro = retangulos[0];
//        for (Retangulo retangulo : retangulos) {
//            if (retangulo.Perimetro() < menorPerimetro.Perimetro()) {
//                menorPerimetro = retangulo;
//            }
//        }
//        System.out.println("Retângulo com o menor perímetro:");
//        menorPerimetro.ExibirInformacoes();

    //Questão 03

        Scanner scanner = new Scanner(System.in);
        Retangulo[] retangulos = new Retangulo[5];

        for (int i = 0; i < retangulos.length; i++) {
            System.out.println("Retângulo " + (i + 1));
            System.out.print("Digite a largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            retangulos[i] = new Retangulo(largura, altura);
            System.out.println();
        }


        Arrays.sort(retangulos, (r1, r2) -> Double.compare(r1.Area(), r2.Area()));

        System.out.println("Retângulos ordenados por área:");
        for (Retangulo retangulo : retangulos) {
            retangulo.ExibirInformacoes();
            System.out.println();
        }

        retangulos = Arrays.copyOf(retangulos, 10);

        for (int i = 5; i < retangulos.length; i++) {
            System.out.println("Retângulo " + (i + 1));
            System.out.print("Digite a largura: ");
            double largura = scanner.nextDouble();
            System.out.print("Digite a altura: ");
            double altura = scanner.nextDouble();
            retangulos[i] = new Retangulo(largura, altura);
            System.out.println();
        }

        System.out.println("Todos os retângulos após a expansão:");
        for (Retangulo retangulo : retangulos) {
            retangulo.ExibirInformacoes();
            System.out.println();
        }
    }
}
