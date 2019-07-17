package util;

import javax.servlet.http.HttpServletRequest;

import model.Aluno;
import model.Endereco;

public class AlunoUtil {

	
	public static Aluno buildAluno(HttpServletRequest request){
		
		Endereco endereco = new Endereco();
		endereco.setCep(request.getParameter("cep"));
		endereco.setLogradouro(request.getParameter("logradouro"));
		endereco.setBairro(request.getParameter("bairro"));
		endereco.setNumero(request.getParameter("numero"));
		endereco.setCidade(request.getParameter("cidade"));
		endereco.setEstado(request.getParameter("estado"));
		
		Aluno aluno = new Aluno();
		aluno.setNome(request.getParameter("nome"));
		aluno.setSobrenome(request.getParameter("sobrenome"));
		aluno.setRg(request.getParameter("rg"));
		aluno.setCpf(request.getParameter("cpf"));
		//aluno.setNascimento(request.getParameter("nascimento"));
		aluno.setEndereco(endereco);
		
		return aluno;
	}
}
