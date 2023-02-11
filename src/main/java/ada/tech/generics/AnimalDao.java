package ada.tech.generics;

public class AnimalDao extends AbstractDao <Animal, String> {

    public AnimalDao(Repository<Animal, String> repository) {
        super(repository);
    }
}
