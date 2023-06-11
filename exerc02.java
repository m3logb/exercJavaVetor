import java.util.Locale;
import java.util.Scanner;

public class exerc02 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Quantos números você vai digitar?");
        int N = sc.nextInt();
        Double vetor[] = new Double[N];

        for (int i = 0;i<N;i++){
            System.out.println("Digite um número:");
            vetor[i] = sc.nextDouble();
        }
        System.out.println("VALORES:");    
        for (int i = 0;i<N;i++){
            System.out.println(vetor[i]);
        }
        Double soma = 0.0;
        Double media = 0.0;
        for (int i = 0;i<N;i++){
            soma += vetor[i];
            media = soma / N;
            
        }
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);
        
        sc.close();
    }
}
