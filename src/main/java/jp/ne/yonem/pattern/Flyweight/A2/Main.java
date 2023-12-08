package jp.ne.yonem.pattern.Flyweight.A2;

public class Main {

    private static final BigString[] bsarray = new BigString[1000];

    public static void main(String[] args) {
        System.out.println("共有した場合:");
        testAllocation(true);
        System.out.println("共有しない場合:");
        testAllocation(false);
    }

    public static void testAllocation(boolean shared) {

        for (var i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        var used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用メモリ = " + used);
    }
}
