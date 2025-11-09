public class Volume {
    static double sphere(double d) {
        double r = 0.5 * d;
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(r,3);
        return volume;
    }
    public static void main(String[] args) {
        double d = 20.24;
       System.out.println(sphere(d));
        }

}
