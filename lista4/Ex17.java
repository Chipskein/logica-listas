import java.util.Scanner;
public class Ex17 {
    /*
        Desenvolva um programa em Java que determine o pagamento bruto de cada um de
        vários empregados. 
            A companhia paga o valor de uma "hora normal" pelas primeiras 40 horas 
            trabalhadas de cada empregado e paga o valor de uma "hora extra" (uma
            vez e meia a hora normal) para cada hora trabalhada depois de completadas as
        primeiras 40 horas. Seu programa deve primeiramente receber a informação de
        quantos empregados trabalharam durante a semana. 
        Em seguida, receba cada uma
        das informações acima descritas, para cada empregado, e mostre o pagamento
        bruto para cada um deles. O valor da hora de cada empregado deve ser também
        solicitado, pois pode ser diferente para cada empregado.
    */    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n_empregados=in.nextInt();
        while(n_empregados<=0){
            System.out.println("Numero de empregados invalido");
            n_empregados=in.nextInt();
        }
        int hr_normal=40;
        for(int i=1;i<=n_empregados;i++){
            int n_horas_empregado=in.nextInt();
            float valor_hr_empregado=in.nextFloat();
            if(n_horas_empregado<=0||valor_hr_empregado<=0){
                System.out.println("Input invalido");
                i--;
                continue;
            }
            float valor_hr_extra=1.5f*valor_hr_empregado;
            int hr_extra_trabalhada=n_horas_empregado-hr_normal;
            if(hr_extra_trabalhada<0) hr_extra_trabalhada=0;
            int hr_normal_trabalhada=n_horas_empregado-hr_extra_trabalhada;
            float bruto=((float)hr_normal_trabalhada*valor_hr_empregado)+((float)hr_extra_trabalhada*valor_hr_extra);
            System.out.printf("Horas Totais:%d\nHora Extra:%d\nValor Da Hora:%.2f\nValor Da Hora Extra:%.2f\nBruto:%.2f\n",n_horas_empregado,hr_extra_trabalhada,valor_hr_empregado,valor_hr_extra,bruto);
        }
        in.close();
    }
}
