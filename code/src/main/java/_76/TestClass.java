package _76;


import org.junit.Assert;
import org.junit.Test;

public class TestClass {
   Solution solution = new Solution();

    @Test
    public void test01() {
        String s = solution.minWindow("ADOBECODEBANC", "ABC");
        Assert.assertEquals("BANC",s);
    }

    @Test
    public void test02() {
        String s = solution.minWindow("ADOBECODEBANC", "ABEFC");
        Assert.assertEquals(s,"");
    }
    @Test
    public void test03() {
        String s = solution.minWindow("A", "A");
        Assert.assertEquals("A",s);
    }

    @Test
    public void test04() {
        String s = solution.minWindow("A", "AA");
        Assert.assertEquals("",s);
    }
}
