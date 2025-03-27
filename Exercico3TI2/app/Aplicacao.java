package app;

import static spark.Spark.*;

public class Aplicacao {
    public static void main(String[] args) {
        staticFiles.location("/public");

        new ProdutoService();
    }
}
