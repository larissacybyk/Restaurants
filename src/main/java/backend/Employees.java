package backend;

public class Employees {
    public double serverSalary;
    public double cookSalary;
    public double managerSalary;
    public double bartenderSalary;
    public double getServerSalary() {
        return serverSalary;
    }

    public double getCookSalary() {
        return cookSalary;
    }

    public double getManagerSalary() {
        return managerSalary;
    }

    public double getBartenderSalary() {
        return bartenderSalary;
    }

    public Employees(double serverSalary, double managerSalary, double bartenderSalary, double cookSalary) {
        this.bartenderSalary = bartenderSalary;
        this.cookSalary = cookSalary;
        this.managerSalary = managerSalary;
        this.serverSalary = serverSalary;
    }
}
