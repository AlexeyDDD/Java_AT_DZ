public class Cube extends _3dBody{

    //переопределение методов расчета
    //вычисление объема
    @Override
    public double getVolume() {
        return a*a*a;
    }

    //вычисление площади
    @Override
    public double getSquare(){
        return a*a*6;
    }

    //конструктор
    public Cube(double a) {
        super(a);
    }
}
