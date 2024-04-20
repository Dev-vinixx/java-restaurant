package user;

public class User {
    private final String NAME   ;
    private final int age;
    private double amount;

    public User (String name, int age) {
        this.NAME = name;
        this.age = age;
    }

    public void setAmount (double amount) {
        this.amount += amount;
    }
    public double getAmount () {
        return this.amount;
    }
}
