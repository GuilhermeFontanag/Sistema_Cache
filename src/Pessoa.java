public class Pessoa {

    private int id;
    private String nome;
    private int idade;

    public Pessoa(int id, String nome, int idade) {

        if (id == 0 ){
            throw new IllegalArgumentException("informe o ID corretamente");
        }
            this.id = id;

        if (nome.isBlank() || nome == null  ) {
            throw new IllegalArgumentException("informe o nome corretamente");
        }
        this.nome = nome;

        if (idade == 0  ){
            throw new IllegalArgumentException("informe sua idade corretamente");
        }
        this.idade = idade;
    }


    //gettera
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
