
package calcarea;

/**
 *
 * @author geneivaocampo
 */
public class CalcArea {
    //removed static void main because we want to reuse this code
    //set modifiers as public so they can be accessed outside of CalcArea
    
    //method to calculate triangle 
    public static double calculateTriangleArea(double base, double height) {
        double triangle = (base * height) / 2;//formula for area of triangle is base times height times 1/2
        return triangle;
        }
    //method to calculate rectancle
    public static double calculateRectangleArea(double width, double lenght) {
        double rectangle = width * lenght;//formula for area of rectangle
        return rectangle;
    }
    
    //method to calculate circle
    public static double calculateCircleArea(double radius) {
        double circle = Math.PI * Math.pow(radius, 2); //formula for area of of circle is πr^2
        return circle;
    }

}
