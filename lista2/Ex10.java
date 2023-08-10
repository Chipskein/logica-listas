import java.util.Scanner;
class Ex10{
    /* 
         Faça um programa que receba a idade de um nadador e classifique-o numa das
        seguintes categorias:
        • Adulto (idade >= 18);
        • Juvenil (idade >= 14 e idade < 18);
        • Infantil (idade >=9 e idade < 14);
        • Mirim (Idade < 9)
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int idade=in.nextInt();
        if(idade<0) Math.abs(idade);
        if(idade>=18){
            System.out.println("Adulto");
        } 
        else{
            if(idade>=14){
                System.out.println("Juvenil");
            } 
            else{
                if(idade<9){
                    System.out.println("Mirim");
                }
                else{
                    System.out.println("Infantil");
                }
            }


        }

        in.close();
    }
};