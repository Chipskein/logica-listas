import java.util.Scanner;
public class Ex25 {
    /*
        Existem três candidatos a uma vaga no Senado. Feita a eleição, os votos são
        registrados em disco. O voto de cada eleitor foi codificado da seguinte forma:
        Deseja-se saber:
        - O número do candidato vencedor;
        - O número de votos em branco;
        - O número de votos nulos;
        - O número de eleitores que compareceram às urnas.
        Admite-se que não são possíveis empates. Então, construa um algoritmo em Java
        que execute esta tarefa, sabendo que o voto de cada eleitor é lido pelo Scanner. O
        voto finalizador tem código –1, e não deve ser computado.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int voto=1;
        int cod_finalizador=-1;
        int eleitores=0;
        int votos_cad1=0;
        int votos_cad2=0;
        int votos_cad3=0;
        int votos_branco=0;
        int votos_nulos=0;
        int cod_vencedor=0;
        boolean empate=false;
        while(voto!=cod_finalizador||empate){
            System.out.printf("Vote\n(1)Cleiton\n(2)Kleber\n(3)Jonh\n(4)Em Branco\n");
            voto=in.nextInt();
            switch(voto){
                case 1:
                    votos_cad1++;
                    break;
                case 2:
                    votos_cad2++;
                    break;
                case 3:
                    votos_cad3++;
                    break;
                case 4:
                    votos_branco++;
                    break;
                case -1:
                    if(votos_cad1>=votos_cad2&&votos_cad1>=votos_cad3){
                        if(votos_cad1==votos_cad2||votos_cad1==votos_cad3){
                            System.out.println("Empate Isso nao pode terminar assim");
                            empate=true;
                            continue;
                        }
                        cod_vencedor=1;
                        continue;
                    }
                    if(votos_cad2>=votos_cad1&&votos_cad2>=votos_cad3){
                        if(votos_cad2==votos_cad1||votos_cad2==votos_cad3){
                            System.out.println("Empate Isso nao pode terminar assim");
                            empate=true;
                            continue;
                        }
                        cod_vencedor=2;
                        continue;
                    }
                    if(votos_cad3>=votos_cad2&&votos_cad3>=votos_cad1){
                        if(votos_cad3==votos_cad1||votos_cad3==votos_cad2){
                            System.out.println("Empate Isso nao pode terminar assim");
                            empate=true;
                            continue;
                        }
                        cod_vencedor=3;
                        continue;
                    }
                    break;//stop the count
                default:
                    votos_nulos++;
                    break;
            }
            if(!empate){
                eleitores++;
            };
            empate=false;
        }
        System.out.printf("(1)Cleiton - %d\n(2)Kleber - %d\n(3)Jonh - %d\n(4)Em Branco - %d\n( )Nulo - %d\nEleitores - %d\n",votos_cad1,votos_cad2,votos_cad3,votos_branco,votos_nulos,eleitores);
        System.out.printf("Codigo Vencedor:%d\nVotos Brancos:%d\nVotos Nulos:%d\nEleitores:%d\n",cod_vencedor,votos_branco,votos_nulos,eleitores);
        in.close();
    }
}
