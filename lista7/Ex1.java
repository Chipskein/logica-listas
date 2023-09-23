import java.util.Scanner;
public class Ex1{
    /*
      Crie um programa que exibe se um dia é dia útil,
      fim de semana ou dia inválido dado
      o número referente ao dia. 
      Considere que domingo é o dia 1 e sábado é o dia 7
    */
    public static void main(String[] args){
      Scanner in=new Scanner(System.in);
      String message="Dia inválido";
      System.out.println("Digite um número de 1 a 7");
      final int DOMINGO = 1;
      final int SABADO = 7;
      int dia = in.nextInt();
      if(dia >= DOMINGO && dia <= SABADO){
        if (dia == DOMINGO || dia == SABADO){
          message="fim de semana";
        } else{
          message="dia útil";
        }
      }
      System.out.println(message);
      in.close();
    }
}
