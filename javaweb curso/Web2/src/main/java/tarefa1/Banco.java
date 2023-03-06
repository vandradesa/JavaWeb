package tarefa1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Banco{

	private static List <Aluno> lista = new ArrayList<>();
	private static HashMap<String, String> map = new HashMap<>(); 


	
	public void adiciona(Aluno aluno) {
		Banco.lista.add(aluno);	

	}

	public List<Aluno> getAlunos(){
		return Banco.lista;
	}
	
	public void addmapa(String senha, String nome) {
		Banco.map.put(senha, nome);	
	}
	
	 public HashMap<String, String> getDados(){
			return Banco.map;
	
	}
		
		 

	
	
}

