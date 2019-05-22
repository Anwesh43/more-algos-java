public class PossiblePath {

    public static int getPossiblePath(int i, int j, int m, int n) {
        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        return getPossiblePath(i + 1, j, m, n) + getPossiblePath(i, j + 1, m, n);
    }
    public static void main(String args[]) {
        int m = 3;
        int n = 3;
        System.out.println("possible paths are " + getPossiblePath(0, 0, m, n));
    }
}
