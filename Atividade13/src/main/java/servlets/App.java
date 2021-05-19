package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelos.Livro;

@WebServlet("/App")
public class App extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ArrayList<Livro> livro = new ArrayList<Livro>();
		
		Livro livro1 = new Livro() ;
		livro1.setNome("The Hunger Games");
		livro1.setAno(2008);
		livro1.setAutor("Suzanne Collins"); 
		
		Livro livro2 = new Livro() ;
		livro2.setNome("Catching Fire");
		livro2.setAno(2009);
		livro2.setAutor("Suzanne Collins"); 
		
		Livro livro3 = new Livro() ;
		livro3.setNome("Mockinjay");
		livro3.setAno(2010);
		livro3.setAutor("Suzanne Collins"); 
		
		livro.add(livro1);
		livro.add(livro2);
		livro.add(livro3);
		
		req.setAttribute("livros", livro);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("listaLivros.jsp");
		dispatcher.forward(req, resp);
	}

}
