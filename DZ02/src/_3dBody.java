public abstract class _3dBody { //родительский класс

    //измерения тела
    double a; //для сферы a=радиус
    double b;
    double c;
    //вычисление объема
    public abstract double getVolume();

    //вычисление площади
    public abstract double getSquare();

    //перегруженный конструктор
    public _3dBody(double a) {
        this.a = a;
    }

    //общий конструктор
    public _3dBody(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
