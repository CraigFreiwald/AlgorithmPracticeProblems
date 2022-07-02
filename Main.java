import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"mazda", "volvo", "tesla", "lucid"};


       // printMe(cars);

        PivotIndex pivotIn = new PivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int x = pivotIn.pivotIndex(nums);
        System.out.println(x);
    }

    private static void printMe(String[] cars) {
        for (String car : cars) System.out.println(car);
    }
}

