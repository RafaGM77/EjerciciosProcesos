import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio2Procesos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listaComandos = new ArrayList<String>();
		listaComandos.add("nslookup");
		
		System.out.print("Introduce el sitio web: ");
		String web = sc.nextLine();
		
		listaComandos.add(web);
		
		ProcessBuilder pb = new ProcessBuilder(listaComandos);
		pb.inheritIO();
		
		try {
			Process p = pb.start();
			p.waitFor();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
