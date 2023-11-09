import java.util.Scanner;
public class ExercicioVetores{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        final int TAMANHO=10;
        int [] x=new int[TAMANHO];
        testando_label:
        while(true){
            System.out.println("Escolha ai uma opção:");
            System.out.println("0- Sair");
            System.out.println("1 - mostra");
            System.out.println("2 - insere ai");
            System.out.println("3 - Maior valor");
            System.out.println("4 - Menor Posição");
            System.out.println("5 - Media dos diferentes de zero");
            System.out.println("6 - Qt pares e impares");
            System.out.println("7 - Trocar o valor entre duas posições");
            System.out.println("8 - Identificar sequencias");
            System.out.println("9 - Ordenar vetor");
            System.out.println("10 - Criar um novo vetor com tamanho diferente copiando os valores do vetor antigo");
            int op=in.nextInt();
            switch (op){
                case 0:
                    System.out.println("Saindo");
                    break testando_label;
                case 1:
                    String msg="";
                    for(int i=0;i<x.length;i++){
                        msg+=""+x[i]+" ";
                    }
                    System.out.println(msg);
                    break;
                case 2:
                    System.out.println("Digite o index:");
                    int index=in.nextInt();
                    System.out.println("Digite o valor:");
                    int value=in.nextInt();
                    if(index<0||index>=x.length){
                        System.out.println("Valores Invalidos:");
                        break;
                    }
                    x[index]=value;
                    break;
                case 3:
                    int max=0;
                    int pos_max=0;
                    for(int i=0;i<x.length;i++){
                        if(x[i]>=max){
                            max=x[i];
                            pos_max=i;
                        }
                    }
                    System.out.printf("Valor Maximo %d na posição %d \n",max,pos_max);
                    break;
                case 4:
                    int min=x[0];
                    int pos_min=0;
                    for(int i=0;i<x.length;i++){
                        if(x[i]<min){
                            min=x[i];
                            pos_min=i;
                        }
                    }
                    System.out.printf("Valor Minimo %d na posição %d \n",min,pos_min);
                    break;
                case 5:
                    int qt_diff_zero=0;
                    int sum_diff_zero=0;
                    
                    for(int i=0;i<x.length;i++){
                        if(x[i]!=0){
                            sum_diff_zero+=x[i];
                            qt_diff_zero++;
                        }
                    }
                    float media= qt_diff_zero==0 ? 0.0f:((float)sum_diff_zero)/((float)qt_diff_zero);
                    System.out.printf("Media dos valores diferentes de zero: %.2f \n",media);
                    break;
                case 6:
                    int pares=0;
                    int impares=0;
                    for(int i=0;i<x.length;i++){
                        if(x[i]%2==0){
                            pares++;
                        } else{
                            impares++;
                        }
                    }
                    System.out.printf("Qt Pares:%d\nQt Impares: %d\n",pares,impares);
                    break;
                case 7:
                    System.out.println("Digite pos 1");
                    int pos1=in.nextInt();
                    if(pos1<0||pos1>=x.length){
                        System.out.println("Posiçao 1 invalida");
                    }
                    System.out.println("Digite pos 2");
                    int pos2=in.nextInt();
                    if(pos2<0||pos2>=x.length){
                        System.out.println("Posiçao 2 invalida");
                    }
                    int v1=x[pos1];
                    int v2=x[pos2];
                    x[pos2]=v1;
                    x[pos1]=v2;
                    System.out.printf("%d=>%d\n%d=>%d\n",v1,x[pos1],v2,x[pos2]);
                    break;
                case 8:
                    int qt_sequencias_crescentes=0;
                    int conta_seq=0;
                    for(int i=0;i<x.length-1;i++){
                        if(x[i+1]-x[i]==1){
                           if(conta_seq==0){
                                qt_sequencias_crescentes++;
                           } 
                           conta_seq++; 
                        } else {
                            conta_seq=0;
                        }
                    }
                    System.out.printf("O vetor x tem %d sequências crescentes\n",qt_sequencias_crescentes);
                    break;
                case 9:
                    for(int i=0;i<x.length;i++){
                        for(int j=i;j<x.length;j++){
                            if(x[i] > x[j]){
                                int val=x[i];
                                int val2=x[j];
                                x[j]=val;
                                x[i]=val2;
                            }
                        }
                    }
                    break;
                case 10:
                    System.out.println("Digite o tamanho do vetor x2");
                    int tamanho=in.nextInt();
                    int []x2=new int[tamanho];
                    int j=0;
                    for(int i=0;i<x2.length;i++){
                        x2[i]=x[j];
                        if(j==x.length-1){
                            j=0;
                            continue;
                        }

                        j++;
                    }
                    String msg2="";
                    for(int i=0;i<x2.length;i++){
                        msg2+=""+x2[i]+" ";
                    }
                    System.out.println(msg2);
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
        in.close();
    }
}