import java.util.Scanner;
public class Ex3 {
    /*
        Faça um programa que receba a altura e o peso de várias pessoas até que sejam
        informados os valores zero para a altura. Calcule o IMC e mostre ao final quantas
        pessoas estão em cada faixa de IMC conforme o quadro a seguir: 

    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        int qt_faixa_abaixo=0;
        float faixa_normal_inicio=18.5f;
        float faixa_normal_fim=24.59f;
        int qt_faixa_normal=0;

        float faixa_sobrepeso_inicio=25.0f;
        float faixa_sobrepeso_fim=29.9f;
        int qt_faixa_sobrepeso=0;

        float faixa_obesidade_g1_inicio=30.0f;
        float faixa_obesidade_g1_fim=34.9f;
        int qt_faixa_obesidade_g1=0;
        
        float faixa_obesidade_g2_inicio=35.0f;
        float faixa_obesidade_g2_fim=39.9f;
        int qt_faixa_obesidade_g2=0;
        
        float faixa_obesidade_g3=40.0f;
        int qt_faixa_obesidade_g3=0;

        float altura=1;//m
        float peso=1;//kg
        while(altura!=0){
            altura=in.nextFloat();
            if(altura==0){
                continue;
            }
            peso=in.nextFloat();
            float imc=peso/(altura*altura);
            System.out.println(Math.round(imc));
            //g3
            if(imc>=faixa_obesidade_g3){
                qt_faixa_obesidade_g3++;
                continue;
            }
            //g2
            if(faixa_obesidade_g2_fim>=imc&&imc>=faixa_obesidade_g2_inicio){
                qt_faixa_obesidade_g2++;
                continue;
            }
            //g1
            if(faixa_obesidade_g1_fim>=imc&&imc>=faixa_obesidade_g1_inicio){
                qt_faixa_obesidade_g1++;
                continue;
            }
            //sobrepeso
            if(faixa_sobrepeso_fim>=imc&&imc>=faixa_sobrepeso_inicio){
                qt_faixa_sobrepeso++;
                continue;
            }
            //normal
            if(faixa_normal_fim>=imc&&imc>=faixa_normal_inicio){
                qt_faixa_normal++;
                continue;
            }
            if(faixa_normal_inicio>imc){
                qt_faixa_abaixo++;
                continue;
            }
        }
        System.out.printf("Faixa Abaixo do peso tem %d pessoas\nFaixa Normal tem %d pessoas\nFaixa Sobrepeso tem %d pessoas\nFaixa Obesidade Grau 1 tem %d pessoas\nFaixa Obesidade Grau 2 tem %d pessoas\nFaixa Obesidade Grau 3 tem %d pessoas\n",qt_faixa_abaixo,qt_faixa_normal,qt_faixa_sobrepeso,qt_faixa_obesidade_g1,qt_faixa_obesidade_g2,qt_faixa_obesidade_g3);
        in.close();
    }
}
