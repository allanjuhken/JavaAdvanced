package encapsulation.and.inheritance.ball;

public class Spike extends Ball {
    // A parent object is one that is extended
    // by the child class

    // The child class INHERITS alla the features and
    //properties of teh parent class but vice versa does not occur

    private  int numOfSpikes;

    public Spike(boolean isRound, int diameter, int numOfSpikes){
        super(isRound, diameter);
        this.numOfSpikes = numOfSpikes;
    }

    public int getNumOfSpikes() {
        return numOfSpikes;
    }

    //polymorphism
    public int getNumOfSpikes(int spikes){
        return spikes;
    }


    //Annotation
    @Override
    public void bounce(){ // method overriding
        System.out.println("Spikes dont bounce");
    }
}
