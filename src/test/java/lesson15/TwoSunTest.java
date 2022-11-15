package lesson15;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSunTest {
    @Before

    @Test
    public void twoSumTest(){
        TwoSum sumTwoNumbers = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int expected[] = new int[]{0,1};
        Assert.assertArrayEquals(expected, sumTwoNumbers.twoSum(nums, target));

    }




}
