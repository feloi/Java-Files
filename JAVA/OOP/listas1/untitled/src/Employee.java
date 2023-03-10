public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(){

    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public void setId(Integer id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public Double increaseSalary(double percent){
        return salary += (10 * salary) / 100;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary );
    }
}
