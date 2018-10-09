package dao;

import bean.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * @author Gabriel de Oliveira Ferreira
 */
public class FilmeDAO {
    public Filme filme = new Filme();
    public int cadastrar(Filme venom){
        Connection conexao = Conexao.conectar();
        if (conexao != null) {
            String sql = "INSERT INTO filmes (nome, diretor, categoria, atorPrincipal, faixaEtaria, idiomaOriginal, tempoFilme, ano, faturamento, orcamento, legenda, dublado)";
            try {
                PreparedStatement ps = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                
                ps.setString(1, filme.getNome());
                ps.setString(2, filme.getDiretor());
                ps.setString(3, filme.getCategoria());
                ps.setString(4, filme.getAtorPrincipal());
                ps.setString(5, filme.getFaixaEtaria());
                ps.setString(6, filme.getIdiomaOriginal());
                ps.setShort(7, filme.getTempoFilme());
                ps.setInt(8, filme.getAno());
                ps.setDouble(9, filme.getFaturamento());
                ps.setDouble(10, filme.getOrcamento());
                ps.setBoolean(11, filme.isLegenda());
                ps.setBoolean(12, filme.isDublado());
                ps.execute();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    return rs.getInt(1);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                Conexao.desconectar();
            }
        }
        return -1;
    }
    
}
