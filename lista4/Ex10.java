import java.util.Scanner;
public class Ex10 {
    /*
        Escreva um algoritmo para ler um salário. O algoritmo deve “validar” a leitura do
        salário para aceitar somente um “salário válido”. Você deve definir o que é um
        “salário válido”. Escrever o salário lido.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        float salario_minimo=1320.00f;
        float salario=in.nextFloat();
        while(salario<=salario_minimo){
            System.out.println("Salário inválido Digite dnv");
            salario=in.nextFloat();
        }
        System.out.println(salario);
        in.close();
    }
}
