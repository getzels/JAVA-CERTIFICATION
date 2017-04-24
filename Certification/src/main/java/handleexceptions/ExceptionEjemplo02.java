package handleexceptions;

public class ExceptionEjemplo02 {
	
	public float metodo01 (String numero){
		float valor = 0.0f;
		
		try{
			valor = Float.valueOf(numero).floatValue();
			
			return valor;
		}catch(NumberFormatException e){
			valor = Float.NaN;
			return valor;
		}
		finally{
			valor = 10.0F;
			return valor;
		}
	}

}
