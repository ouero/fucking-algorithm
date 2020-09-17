package _227;


import org.junit.Assert;
import org.junit.Test;

public class TestClass {
   Solution solution = new Solution();

    @Test
    public void test01() {
        int s = solution.calculate("1+1");
        Assert.assertEquals(2,s);
    }

    @Test
    public void test02() {
        int s = solution.calculate("1+1*7");
        Assert.assertEquals(8,s);
    }
    @Test
    public void test03() {
        int s = solution.calculate("5-3*1+2");
        Assert.assertEquals(4,s);
    }
    @Test
    public void test04() {
        int s = solution.calculate("-9+6*4/2+1");
        Assert.assertEquals(4,s);
    }
    @Test
    public void test05() {
        int s = solution.calculate(" 3/2 ");
        Assert.assertEquals(1,s);
    }
    @Test
    public void test06() {
        int s = solution.calculate(" 3/2");
        Assert.assertEquals(1,s);
    }

    @Test
    public void test07() {
        int s = solution.calculate("6+(3/(2+1)+1)*2 ");
        Assert.assertEquals(10,s);
    }
}
