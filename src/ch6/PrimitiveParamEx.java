package ch6;


class Data1 {
    int x;
}

class PrimitiveParamEx {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After changing : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("change : x = " + x);
    }
}
