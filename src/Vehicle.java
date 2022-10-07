import java.util.Scanner;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String Lplate;
    private int miles;

    void base(){
        make = "0";
        model = "0";
        year = 0;
        Lplate = "0";
        miles = 0;
    }
    public void base(String make, String model, int year, String Lplate, int miles){
        this.make = make;
        this.model = model;
        this.year = year;
        this.Lplate = Lplate;
        this.miles = miles;

    }



}
