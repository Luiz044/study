/**
 * Created by FUJITSU on 2015/06/23.
 */
public class fizzbuzz01 {
    public static void main(String[] args){
        int i = 1;
        while(i <= 100){
            if(i % 3 == 0 && i % 5 == 0){
                // 15 の倍数
                System.out.print("FizzBuzz");
            } else if(i % 3 == 0){
                // 3 の倍数
                System.out.print("Fizz");
            } else if(i % 5 == 0){
                // 5 の倍数
                System.out.print("Buzz");
            } else {
                // 数字をそのまま表示
                System.out.print(i);
            }
            if(i % 20 == 0){
                System.out.println();
            } else {
                System.out.print(" ");
            }
            i++;
        }
    }
}
