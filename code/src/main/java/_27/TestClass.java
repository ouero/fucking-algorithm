package _27;


import org.junit.Test;

public class TestClass {
    Solution solution = new Solution();

    @Test
    public void test01() {
        int[] nums1 = {2, 1};
        int len = solution.removeElement(nums1, 2);
        for (int i = 0; i < len; i++) {
            System.out.println(nums1[i]);
        }
    }

    @Test
    public void test02() {
        int[] nums = {2};
        int len = solution.removeElement(nums, 2);
        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }
    }

    @Test
    public void test03() {
        int[] nums1 = {2, 1, 1};
        int len = solution.removeElement(nums1, 1);
        for (int i = 0; i < len; i++) {
            System.out.println(nums1[i]);
        }
    }
}
