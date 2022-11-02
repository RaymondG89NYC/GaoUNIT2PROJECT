import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        //Asking for inputs
        System.out.println("Please enter a coordinate point in (x, y) form");
        String firstPoint = input.nextLine();
        System.out.println("Please enter another coordinate point in (x, y) form");
        String secondPoint = input.nextLine();
        //parseInt'ing the coordinate points
        int commaLocation1 = firstPoint.indexOf(",");
        int x1 = Integer.parseInt(firstPoint.substring(1,commaLocation1));
        int y1 = Integer.parseInt(firstPoint.substring(commaLocation1+2, firstPoint.length()-1));

        int commaLocation2 = secondPoint.indexOf(",");
        int x2 = Integer.parseInt(secondPoint.substring(1,commaLocation2));
        int y2 = Integer.parseInt(secondPoint.substring(commaLocation2+2, secondPoint.length()-1));

        if(x1 == x2){
            System.out.println("The line is vertical line. The equation is: x = " + x1);
        }else {

            //creating the class
            LinearEquation linearEquationRunner = new LinearEquation(x1, y1, x2, y2);
            System.out.println(linearEquationRunner.lineInfo());
            System.out.println();

            System.out.println("Please enter an x value.");
            double xValue = input.nextDouble();
            System.out.println(linearEquationRunner.coordinateForX(xValue));
        }
    }
}
