package backend;

public class Patron {
    private final int age;
    private final int size;
    private final int time;

    private final String type;

    public Patron(int age, int size, int time, String type){
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

    public String getType(){
        return this.type;
    }

}
