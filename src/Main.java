import static java.lang.IO.*;

void main() {

    ArrayList<Pessoa> banco = new ArrayList<>();

    banco.add(new Pessoa(1, "Murilo", 17));
    banco.add(new Pessoa(2, "Erick", 18));
    banco.add(new Pessoa(3, "Juliana", 17));
    banco.add(new Pessoa(4, "Manuela", 22));
    banco.add(new Pessoa(5, "Mathias", 17));

    ArrayList<Pessoa> cache = new ArrayList<>();

    do {

        println("\n===== MENU =====");
        println("1 - Encerrar");
        println("2 - Pesquisar pessoa");
        println("3 - Mostrar cache");
        println("Digite a opção: ");

        int rep = Integer.parseInt(readln());


        if (rep == 1) {

            println("Programa encerrado!!!");
            break;


        } else if (rep == 2) {

            println("Digite o ID da pessoa: ");
            int id = Integer.parseInt(readln());

            Pessoa encontrada = null;


            for (Pessoa pessoa : cache) {

                if (pessoa.getId() == id) {
                    encontrada = pessoa;
                    break;
                }
            }


            if (encontrada != null) {

                println("Pessoa encontrada no cache: " + encontrada.getNome() + ", " + encontrada.getIdade() + " anos");

            } else {


                for (Pessoa pessoa : banco) {

                    if (pessoa.getId() == id) {

                        encontrada = pessoa;

                        if (cache.size() == 10) {

                            Pessoa removida = cache.remove(0);

                            println("Cache cheio!");
                            println("Removida: " + removida.getNome());
                        }


                        cache.add(pessoa);

                        println("Pessoa buscada no banco e adicionada ao cache: " + pessoa.getNome() + ", " + pessoa.getIdade() + " anos");

                        break;
                    }
                }

                if (encontrada == null) {
                    println("Pessoa não encontrada!");
                }
            }


        } else if (rep == 3) {

            println("\n===== CACHE ATUAL =====");

            if (cache.isEmpty()) {

                println("O cache está vazio.");

            } else {

                for (Pessoa pessoa : cache) {

                    println("ID: " + pessoa.getId() + " | Nome: " + pessoa.getNome() + " | Idade: " + pessoa.getIdade());
                }
            }

            println("=======================");

        } else {

            println("Opção inválida!");

        }

    } while (true);
}