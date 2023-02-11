package ada.tech.menus;

import java.util.Scanner;

public class TelaDeLogin extends TelaAbstrata {

    public TelaDeLogin(Scanner scanner) {
        super(scanner);
    }

    public Usuario autenticar() {

        System.out.print("nome: ");
        String nome = scanner.nextLine();

        System.out.print("senha: ");
        String senha = scanner.nextLine();

        if ("admin".equals(senha)) {
            return new Usuario(nome);
        }
        return null;
    }


}
