import java.util.Scanner;
public class Ex4 {
    /*
        Ler três valores (considere que não serão informados valores iguais) e escrevê-los
        em ordem crescente. 
    */
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        int p1=0;
        int p2=0;
        int p3=0;
        if(n1>n2 && n1>n3 && n2>n3){
            p1=n1;
            p2=n2;
            p3=n3;
        }
        if(n1>n2 && n1>n3 && n3>n2){
            p1=n1;
            p2=n3;
            p3=n2;
        }

        if(n2>n1 && n2>n3 && n1>n3){
            p1=n2;
            p2=n1;
            p3=n3;
        }

        if(n2>n1 && n2>n3 && n3>n1){
            p1=n2;
            p2=n3;
            p3=n1;
        }
        
        if(n3>n2 && n3>n1 && n1>n2){
            p1=n3;
            p2=n1;
            p3=n2;
        }
        if(n3>n2 && n3>n1 && n2>n1){
            p1=n3;
            p2=n2;
            p3=n1;
        }
        System.out.printf("%d,%d,%d\n",p3,p2,p1);
        in.close();
    }
}
