package ejecucion;

class Persona {
	
	public String nombre;
	public String apellido;
	public int edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
	
}

public class Ejecucion {

	public static void main(String[] args) {
		String s = "abc";
		
		StringBuilder sb = new StringBuilder("def");
		Boolean valida = false;
		
		Persona persona = new Persona("Xavier","De Los Santos",5);
		
		
		cambioString(s,sb,valida,persona);
		
		System.out.println("s = " + s + " sb = " + sb + " valida " + valida + " persona " + persona);
		
	}

    private static void cambioString (String s, StringBuilder sb, Boolean valida, Persona persona){
    	
    	valida = true;
    	
//    	persona = new Persona("Liham","De Los Santos",1);
    	
    	persona.nombre = "Liham";
    	persona.edad   = 1; 
    	s = s.concat(sb.toString());
    	sb.append(s);
    	
    	s = null;
    	sb = null;
    	
		System.out.println("s = " + s + " sb = " + sb + " valida " + valida);
    	
    }
	
	private static void miMetodo() throws MyException {
		miMetodo();
		throw new MyException();
	}
}

class MyException extends Exception {

	private int codigo;
	private String Descripcion;

	public MyException() {
	}

	public MyException(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		Descripcion = descripcion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "MyException [codigo=" + codigo + ", Descripcion=" + Descripcion + "]";
	}

}

interface Mamifero {

	void beberLeche();

	void algunOtroMetodo();
}

abstract class Ballena implements Mamifero {

	public Ballena() {
		System.out.println("Constructor clase Ballena");
	}

	abstract public void moverse(Integer i);
}

class Delfin extends Ballena {

	@Override
	public void beberLeche() {
		// TODO Auto-generated method stub

	}

	@Override
	public void algunOtroMetodo() {
		// TODO Auto-generated method stub

	}

	protected String moverse(Integer i, String a) {
		System.out.println("Aja se esta moviendo");

		return i.toString();
	}

	@Override
	public void moverse(Integer i) {
		// TODO Auto-generated method stub

	}

}
