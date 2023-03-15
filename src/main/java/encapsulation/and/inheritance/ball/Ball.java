package encapsulation.and.inheritance.ball;

public class Ball {
    //fieds = features/ properties
    boolean isRound = true;
    int diameter = 40; //cm

    //default constructor
    public Ball(boolean isRound, int diameter){
        this.isRound = isRound;
        this.diameter = diameter;
    }


    // setter and getter
    public void setDiameter(int diameter){
        this.diameter = diameter;
    }

    public int getDiameter(){
        return diameter;
    }

    //methods = behaviour
    public void bounce(){
        System.out.println("The ball bounced");
    }

    public static void keepBallRound(){
        System.out.println("Keeping ball round");
    }
}
