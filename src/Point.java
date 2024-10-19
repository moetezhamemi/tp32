public class Point {
        int abs;
        int ord;
        String nom;
    public Point(int a,int o,String nom)
    {
        abs = a;
        ord = o;
        this.nom = nom;
    }
    public Point()
    {
        this(0,0,"");
    }
    void affiche()
    {
       System.out.println(nom+"("+abs+","+ord+")");
    }
    int distance(Point p)
    {
         int d = Math.abs((this.abs - p.abs)+(this.ord-p.ord));
        return d;
    }


}
