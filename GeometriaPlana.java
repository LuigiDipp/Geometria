import java.util.Scanner;

public class GeometriaPlana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("Calculadora de Geometria Plana");
            System.out.println("1. Área do Círculo");
            System.out.println("2. Perímetro do Círculo");
            System.out.println("3. Área do Retângulo");
            System.out.println("4. Perímetro do Retângulo");
            System.out.println("5. Área do Triângulo");
            System.out.println("6. Perímetro do Triângulo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção (1-7): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o raio do círculo: ");
                    double raioCirculo = scanner.nextDouble();
                    System.out.println("Área do círculo: " + calcularAreaCirculo(raioCirculo));
                    break;
                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    raioCirculo = scanner.nextDouble();
                    System.out.println("Perímetro do círculo: " + calcularPerimetroCirculo(raioCirculo));
                    break;
                case 3:
                    System.out.print("Digite a base do retângulo: ");
                    double baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    double alturaRetangulo = scanner.nextDouble();
                    System.out.println("Área do retângulo: " + calcularAreaRetangulo(baseRetangulo, alturaRetangulo));
                    break;
                case 4:
                    System.out.print("Digite a base do retângulo: ");
                    baseRetangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do retângulo: ");
                    alturaRetangulo = scanner.nextDouble();
                    System.out.println("Perímetro do retângulo: " + calcularPerimetroRetangulo(baseRetangulo, alturaRetangulo));
                    break;
                case 5:
                    System.out.print("Digite a base do triângulo: ");
                    double baseTriangulo = scanner.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double alturaTriangulo = scanner.nextDouble();
                    System.out.println("Área do triângulo: " + calcularAreaTriangulo(baseTriangulo, alturaTriangulo));
                    break;
                case 6:
                    System.out.print("Digite o lado 1 do triângulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.print("Digite o lado 2 do triângulo: ");
                    double lado2 = scanner.nextDouble();
                    System.out.print("Digite o lado 3 do triângulo: ");
                    double lado3 = scanner.nextDouble();
                    System.out.println("Perímetro do triângulo: " + calcularPerimetroTriangulo(lado1, lado2, lado3));
                    break;
                case 7:
                    System.out.println("Finalizando o programa...");
                    break;
                default:
                    System.out.println("Escolha inválida. Por favor, selecione uma opção válida.");
            }
        } while (escolha != 7);
    }

    // Área do círculo
    public static double calcularAreaCirculo(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    // Perímetro do círculo
    public static double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // Área do retângulo
    public static double calcularAreaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Perímetro do retângulo
    public static double calcularPerimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Área do triângulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    // Perímetro do triângulo
    public static double calcularPerimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }
}
