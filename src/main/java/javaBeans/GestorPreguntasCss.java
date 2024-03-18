package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorPreguntasCss {

	private List<PreguntaTest> preguntas;
	
	public GestorPreguntasCss () {
		this.preguntas = new ArrayList<>();
		cargarPreguntas();
	}
	
	 private void cargarPreguntas() {
		 PreguntaTest pregunta1 = new PreguntaTest(
				    "¿Cuál es la versión de CSS que se usa hoy en día?",
				    Arrays.asList("Default", "10.0", "CSS3", "Legacy version"),
				    "CSS3"
				);

				PreguntaTest pregunta2 = new PreguntaTest(
				    "¿Qué propiedad CSS se utiliza para cambiar el color de fondo de un elemento?",
				    Arrays.asList("background-color", "color", "bgcolor", "background-image"),
				    "background-color"
				);

				PreguntaTest pregunta3 = new PreguntaTest(
				    "¿Qué propiedad CSS se usa para cambiar el color del texto de un elemento?",
				    Arrays.asList("text-color", "color", "font-color", "text-style"),
				    "color"
				);

				PreguntaTest pregunta4 = new PreguntaTest(
				    "¿Cómo se aplica un estilo a un elemento HTML específico usando su ID?",
				    Arrays.asList("Con un . antes del nombre del ID", "Con un # antes del nombre del ID", "Con un $ antes del nombre del ID", "Directamente el nombre del ID"),
				    "# antes del nombre del ID"
				);

				PreguntaTest pregunta5 = new PreguntaTest(
				    "¿Cuál de las siguientes propiedades NO es una propiedad de flexbox?",
				    Arrays.asList("flex-direction", "align-items", "justify-content", "float"),
				    "float"
				);

				PreguntaTest pregunta6 = new PreguntaTest(
				    "¿Qué función CSS se utiliza para hacer referencia a imágenes como fondo?",
				    Arrays.asList("url()", "src()", "href()", "link()"),
				    "url()"
				);

				PreguntaTest pregunta7 = new PreguntaTest(
				    "¿Cómo se seleccionan todos los elementos <p> que son directamente hijos de un div?",
				    Arrays.asList("div p", "div > p", "div + p", "p > div"),
				    "div > p"
				);

				PreguntaTest pregunta8 = new PreguntaTest(
				    "¿Cuál es el valor por defecto de la propiedad position?",
				    Arrays.asList("relative", "fixed", "absolute", "static"),
				    "static"
				);

				PreguntaTest pregunta9 = new PreguntaTest(
				    "¿Qué propiedad se utiliza para establecer el espaciado entre los caracteres de un texto?",
				    Arrays.asList("letter-spacing", "text-spacing", "character-spacing", "spacing"),
				    "letter-spacing"
				);

				PreguntaTest pregunta10 = new PreguntaTest(
				    "¿Cuál propiedad CSS se utiliza para hacer que los elementos floten y se alineen a un lado?",
				    Arrays.asList("margin", "align", "float", "clear"),
				    "float"
				);

				PreguntaTest pregunta11 = new PreguntaTest(
				    "¿Qué selector se usa para definir un estilo sobre un elemento HTML cuando está siendo apuntado por el mouse?",
				    Arrays.asList(":hover", ":active", ":focus", ":visited"),
				    ":hover"
				);

				PreguntaTest pregunta12 = new PreguntaTest(
				    "¿Cuál de estas NO es una unidad de medida en CSS?",
				    Arrays.asList("pixels", "centimeters", "liters", "em"),
				    "liters"
				);

				PreguntaTest pregunta13 = new PreguntaTest(
				    "¿Qué propiedad CSS se utiliza para crear una sombra alrededor de un elemento?",
				    Arrays.asList("box-shadow", "text-shadow", "border-shadow", "shadow"),
				    "box-shadow"
				);

				PreguntaTest pregunta14 = new PreguntaTest(
				    "¿Cómo se agrega un comentario en un archivo CSS?",
				    Arrays.asList("<!-- comentario -->", "/* comentario */", "// comentario", "' comentario '"),
				    "/* comentario */"
				);

				PreguntaTest pregunta15 = new PreguntaTest(
				    "¿Qué propiedad se usa para cambiar la fuente de un texto?",
				    Arrays.asList("font-style", "text-font", "font-family", "font-weight"),
				    "font-family"
				);

				PreguntaTest pregunta16 = new PreguntaTest(
				    "¿Qué valor de la propiedad display hace que el elemento se comporte como un bloque en línea?",
				    Arrays.asList("block", "inline", "inline-block", "none"),
				    "inline-block"
				);

				PreguntaTest pregunta17 = new PreguntaTest(
				    "¿Cuál de las siguientes propiedades se utiliza para establecer la opacidad de un elemento?",
				    Arrays.asList("opacity", "visibility", "alpha", "transparent"),
				    "opacity"
				);

				PreguntaTest pregunta18 = new PreguntaTest(
				    "¿Qué propiedad se utiliza para cambiar el estilo del cursor del mouse?",
				    Arrays.asList("cursor-style", "pointer", "cursor", "mouse-style"),
				    "cursor"
				);

				PreguntaTest pregunta19 = new PreguntaTest(
				    "¿Qué propiedad CSS se utiliza para poner en mayúsculas el texto?",
				    Arrays.asList("text-transform", "text-decoration", "font-style", "text-uppercase"),
				    "text-transform"
				);

				PreguntaTest pregunta20 = new PreguntaTest(
				    "¿Cuál propiedad CSS elimina el espacio entre los bordes de dos elementos adyacentes?",
				    Arrays.asList("margin-collapse", "border-collapse", "padding-collapse", "collapse"),
				    "border-collapse"
				);
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
