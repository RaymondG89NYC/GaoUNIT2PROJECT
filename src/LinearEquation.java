public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

//    public double roundNumber(double number){
//        number *= 100;
//        number = Math.round(number);
//        return number/100;
//    }
        public double roundedToHundredth(double toRound){
            toRound *= 100;
            toRound = Math.round(toRound);
            return toRound/100;
        }

    public double distance(){
        double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return(roundedToHundredth(distance));
    }

    public double yIntercept(){
        double y = y1;
        double x = x1;

        y -= x*slope();
        return(roundedToHundredth(y));
    }

    public double slope(){
        double run = x2-x1;
        double rise = y2 - y1;
        double slope = rise/run;
        return(roundedToHundredth(slope));
    }

    public String equation(){
        double slope = slope();
        double yIntercept = yIntercept();
        boolean horizontal = false;
        boolean yInterceptInt = false;
        //Now that I finished, I just realized that I didn't need to turn the yIntercept into int ;-;
        if(yIntercept % 1 == 0 ){
            yInterceptInt = true;
        }

        String equation = "y = ";
        //if slope is not horizontal
        if(slope != 0){
            //if slope is whole number
            if(slope % 1 == 0){
                if(slope == 1){
                    //don't add anything
                }
                else if(slope == -1){
                    equation += "-";
                }else {
                    equation += slope;
                }
            }
            //slope is not whole number
            else{
                int run = x2-x1;
                int rise = y2-y1;
                //if slope is negative fraction
                if(run < 0 || rise < 0){
                    run = Math.abs(run);
                    rise = Math.abs(rise);
                    //testing if negative is false alarm
                    if(run < 0 && rise < 0 ){
                        run = Math.abs(run);
                        rise = Math.abs(rise);
                        equation += rise + "/" + run;
                    }
                    //slope is negative fraction
                    else{
                        equation += "-" + rise + "/" + run;
                    }
                }
                //slope is positive fraction
                else{
                    equation += rise + "/" + run;
                }
            }
            equation += "x";
        }
        //slope is horizontal
        else{
            horizontal = true;
        }

        //if y-intercept isn't 0
        if(yIntercept != 0){
            //if y-intercept is negative
            if(yIntercept<0){
                yIntercept = Math.abs(yIntercept);
                //if equation is in y = number form
                if(horizontal == true){
                    //if yIntercept is integer
                    if(yInterceptInt){
                        equation += "-" + (int) yIntercept;
                    }else {
                        equation += "-" + yIntercept;
                    }
                }
                //equation is not in y = number form
                else {
                    //if yIntercept is integer
                    if(yInterceptInt){
                        equation += " - " + (int) yIntercept;
                    }else {
                        equation += " - " + yIntercept;
                    }
                }
            }
            //y-intercept is positive
            else{
                //equation is in y = number form
                if(horizontal == true){
                    if(yInterceptInt){
                        equation += (int) yIntercept;
                    }else {
                        equation += roundedToHundredth(yIntercept);
                    }
                }
                //equation is not in y = number form
                else {
                    if(yInterceptInt){
                        equation += " + " + (int) yIntercept;
                    }else {
                        equation += " + " + yIntercept;
                    }
                }
            }
        }

        return equation;
    }
    public String lineInfo(){
        String allInfo = "";
        allInfo += "The two points are: (" +x1 + ", " + y1 + ")" + " and (" +x2 + ", " + y2 + ")" + "\n";
        allInfo += "The equation of the line between these two points is: " + equation() + "\n";
        allInfo += "The slope of this line is: " + slope() + "\n";
        allInfo += "The y-intercept of the line is: " + yIntercept() + "\n";
        allInfo += "The distance between the two points is: " + distance() + "\n";

        return allInfo;
    }
    public String coordinateForX(double xValue){
        double yValue = xValue*slope()+yIntercept();
        yValue = roundedToHundredth(yValue);
        return "The points on the line is (" + xValue + ", " + yValue + ")";
    }

}
