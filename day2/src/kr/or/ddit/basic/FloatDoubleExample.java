package kr.or.ddit.basic;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // float var1 = 3.14;
        // 컴파일 에러 실수를 float으로 사용시 f를 붙여야 한다,
        float var2 = 3.14f;
        double var3 = 3.14;

        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        // System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);

        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
    }
}
