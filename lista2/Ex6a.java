import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Ex6a {
    /*
      a. Desafio e pesquisa: utilizando a classe Calendar ou Date do Java, peça que
        o usuário informe sua data de nascimento e o sistema irá calcular quantos
        anos, meses e dias a pessoa viveu.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            int qt_dias_ano=365;
            int qt_dias_mes=30;
            System.out.println("Digite a sua data de nascimento (yyyy-mm-dd):");
            
            String data_nasc_string=in.next();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

            Date data_nasc=format.parse(data_nasc_string);
            Date today=new Date();

            Calendar calendar_nasc=Calendar.getInstance();
            calendar_nasc.setTime(data_nasc);

            Calendar calendar_today=Calendar.getInstance();
            calendar_today.setTime(today);
            
            int idade = calendar_today.get(Calendar.YEAR)-calendar_nasc.get(Calendar.YEAR);
            if(idade<0) Math.abs(idade);
            
            int nasc_mes=calendar_nasc.get(Calendar.MONTH);
            int today_mes=calendar_today.get(Calendar.MONTH);
            
            int nasc_day=calendar_nasc.get(Calendar.DAY_OF_MONTH);
            int today_day=calendar_today.get(Calendar.DAY_OF_MONTH);
            
            if( (today_mes==nasc_mes && today_day<nasc_day) || today_mes<nasc_mes){
                idade--;
            }

            int viveu_anos = idade;
            int viveu_dias = idade*qt_dias_ano;
            int viveu_mes = viveu_dias/qt_dias_mes;
            System.out.printf("Viveu Anos:%d\nViveu Dias:%d\nViveu Mes:%d\n",viveu_anos,viveu_dias,viveu_mes);
        }
        catch(Exception err){
            System.out.println("Data Inválida");
            System.out.println(err);
        }
        finally {
            in.close();
        }
    }
}
