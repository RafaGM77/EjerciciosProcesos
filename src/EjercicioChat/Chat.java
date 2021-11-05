package EjercicioChat;

public class Chat {

	public synchronized void Answer(String answer) {
		
		notify();
		
		System.out.println(answer);
		
		try {
			wait();
		} 
		catch (InterruptedException e) {
			System.out.println("Error -> " + e.getMessage());
		}
	}
	
	public synchronized void Question(String question) {
		
		notify();
		
		System.out.println(question);
		
		try {
			wait();
		} 
		catch (InterruptedException e) {
			System.out.println("Error -> " + e.getMessage());
		}
	}
}
