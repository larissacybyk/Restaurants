package backend;

public class Reservation {
    public int size;
    public int start_time;
    public int end_time;

    public Reservation(int size, int start_time, int end_time){
        this.size = size;
        this.start_time = start_time;
        this.end_time = end_time;
    }

    public int getSize(){
        return size;
    }
    public int getStart_time(){
        return start_time;
    }
    public int getEnd_time(){
        return end_time;
    }

    public Reservation[] consolidateReservations(){

    }



}
