package ada.tech.menus;

import java.util.Scanner;

public abstract class TelaAbstrata {

    protected final Scanner scanner;

    protected TelaAbstrata(Scanner scanner) {
        this.scanner = scanner;
    }
}
