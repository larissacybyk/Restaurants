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
        DISCOUNTED;
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
