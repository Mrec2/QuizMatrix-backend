package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorPreguntasJavascript {
	private List<PreguntaTest> preguntas;

    public GestorPreguntasJavascript() {
        this.preguntas = new ArrayList<>();
        // Aquí puedes añadir preguntas a la lista
        cargarPreguntas();
    }

    private void cargarPreguntas() {
    	   PreguntaTest pregunta1 = new PreguntaTest(
                   "¿Javascript qué es?",
                   Arrays.asList("Lenguaje de programación", "Estilo de la página", "Un protocolo de comunicación bidireccional", 		"Ninguno"),
                   "Lenguaje de programación"
           );
    	   
    	   PreguntaTest pregunta2 = new PreguntaTest(
    			    "¿Cuál es el propósito de las funciones en JavaScript?",
    			    Arrays.asList("Ejecutar un conjunto de instrucciones", "Estilizar la página", "Crear páginas web estáticas", "Ninguno"),
    			    "Ejecutar un conjunto de instrucciones"
    			);

    			PreguntaTest pregunta3 = new PreguntaTest(
    			    "¿Cómo se declara una función en JavaScript?",
    			    Arrays.asList("function miFuncion() {}", "declare miFuncion() {}", "function: miFuncion() {}", "miFuncion() -> {}"),
    			    "function miFuncion() {}"
    			);

    			PreguntaTest pregunta4 = new PreguntaTest(
    			    "¿Qué sintaxis es correcta para referenciar un elemento externo de JavaScript en HTML?",
    			    Arrays.asList("<script href='externo.js'>", "<script name='externo.js'>", "<script src='externo.js'>", "<javascript src='externo.js'>"),
    			    "<script src='externo.js'>"
    			);

    			PreguntaTest pregunta5 = new PreguntaTest(
    			    "¿Cómo se crea un comentario de una línea en JavaScript?",
    			    Arrays.asList("<!-- Comentario -->", "// Comentario", "/* Comentario */", "' Comentario"),
    			    "// Comentario"
    			);

    			PreguntaTest pregunta6 = new PreguntaTest(
    			    "¿Cómo se escribe un 'Hola Mundo' en una alerta de JavaScript?",
    			    Arrays.asList("alertBox('Hola Mundo');", "msg('Hola Mundo');", "alert('Hola Mundo');", "console.log('Hola Mundo');"),
    			    "alert('Hola Mundo');"
    			);

    			PreguntaTest pregunta7 = new PreguntaTest(
    			    "¿Cuál de estos bucles existe en JavaScript?",
    			    Arrays.asList("for", "repeat", "loop", "do-while"),
    			    "do-while"
    			);

    			PreguntaTest pregunta8 = new PreguntaTest(
    			    "¿Cuál método se utiliza para redondear al número entero más cercano en JavaScript?",
    			    Arrays.asList("Math.round()", "Math.floor()", "Math.ceil()", "Math.rnd()"),
    			    "Math.round()"
    			);

    			PreguntaTest pregunta9 = new PreguntaTest(
    			    "¿Cómo se puede convertir una cadena en un número entero en JavaScript?",
    			    Arrays.asList("int('cadena')", "Number('cadena')", "parseInt('cadena')", "All of the above"),
    			    "parseInt('cadena')"
    			);

    			PreguntaTest pregunta10 = new PreguntaTest(
    			    "¿Qué operador se utiliza para asignar un valor a una variable en JavaScript?",
    			    Arrays.asList("=", "==", "===", "=>"),
    			    "="
    			);

    			PreguntaTest pregunta11 = new PreguntaTest(
    			    "¿Cómo se denomina una estructura que permite almacenar múltiples valores en una sola variable en JavaScript?",
    			    Arrays.asList("Cadena", "Objeto", "Función", "Array"),
    			    "Array"
    			);

    			PreguntaTest pregunta12 = new PreguntaTest(
    			    "¿Qué objeto de JavaScript se utiliza para trabajar con fechas?",
    			    Arrays.asList("Date", "Time", "Moment", "Clock"),
    			    "Date"
    			);

    			PreguntaTest pregunta13 = new PreguntaTest(
    			    "¿Cuál es la sintaxis correcta para agregar un comentario de varias líneas en JavaScript?",
    			    Arrays.asList("// Comentario //", "<!-- Comentario -->", "/* Comentario */", "' Comentario '"),
    			    "/* Comentario */"
    			);

    			PreguntaTest pregunta14 = new PreguntaTest(
    			    "¿Cómo se llama a una función llamada 'miFuncion' en JavaScript?",
    			    Arrays.asList("call miFuncion();", "execute miFuncion();", "miFuncion();", "run miFuncion();"),
    			    "miFuncion();"
    			);

    			PreguntaTest pregunta15 = new PreguntaTest(
    			    "¿Qué método de String en JavaScript se utiliza para buscar una cadena dentro de otra cadena?",
    			    Arrays.asList("find()", "search()", "locate()", "indexOf()"),
    			    "indexOf()"
    			);

    			PreguntaTest pregunta16 = new PreguntaTest(
    			    "¿Cuál es el resultado de 'true && false' en JavaScript?",
    			    Arrays.asList("true", "false", "null", "undefined"),
    			    "false"
    			);

    			PreguntaTest pregunta17 = new PreguntaTest(
    			    "¿Qué instrucción se utiliza para repetir un bloque de código dado un número específico de veces?",
    			    Arrays.asList("loop", "repeat", "for", "while"),
    			    "for"
    			);

    			PreguntaTest pregunta18 = new PreguntaTest(
    			    "¿Cuál es el método para parsear un JSON string a un objeto en JavaScript?",
    			    Arrays.asList("JSON.parse()", "JSON.stringify()", "JSON.toObject()", "JSON.fromString()"),
    			    "JSON.parse()"
    			);

    			PreguntaTest pregunta19 = new PreguntaTest(
    			    "¿Qué método se utiliza para agregar elementos al final de un array en JavaScript?",
    			    Arrays.asList("push()", "pop()", "shift()", "unshift()"),
    			    "push()"
    			);

    			PreguntaTest pregunta20 = new PreguntaTest(
    			    "¿Cómo se declara un objeto en JavaScript?",
    			    Arrays.asList("var objeto = {}", "var objeto = []", "var objeto = new Object()", "Todas las anteriores"),
    			    "Todas las anteriores"
    			);


        // Añadir las preguntas a la lista
    			preguntas.add(pregunta1);
    	        preguntas.add(pregunta2);
    	        preguntas.add(pregunta3);
    	        preguntas.add(pregunta4);
    	        preguntas.add(pregunta5);
    	        preguntas.add(pregunta6);
    	        preguntas.add(pregunta7);
    	        preguntas.add(pregunta8);
    	        preguntas.add(pregunta9);
    	        preguntas.add(pregunta10);
    	        preguntas.add(pregunta11);
    	        preguntas.add(pregunta12);
    	        preguntas.add(pregunta13);
    	        preguntas.add(pregunta14);
    	        preguntas.add(pregunta15);
    	        preguntas.add(pregunta16);
    	        preguntas.add(pregunta17);
    	        preguntas.add(pregunta18);
    	        preguntas.add(pregunta19);
    	        preguntas.add(pregunta20);
    }

    public List<PreguntaTest> getPreguntas() {
        return preguntas;
    }
}
