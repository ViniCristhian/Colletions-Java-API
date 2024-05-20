package List.Ordenacao;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoMesmoAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoMesmoAutor.add(l);
                }
            }
        }
        return livrosDoMesmoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()) {
            for(Livro l : livrosList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2024);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2027);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2019);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2022);

        System.out.println(catalogoLivros.pesquisarPorAutor("autor 1"));

        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2019, 2020));

        System.out.println(catalogoLivros.pesquisarPorTitulo("livro 2"));
    }
}
