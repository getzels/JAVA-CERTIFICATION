package handleexceptions;

public class ExceptionEjemplo01 {

	public void metodo1(){
		try{
		int[] a = new int[10];
		int i = a[m1()];
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	public int m1() throws Exception{
		throw new Exception("Some Exception");
	}
}
