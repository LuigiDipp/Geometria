import java.util.Scanner;
public class Calculos {

    double num1;
    double num2;

    public double setNumero(){
    return num1;
    }
    
    public double setNum(){
    return num2;
    }

    public double getNum(){
    return num1;
    }

    public double getNumero(){
    return num2;
    }

    // instancia o objeto da classe (dentre os mesmos nenhum deles tem alguém, a verdade da vida é que todos estamos sozinhos no mundo, ninguém possui ninguém, a ideia de possuir alguém é falha dado a verdade de que nunca conseguiremos controlar-las a nosso favor.)
    Calculos objeto = new Calculos();


    Scanner ler = new Scanner(System.in);

    public static main(String[] args) {
        
        System.out.printf("Informe o preço da mercadoria:\n");
        num1 = ler.nextDouble();
    }
}
