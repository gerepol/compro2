import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner pia = new Scanner(System.in);
        int[] nums = {1, 3, 4, 3, 19, 23, 25, 27, 29, 33};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(i + " = " + nums[i]);
        }

        System.out.print("Insert a number: ");
        int pick = pia.nextInt();
        
        for (int i = 0; i < nums.length; i++) {
            if (pick == nums[i]) {
                System.out.println("The index number is: " + i);
                break;
            }
        }

        pia.close();
    }
}