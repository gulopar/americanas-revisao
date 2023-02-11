package ada.tech.generics;

public class PessoaDao extends AbstractDao <Pessoa, String> {

    public PessoaDao(Repository<Pessoa, String> repository) {
        super(repository);
    }
}
