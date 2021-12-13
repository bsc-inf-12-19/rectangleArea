import java.util.Scanner;
public class RectangleArea{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
    System.out.println("the area will be shown here");
       Area area1 = new Area();
       System.out.println("\nEnter the value of length");
       double lengththValue = input.nextDouble();
       System.out.println("Enter the value of breadth");
       double breadthValue = input.nextDouble();
     System.out.println("The area of the rectangle is " +area1.returnArea(lengthValue, breadthValue));
   }
 }
class Area{
double length;
double breadth;
Area(){
length = 0;
breadth = 0;
  }
double returnArea(double length, double breadth){
  double Area = breadth * length;
  return Area;
  }
}