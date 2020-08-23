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
        int normalResult = demo.calculateNormalQuality(0, 0, 0);
        int backStagePassResult = demo.calculateBackStagePassQuality(0, 0, 0);
        Assert.assertEquals(0, normalResult);
        Assert.assertEquals(0, backStagePassResult);
    }

    @Test
    public void should_throws_when_normal_quality_large_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(1, 51, 1);
    }

    @Test
    public void should_throws_when_back_stage_pass_quality_large_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateBackStagePassQuality(1, 51, 1);
    }

    @Test
    public void should_throws_when_normal_quality_less_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(1, -1, 1);
    }

    @Test
    public void should_throws_when_back_stage_pass_quality_less_than_zero() throws IllegalArgumentException {
        expectedEx.expect(IllegalArgumentException.class);
        expectedEx.expectMessage("invalid arguments");
        Demo demo = new Demo();
        int result = demo.calculateBackStagePassQuality(1, -1, 1);
    }

    @Test
    public void should_return_updateQuality_v1() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(10, 20, 9);
        Assert.assertEquals(19, result);
    }

    @Test
    public void should_return_updateQuality_v2() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(2, 0, 1);
        Assert.assertEquals(0, result);
    }

    @Test
    public void should_return_updateQuality_v3() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(3, 6, 2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void should_return_updateQuality_v4() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(0, 6, -1);
        Assert.assertEquals(4, result);
    }

    @Test
    public void should_return_updateQuality_v5() {
        Demo demo = new Demo();
        int result = demo.calculateNormalQuality(-1, 6, -2);
        Assert.assertEquals(4, result);
    }
}
