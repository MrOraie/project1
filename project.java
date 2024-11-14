import java.util.Scanner;  

public class project {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);   
            System.out.print("Enter a number: ");  
            int number = Integer.parseInt(scanner.nextLine());   
            System.out.println("You entered: " + number);  
            

            scanner.close();  
    }  
}