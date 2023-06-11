import java.util.Locale;
import java.util.Scanner;

public class execMaiorPosicao {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Double maiorValor;
        int posicaoMValor;
        System.out.println("Quantos números vai digitar ?");
        int N = sc.nextInt();
        Double vetor[] = new Double[N];

        for(int i = 0;i<N;i++){
            System.out.println("Digite um número:");
            vetor[i] = sc.nextDouble();
            }
            maiorValor = 0.0;
            posicaoMValor = 0;
            for(int i = 0;i<N;i++){
                if(maiorValor < vetor[i] ){
                    maiorValor = vetor[i];
                    posicaoMValor = i;
                }
                
               
            } 
            System.out.println(maiorValor);
            System.out.println(posicaoMValor);

            sc.close();
    }
}
