public class Exec {
    public static void main(String [] args){
        try {
            KvUr kvur = new KvUr(-1, 2, 3);

            kvur.Discriminant();
            //System.out.println(kvur.d);
            if (kvur.d < 0)
                System.out.println("Квадратное уравнение " + kvur.kvurString + " не имеет дейстительных решений, D < 0");
            else if (kvur.d == 0) {
                kvur.Solve();
                System.out.println("Квадратное уравнение " + kvur.kvurString + " имеет один действительный корень, x = " + kvur.x1);
            } else {
                kvur.Solve(kvur.d);
                System.out.println("Квадратное уравнение " + kvur.kvurString + " имеет два действительных корня:\n" +
                        "x1 = " + kvur.x1 + "\nx2 = " + kvur.x2);
            }
        }
         catch (IllegalArgumentException e) {
            System.out.println("Коэффициент 'а' не задан!");
        }
    }
}
