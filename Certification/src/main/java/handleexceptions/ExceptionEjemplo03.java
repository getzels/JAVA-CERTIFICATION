package handleexceptions;

public class ExceptionEjemplo03 {

	public void miMetodo() {
		try {

			metodo1();
		} catch (Exception e) {
			try {
				metodo1();
			} catch (Exception i) {
				System.out.println(i);
			}
		} finally {
			metodo2();
		}
	}

	public static void metodo1() throws Exception {
		throw new Exception();
	}

	public static void metodo2() {
		throw new NullPointerException();
	}
}
