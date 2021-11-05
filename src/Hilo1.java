
public class Hilo1 extends Thread{
	//protected Thread hilo = null;
	
	public Hilo1(String str) {
		//hilo = new Thread(str);
		super(str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + getName());
			try {
				sleep((long)(Math.random()*1000));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fin! " + getName());
	}
}
