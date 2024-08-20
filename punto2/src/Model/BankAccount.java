package Model;

public class BankAccount {
    private String name;
    private String lastName;
    private String dni;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public BankAccount(String name, String dni, String lastName, double money) {
        this.name = name;
        this.dni = dni;
        this.lastName = lastName;
        this.money = money;
    }
}
