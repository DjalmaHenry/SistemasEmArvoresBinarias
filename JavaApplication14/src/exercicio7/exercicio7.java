package exercicio7;

public class exercicio7 {

    public static void main(String[] args) {
        int t0 = proc1(30);
        int t4 = proc2(30);
        System.out.println("$t0: " + t0);
        System.out.println("$t4: " + t4);
    }

    public static int proc1(int a1) {
        int t2 = 82;
        int s0 = -10;
        int t0 = 0;
        int t1 = 1;
        int t4 = 0;
        int s1 = 15;
        if (a1 % 2 == 0) { // se a1 é par
            return t0; //retorna 0
        }
        if (a1 >= t2) { //se a1 >= 82
            return t0; //retorna 0
        }
        while (a1 != s1) {
            t0 = t0 + s1;
            s1 = s1 + 15;
            t4 = t4 + 1;
        }
        return t0;
    }

    public static int proc2(int a1) {
        int t2 = 82;
        int s0 = -10;
        int t0 = 0;
        int t1 = 1;
        int t4 = 0;
        int s1 = 15;
        if (a1 % 2 == 0) { // se a1 é par
            return t4; //retorna 0
        }
        if (a1 >= t2) { //se a1 >= 82
            return t4; //retorna 0
        }
        while (a1 != s1) {
            t0 = t0 + s1;
            s1 = s1 + 15;
            t4 = t4 + 1;
        }
        return t4;
    }
}
