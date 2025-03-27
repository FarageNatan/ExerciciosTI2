package app;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {
    private Connection conexao;

    public ProdutoDAO() {
        try {
            String url = "jdbc:postgresql://localhost:5432/seu_banco";
            String usuario = "seu_usuario";
            String senha = "sua_senha";
            this.conexao = DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean inserir(Produto produto) {
        String sql = "INSERT INTO produtos (nome, descricao, preco) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setString(2, produto.getDescricao());
            stmt.setDouble(3, produto.getPreco());
            stmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Métodos atualizar, deletar e listar
}
