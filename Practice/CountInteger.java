package Practice;
public class CountInteger {
    public static void main(String[] args) {
        int num = 100000;
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
