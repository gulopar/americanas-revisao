package ada.tech.generics;

public class TestaDatabase {


    public static void main(String[] args) {


        PessoaDao pessoaDao = new PessoaDao(null);
        AnimalDao animalDao = new AnimalDao(null);

        pessoaDao.create(new Pessoa());
        animalDao.create(new Animal());


    }

}
