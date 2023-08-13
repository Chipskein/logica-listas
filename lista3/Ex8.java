import java.util.Scanner;
public class Ex8 {
    /*
        Faça um algoritmo para ler um número que é um código de usuário. Caso este
        código seja diferente de um código armazenado internamente no algoritmo (igual a
        1234) deve ser apresentada a mensagem “Usuário inválido!”. Caso o Código seja
        correto, deve ser lido outro valor que é a senha. Se esta senha estiver incorreta (a
        certa é 9999) deve ser mostrada a mensagem ‘senha incorreta’. Caso a senha
        esteja correta, deve ser mostrada a mensagem “Acesso permitido”.
    */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int expected_cod_user=1234;
        int expected_senha_user=9999;
        int cod_user=in.nextInt();
        String msg="Usuário inválido";
        if(cod_user==expected_cod_user){
            int senha=in.nextInt();
            if(senha==expected_senha_user){
                msg="Acesso permitido";
            } else{
                msg="senha incorreta";
            }
        }        
        System.out.printf("%s\n",msg);
        in.close();
    }
}
