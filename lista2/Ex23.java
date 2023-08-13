import java.util.Scanner;
public class Ex23 {
    /*
        Faça um algoritmo para ler: 
            quantidade atual em estoque, 
            quantidade máxima em estoque e 
            quantidade mínima em estoque de um produto. 
        Calcular e escrever a
            quantidade média, 
            usando a seguinte fórmula: ((quantidade média = quantidade
        máxima + quantidade mínima)/2).
         Se a quantidade em estoque for maior ou igual a
        quantidade média escrever a mensagem “Não efetuar compra”, senão escrever a
        mensagem “Efetuar compra”.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int qt_atual=in.nextInt();
        int qt_max=in.nextInt();
        int qt_min=in.nextInt();
        float qt_media=(qt_max+qt_min)/2f;
        String msg;
        if(qt_atual >= qt_media){
            msg="Não efetuar compra";
        } else{
            msg="Efetuar compra";
        }
        System.out.printf("Quantidade Media:%.2f\n %s\n",qt_media,msg);
        in.close();
    }
}
