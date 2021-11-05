package EjercicioChat;

public class Chat {

	public synchronized String Answer(String answer) {
		
		notify();
		
		System.out.println(answer);
		
		try {
			wait();
		} 
		catch (InterruptedException e) {
			System.out.println("Error -> " + e.getMessage());
		}
		
		return answer;
	}
	
	public synchronized String Question(String question) {
		
		notify();
		
		System.out.println(question);
		
		try {
			wait();
		} 
		catch (InterruptedException e) {
			System.out.println("Error -> " + e.getMessage());
		}
		
		return question;
	}
}
