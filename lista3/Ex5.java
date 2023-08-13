import java.util.Scanner;
public class Ex5 {
    /*
        Ler três valores (A, B e C) representando as medidas dos lados de um triângulo e
        escrever se formam ou não um triângulo. Observação: para formar um triângulo, o
        valor de cada lado deve ser menor que a soma dos outros dois lados. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        float b=in.nextFloat();
        float c=in.nextFloat();
        String status="Não forma";
        if(a+b>c && a+c>b && b+c>a){
            status="Forma";
        }
        System.out.printf("Medidas:%.2f;%.2f;%.2f\nStatus:%s\n",a,b,c,status);
        in.close();
    }
}
