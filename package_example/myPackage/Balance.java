package myPackage;

public class Balance{
    String name;
    double amt;

    public Balance(String name, double amt){
        this.name = name;
        this.amt = amt;
    }

    public void show(){
        System.out.println(this.name + " $" + this.amt);
    }
}