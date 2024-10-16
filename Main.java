import br.com.alura.modelos.Produto;
import br.com.alura.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();

        Produto produto1 = new Produto("Vassoura", 10, 5);
        Produto produto2 = new Produto("Rastelo", 13, 9);
        Produto produto3 = new Produto("Pá", 15, 7);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Produto pelo indice: " + listaDeProdutos.get(1).toString());

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Arroz", 15, 10);
        System.out.println("Produto perecível: " + produtoPerecivel);
    }
}