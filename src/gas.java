import java.util.Scanner;

public class gas extends Vehicle{
    float TankCapacity;
    String type;
    private void initial(){
        TankCapacity = 0;
        type = "M/A";

    }
    public void initial(float TankCapacity, String type){
        this.TankCapacity = TankCapacity;
        this.type = type;

    }
    public void gas(String make, String model, int year, String Lplate, int miles, float tankCap,String gastype ){
        super.base(make,model,year,Lplate,miles);
        initial(tankCap,gastype);

    }
    public float getTank(){
        return TankCapacity;
    }
    public double getFuelEffciency(int m){
        return (double)m/getTank();
    }



}
