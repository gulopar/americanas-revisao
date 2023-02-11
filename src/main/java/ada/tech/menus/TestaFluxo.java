package ada.tech.menus;

import java.util.Scanner;

public class TestaFluxo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TelaDeLogin telaDeLogin = new TelaDeLogin(scanner);
        Usuario usuario = telaDeLogin.autenticar();

        if (usuario != null) {
            System.out.println("Usuario " + usuario.getNome() + " autenticado");

            TelaDeCadastro telaDeCadastro = new TelaDeCadastro(scanner, usuario);
            telaDeCadastro.cadastrar();

            System.out.println("Usuario cadastrado com " + usuario.getIdade() + " anos de idade");


        } else {
            System.out.println("Erro ao autenticar usuario");
        }


    }

}
