package day11;

public class SolveQ1 {

    //How to find the missing number in a given integer array of 1 to 10?
    //1,2,3,4,5,7,8,9,10

    public static void main(String[] args) {

        int a[] = {1,2,3,4,5,6,7,9,10};

        for(int i = 1; i <= 10; i++) {
            if(i != a[i-1]) {
                System.out.println(i);
                break;
            }
        }

        int d = 1;
        for ( int b:a) {
            if( d != b) {
                System.out.println(d);
                break;
            }
            d++;
        }

        int sum = (10*11)/2;  //(n(n+1)/2) //1,2,3,4,5,6,7,8,9,10
        int sum1 = 0;
        for(int i : a ) {
            sum1 +=  i;
        }

        System.out.println(sum - sum1);
    }
}
