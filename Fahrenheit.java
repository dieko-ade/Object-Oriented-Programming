import java.util.Scanner;

class Fahrenheit {
    // Conversion function
    static void convertToFahrenheit(double tempCentigrade) {
        double tempFahrenheit = (9 * tempCentigrade) / 5 + 32;
        System.out.println ("Temperature in Fahrenheit(°F) is: " + tempFahrenheit);
    }
    public static void main(String[] args){
        Scanner obj = new Scanner (System.in);
        System.out.println ("Enter temperature in Centigrade(°C): ");
        double tempCentigrade = obj.nextDouble();
        convertToFahrenheit(tempCentigrade);
    }
}
