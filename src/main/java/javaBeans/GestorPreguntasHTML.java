package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorPreguntasHTML {
	private List<PreguntaTest> preguntas;

    public GestorPreguntasHTML() {
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
    		    "¿Qué etiqueta HTML se utiliza para definir un párrafo?",
    		    Arrays.asList("<p>", "<h1>", "<body>", "<title>"),
    		    "<p>"
    		);

    		PreguntaTest pregunta3 = new PreguntaTest(
    		    "¿Cuál es la función de la etiqueta <a> en HTML?",
    		    Arrays.asList("Insertar imágenes", "Crear enlaces", "Formatear texto", "Definir encabezados"),
    		    "Crear enlaces"
    		);

    		PreguntaTest pregunta4 = new PreguntaTest(
    		    "¿Qué atributo de la etiqueta <img> especifica la URL de la imagen?",
    		    Arrays.asList("src", "href", "alt", "link"),
    		    "src"
    		);

    		PreguntaTest pregunta5 = new PreguntaTest(
    		    "¿Cómo se comenta el código en HTML?",
    		    Arrays.asList("<!-- comentario -->", "// comentario", "/* comentario */", "# comentario"),
    		    "<!-- comentario -->"
    		);

    		PreguntaTest pregunta6 = new PreguntaTest(
    		    "¿Qué etiqueta HTML se utiliza para definir un encabezado de nivel 1?",
    		    Arrays.asList("<h1>", "<header>", "<head>", "<h6>"),
    		    "<h1>"
    		);

    		PreguntaTest pregunta7 = new PreguntaTest(
    		    "¿Cuál de estas etiquetas HTML se usa para definir una lista ordenada?",
    		    Arrays.asList("<ul>", "<ol>", "<li>", "<dl>"),
    		    "<ol>"
    		);

    		PreguntaTest pregunta8 = new PreguntaTest(
    		    "¿Qué atributo se utiliza para abrir un enlace en una nueva pestaña/ventana?",
    		    Arrays.asList("newtab", "target=\"_blank\"", "open", "hrefnew"),
    		    "target=\"_blank\""
    		);

    		PreguntaTest pregunta9 = new PreguntaTest(
    		    "¿Qué etiqueta se utiliza para insertar un archivo de JavaScript en HTML?",
    		    Arrays.asList("<js>", "<script>", "<javascript>", "<link>"),
    		    "<script>"
    		);

    		PreguntaTest pregunta10 = new PreguntaTest(
    		    "¿Cuál de estas etiquetas define el cuerpo de un documento HTML?",
    		    Arrays.asList("<body>", "<main>", "<div>", "<section>"),
    		    "<body>"
    		);

    		PreguntaTest pregunta11 = new PreguntaTest(
    		    "¿Qué atributo de la etiqueta <form> especifica el método de envío de datos?",
    		    Arrays.asList("method", "type", "action", "enctype"),
    		    "method"
    		);

    		PreguntaTest pregunta12 = new PreguntaTest(
    		    "¿Cómo se especifica un enlace a un archivo de estilo CSS en HTML?",
    		    Arrays.asList("<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">", "<css src=\"estilo.css\">", "<style src=\"estilo.css\">", "<stylesheet>estilo.css</stylesheet>"),
    		    "<link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\">"
    		);

    		PreguntaTest pregunta13 = new PreguntaTest(
    		    "¿Qué etiqueta HTML se utiliza para definir una imagen?",
    		    Arrays.asList("<img>", "<image>", "<pic>", "<picture>"),
    		    "<img>"
    		);

    		PreguntaTest pregunta14 = new PreguntaTest(
    		    "¿Cuál es la etiqueta correcta para crear un salto de línea en HTML?",
    		    Arrays.asList("<lb>", "<break>", "<br>", "<linebreak>"),
    		    "<br>"
    		);

    		PreguntaTest pregunta15 = new PreguntaTest(
    		    "¿Qué etiqueta HTML se utiliza para crear una tabla?",
    		    Arrays.asList("<table>", "<tab>", "<tl>", "<tb>"),
    		    "<table>"
    		);

    		PreguntaTest pregunta16 = new PreguntaTest(
    		    "¿Cuál de estas opciones NO es un tipo de lista en HTML?",
    		    Arrays.asList("Lista desordenada", "Lista ordenada", "Lista de definiciones", "Lista de tablas"),
    		    "Lista de tablas"
    		);

    		PreguntaTest pregunta17 = new PreguntaTest(
    		    "¿Qué atributo de la etiqueta <input> define el tipo de control a mostrar?",
    		    Arrays.asList("formtype", "type", "inputtype", "controltype"),
    		    "type"
    		);

    		PreguntaTest pregunta18 = new PreguntaTest(
    		    "¿Qué etiqueta HTML se utiliza para definir un título importante o un tema de la página?",
    		    Arrays.asList("<title>", "<meta>", "<head>", "<header>"),
    		    "<title>"
    		);

    		PreguntaTest pregunta19 = new PreguntaTest(
    		    "¿Cómo se define un fragmento de código en HTML que debe ser interpretado como código de computadora?",
    		    Arrays.asList("<code>", "<pre>", "<block>", "<coding>"),
    		    "<code>"
    		);

    		PreguntaTest pregunta20 = new PreguntaTest(
    		    "¿Qué etiqueta se utiliza para agregar un pie de página a un documento o sección?",
    		    Arrays.asList("<footer>", "<bottom>", "<foot>", "<end>"),
    		    "<footer>"
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
