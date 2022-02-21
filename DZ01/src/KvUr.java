public class KvUr {
    //коэффициенты квура
    double a;
    double b;
    double c;
    //дискриминант
    double d;
    //корни
    double x1;
    double x2;

    String kvurString;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    //конструктор
    public KvUr(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.kvurString = a+"x2+"+b+"x+"+c+"=0";
        if (a == 0)
              throw new IllegalArgumentException("Коэффициент 'а' не задан!");

    }
    //общий вид квура
    public void fullKvUr(){

    }

    //метод вычисления дискриминанта
    public void Discriminant(){
        d = b*b-4*a*c;
        //return d;
    }
    //метод вычисления корня при D=0
    public void Solve(){
        x1 = -b/2*a;
    }
    //общий метод вычисления корней
    public void Solve(double d){
        x1 = (-b+Math.sqrt(d))/(2*a);
        x2 = (-b-Math.sqrt(d))/(2*a);

    }


}
