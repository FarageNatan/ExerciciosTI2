package app;

import static spark.Spark.*;

public class ProdutoService {
    private ProdutoDAO produtoDAO = new ProdutoDAO();

    public ProdutoService() {
        post("/produto", (req, res) -> {
            String nome = req.queryParams("nome");
            String descricao = req.queryParams("descricao");
            double preco = Double.parseDouble(req.queryParams("preco"));

            Produto produto = new Produto(nome, descricao, preco);
            produtoDAO.inserir(produto);

            res.redirect("/produtos");
            return null;
        });

        // Definição dos endpoints para atualizar, deletar e listar produtos
    }
}
