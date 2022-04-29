package biblioteca.com.configuration;

import java.util.Scanner;

/**
 *
 * @author Alberto
 */

public class NewMain {

    private final Scanner scanner = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new NewMain();
    }
    
    public NewMain(){
        
        System.out.println("1. JSON");
        System.out.println("2. CSV");
        System.out.println("Option: ");
        
        int option = scanner.nextInt();
        scanner.nextLine();
        
        chooseOption(option);
    }
    
    private void chooseOption(int option){
        
        switch (option) {
            case 1:
                PruebaJson json = new PruebaJson();
                json.readJson();
                break;
            case 2:
                PruebaCSV csv =new PruebaCSV();
                csv.readCSV();
                break;
            default:
                System.out.println("Eres tontorrin?");
                break;
        }
    }
    
}
