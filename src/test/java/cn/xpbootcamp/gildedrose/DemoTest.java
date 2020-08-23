package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DemoTest {
    //这个测试文件只是一个demo，仅供参考，提交代码时需要删除
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();

    @Test
    public void should_return_correct_number_when_calculate_given_two_numbers() {
        Demo demo = new Demo();
        int result = demo.calculate(1, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void should_return_zero_when_quality_zero() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(0, 0, 0);
        Assert.assertEquals(0, result);
    }

    @Test
    public void should_throws_when_quality_large_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(1, 51, 1);
    }

    @Test
    public void should_throws_when_quality_less_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(1, -1, 1);
    }
}
