package ada.tech.menus;

import java.util.Scanner;

public class TelaDeCadastro extends TelaAbstrata {
    private final Usuario usuario;

    public TelaDeCadastro(Scanner scanner, Usuario usuario) {
        super(scanner);
        this.usuario = usuario;
    }

    public Usuario cadastrar() {

        System.out.print("idade: ");
        Integer idade = scanner.nextInt();
        usuario.setIdade(idade);
        return usuario;
    }


}
