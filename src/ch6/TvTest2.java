package ch6;

class Tv2 {
    String color;
    boolean power;
    int channel;

    void poewer() {
        power = !power;
    }

    void channel() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();
        Tv2 t2 = new Tv2();
        System.out.println("t1의 채널은 " + t1.channel + " 입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");

        t1.channel=7;
        System.out.println("t1의 채널을 7로 변경했습니다.");

        System.out.println("t1의 채널은 " + t1.channel + "입니다.");
        System.out.println("t2의 채널은 " + t2.channel + "입니다.");
    }
}
