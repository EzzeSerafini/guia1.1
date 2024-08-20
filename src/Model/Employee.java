package Model;

public class Employee {
    private String name;
    private String lastname;
    private String dni;
    private double salary;

    // SETTERS

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    // GETTERS

    public String getNombre() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDni() {
        return dni;
    }

    public double getSalary() {
        return salary;
    }

    ///contructor

    public Employee(String nombre, String apellido, String dni, double salary) {
        this.name = nombre;
        this.lastname = apellido;
        this.dni = dni;
        this.salary = salary;
    }

    // Metodos

    public double calculateAnnualSalary(){
        return this.salary = this.salary * 12;
    }
    public void calculatePercentage(double porcentaje){
        if (porcentaje > 0) {
            this.salary += salary * (porcentaje / 100);
        }
    }

    public String toString() {
        return "Employee[dni=" + dni + ", name=" + name + ", lastname=" + lastname + ", salary=" + salary + "]";
    }
}
