class TestPoint{
    public static void main (String args [] ){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        Point p = new Point(x,y);
        p.deplacer(5,3);
        p.afficher();
    }
}
// javac src/Point.java src/TestPoint.java
// java -cp src TestPoint 3 5