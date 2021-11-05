
public class mainHilo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo2 h1 = new Hilo2("Picas");
		Hilo2 h2 = new Hilo2("Corazones");
		
		Thread hilo1 = new Thread(h1);
		Thread hilo2 = new Thread(h2);
		
		hilo1.start();
		hilo2.start();
		
		System.out.println("---------------");
	}

}
