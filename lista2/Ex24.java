import java.util.Scanner;
public class Ex24 {
    /*
        Escreva um programa que faça a leitura da 
            idade de 2 homens e 2 mulheres
    (supondo que as idades do mesmo sexo serão diferentes). 
    O programa deve fazer o
    somatório da idade do 
        homem mais velho com a idade da mulher mais nova e o
    produto da idade do homem mais novo pela idade da mulher mais velha. Ao final
    você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
    nova, mulher mais velha, homem mais novo e homem mais velho.
     
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int h_mais_velho;
        int h_mais_novo;
        int m_mais_velha;
        int m_mais_nova;

        int h1_idade=in.nextInt();
        int h2_idade=in.nextInt();

        if(h1_idade>h2_idade){
            h_mais_velho=h1_idade;
            h_mais_novo=h2_idade;
        } else{
            h_mais_velho=h2_idade;
            h_mais_novo=h1_idade;
        }
        int m1_idade=in.nextInt();
        int m2_idade=in.nextInt();

        if(m1_idade>m2_idade){
            m_mais_velha=m1_idade;
            m_mais_nova=m2_idade;
        } else{
            m_mais_velha=m2_idade;
            m_mais_nova=m1_idade;
        }
        int somatorio=h_mais_velho+m_mais_nova;
        int produto=h_mais_novo*m_mais_velha;
        System.out.printf("Somatorio:%d\nProduto:%d\n",somatorio,produto);
        in.close();
    }
}
