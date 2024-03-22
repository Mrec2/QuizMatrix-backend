package servlets;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaBeans.GestorPreguntasCss;
import javaBeans.PreguntaTest;


@WebServlet("/PreguntasCssServlet")
public class PreguntasCssServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public PreguntasCssServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entra en Get del Servlet Css");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Entra en Post del Servlet Css");
		try {
			GestorPreguntasCss gestor = new GestorPreguntasCss();
	        List<PreguntaTest> preguntas = gestor.getPreguntas();
	        Gson gson = new Gson();
	        String json = gson.toJson(preguntas);
	        
	        System.out.println("Esto es lo que se envia " + json); 
	        response.setContentType("application/json");
	        response.setCharacterEncoding("UTF-8");
	        response.getWriter().write(json);
	    } catch (IOException e) {
	        e.printStackTrace();
	        
	    }
		
	}

}
