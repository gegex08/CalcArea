
package calcarea;

import java.util.Scanner;

/**
 *
 * @author geneivaocampo
 */
public class TotalArea {
    public static void main(String[] args) {
        
        //declare total to begin at a value of 0
        double total=0;
        
        Scanner input = new Scanner(System.in);
        
        //Ask User for number of shapes
        System.out.println("Enter the number of shapes:");
        int numShapes = input.nextInt();
        
        //declare i, as long as i is less than the number of shapes, continue iterating
        for (int i = 0; i < numShapes; i++) {
            
            //Ask user to input the shape based on the number
            System.out.println("Enter shape number (1-triangle, 2-rectangle, 3-circle):");
            int shape = input.nextInt();
            
            //switch statement
            switch (shape) {
                //if they choose 1 it will ask user for the base and triangle then call method with those parameters
                case 1:
                    System.out.println("Enter base for the triangle: ");//ask user for triangle base
                    double base = input.nextDouble();
                    System.out.println("Enter height for the triangle: ");//ask user for triangle height
                    double height = input.nextDouble();
                    total += CalcArea.calculateTriangleArea(base, height);//will add each method to the total
                    break;
                    
                //if the user chooses 2 the program will ask for the lenght and width then call method with those parameters
                case 2:
                    System.out.println("Enter length for the rectangle: ");//ask user for rectangle lenght
                    double lenght = input.nextDouble();
                    System.out.println("Enter width for the rectangle: ");//ask user for rectangle width
                    double width = input.nextDouble();
                    total += CalcArea.calculateRectangleArea(lenght, width);//will add each method to the total
                    break;
                    
                //if the user chooses 3 the program will ask the user for radius then call method with those parameters
                case 3:
                    System.out.println("Enter the radius for the circle: ");//ask for radius
                    double radius = input.nextDouble();
                    total += CalcArea.calculateCircleArea(radius);//will add each method to the total
                    break;
                    
                //if user chooses anything other than the 1, 2, or 3 it will display an error message
                default:
                    System.out.println("Not a valid number for the shape");
            }
        }
        //prints the total sums
        System.out.printf("Total area: %.2f" + total );

    
    }

}
