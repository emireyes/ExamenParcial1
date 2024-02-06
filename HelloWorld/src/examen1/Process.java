package examen1;
 
import java.util.Scanner;

public class Process {
    public void iniciarPrograma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a sentence: ");
        String userInput = scanner.nextLine();
        Palabras palabras = new Palabras(userInput);

        palabras.primeraMayuscula();
        palabras.invertirCadena();
        palabras.vocalesMayuscula();
        palabras.palindromo();

        System.out.println("Modified sentence: " + palabras.getCadena());

        System.out.print("Do you want to execute the FizzBuzz method? (yes/no): ");
        String userResponse = scanner.next().toLowerCase();
        scanner.close();
        if (userResponse.equals("yes")) {
            Extra extra = new Extra();
            extra.fizzBuzz();
        }
    }
}    
    
        

