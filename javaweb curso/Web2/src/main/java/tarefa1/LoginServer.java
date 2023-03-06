package tarefa1;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map.Entry;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServer
 */
@WebServlet("/Login")
public class LoginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeLogin = request.getParameter("nome");
		String senhaLogin = request.getParameter("senha");

		
		Banco banco = new  Banco();
		
		HashMap<String, String> mapDados = banco.getDados();
		
		//PrintWriter out = response.getWriter();
		//out.println("<html><body>");
		
		int n;
		n=0;

		for (Entry<String, String> Dados : mapDados.entrySet()) {
			
			if(nomeLogin.equals(Dados.getValue())){
				n=n+1;			
				if(senhaLogin.equals(Dados.getKey())) {
					request.setAttribute("usuario", nomeLogin);
					  RequestDispatcher xx = request.getRequestDispatcher("/bemvindo.jsp");
					     xx.forward(request, response);
					//out.println("<h1>Olá " + nomeLogin + "!</h1>"); 	
					     
					}else {					
					   RequestDispatcher xx = request.getRequestDispatcher("/Login.html");
					     xx.forward(request, response);						 
				}			
		     }		
		}
		
		if(n==0) {
			System.out.println("o valor de n é" + n);
			 RequestDispatcher xx = request.getRequestDispatcher("/Logincadastro.jsp");
		     xx.forward(request, response);	
			
		}
		
		
			

	}
	}


