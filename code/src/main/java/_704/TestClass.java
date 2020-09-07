package _704;


import org.junit.Assert;
import org.junit.Test;

public class TestClass {
    Solution solution = new Solution();

    @Test
    public void test01() {
        int[] nums1 = {-1,0,3,5,9,12};
        int len = solution.search(nums1, 9);
        Assert.assertEquals(4,len);
    }

    @Test
    public void test02() {
        int[] nums1 = {-1,0,3,5,9,12};
        int len = solution.search(nums1, 2);
        Assert.assertEquals(-1,len);
    }

}
