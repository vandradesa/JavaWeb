package tarefa1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class listaAlunosServer
 */
@WebServlet("/listaAlunos")
public class listaAlunosServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeAluno = request.getParameter("nome");
		String matriculaAluno = request.getParameter("matricula");
		String option = request.getParameter("busca");		
		String[] textoSeparado = matriculaAluno.split(",");
		
		Banco banco = new  Banco();
		List <Aluno> lista = banco.getAlunos();
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<ul>");
		
		if (option.equals("todos")) {	
			int n;
			n=0;
		
			for (Aluno aluno: lista) {
				
				out.println("<li>" + "Nome: " + aluno.getNome() + " - Matrícula:  " + aluno.getMatricula() + "</li>");
				n=n+1;
			}
			if(n==0) {
				out.println("<h1>Não foram encontrados registros!</h1>");
			}
		
		}
		
		if(option.equals("nome")) {
				int n;
				n=0;
			
				for (Aluno aluno: lista) {
					if(nomeAluno.equals(aluno.getNome())){
						out.println("<li>" + "Nome: " + aluno.getNome() + " - Matrícula:  " + aluno.getMatricula() + "</li>");
						n=n+1;
					}
					
				}
			if(n==0) {
				out.println("<h1>Não encontrado! </h1>");
			}
			
		}
		
		if(option.equals("matricula")) {
			int n;
			n=0;
		
			for (Aluno aluno: lista) {
				for(int i=0; i<textoSeparado.length; i++) {
					if(textoSeparado[i].equals(aluno.getMatricula())){
						out.println("<li>" + "Nome: " + aluno.getNome() + " - Matrícula:  " + aluno.getMatricula() + "</li>");
						n=n+1;
					}
				}
				
			}
		if(n==0) {
			out.println("<h1>Não encontrado! </h1>");
		}
		
	}	

	
		out.println("</ul>");
		out.println("</body></html>");
	}


	

}
