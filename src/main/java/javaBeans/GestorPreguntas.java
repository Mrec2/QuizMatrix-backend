package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorPreguntas {
    private List<PreguntaTest> preguntas;

    public GestorPreguntas() {
        this.preguntas = new ArrayList<>();
        // Aquí puedes añadir preguntas a la lista
        cargarPreguntas();
    }

    private void cargarPreguntas() {
        PreguntaTest pregunta1 = new PreguntaTest(
                "¿Qué lenguaje de programación consideras HTML?",
                Arrays.asList("Marcado", "De inglés", "Alto nivel", "No es un lenguaje de programación"),
                "No es un lenguaje de programación"
        );

        PreguntaTest pregunta2 = new PreguntaTest(
                "¿HTML establece qué?",
                Arrays.asList("Estructura/Esqueleto", "Estilo de la página", "Dinamismo o cambio de los elementos de mi página", 		"Ninguno"),
                "Estructura/Esqueleto"
        );

        // Añadir las preguntas a la lista
        preguntas.add(pregunta1);
        preguntas.add(pregunta2);
    }

    public List<PreguntaTest> getPreguntas() {
        return preguntas;
    }

    // Aquí podrías añadir más métodos, como uno para añadir preguntas, eliminar preguntas, etc.
}

