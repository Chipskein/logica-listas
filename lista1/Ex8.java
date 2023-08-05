import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Total de eleitores:");
        int total_eleitores=in.nextInt();
        System.out.println("votos validos:");
        int votos_validos=in.nextInt();
        System.out.println("votos brancos:");
        int votos_brancos=in.nextInt();
        System.out.println("votos nulos:");
        int votos_nulos=in.nextInt();
        float percen_validos=100*votos_validos/total_eleitores;
        System.out.println("percentual votos validos:");
        System.out.println(percen_validos);
        float percen_brancos=100*votos_brancos/total_eleitores;
        System.out.println("percentual votos brancos:");
        System.out.println(percen_brancos);
        float percen_nulos=100*votos_nulos/total_eleitores;
        System.out.println("percentual votos nulos:");
        System.out.println(percen_nulos);
        in.close();
    }
}
