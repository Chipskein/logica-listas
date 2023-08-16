import java.util.Scanner;
class Ex27{
    /*
        Faça um programa que receba um valor inteiro, e imprima na tela o dobro dele, ao
        lado da soma com seu antecessor. Faça isso consecutivamente, imprimindo sempre
        o dobro do valor que apareceu na tela e a soma com o antecessor, por N vezes. O
        valor de N é fornecido pelo usuário. 
        Por exemplo: Recebe o valor inteiro 2, e N = 3,
        então imprime:

            0 2 Dobro = 4 Soma com Antecessor = 4       = 4+0
            1 4 Dobro = 8 Soma com Antecessor = 12      = 8+4
            2 8 Dobro = 16 Soma com Antecessor = 24     = 16+8
            3 16 Dobro = 32 Soma com Antecessor = 48     = 32+16

        O limite de execução é quando atingir o valor de N, ou quando o dobro ou a soma
        atingirem o valor inteiro de 100.000. 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int valor_inicial=in.nextInt();
        int n_iteracoes=in.nextInt();
        int i=0;
        int limite=100000;
        int dobro=0;
        int soma=0;
        int antecessor=0;
        int numero=valor_inicial;
        while(i<=n_iteracoes||dobro>=limite){
            if(soma>=limite){
                break;
            }
            dobro=numero*2;
            numero=dobro;
            soma=antecessor+dobro;
            antecessor=dobro;
            System.out.printf("Dobro = %d Soma com Antecessor=%d\n",dobro,soma);
            i++;
        }
        in.close();
    }
}