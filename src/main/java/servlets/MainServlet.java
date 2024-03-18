package servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaBeans.GestorPreguntasCss;
import javaBeans.GestorPreguntasHTML;
import javaBeans.GestorPreguntasJava;
import javaBeans.GestorPreguntasJavascript;
import javaBeans.PreguntaTest;


@WebServlet("/testServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MainServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Estamos en el servlet GET");
		response.setHeader("Access-Control-Allow-Origin", "*");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Estamos en el servlet POST");
		response.setHeader("Access-Control-Allow-Origin", "*");
		
		BufferedReader miDato = request.getReader();
		String miDatoFinal = miDato.readLine();
		System.out.println(miDatoFinal);
		
		if (miDatoFinal.equals("js")) {
		    try {
		        GestorPreguntasJavascript gestor = new GestorPreguntasJavascript();
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
		}else if (miDatoFinal.equals("html")) {
			try {
				GestorPreguntasHTML gestor = new GestorPreguntasHTML();
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
		}else if (miDatoFinal.equals("css")) {
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
		}else if (miDatoFinal.equals("java")) {
			try {
				GestorPreguntasJava gestor = new GestorPreguntasJava();
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

}
