import java.util.Scanner;

public class ConcaveMirror {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter image distance (v) in cm (positive): ");
        double v = input.nextDouble();

        System.out.print("Enter object distance (u) in cm (negative for concave): ");
        double u = input.nextDouble(); 

        // Mirror formula: f = (u * v) / (u + v)
        double f = (u * v) / (u + v);

        System.out.printf("\nCalculated Focal Length (f): %.2f cm\n", f);

        if (f >= 21.0 && f <= 25.0) {
            System.out.println("Mirror is ACCEPTABLE. Focal length is within range (21 - 25 cm).");
        } else {
            System.out.println("Mirror is NOT acceptable. Focal length is out of range.");
        }

        input.close();
    }
}
