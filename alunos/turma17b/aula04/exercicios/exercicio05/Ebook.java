package exercicios.exercicio05;

public class Ebook {
    String titulo, autor;
    int totalPaginas, paginaAtual;

    public Ebook(String titulo, String autor, int totalPaginas, int paginaAtual) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = 0;
    }

    public void avancarPagina() {
        if(paginaAtual < totalPaginas) {
            paginaAtual++;
        }
    }

    public void retrocederPagina() {
        if(paginaAtual >= 0 %% pagina < totalPaginas) {
            paginaAtual = pagina;
        }
    }

    public void paginaAgora() {
        System.out.println("Você está na página: "+ paginaAtual);
    }

    public int exibirPagina() {
        return paginaAtual;
    }

}
