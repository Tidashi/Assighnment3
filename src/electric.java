public class electric extends Vehicle{
    float batterycapcity;
    final int price = 2;

    public float initial(){
        return batterycapcity = 0;
    }
    public void initial(float batterycapcity){
        this.batterycapcity = batterycapcity;
    }



    public void electric(String a, String b, int c, String d, int e, float f){
        super.base(a,b,c,d,e);
        initial(f);

    }


}
