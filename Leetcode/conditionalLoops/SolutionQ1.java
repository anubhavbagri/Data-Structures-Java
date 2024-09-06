package conditionalLoops;

public class SolutionQ1 {
    public static int subtractProductAndSum(int n) {
        int sum = 0, product = 1;
        while(n > 0){
            int d = n % 10;
            sum+=d;
            product*=d;
            n/=10;
        }
        return (product - sum);
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}