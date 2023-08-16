import java.util.Scanner;
public class Ex24 {
    /*
        Criar um algoritmo em Java que leia um conjunto de informações (nome, sexo,
        idade, peso e altura) dos atletas que participaram de uma olimpíada, e informar:
        - O atleta do sexo masculino mais alto;
        - A atleta do sexo feminino mais pesada;
        - A média de idade dos atletas.
        Deverão ser lidos dados dos atletas até que seja digitado o nome @ para um atleta 
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String nome="";
        int n_atletas=0;
        float soma_idade=0.0f;
        String nome_m_atleta_mais_alto="";
        String nome_f_atleta_mais_pesada="";
        float maior_peso=0.0f;
        float maior_altura=0.0f;
        while(!nome.equals("@")){
            nome=in.next();
            String sexo=in.next();
            if(!sexo.equalsIgnoreCase("m")&&!sexo.equalsIgnoreCase("f")){
                continue;
            }
            int idade=in.nextInt();
            float peso=in.nextFloat();
            float altura=in.nextFloat();
            if(sexo.equalsIgnoreCase("m")&&altura>=maior_altura){
                maior_altura=altura;
                nome_m_atleta_mais_alto=nome;
            }
            if(sexo.equalsIgnoreCase("f")&&peso>=maior_peso){
                maior_peso=peso;
                nome_f_atleta_mais_pesada=nome;
            }
            soma_idade+=idade;
            n_atletas++;
        }
        float media_idade = n_atletas>0 ? soma_idade/n_atletas:0;
        System.out.printf("Atleta(M) mais alto(%.2f):%s\nAtleta(F) mais pesada(%.2f):%s\nMedia da idade dos atletas:%.2f\n",maior_altura,nome_m_atleta_mais_alto,maior_peso,nome_f_atleta_mais_pesada,media_idade);
        in.close();
    }
}
