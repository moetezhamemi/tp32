import static java.lang.Math.max;
import static java.util.Collections.min;

public class segment {
     Point extr1;
     Point extr2;
    public segment(Point p1,Point p2)
    {
        extr1 = p1;
        extr2 = p2;
    }
    public segment()
    {
        this(null,null);
    }
    public String ToString()
    {
         String b =  "[" + extr1 + extr2 +"]";
         return b;
    }
    boolean appartient(Point p) {
        boolean b = false;
        if ((p.ord - extr1.ord) / (p.abs - extr1.abs) == (extr2.ord - extr1.ord) / (extr2.abs - extr1.abs) && Math.min(extr1.abs, extr2.abs) <= p.abs && Math.max(extr1.abs, extr2.abs) >= p.abs && Math.min(extr1.ord, extr2.ord) <= p.ord && Math.max(extr1.ord, extr2.ord) <= p.ord)
        {
            return true;
        }
        else {return b;}
    }
    void translaterSeg (int a, int b)
    {
        extr1.abs+=a;
        extr2.abs+=a;
        extr2.ord+=b;
        extr2.ord+=b;
    }


}

