public class Sphere extends _3dBody{
    //переопределение методов расчета
    //вычисление объема
    @Override
    public double getVolume() {
        return 4/3*Math.PI*a*a*a;
    }

    //вычисление площади
    @Override
    public double getSquare(){
        return 4*Math.PI*a*a;

    }
    //конструктор
    public Sphere(double a) {
        super(a);
    }
}
