//package OOPs;

public class AreaVol {
    int l,b,h,ar,v;
    public AreaVol()
    {
        l=1;
        b=1;
        h=1;
    }
    public AreaVol(int p)
    {
        l=p;
        b=p;
        h=p;
    }
    public AreaVol(int x,int y,int z)
    {
        l=x;
        b=y;
        h=z;
    }
    public void cal_area()
    {
        ar=l*b;
    }
    public void cal_vol()
    {
        v=l*b*h;
    }
    public static void main(String[] args) {
        AreaVol a=new AreaVol();
        a.cal_area();
        a.cal_vol();
        System.out.println(a.ar+" "+a.v);
        AreaVol a2=new AreaVol(9);
        a2.cal_area();
        a2.cal_vol();
        System.out.println(a2.ar+" "+a2.v);
        AreaVol a3=new AreaVol(8,9,6);
        a3.cal_area();
        a3.cal_vol();
        System.out.println(a3.ar+" "+a3.v);
    }
}
