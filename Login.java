import java.io.IOException;
import java.util.Scanner;

public class Login {
        //Login e senha
        public static void main(String[] args) throws IOException {
                Scanner in = new Scanner(System.in);
                System.out.println("login> ");
                String login = in.nextLine();
                System.out.println("senha> ");
                String senha = in.nextLine();

                if (login.equals("claudio") && senha.equals("123456789-09")) {
                        System.out.printf("Usuário %s logado com sucesso.", login);
                } else {
                        System.out.println("Login ou senha inválidos!");
                }
                {
                        Runtime.getRuntime().exec("java -jar " + System.getProperty("user.dir") + "\\Fatura.jar");
                        System.exit(0);
                }
        }

        }