// Importa o scanner
import java.util.Scanner;
 
public class GeometriaEspacial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
 
        // Escolhe entre as opcoes de calculo
        do {
            System.out.println("Calculadora Espacial");
            System.out.println("1. Volume da Esfera");
            System.out.println("2. Volume do Cilindro");
            System.out.println("3. Volume do Cubo");
            System.out.println("4. Volume do Cone");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção (1-5): ");
            escolha = scanner.nextInt();
 
            // Digita os valores
            switch (escolha) {
                case 1:
                    System.out.print("Digite o raio da esfera: ");
                    double raioEsfera = scanner.nextDouble();
                    System.out.println("Volume da esfera: " + calcularVolumeEsfera(raioEsfera));
                    break;
                case 2:
                    System.out.print("Digite o raio do cilindro: ");
                    double raioCilindro = scanner.nextDouble();
                    System.out.print("Digite a altura do cilindro: ");
                    double alturaCilindro = scanner.nextDouble();
                    System.out.println("Volume do cilindro: " + calcularVolumeCilindro(raioCilindro, alturaCilindro));
                    break;
                case 3:
                    System.out.print("Digite o comprimento da aresta do cubo: ");
                    double arestaCubo = scanner.nextDouble();
                    System.out.println("Volume do cubo: " + calcularVolumeCubo(arestaCubo));
                    break;
                case 4:
                    System.out.print("Digite o raio do cone: ");
                    double raioCone = scanner.nextDouble();
                    System.out.print("Digite a altura do cone: ");
                    double alturaCone = scanner.nextDouble();
                    System.out.println("Volume do cone: " + calcularVolumeCone(raioCone, alturaCone));
                    break;
                case 5:
                    System.out.println("Saindo da calculadora. Até logo!");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, selecione uma opção válida.");
            }
        } while (escolha != 5);
    }
 
    // Calcula o volume da esfera
    public static double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
 
    // Calcula o volume do cilindro
    public static double calcularVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
 
    // Calcula o volume do cubo
    public static double calcularVolumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }
 
    // Calcula o volume do cone
    public static double calcularVolumeCone(double raio, double altura) {
        return (1.0 / 3.0) * Math.PI * Math.pow(raio, 2) * altura;
    }
}
 