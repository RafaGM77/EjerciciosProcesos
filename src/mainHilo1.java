
public class mainHilo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hilo1 h1 = new Hilo1("Picas");
		Hilo1 h2 = new Hilo1("Corazones");
		
		h1.start();
		h2.start();
		
		//Ejemplo con join -> Espera a que acaben los hilos para acabar el hilo principal
		//Si solo un hilo tiene el join espera a que acabe ese hilo para acabar el programa principal
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main acabado");
	}

}
