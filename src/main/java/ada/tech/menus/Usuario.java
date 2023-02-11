package ada.tech.menus;

public class Usuario {

    private final String nome;
    private Integer idade;


    public Usuario(String nome) {
        this.nome = nome;
    }


    public String getNome() {
        return nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

}
