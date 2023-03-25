package backend;

public class Patron {
    public int age;
    public int size;
    public int start_time;
    private int end_time;
    private Type type;
    private double value = 0.0;

    enum Type{
        CRITIC,
        BAR,
        FIRST_TIME,
        DISCOUNTED;
    }

    public double getExpectedCheck() {
        switch (this.type) {
            case CRITIC:
                // read csv's average critic check
            case BAR:
                // read csv's average bar check
            case FIRST_TIME:
                // read csv's average first time check
            case DISCOUNTED:
                // read csv's average discounted check
        }
        return 0; // temp temp temp
    }


    public Patron(){ return; }
    public Patron(int age, int size, int start_time, int end_time, Type type){
        this.age = age;
        this.size = size;
        this.start_time = start_time;
        this.end_time = end_time;
        this.type = type;
    }

    public int getAge(){
        return this.age;
    }

    public int getSize(){
        return this.size;
    }

    public int getStart_time(){
        return this.start_time;
    }

    public int getEnd_time(){
        return this.end_time;
    }

    public Type getType(){
        return this.type;
    }

    public void setStart_time(int start_time){
        this.start_time = start_time;
    }

    public void setEnd_time(int end_time){
        this.end_time = end_time;
    }

    public void setType(Type type){
        this.type = type;
    }

}
