package Aula10;

import Aula10.Entity.Produto;
import Aula10.dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        Produto prod = new Produto(5, "Arroz branco", 13, 5.66);
        
        new ProdutoDAO().inserir(prod);
    }
}
