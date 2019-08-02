package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AlunoDAO;
import model.Aluno;
import util.AlunoUtil;

@WebServlet("/AlunoServlet")
public class AlunoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AlunoServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Construir o objeto aluno com os dados vindos da requisicao
		Aluno aluno = AlunoUtil.buildAluno(request);
		System.out.println(aluno);
		
		
		
		//Salvar o aluno no banco aqui
		AlunoDAO dao = new AlunoDAO();
		
		//Depois de salvar, enviar para a tela uma mensagem de sucesso ou erro
		if(dao.inserirAluno(aluno)) {
			request.setAttribute("retorno", "sucesso");
		}else {
			request.setAttribute("retorno", "erro");
		}
		
		
		List<Aluno> listaAlunos = dao.buscarAlunos();
		
		
		request.setAttribute("alunos_cadastrados", listaAlunos);
		request.getRequestDispatcher("/aluno/aluno_index.jsp").forward(request, response);
	}
}
