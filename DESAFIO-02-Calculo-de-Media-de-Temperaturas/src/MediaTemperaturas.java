import java.util.Scanner;

public class MediaTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // armazena 7 temperaturas / almacena 7 temperaturas
        double[] temperaturas = new double[7];
        double soma = 0;

        // lê 7 valores / lee 7 valores
        for (int i = 0; i < 7; i++) {
            System.out.println("Digite a temperatura do dia " + (i + 1) + ":");
            temperaturas[i] = scanner.nextDouble(); // lê o valor / lee el valor
            soma += temperaturas[i]; // acumula / acumula
        }

        // calcula média / calcula promedio
        double media = soma / 7.0;

        // inicializa maior/menor / inicializa mayor/menor
        double maior = temperaturas[0];
        double menor = temperaturas[0];

        // percorre para achar maior e menor / recorre para encontrar mayor y menor
        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
            if (temperaturas[i] < menor) {
                menor = temperaturas[i];
            }
        }

        // mostra resultados / muestra resultados
        System.out.println("Media semanal: " + media);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);

        scanner.close(); // fecha o scanner / cierra el scanner
    }
}
