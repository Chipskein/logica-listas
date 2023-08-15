import java.util.Scanner;
public class Ex18 {
    /*
            Faça um programa que, para um número indeterminado de pessoas: leia a idade de
        cada uma, sendo que a idade 0 (zero) indica o fim da leitura e não deve ser
        considerada. A seguir calcule:
        • o número de pessoas;
        • a idade média do grupo;
        • a menor idade e a maior idade.
    
    */   
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int max=0;
        int min=0;
        int soma=0;
        int n_pessoas=0;
        while(true){
            int idade=in.nextInt();
            if(idade<0){
                System.out.println("Idade negativa");
                n_pessoas--;
                continue;
            }
            if(n_pessoas==0){
                min=idade;
            }
            if(idade==0){
                System.out.println("Fim de leitura");
                break;
            }
            if(idade>=max){
                max=idade;
            }
            if(idade<=min){
                min=idade;
            }
            soma+=idade;
            n_pessoas++;
        }
        float media=(float) soma/(n_pessoas+1);
        System.out.printf("Numero de pessoas:%d\n\nMedia da idades:%.2f\nMenor Idade:%d\nMaior Idade:%d\n",n_pessoas,media,min,max);
        in.close();
    }
}
