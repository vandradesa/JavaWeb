package tarefa1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginCadastroServer
 */
@WebServlet("/LoginCadastro")
public class LoginCadastroServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeLogin = request.getParameter("nome");
		String senhaLogin = request.getParameter("senha");		
		
		Banco banco = new  Banco();
		banco.addmapa(senhaLogin, nomeLogin);
		
		HashMap<String, String> mapDados = banco.getDados();
		
		for (Entry<String, String> Dados : mapDados.entrySet()) {
		     System.out.println(Dados); 
		}
		
		for (Entry<String, String> Dados : mapDados.entrySet()) {
		     System.out.println(Dados.getValue()); 
		}
		
		for (String Dados : mapDados.values()) {
		     System.out.println(Dados); 
		}
		
		 RequestDispatcher xx = request.getRequestDispatcher("/Login.html");
	     xx.forward(request, response);	
		
	
	}

}
