package DAO;

import DTO.UsuarioDTO;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;
    PreparedStatement pstm;

    public ResultSet autenticaLogin(UsuarioDTO objUserDto) {
        conn = new ConexaoDAO().conexaoBD();

        try {
            String sql = "select * from usuario where nome_usuario = ? and senha_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUserDto.getNome());
            pstm.setString(2, objUserDto.getSenha());

            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario DAO " + e);
            return null;
        }
    }

    public void cadastrarUsuario(UsuarioDTO objUserDto) {
        String sql = "insert into usuario (nome_usuario,senha_usuario) values (?,?)";
        conn = new ConexaoDAO().conexaoBD();

        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUserDto.getNome());
            pstm.setString(2, objUserDto.getSenha());
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario DAO " + e);
        }
    }
}
