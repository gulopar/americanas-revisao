package ada.tech.listas;

import java.util.*;

public class RevisaoListas {

    public static void main(String[] args) {

        // List -> permite repicoes             -> ArrayList LinkedList
        // Set -> nao permite repeticoes        -> LinkedHashSet HashSet TreeSet

        List<Animal> listOfAnimals = new ArrayList<>();

        Set<Animal> setOfAnimals = new TreeSet<>();

        listOfAnimals.add(new Cachorro("Thor"));
        listOfAnimals.add(new Cachorro("Luna"));
        listOfAnimals.add(new Gato("Luna"));

        System.out.println("Lista de animais tem tamanho: " + listOfAnimals.size());


        setOfAnimals.add(new Gato("Bob"));
        setOfAnimals.add(new Gato("Thor"));
        setOfAnimals.add(new Gato("Luna"));
        setOfAnimals.add(new Cachorro("Luna"));
        System.out.println("Set de animais tem tamanho: " + setOfAnimals.size());

        for (Animal animal : setOfAnimals) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }

        System.out.println();

//        manipulandoListaIndevidamente(listOfAnimals);

        List<Cachorro> cachorros = new ArrayList<>();
        cachorros.add(new Cachorro("Thor"));
        cachorros.add(new Cachorro("Luna"));

        String nomeParaSerPesquisado = "Luna";
        Cachorro cachorroEncontrado = null;
        for (Cachorro cachorro : cachorros) {
            if (cachorro.getNome().equals(nomeParaSerPesquisado)) {
                cachorro.setNome("Tobias");
                cachorroEncontrado = cachorro;
                break;
            }
        }


        cachorros.get(0).setNome("Jacaré");
        exibirNomeDosAnimais(cachorros);

        if (cachorroEncontrado != null) {
            cachorroEncontrado.setNome("Bob");
        }

        System.out.println();

        exibirNomeDosAnimais(cachorros);


//        manipulandoListaCorretamente(cachorros);
//        exibirNomeDosAnimais(cachorros);
//
//        System.out.println();
//        System.out.println();
//
//        manipulandoListaDeAnimais(listOfAnimals);


    }

    public static void manipulandoListaDeAnimais(List<Animal> animais) {
        animais.add(new Gato("Gato 1"));
        animais.add(new Cachorro("Cachorro 1"));

        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }

    }

    public static void manipulandoListaDeCachorros(List<Cachorro> cachorros) {
        System.out.println("Adicionando novo cachorrinho");
        cachorros.add(new Cachorro("Sofia"));
    }

    public static void manipulandoListaCorretamente(List<? extends Animal> animais) {
    //        animais.add(new Cachorro("Dog"));
    //       animais.add(new Gato("Cat"));
    }

    public static void manipulandoListaIndevidamente(List listaQualquer) {
        listaQualquer.add("Novo animal");
    }

    public static void exibirNomeDosAnimais(List<? extends Animal> animais) {

        for (Animal animal : animais) {
            System.out.println(animal.getClass().getSimpleName() + ": " + animal.getNome());
        }

    }


}
