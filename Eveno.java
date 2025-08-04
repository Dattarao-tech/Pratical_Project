import java.util.Scanner; 
public class Eveno 
{

    public static void main(String[] args) 
    {
        
        Scannersc = new Scanner(System.in);

        System.out.print("Enter an integer to check if it's even or odd: ");

        
        int number = Scannersc.nextInt();

        
        if (number % 2 == 0) {
            System.out.println(number + " is an EVEN number.");
        } 
        else 
        {
        
            System.out.println(number + " is an ODD number.");
        }

        
            Scannersc.close();
    }
}