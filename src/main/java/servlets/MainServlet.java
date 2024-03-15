package servlets;

import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import javaBeans.GestorPreguntas;
import javaBeans.PreguntaTest;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/testServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Estamos en el servlet GET");
		response.setHeader("Access-Control-Allow-Origin", "*");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Estamos en el servlet POST");
		response.setHeader("Access-Control-Allow-Origin", "*");
		// Crear una instancia de GestorPreguntas
        GestorPreguntas gestor = new GestorPreguntas();

        // Obtener la lista de preguntas
        List<PreguntaTest> preguntas = gestor.getPreguntas();

        // Convertir las preguntas a formato JSON
        Gson gson = new Gson();
        String json = gson.toJson(preguntas);

        // Preparar la respuesta para enviar el JSON
        System.out.println(json);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);
	}

}
