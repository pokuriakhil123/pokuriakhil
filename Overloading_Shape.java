class shapes
{
    static void shape(int l, int b)
    {
        System.out.println("area of rectangle " +(l*b));
    }
    static void shape(int s)
    {
        System.out.println("area of square " +(4*s));
    }
    static void shape(int s1, int s2, int s3)
    {
        System.out.println("area of trinagle " +(0.5*s2*s3));
    }
}
class Overloading_Shape
{
    public static void main(String args[])
    {
        shapes shp = new shapes();
        shp.shape(2);
        shp.shape(3,4);
        shp.shape(1,2,3);
    }
}
