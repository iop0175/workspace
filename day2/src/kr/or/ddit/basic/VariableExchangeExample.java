package kr.or.ddit.basic;
public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println(x+"."+y);
        int temp = x;
        x= y;
        y = temp;
        System.out.println("x"+x+",y"+y);
    }
}
