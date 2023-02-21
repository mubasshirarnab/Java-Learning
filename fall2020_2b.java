package MidQuestion;

public class fall2020_2b {
    public static void main(String[] args) {
        double[] Array = {10.5,11.0,22.0,12.5,4.7,5.6,15.75,3.5,7.0,9.5,2.5};

        double sum = 0;

        for (double i : Array){
            if (i<10.5){
                sum+=i;
            }
        }

        System.out.println("The sum of the elements that are less than 10.5 is: " + sum);

        System.out.println("The size of the array is: " + Array.length);
    }
}
