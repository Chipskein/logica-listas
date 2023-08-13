import java.util.Scanner;
public class Ex11_12 {
    /*
     Escreva um algoritmo para ler o número de lados de um polígono regular e a medida
    do lado (em cm). Calcular e imprimir o seguinte:
    - Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor do seu
    perímetro.
    - Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
    - Se o número de lados for igual a 5 escrever PENTÁGONO.
    Observação: Considere que o usuário só informará os valores 3, 4 ou 5.
    
    12. Acrescente as seguintes mensagens à solução do exercício anterior conforme o
    caso
    - Caso o número de lados seja inferior a 3 escrever NÃO É UM POLÍGONO.
    - Caso o número de lados seja superior a 5 escrever POLÍGONO NÃO
    IDENTIFICADO.
    Observação: Considere que o usuário poderá informar qualquer valor para o número
    de lados. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_lados=in.nextInt();
        float medida_cm=in.nextFloat();
        while(n_lados<=0){
            System.out.println("Numero de lados invalido");
            n_lados=in.nextInt();
        }
        while(medida_cm<=0){
            System.out.println("Medida Inválida");
            medida_cm=in.nextInt();
        }
        switch(n_lados){
            case 3:
                float perimetro=3*medida_cm;
                System.out.printf("TRIÂNGULO\nPerimetro:%.2f\n",perimetro);
                break;
            case 4:
                float area=medida_cm*medida_cm;
                System.out.printf("QUADRADO\nÁrea:%.2f\n",area);
                break;
            case 5:
                System.out.println("PENTÁGONO");
                break;
            default:
                if(n_lados<3){
                    System.out.println("NÃO É UM POLÍGONO");
                } else{
                    System.out.println("POLÍGONO NÃO IDENTIFICADO");
                }
                break;
        }
        in.close();
    }
}
