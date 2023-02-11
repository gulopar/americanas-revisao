package ada.tech.listas;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {

    private String nome;
    private int idade;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public int compareTo(Animal o) {
        int comparacao1 = this.getNome().compareTo(o.getNome());
        int comparacao2 = this.getClass().getSimpleName().compareTo(o.getClass().getSimpleName());
        return comparacao1 + comparacao2;
    }
}
