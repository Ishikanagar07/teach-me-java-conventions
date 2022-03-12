package powerpackage;

public class PowerFinder {
    public static int findPower(int base, int power) {
        int tmp = 1;
        for (int i = 0; i<power; i++) {
            tmp *= base;
        }
        return tmp;
    }
}
