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
        int y1 = Integer.parseInt(firstPoint.substring(commaLocation1+1, firstPoint.length()-1));

        int commaLocation2 = secondPoint.indexOf(",");
        int x2 = Integer.parseInt(secondPoint.substring(1,commaLocation2));
        int y2 = Integer.parseInt(secondPoint.substring(commaLocation2+1, secondPoint.length()-1));
        //creating the class
        LinearEquation linearEquationRunner = new LinearEquation(x1, y1, x2, y2);


    }
}
