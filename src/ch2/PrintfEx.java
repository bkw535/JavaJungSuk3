package ch2;

public class PrintfEx {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;  // Long big=100000000000L;
        long hex=0xFFFF_FFFF_FFFFL;

        int octNum=010;     // 8진수 10, 10진수로는 8
        int hexNum=0x10;    // 16진수 10, 10진수로는 16
        int bigNum=0b10;    // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b);
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c);
        System.out.printf("finger=[%5d]%n", finger);
        System.out.printf("finger=[%-5d]%n", finger);
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex);
        System.out.printf("octNum=%o, %d%n", octNum, octNum);
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum);
        System.out.printf("bigNum=%s, %d%n", bigNum, bigNum);

    }
}
