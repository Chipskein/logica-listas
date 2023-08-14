import java.util.Scanner;
public class Ex12 {
    /*
        Faça um programa que peça para o usuário digitar um valor qualquer (inteiro).
        Enquanto o valor digitado não for múltiplo 5, o programa continua solicitando ao
        usuário para digitar um valor. O programa somente irá encerrar quando o valor
        digitado for múltiplo de 5. Para isso, você precisa conhecer o operador utilizado para
        o resto da divisão: %. Ele deve ser utilizado da seguinte maneira, por exemplo:
        A = B % C;
        Essa operação deve ser lida como: a variável A recebe o resto da divisão de B por
        C. Ou seja, se B é 10 e C é 3, o resto da divisão é 1, pois 10 dividido por 3, quando
        consideramos apenas números inteiros, é 3. E 3 vezes o divisor corresponde ao
        número 9, tendo 1 como resto dessa divisão
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int valor=in.nextInt();
        while(valor % 5 != 0 ){
            System.out.println("Valor não é multiplo de 5. Digite novamente");
            valor=in.nextInt();
        }
        System.out.println("Valor informado é multiplo de 5");
        in.close();
    }
}
