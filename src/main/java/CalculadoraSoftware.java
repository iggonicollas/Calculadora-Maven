import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CalculadoraSoftware {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double inputUm, inputDois;
        String operacao;
        boolean continuar;

        do {

            try {

                    System.out.println("Digite um número: ");
                    inputUm = sc.nextDouble();

                    System.out.println("Qual operação deseja?| + | - | / | * |");
                    operacao = sc.next();

                    System.out.println("Digite o segundo valor");
                    inputDois = sc.nextDouble();

                    System.out.println("Resultado: " + areaCalculos(inputUm, inputDois, operacao));

            } catch (InputMismatchException ex) {
                System.out.println("Digite apenas números");
            }

        continuar = interromperExecutar();
        } while (continuar);
    }


        public static boolean interromperExecutar(){
                Scanner sc = new Scanner(System.in);
                System.out.println("Continuar ou Encerrar programa (c / e) ?");
                return !sc.nextLine().toLowerCase(Locale.ROOT).equals("e");
        }


    public static Double areaCalculos(Double inputUm, Double inputDois, String operacao) {

        double resultado = 0.0;


        switch (operacao) {
            case "+":
                resultado = inputUm + inputDois;
                break;
            case "-":
                resultado = inputUm - inputDois;
                break;
            case "/":
                resultado = inputUm / inputDois;
                break;
            case "*":
                resultado = inputUm * inputDois;
                break;

            default:
                System.out.println("Operação inválida");
        }
            return resultado;

    }

}