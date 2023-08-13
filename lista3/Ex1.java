import java.util.Scanner;
class Ex1{
    /*1. Ler um valor e escrever se é positivo, negativo ou zero */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String msg="";
        int n=in.nextInt();
        if(n==0){
            msg="zero";
        }
        if(n>0){
            msg="positivo";
        } else if(n!=0){
            msg="negativo";
        }
        System.out.println(msg);
        in.close();
    }
}