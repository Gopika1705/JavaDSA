package recursion;
public class Binary {
    void rec(int num) {
        if (num > 1) {
            rec(num / 2); 
        }
        System.out.print(num % 2);
    }
    public static void main(String[] args) {
        Binary b = new Binary();
        int num = 72;
        if (num == 0) {
            System.out.print(0);
        } else {
            b.rec(num);
        }
   
    }
}
