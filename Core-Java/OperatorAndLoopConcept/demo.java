class Calc {
    public int add(int nums[]) {

        int result = 0;
        for (int n : nums) {
            result = result + n;
        }
        return result;
    }
}

public class demo {
    public static void main(String[] args) {
        Calc obj = new Calc();
        // int nums[] = { 1, 4, 3, 5, 6 };
        int result = obj.add(new int[] { 2, 4, 2, 5, 4 });
        System.out.println(result);
    }

}
