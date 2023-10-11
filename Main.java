import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> ListaLivro = new ArrayList<>();
        Livro metodoListagem = new Livro();


        System.out.println("Bem vindo ao sistema");
        Scanner leitor = new Scanner(System.in);
        String opcao;



        do {

            System.out.println("Escolha uma opção: 1 - Cadastrar Livro  / 2 - Listar Livro / 0 - Sair");
            opcao = leitor.nextLine();

            switch (opcao) {


                            case "1":

                               Livro novoLiv = new Livro();


                                System.out.println("Digite o Titulo: ");
                                novoLiv.titulo = leitor.nextLine();

                                System.out.println("Digite o nome do Autor: ");
                                novoLiv.autor.nome = leitor.nextLine();

                                System.out.println("Digite o preco: ");
                                novoLiv.preco = leitor.nextFloat();

                                System.out.println("Digite a data do Livro: ");
                                novoLiv.dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                                Period dataLan = Period.between(novoLiv.dataLancamento, LocalDate.now());

                                if (idade.getYears() >= 5){
                                    System.out.println("Livro Disponivel!");
                                }else{
                                    System.out.println("Livro Indisponivel!");
                                    break;
                                }



                                ListaLivro.add(novoLiv);

                                System.out.println("Cadastro realizado com sucesso!");

                                break;

                            case "2":

                                if (ListaLivro.size() > 0) {

                                    for (Livro cadaLL : ListaLivro) {
                                        System.out.println("Titulo: " + cadaLL.titulo);
                                        System.out.println("Autor: " + cadaLL.autor);
                                        System.out.println("Valor: " + cadaLL.preco);
                                        System.out.println("Data do Livro" + cadaPf.dataNasc.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.println("Imposto a ser pago: " + metodoPf.CalcularImposto(cadaPf.rendimento));
                                        System.out.println("Endereço: " + cadaPf.endereco.logradouro + "-" + cadaPf.endereco.numero);

                                        System.out.println();
                                        System.out.println("Aperte ENTER para continuar");
                                        leitor.nextLine();

                                    }

                                } else {
                                    System.out.println("Lista vazia!");
                                }

                                break;

                            case "0":
                                System.out.println("case 0");
                                break;

                            default:
                                System.out.println("Opção inválida");
                                break;
                        }

                    } while (!opcao.equals("0"));

                    break;



