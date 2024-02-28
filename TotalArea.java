
package calcarea;

import java.util.Scanner;

/****************************************************
 * Programmer: Geneiva Ocampo
 * Course CSCI 1471
 * Date 02/25/2024
 * Assignment: Homework #5: CalcArea
 * Environment Java with Netbeans
 * Files Included: CalcArea & TotalArea
 * Purpose: To write an app that allows user get the total sum of areas from different shapes
 * Input: number of shapes, number from 1-3
 * Preconditions/ Assumptions: number on type of shape is an integer from 1-3
 * Equations: for Triangle (Base*Height*1/2) for Rectangle (Length*Width) for Circle (πr^2)
 * Output:Enter the number of shapes:, 
 * Enter shape number (1-triangle, 2-rectangle, 3-circle):, 
 * Enter base for the triangle:
 * Enter height for the triangle:
 * Enter length for the rectangle:
 * Enter width for the rectangle:
 * Enter the radius for the circle:
 * Total area: (sum of all shapes area)
 * Postconditions/Assumptions: Data Type of double Variables and int variables
 * Contraints: variable data types are double for base, height, length, width, radius and int for numShapes and shape selection
 * Algorithm: 
 * Ask User for the number of shapes
 * if user enters number of shapes ask for int value of shape
 * if user enters 1 ask for user input for base and height then calculate area of triangle then add to the total of the sum of areas
 * if user enters 2 ask for user input for length and width then calculate area of square then add to the total of the sum of areas
 * if user enters 3 ask for user input for radius, then calculate area of circle, then add to the total of the sum of areas
 * if user enters any other integer invalid number message
 * if the number of shapes has reached max, output the total combined sum of areas

 ****************************************************/
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
                    double triangleArea = CalcArea.calculateTriangleArea(base, height);//to store triangle area
                    System.out.printf("The Area for this Triangle is %.2f\n", triangleArea);
                    total += triangleArea;//will add each method to the total
                    break;
                    
                //if the user chooses 2 the program will ask for the lenght and width then call method with those parameters
                case 2:
                    System.out.println("Enter length for the rectangle: ");//ask user for rectangle lenght
                    double lenght = input.nextDouble();
                    System.out.println("Enter width for the rectangle: ");//ask user for rectangle width
                    double width = input.nextDouble();
                    double rectangleArea = CalcArea.calculateRectangleArea(lenght, width);//store rectangle area
                    System.out.printf("The area for this Rectangle is %.2f\n", rectangleArea);
                    total += rectangleArea;//will add each method to the total
                    break;
                    
                //if the user chooses 3 the program will ask the user for radius then call method with those parameters
                case 3:
                    System.out.println("Enter the radius for the circle: ");//ask for radius
                    double radius = input.nextDouble();
                    double circleArea = CalcArea.calculateCircleArea(radius);
                    System.out.printf("The area for this circle is %.2f\n", circleArea);
                    total += CalcArea.calculateCircleArea(radius);//will add each method to the total
                    break;
                    
                //if user chooses anything other than the 1, 2, or 3 it will display an error message
                default:
                    System.out.println("Not a valid number for the shape");
            }
        }
        //prints the total sums
        System.out.printf("Total combined area is: %.2f\n", total );

    
    }

}
