package backend;

public class Optimal extends Patron {

    public double getCalculatedValue(){
       return this.getExpectedCheck() * this.getSize();
    }

//    public double setRatioValues(){
//        for(int i=0; i</*array of arrays of Patrons*/; i++){
//            double total = this.getCalculatedValue() / ((this.getEnd_time() - this.getStart_time()) - 40);
//            this.setValue(total);
//        }
//    }



//    public Reservation[] optimalSchedule(){
//        /*the array*/.forEach(function ())
//
//    }

}
