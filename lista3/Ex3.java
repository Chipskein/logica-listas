import java.util.Scanner;
public class Ex3 {
    /*   
        Ler três valores (considere que não serão informados valores iguais) e escrever a
        soma dos dois maiores.
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int maior1=0;
        int maior2=0;
        if(n1>n2 && n1>n3 && n2>n3){
            maior1=n1;
            maior2=n2;
        }
        if(n1>n2 && n1>n3 && n3>n2){
            maior1=n1;
            maior2=n3;
        }

        if(n2>n1 && n2>n3 && n1>n3){
            maior1=n2;
            maior2=n1;
        }

        if(n2>n1 && n2>n3 && n3>n1){
            maior1=n2;
            maior2=n3;
        }
        
        if(n3>n2 && n3>n1 && n1>n2){
            maior1=n3;
            maior2=n1;
        }
        if(n3>n2 && n3>n1 && n2>n1){
            maior1=n3;
            maior2=n2;
        }
        int soma=maior1+maior2;
        System.out.printf("%d+%d=%d\n",maior1,maior2,soma);
        in.close();
    }
}
