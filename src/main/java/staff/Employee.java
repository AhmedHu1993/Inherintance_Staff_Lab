package staff;

public abstract class Employee {

    private String name;
    private int niNum;
    private int salary;

    public Employee(String name, int niNum, int salary){
        this.name = name;
        this.niNum = niNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNum() {
        return niNum;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        if (increase > 0) {
            salary += increase;
        }
    }

    public double payBonus(){
        return 0.01 * this.salary;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
    }
}
