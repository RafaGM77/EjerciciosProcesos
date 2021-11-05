
public class Hilo2 implements Runnable{
	protected Thread hilo = null;
	
	public Hilo2(String str) {
		hilo = new Thread(this, str);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " - " + hilo.getName());
			try {
				Thread.sleep((long)(Math.random() * 1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Fin! " + hilo.getName());
	}
}
