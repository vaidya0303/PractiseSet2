public class SumNaturalNumFor {

    public static void main(String[] args) {

        int num = 10, sum = 0;

        for(int i = 1; i <= num; i++)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum of natural number by for loop is = " + sum);
    }
 }
