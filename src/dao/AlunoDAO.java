package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

import model.Aluno;
import util.ConexaoBD;

public class AlunoDAO {

	
	Connection conexao = null;
	
	public boolean inserirAluno(Aluno aluno) {
		conexao = ConexaoBD.getInstance();
		
		String query = "INSERT INTO aluno (nome, sobrenome, rg, cpf) VALUES (?, ?, ?, ?)";
		boolean sucesso = true;
		
		try {
			PreparedStatement statement = (PreparedStatement) conexao.prepareStatement(query);
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getSobrenome());
			statement.setString(3, aluno.getRg());
			statement.setString(4, aluno.getCpf());
			
			statement.execute();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
			sucesso = false;
		}
		
		return sucesso;
	}
	
	public List<Aluno> buscarAlunos(){
		 conexao = ConexaoBD.getInstance();
		
		String sql = "select * from aluno";
		try {
			PreparedStatement statement = (PreparedStatement) conexao.prepareStatement(sql);
			ResultSet result = statement.executeQuery();
			
			List<Aluno> listAluno = new ArrayList<Aluno>();
			
			while(result.next()) {
				Aluno aluno = new Aluno();
				aluno.setNome(result.getString("nome"));
				aluno.setSobrenome(result.getString("sobrenome"));
				aluno.setRg(result.getString("rg"));
				aluno.setCpf(result.getString("cpf"));
				
				listAluno.add(aluno);
				
			}
			
			return listAluno;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
