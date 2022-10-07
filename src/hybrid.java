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

    public float getFuelEffciency(){
        Scanner scrn = new Scanner(System.in);
        int newMiles;
        newMiles = scrn.nextInt();
        return newMiles;
    }
    public float getTank(){
        return tank;
    }


    public void hybrid(String a, String b, int c, String d, int e, float f, String t, int watts){
        super.base(a,b,c,d,e);


    }
    public double getFuelEffciency(int m){
        return (double)m/getTank();

    }
    public double getFuelEffciencya(int m){
        return (double)(m/getTank());

    }
    public double getFuelEffciencyb(int m){
        return (double)m/getTank();

    }

}
