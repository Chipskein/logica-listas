import java.util.Scanner;
public class Ex10 {
    /*
        Tendo como entrada a altura e o sexo (codificado da seguinte forma: 1:feminino
        2:masculino) de uma pessoa, construa um algoritmo que 
        calcule e imprima seu peso ideal, utilizando as seguintes fórmulas:
        - para homens : (72.7 * h) – 58
        - para mulheres : (62.1 * h) – 44.7
        Observação: Altura = h (na fórmula acima)
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int feminino=1;
        int masculino=2;
        float h=in.nextFloat();
        int sexo=in.nextInt();
        while(sexo!=masculino&&sexo!=feminino){
            System.out.println("Sexo invalido");
            sexo=in.nextInt();
        }
        float peso_ideal=0.0f;
        if(sexo==masculino){
            peso_ideal=(72.7f * h)-58.0f;
        } else{
            peso_ideal=(62.1f * h)-44.7f;
        }
        System.out.println(peso_ideal);
        in.close();
    }
}
