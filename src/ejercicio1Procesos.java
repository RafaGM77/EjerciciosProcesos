import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejercicio1Procesos {

	public static void main(String[] args) {
		
		String [] comando = {"ping", "google.com"};
		
		ProcessBuilder processBuilder = new ProcessBuilder(comando);
		
		try {
			Process p = processBuilder.start();
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String linea = br.readLine();
			
			while (linea != null) {
				System.out.println(linea);	
				linea = br.readLine();
			}
			br.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

}
