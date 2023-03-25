package backend;

public class Optimal extends Patron {
    public double value;
    public double getCalculatedValue(){
        return this.getExpectedCheck() * this.size;
    }

    public double getRatioProfit(){
        return this.getCalculatedValue() / ((this.getEnd_time() - this.getStart_time()) - 40);
    }



    public optimalSchedule(){
        for(int i=0; i</*array of arrays of Patrons*/; i++){

        }

    }

}
