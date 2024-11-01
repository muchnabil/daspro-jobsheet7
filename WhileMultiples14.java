import java.util.Scanner;

public class WhileMultiples14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, counter = 0;
        double multiple;
        double i= 1.0;
        double avg;

        System.out.print("Input the multiple : ");
        multiple = input.nextDouble();
 
        while (i <= 50) {
            if (i % multiple == 0){
                sum += i;
                counter++;
            }
        i++;    
        }
    if (counter !=0){
        avg = sum / counter;
        System.out.println(avg);
    }
    }
}