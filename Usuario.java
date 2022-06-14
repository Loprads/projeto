import java.util.Scanner;

public class Usuario {

    protected String usuario;
    protected String senha;
    protected String usuarioval;
    protected String senhaval;

    public void cadastrarsenha() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cadastre seu usuário: ");
        this.usuario = scanner.next();
        System.out.println("Cadastre sua senha: ");
        this.senha = scanner.next();
    }

    public boolean validarsenha() {
        boolean validarsenha1, teste;
        validarsenha1 = false;
        int contador = 0;
        Scanner scanner = new Scanner(System.in);
        while (!this.usuario.equals(this.usuarioval) || !this.senha.equals(this.senhaval) && contador < 3) {
            contador++;
            System.out.println("Informe seu usuário: ");
            this.usuarioval = scanner.next();
            System.out.println("Informe sua senha: ");
            this.senhaval = scanner.next();
            if (!this.usuario.equals(this.usuarioval) || !this.senha.equals(this.senhaval)){
                System.out.println(3 - contador + " tentativas restantes... ");
                System.out.println("Senha ou usuário errada(o)! informe novamente:" );

            }

        }
        if (this.usuario.equals(this.usuarioval) && this.senha.equals(this.senhaval)) {
            System.out.println("Você está logado! ");
            return validarsenha1 = true;
        } else {
            return validarsenha1 = false;

        }

    }
}

