package javaBeans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestorPreguntasJava {
	private List<PreguntaTest> preguntas;

    public GestorPreguntasJava() {
        this.preguntas = new ArrayList<>();
        // Aquí puedes añadir preguntas a la lista
        cargarPreguntas();
    }

    private void cargarPreguntas() {
    	PreguntaTest pregunta1 = new PreguntaTest(
    		    "¿Java está orientado a la programación ....?",
    		    Arrays.asList("Estilos", "Objetos", "Prototipos", "Ninguno"),
    		    "Objetos"
    		);

    		PreguntaTest pregunta2 = new PreguntaTest(
    		    "¿Qué estructura de control en Java se utiliza para repetir un bloque de instrucciones mientras una condición sea verdadera?",
    		    Arrays.asList("For", "Do-While", "Switch", "If"),
    		    "Do-While"
    		);

    		PreguntaTest pregunta3 = new PreguntaTest(
    		    "¿Cuál de los siguientes es un tipo primitivo en Java?",
    		    Arrays.asList("String", "Class", "int", "Array"),
    		    "int"
    		);

    		PreguntaTest pregunta4 = new PreguntaTest(
    		    "¿Qué método de la clase String en Java se utiliza para comparar dos cadenas, ignorando las diferencias de mayúsculas y minúsculas?",
    		    Arrays.asList("compareTo()", "equals()", "equalsIgnoreCase()", "compareToIgnoreCase()"),
    		    "equalsIgnoreCase()"
    		);

    		PreguntaTest pregunta5 = new PreguntaTest(
    		    "¿En Java, cuál es el propósito principal de las interfaces?",
    		    Arrays.asList("Herencia múltiple", "Crear objetos", "Encapsulamiento", "Polimorfismo"),
    		    "Herencia múltiple"
    		);

    		PreguntaTest pregunta6 = new PreguntaTest(
    		    "¿Qué palabra clave se utiliza para definir una variable constante en Java?",
    		    Arrays.asList("constant", "const", "final", "immutable"),
    		    "final"
    		);

    		PreguntaTest pregunta7 = new PreguntaTest(
    		    "¿Cómo se denomina el proceso de definir más de un método con el mismo nombre pero con diferentes listas de parámetros en Java?",
    		    Arrays.asList("Sobrecarga de métodos", "Sobrescritura de métodos", "Polimorfismo", "Encapsulamiento"),
    		    "Sobrecarga de métodos"
    		);

    		PreguntaTest pregunta8 = new PreguntaTest(
    		    "¿Qué excepción se lanza cuando se intenta acceder a un índice fuera de los límites de un array en Java?",
    		    Arrays.asList("ArrayIndexOutOfBoundsException", "IndexOutOfBoundsException", "OutOfBoundsException", "ArrayBoundsException"),
    		    "ArrayIndexOutOfBoundsException"
    		);

    		PreguntaTest pregunta9 = new PreguntaTest(
    		    "¿Cuál es la palabra clave utilizada para heredar una clase en Java?",
    		    Arrays.asList("extends", "implements", "super", "this"),
    		    "extends"
    		);

    		PreguntaTest pregunta10 = new PreguntaTest(
    		    "¿Qué es JRE en el contexto de Java?",
    		    Arrays.asList("Java Runtime Environment", "Java Runtime Execution", "Java Runtime Encapsulation", "Java Runtime Extension"),
    		    "Java Runtime Environment"
    		);

    		PreguntaTest pregunta11 = new PreguntaTest(
    		    "¿Cuál de los siguientes no es un nivel de acceso en Java?",
    		    Arrays.asList("public", "protected", "private", "internal"),
    		    "internal"
    		);

    		PreguntaTest pregunta12 = new PreguntaTest(
    		    "¿Qué estructura de datos en Java es mejor para almacenar elementos únicos?",
    		    Arrays.asList("ArrayList", "HashMap", "HashSet", "LinkedList"),
    		    "HashSet"
    		);

    		PreguntaTest pregunta13 = new PreguntaTest(
    		    "¿En qué paquete se encuentra la clase Scanner en Java?",
    		    Arrays.asList("java.util", "java.lang", "java.io", "java.scanner"),
    		    "java.util"
    		);

    		PreguntaTest pregunta14 = new PreguntaTest(
    		    "¿Cuál es el propósito de la palabra clave 'transient' en Java?",
    		    Arrays.asList("Hacer una variable temporal", "Prevenir la serialización de una variable", "Indicar que una variable puede ser nula", "Marcar una variable como volátil"),
    		    "Prevenir la serialización de una variable"
    		);

    		PreguntaTest pregunta15 = new PreguntaTest(
    		    "¿Qué anotación en Java se utiliza para indicar que un método está obsoleto?",
    		    Arrays.asList("@Deprecated", "@Obsolete", "@DeprecatedMethod", "@Old"),
    		    "@Deprecated"
    		);

    		PreguntaTest pregunta16 = new PreguntaTest(
    		    "¿Cuál es la diferencia entre '=='' y 'equals()' en Java?",
    		    Arrays.asList("Ninguna, ambos son iguales", "'==' compara referencias, mientras que 'equals()' compara contenidos", "'equals()' compara referencias, mientras que '==' compara contenidos", "'==' se utiliza para tipos primitivos, 'equals()' no se puede utilizar"),
    		    "'==' compara referencias, mientras que 'equals()' compara contenidos"
    		);

    		PreguntaTest pregunta17 = new PreguntaTest(
    		    "¿Qué palabra clave se utiliza para sincronizar un bloque de código en Java?",
    		    Arrays.asList("synchronized", "volatile", "static", "final"),
    		    "synchronized"
    		);

    		PreguntaTest pregunta18 = new PreguntaTest(
    		    "¿Qué interfaz se debe implementar para definir el método compareTo en Java?",
    		    Arrays.asList("Comparable", "Comparator", "ComparableTo", "CompareWith"),
    		    "Comparable"
    		);

    		PreguntaTest pregunta19 = new PreguntaTest(
    		    "¿Qué paquete en Java se utiliza principalmente para operaciones de entrada y salida?",
    		    Arrays.asList("java.util", "java.io", "java.net", "java.lang"),
    		    "java.io"
    		);

    		PreguntaTest pregunta20 = new PreguntaTest(
    		    "¿Cuál es la firma correcta del método main en Java?",
    		    Arrays.asList("public static void main(String args[])", "public void main(String[] args)", "public static main(String[] args)", "public static void main(String[] args)"),
    		    "public static void main(String[] args)"
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
