package exercicio.operacao;

import java.util.Scanner;

public class Operacao {
    
    public void soma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe primeiro valor");
        int n1 = scanner.nextInt();
        System.out.println("Informe segundo valor");
        int n2 = scanner.nextInt();
        System.out.println("A soma do valor " + n1 + " pelo valor " + n2 + " resulta em:" + n1+n2);
    }
    
    public void calculaMedia(double n1, double n2) {
         System.out.println("A média dos números informados é: " + (n1+n2)/2);
    }
    
    public double divisao(double num1, double num2) {
        return num1/num2;
        
    }
    
    public int multiplicacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe primeiro valor");
        int n1 = scanner.nextInt();
        System.out.println("Informe segundo valor");
        int n2 = scanner.nextInt();
        
        return n1*n2;
    }
    
    public void subtracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe primeiro valor");
        int n1 = scanner.nextInt();
        System.out.println("Informe segundo valor");
        int n2 = scanner.nextInt();
        System.out.println("A subtração do valor " + n1 + " pelo valor " + n2 + " resulta em:" + (n1-n2));
    }	 	  	 	      	      	 	   	      	  	   	 	
    
    public double mediaPonderada(int n1, int n2) {
        return (n1*0.7)+(n2*0.3);        
    }
    
    public void calculaFatorial(int n1) {
        
        int fat = 1;
        
        for(int i = 1; i<=n1; i++) {
            fat *= i;
        }
        
        System.out.println("O fatorial do valor informado é: " + fat);
        
    }
    
    
    
    
}