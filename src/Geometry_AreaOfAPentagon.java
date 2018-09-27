import java.util.Scanner;

public class Geometry_AreaOfAPentagon {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // The task is to prompt a user to enter a radius in a pentagon and hereafter calculate the area of the pentagon using an advanced formula

        // First im prompting the user for a radius
        System.out.print("Please enter radius: ");
        double radius = input.nextDouble();

        // Calculating the length of the side using radius
        double side =  2 * radius * Math.sin(Math.PI / 5);

        // Calculating the area using the length of the sides
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));


        System.out.printf("The area is: %2.2f", area);


    }
}
