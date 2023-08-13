import java.util.Scanner;
public class Ex15 {
    /*
      15. Considere o algoritmo abaixo
        Algoritmo TipoDeTriangulo
        int a, b, c;
        texto mensagem;
        Inicio
        leia(a, b, c);
        se (a<b+c) e (b<a+c) e (c<a+b) então
        se (a==b) e (b==c) então
        mensagem = “Triângulo Equilátero”
        senão
        se (a==b) ou (b==c) ou (a==c) então
        mensagem = “Triângulo Isósceles”;
        senão
        mensagem = “Triângulo Escaleno”;
        fim-se
        fim-se
        senão
        mensagem = “Não é possível formar um triângulo”;
        fim-se
        escreva(mensagem);
        Fim
        Faça um teste de mesa e complete o quadro a seguir para os seguintes valores das
        variáveis: Experimente implementar o mesmo algoritmo em JAVA e verificar se seu teste de
        mesa foi correto.


        a b c mensagem
        1 2 3 Não forma
        3 4 5 Escaleno
        2 2 4 Nao forma
        4 4 4 Equilatero
        5 3 3 Isosceles
    */ 
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String mensagem="";
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        while(a<0||b<0||c<0){
            System.out.println("Medida do lado negativa digite novamente");
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
        }
        if((a<b+c) && (b<a+c) && (c<a+b)){
            if(a==b&&b==c){
                mensagem="Triangulo Equilatero";    
            } else{
                if(a==b||b==c||a==c){
                    mensagem="Triangulo Isosceles";    
                } else{
                    mensagem="Triangulo Escaleno";    
                }
            }
        }
        else{
            mensagem="Não é possivel formar triangulo";
        }
        System.out.println(mensagem);
        in.close();
    }
}
