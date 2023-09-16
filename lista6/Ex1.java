import java.util.Scanner;
class Ex1{
    /*
        1. Fazer um programa para ler os dados (matrícula, idade, sexo, altura e
        concursado [S/N]) de váriosfuncionários de uma empresa. O último tem a
        matrícula igual a zero e não entra nos cálculos. Calcular e mostrar:
        a) o número de funcionárias concursadas;
        b) o número de funcionários (somente homens);
        c) a maior idade dos homens concursados;
        d) a quantidade de mulheres com mais de 30 anos sem concurso;
        e) a quantidade de concursados(as);
        f) a média das alturas dos homens com menos de 40 anos
        faltou testa essa porra aq
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int matricula=-1;
        int idade;
        String sexo; //"M"||"F"
        float altura;
        String concursado; //"S"||"N"
        int n_funcionarios=0;
        int total_concursados=0;
        int n_concursados=0;
        int n_concursadas=0;
        int maior_idade_homem=0;
        int qt_mulher_30_mais=0;
        int soma_idade_h_40_menos=0;
        int qt_h_40_menos=0;
        while(matricula!=0){
            matricula=in.nextInt();
            if(matricula==0){
                System.out.println("Fim do programa");
                continue;
            }
            if(matricula<0){
                System.out.println("Matricula não pode ser negativa.Digite os dados denovo");
                continue;
            }
            idade=in.nextInt();
            if(idade<0){
                System.out.println("Idade Negativa.Digite os dados denovo");
                continue;
            }
            sexo=in.next();
            if(!sexo.equalsIgnoreCase("M")&&!sexo.equalsIgnoreCase("F")){
                System.out.println("Sexo invalido m ou f");
                continue;
            }
            altura=in.nextFloat();
            if(altura<0){
                System.out.println("Altura não pode ser negativa.Digite denovo");
                continue;
            }
            concursado=in.next();
            if(!concursado.equalsIgnoreCase("S")&&!concursado.equalsIgnoreCase("N")){
                System.out.println("Concursado(S/N) Digite denovo");
                continue;
            }
            
            if(concursado.equalsIgnoreCase("S")){
                if(sexo.equalsIgnoreCase("F")){
                    n_concursadas++;
                }
                if(sexo.equalsIgnoreCase("M")){
                    n_concursados++;
                    if(idade>=maior_idade_homem){
                        maior_idade_homem=idade;
                    }
                }
                total_concursados=n_concursadas+n_concursados;
                
            } else{
                if(sexo.equalsIgnoreCase("F")){
                    if(idade>30){
                        qt_mulher_30_mais++;
                    }
                }
            }

            if(sexo.equalsIgnoreCase("M")){
                n_funcionarios++;
                if(idade<40){
                    qt_h_40_menos++;
                    soma_idade_h_40_menos+=idade;
                }
            }


        }
        float media= qt_h_40_menos>0 ? (float)soma_idade_h_40_menos/(float)qt_h_40_menos:0.0f;
        System.out.printf("o número de funcionárias concursadas:%d\no número de funcionários (somente homens):%d\na maior idade dos homens concursados:%d\na quantidade de mulheres com mais de 30 anos sem concurso:%d\na quantidade de concursados(as):%d\na média das alturas dos homens com menos de 40 anos:%.2f\n",n_concursadas,n_funcionarios,maior_idade_homem,qt_mulher_30_mais,total_concursados,media);
        in.close();
    }
}