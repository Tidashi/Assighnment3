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
    public void gas(String a, String b, int c, String d, int e, float f, String t){
        super.base(a,b,c,d,e);
        initial(f,t);

    }
    public float getTank(){
        return TankCapacity;
    }
    public double getFuelEffciency(int m){
        return (double)m/getTank();

    }



}
