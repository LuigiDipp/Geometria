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

    // instancia o objeto da classe
        Calculos objeto = new Calculos();


    Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(Math.sqrt(25));
    }
}
