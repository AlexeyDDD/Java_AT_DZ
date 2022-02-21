public class Executor {
    public static void main(String [] args){

        Cube cube = new Cube(1);
        Sphere sphere = new Sphere(3);
        Parallelepiped ppiped = new Parallelepiped(1,2,3);

        System.out.println("Площадь куба = " + cube.getSquare());
        System.out.println("Объем куба = " + cube.getVolume());

        System.out.println("Площадь сферы = " + sphere.getSquare());
        System.out.println("Объем сферы = " + sphere.getVolume());

        System.out.println("Площадь параллелепипеда = " + ppiped.getSquare());
        System.out.println("Объем параллелепипеда = " + ppiped.getVolume());
    }
}
