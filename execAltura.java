import java.util.Scanner;

public class execAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double soma;
        Double media;
        Integer percentage;
        Integer idadeMenor;
        String nomeMeno;
            System.out.println("Quantas pessoas serão digitadas ?" );
            int X = sc.nextInt();
            pessoas[] vetor = new pessoas[X];

            for (int i=0; i<vetor.length;i++){
                System.out.println("Dados da " + (i+1) + " Pessoa");
                System.out.println("Nome:");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Idade:");
                int idade = sc.nextInt();
                System.out.println("Altura:");
                Double altura = sc.nextDouble();

                vetor[i] = new pessoas(nome, idade, altura);

            }

            soma = 0.0;
            for(pessoas obj : vetor){   
                soma += obj.getAltura();

            }

            media = soma / X;
            idadeMenor= 0;
            System.out.println("Altura média " + media);
            percentage = 0;
            for (pessoas obj : vetor){
                if (obj.getIdade()<16){
                idadeMenor++;
                nomeMeno = obj.getNome();
            }
             
        }
        percentage  = (100 / vetor.length)  * idadeMenor ;
        System.out.println(percentage + "%");
        for(pessoas obj : vetor){
            if(obj.getIdade()<16){
                System.out.println(obj.getNome());
            }
        }
        sc.close();
    }
}
