import java.util.Scanner;

public class somaVetores {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Quantos valores irá ter cada vetor ?");
        int N = sc.nextInt();
        int vectA[] = new int[N];
        int vectB[] = new int[N];

        System.out.println("Digite os valores de A:");

        for(int i=0;i<N;i++){
            vectA[i] = sc.nextInt();
        }
        System.out.println("Digite os valores de B:");

        for(int i=0;i<N;i++){
            vectB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");

        for(int i=0;i<N;i++){
            int somVect = vectA[i] + vectB[i];
            System.out.println(somVect);
        }

            
        }
        
    }

