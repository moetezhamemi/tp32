//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Point p = new Point(2,3,"a");
        Point p1 = new Point(3,5,"b");
        Point p2 = new Point(5,7,"c");
        Point p3 = new Point(7,9,"d");
        segment s = new segment(p,p1);
        segment s1 = new segment(p2,p3);
        int d1 = p.distance(p1);
        int d2 = p2.distance(p3);
        String a = s.ToString();
        String b = s1.ToString();
        System.out.println("distance de segment s = "+ d1);
        System.out.println("distance de segment s1 = "+ d2);
        System.out.println("caracteristique de s est: "+ a);
        p.affiche();
        p1.affiche();
        System.out.println(d1);
        System.out.println("caracteristique de s1 est: "+b);
        p2.affiche();
        p3.affiche();
        System.out.println(d2);

    }
}