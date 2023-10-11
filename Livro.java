import java.time.LocalDate;

public class Livro {

    public String titulo;

    public Autor autor;
    public float preco;
    public LocalDate dataLancamento;


    public float verificarTempoLanc (float dataLancamento){
//        LocalDate dataAtual = LocalDate.now();
//        long anos = dataAtual.getYear() - dataLancamento.getYear();
     //   só aceita livros com mais de 5  anos de lançamen

        if (dataLancamento >= 5 ){
            return 0;
        }else {
            return dataLancamento * 0.05f;
        }
    }


}






