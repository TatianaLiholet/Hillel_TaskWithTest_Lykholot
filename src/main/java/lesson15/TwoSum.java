package lesson15;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] indicesOfTheTwoNumbers = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indicesOfTheTwoNumbers[0] = i;
                    indicesOfTheTwoNumbers[1] = j;
                }

            }
        }

        for (int i = 0; i < indicesOfTheTwoNumbers.length; i++) {
            System.out.println(indicesOfTheTwoNumbers[i]);

        }
        return indicesOfTheTwoNumbers;
    }
}


