import java.util.Scanner;
public class Ex9 {
    /*
        Escreva um algoritmo para ler uma idade, mas o algoritmo deve aceitar somente
        idade válida, ou seja, o algoritmo deve “validar” a leitura da idade. Idade válida tem
        que ser maior que 0 e menor que 150. Escrever a idade lida. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int idade=in.nextInt();
        while(idade<0||idade>150){
            System.out.println("Idade inválida");
            idade=in.nextInt();
        }
        System.out.println(idade);
        in.close();
    }
}
