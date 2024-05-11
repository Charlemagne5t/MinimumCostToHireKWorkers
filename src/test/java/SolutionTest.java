import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[] quality = {10,20,5};
        int[] wage = {70, 50, 30};
        int k = 2;
        double delta = 1e-5;
        double expected = 105.00000;
        double actual = new Solution().mincostToHireWorkers(quality, wage, k);
        Assert.assertEquals(expected, actual, delta);
    }
    @Test
    public void test2() {
        int[] quality = {3,1,10,10,1};
        int[] wage = {4,8,2,2,7};
        int k = 3;
        double delta = 1e-5;
        double expected = 30.66667;
        double actual = new Solution().mincostToHireWorkers(quality, wage, k);
        Assert.assertEquals(expected, actual, delta);
    }
}
