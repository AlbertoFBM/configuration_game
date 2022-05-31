package biblioteca.com.configuration;

import java.util.Scanner;

/**
 *
 * @author David
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
                System.out.println("1. Leer");
                System.out.println("2. Escribir");
                int option1 = scanner.nextInt();
                scanner.nextLine();
                chooseJSONReadOrWrite(option1);
                break;
            case 2:
                System.out.println("1. Leer");
                System.out.println("2. Escribir");
                int option2 = scanner.nextInt();
                scanner.nextLine();
                chooseCSVReadOrWrite(option2);
                break;
            default:
                System.out.println("Elige entre 1 o 2.");
                break;
        }
    }

    
    private void chooseJSONReadOrWrite(int option1){
        
        switch (option1) {
            case 1:
                PruebaJson jsonRead = new PruebaJson();
                jsonRead.leerJson();
                break;
            case 2:
                PruebaJson jsonWrite = new PruebaJson();
                jsonWrite.escribirJSON();
                break;
            default:
                System.out.println("Elige entre 1 o 2.");
                break;
        }
    }

    private void chooseCSVReadOrWrite(int option2) {
         switch (option2) {
            case 1:
                PruebaCSV csvRead = new PruebaCSV();
                csvRead.leerCSV();
                break;
            case 2:
                PruebaCSV csvWrite = new PruebaCSV();
                csvWrite.escribirCSV();
                break;
            default:
                System.out.println("Elige entre 1 o 2.");
         } 
    }
}
