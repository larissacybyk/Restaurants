package backend;

public class Patron {
    private final int age;
    private final int size;
    private int time;
    private Type type;

    enum Type{
        CRITIC,
        BAR,
        FIRST_TIME,
        NORMAL,
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
            case NORMAL:
                // read csv's normal discounted echeck
        }
        return 0; // temp temp temp
    }

    public Patron(int age, int size, int time, Type type){
        this.age = age;
        this.size = size;
        this.time = time;
        this.type = type;
    }

    public int getAge(){
        return this.age;
    }

    public int getSize(){
        return this.size;
    }

    public int getTime(){
        return this.time;
    }

    public Type getType(){
        return this.type;
    }

    public void setTime(int time){
        this.time = time;
    }

    public void setType(Type type){
        this.type = type;
    }

}
