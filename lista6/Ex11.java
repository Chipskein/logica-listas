import java.util.Scanner;
public class Ex11{
    /*
        Faça um programa que leia dois números inteiros positivos: lin e col. Desenhe um
        retângulo usando o valor de lin e col.
        Exemplo: lin=5 e col =10
        ----------
        |        |
        |        |
        |        |
        |        |
        |        |
        ----------
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Digite lin col");
        int lin=in.nextInt();
        int col=in.nextInt();
        //String.repeat nao funciona por alguma motivo
        int coluna_str_counter=0;
        String coluna="";
        while(coluna_str_counter<col){
            coluna+="-";
            coluna_str_counter++;
        }
        System.out.println(coluna);
        int linha_counter=0;
        while(linha_counter<lin){
            int espacos_str_counter=0;
            String espacos="";
            while(espacos_str_counter<(col-2)){
                espacos+=" ";
                espacos_str_counter++;
            }
            String linha="|"+espacos+"|";
            System.out.println(linha);
            linha_counter++;
        }
        System.out.println(coluna);
        in.close();
    }
}