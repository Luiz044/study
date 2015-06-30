/**
 * Created by FUJITSU on 2015/06/30.
 */
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("第"+args[0]+"項:"+fibonacci(Integer.parseInt(args[0])));
    }
    static long fibonacci(int n) {
        if(n<=0)return 0;
        if(n==1 || n==2)return 1;
        long F,Fn1,Fn2;
        F=1;Fn1=1;
        for(int i=3;i<=n;i++) {
            Fn2=Fn1;
            Fn1=F;
            F=Fn1+Fn2;
        }
        return F;
    }
}
