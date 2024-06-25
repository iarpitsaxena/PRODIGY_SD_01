import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("User guide: Enter the temperature value and unit (Please use Celsius (C), Fahrenheit (F), or Kelvin (K)).");
        System.out.println("For example if you want to enter 25 degrees Celsius then enter 25 C or 25 Celsius");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature value and unit : ");
        String userInput = scanner.nextLine();
        
        try {
            String[] parts = userInput.split(" ");
            double temp = Double.parseDouble(parts[0]);
            String unit = parts[1].toLowerCase();
            
            switch (unit) {
                case "celsius":
                case "c":
                    // Convert Celsius to Fahrenheit and Kelvin
                    double kFromC = temp + 273.15;
                    double fFromC = (temp * 9/5) + 32;
                    System.out.printf("Temperature in Kelvin is: %.2f\n", kFromC);
                    System.out.printf("Temperature in Fahrenheit is: %.2f\n", fFromC);
                    break;
                
                case "fahrenheit":
                case "f":
                    // Convert Fahrenheit to Celsius and Kelvin
                    double cFromF = (temp - 32) * 5/9;
                    double kFromF = cFromF + 273.15;
                    System.out.printf("Temperature in Celsius is: %.2f\n", cFromF);
                    System.out.printf("Temperature in Kelvin is: %.2f\n", kFromF);
                    break;
                
                case "kelvin":
                case "k":
                    // Convert Kelvin to Celsius and Fahrenheit
                    double cFromK = temp - 273.15;
                    double fFromK = (cFromK * 9/5) + 32;
                    System.out.printf("Temperature in Celsius is: %.2f\n", cFromK);
                    System.out.printf("Temperature in Fahrenheit is: %.2f\n", fFromK);
                    break;
                
                default:
                    System.out.println("Invalid unit. Please use Celsius (C), Fahrenheit (F), or Kelvin (K).");
            }
        } catch (Exception e) {
            System.out.println("Invalid input format. Please enter a number followed by a unit (e.g., Celsius, Fahrenheit, Kelvin).");
        }
        
        scanner.close();
    }
}
