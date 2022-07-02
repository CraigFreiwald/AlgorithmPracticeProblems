

public class Main {
    public static void main(String[] args) {



        PivotIndex pivotIn = new PivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int x = pivotIn.pivotIndex(nums);
        System.out.println("Expected answer: 3");
        System.out.println("My answer is: " + x);
    }


}

