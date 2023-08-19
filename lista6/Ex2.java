import java.util.Scanner;
class Ex2{
    /*
        Solicitar um número inteiro positivo ao usuário, validando a entrada de dados
        (informando se ele estiver errado e repetindo a solicitação até que esteja correto).
        Após o programa deve informar todos os números pares existentes entre 1 e o
        número fornecido pelo usuário. ao final ele pergunte ao usuário se ele deseja
        informar um outro número. Caso positivo, o programa deve ser repetido.
        Exemplo:
        Digite um número inteiro positivo: -8 Valor incorreto!
        Digite um número inteiro positivo: 8 Numero digitado: 8
        Números inteiros pares entre 1 e 8: 2, 4, 6
        Você deseja repetir? Não
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        boolean loop=true;
        while(loop){
            System.out.printf("Digite um número inteiro positivo:");
            int numero=in.nextInt();
            while(numero<=1){
                System.out.printf("Valor incorreto\n",numero);
                numero=in.nextInt();
            }
            String numeros_string="";
            System.out.printf("Numero digitado: %d\n",numero);
            for(int i=1;i<=numero;i++){
                if(i==numero){
                    if(!numeros_string.equals("")){
                        numeros_string=numeros_string.substring(0,numeros_string.length()-1);
                    }
                    continue;
                }
                if(i%2==0){
                    numeros_string+=i+",";
                }
            }
            System.out.printf("Números inteiros pares entre 1 e %d: %s\n",numero,numeros_string);
            System.out.println("Voce Deseja Repetir?(sim/não||nao)");
            String vai_repetir=in.next();
            while(!vai_repetir.equalsIgnoreCase("sim")&&!vai_repetir.equalsIgnoreCase("não")&&!vai_repetir.equalsIgnoreCase("nao")){
                System.out.println("Valor invalido");
                vai_repetir=in.next();
            }
            if(vai_repetir.equalsIgnoreCase("não")||vai_repetir.equalsIgnoreCase("nao")){
                loop=false;
            }
        }

        in.close();
    }
}