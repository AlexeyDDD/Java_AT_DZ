public class Parallelepiped extends _3dBody{

    //переопределение методов расчета
    //вычисление объема
    @Override
    public double getVolume() {
        return a*b*c;
    }

    //вычисление площади
    @Override
    public double getSquare(){
        return a*b*2+a*c*2+b*c*2;
    }

    //конструктор
    public Parallelepiped(double a, double b, double c) {
        super(a, b, c);
    }
}
