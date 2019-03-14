
package com.lwh.prototype;

public class PrototypeTest {
    public static void main(String[] args){
        GoldenCudgel goldenCudgel = new GoldenCudgel();
        goldenCudgel.setColor("red");
        goldenCudgel.setLength(180L);
        MonkeyKing monkeyKing = new MonkeyKing();

        monkeyKing.setAge(600);
        monkeyKing.setName("QiTianDaSheng");
        monkeyKing.setGoldenCudgel(goldenCudgel);

        System.out.println(monkeyKing);
        System.out.println(goldenCudgel);
        System.out.println("----------------------");
        try {
            MonkeyKing monkeyKing1 = (MonkeyKing)monkeyKing.clone();
            System.out.println(monkeyKing1);
            System.out.println(monkeyKing1.getGoldenCudgel());

            System.out.println("----------------------");

            MonkeyKing monkeyKing2 = (MonkeyKing)monkeyKing.deepClone();
            System.out.println(monkeyKing2);
            System.out.println(monkeyKing2.getGoldenCudgel());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
