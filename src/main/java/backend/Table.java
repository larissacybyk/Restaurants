package backend;

public class Table {
    private final int seats;
    private boolean available;

    public Table(int seats, boolean available) {
        this.seats = seats;
        this.available = available;
    }

    public int getSeats() {
        return seats;
    }

    public boolean getAvailable() {
        return available;
    }

    public void makeAvailable() {
        available = true;
    }

    public void makeUnAvailable() {
        available = false;
    }
}
