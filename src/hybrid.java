import java.util.Scanner;

public class hybrid extends Vehicle {
    private float battery;
    private float tank;
    private  String type;
    final int cost = 2;

    private void initial(){
        tank = 0;
        type = "M/A";

    }
    public void initial(int Tank, String type, float battery){
        this.tank = tank;
        this.type = type;
        this.battery = battery;
    }


    public float getTank(){
        return tank;
    }
    public float getBattery(){
        return battery;
    }
    public String gettype(){
        return type;
    }


    public void hybrid(String make, String model, int year, String Lplate, int miles, float battery, String fueltype, int watts){
        super.base(make,model,year,Lplate,miles);
        initial(watts,fueltype,battery);


    }
    public double getFuelEffciency(int m){
        double mpg  = ((double)(m))/ getTank();
        double mpge = ((double)(m) *2)/getBattery();
        return ((mpg +mpge)/2);
    }


}
