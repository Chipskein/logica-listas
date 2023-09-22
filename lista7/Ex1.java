import java.util.Scanner;
import java.util.HashMap;
public class Ex1{
    /*
      Crie um programa que exibe se um dia é dia útil,
      fim de semana ou dia inválido dado
      o número referente ao dia. 
      Considere que domingo é o dia 1 e sábado é o dia 7
    */
    public static void main(String[] args){
      Scanner in=new Scanner(System.in)   ;
      System.out.println("Digite um número de 1 a 7");
      HashMap<Integer,String> dias=new HashMap<Integer,String>();
      dias.put(1,"Domingo");
      dias.put(2,"Segunda");
      dias.put(3,"Terça");
      dias.put(4,"Quarta");
      dias.put(5,"Quinta");
      dias.put(6,"Sexta");
      dias.put(7,"Sábado");
      int numero_dia = in.nextInt();
      String dia=dias.getOrDefault(numero_dia,"Dia Inválido");
      System.out.println(dia);
      in.close();
    }
}
