public class Main {
    public static void main(String[] args) {
        System.out.println(isReachableAtTime(1, 2, 1, 2, 1));
    }

    public static boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        if (sx == fx && sy == fy && t==1) return false;
        return Math.abs(fx - sx) <= t && Math.abs(fy - sy) <= t;
    }
}