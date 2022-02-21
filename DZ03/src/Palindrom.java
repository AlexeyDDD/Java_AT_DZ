public class Palindrom {

    private String stroka;
    private String strLower;
    private int len;

    public String getStroka() {
        return stroka;
    }

    public void setStroka(String stroka) {
        this.stroka = stroka;
    }

    public void getLen() {
        len = stroka.length();
    }

    public Palindrom(String str) {
        this.stroka = str;
        strLower = str.toLowerCase();
    }

    public static void main (String[] args) {
        int i;
        String strLower;
        Palindrom plndrom = new Palindrom("квааTвК");
       // plndrom.setStroka();
        plndrom.getLen();


        for (i = 0;i < plndrom.len/2;i++) {
            if (plndrom.strLower.charAt(i) != plndrom.strLower.charAt(plndrom.len-1-i)) {
                System.out.println("Строка " +plndrom.stroka+ " НЕ является палиндромом");
                i = plndrom.len; //чтобы сразу выйти из цикла
            }

        }
        if (i<plndrom.len)
            System.out.println("Строка " +plndrom.stroka+ " является палиндромом");
    }
}
