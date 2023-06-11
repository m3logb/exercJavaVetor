import java.util.Scanner;

public class exerc01 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar?");
        int N = sc.nextInt();
        int vetor[] = new int[N];

        for (int i=0;i<N;i++){
            System.out.println("Digite um número:");
            vetor[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS:");
        
        for (int i=0;i<N;i++){
            if (vetor[i]<0){
               int nNegativos = vetor[i];
               System.out.println(nNegativos);
            }
            
        }

        sc.close();
    }
}
