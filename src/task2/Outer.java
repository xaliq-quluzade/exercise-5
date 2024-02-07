package task2;

public class Outer {
    public static void main(String[] args) {
        Outer.Inner inner1 = new Outer.Inner();
        Outer.Inner inner2 = new Outer.Inner();
        Outer.Inner inner3 = new Outer.Inner();

        System.out.println(Outer.Inner.getCount());
    }

    private static class Inner {
        private static int count = 0;

        public Inner() {
            count++;
        }

        public static int getCount() {
            return count;
        }
    }
}
