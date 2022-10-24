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

    public double roundNumber(double number){
        number *= 100;
        number = Math.round(number);
        return number/100;
    }

    public double distance(){
        double distance = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
        return(roundNumber(distance));
    }

    public double yIntercept(){
        double y = y1;
        double x = x1;

        y -= x*slope();
        return(roundNumber(y));
    }

    public double slope(){
        double run = x2-x1;
        double rise = y2 - y1;
        double slope = rise/run;
        return(roundNumber(slope));
    }





}
