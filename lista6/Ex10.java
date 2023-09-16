import java.util.Scanner;
public class Ex10{
   /*
   Escreva um programa que leia um valor inteiro n > 0 e desenhe na tela um triângulo
   com asteriscos (*) que possua a quantidade de linhas n.
   Exemplo: n=3
      *****
       ***
        *


   n=5

    ********* 9
     ******* 7
      ***** 5
       *** 3
        * 1

   */  
  public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      System.out.println("Digite um numero");
      int n=in.nextInt();
      int contador_espacos_esquerda=0;
      while(n>0){
         String linha="";
         /* Por Alguma Razão String.repeat() o compilador reclama então eu fiz na mão mesmo */
         String asteriscos_linha="";
         String espacos_esquerda="";
         int c=0;
         while(c<(n*2)-1){
            asteriscos_linha+="*";
            c++;
         }
         int c2=0;
         while(c2<contador_espacos_esquerda){
            espacos_esquerda+=" ";
            c2++;
         }
         contador_espacos_esquerda++;
         
         linha=espacos_esquerda+asteriscos_linha;
         System.out.println(linha);
         n--;
      }
      in.close();
  } 
}

