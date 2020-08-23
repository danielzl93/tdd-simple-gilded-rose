package cn.xpbootcamp.gildedrose;

public class Demo {
    //这个实现文件只是一个demo，仅供参考，提交代码时需要删除
    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

    public int calculateNormalQuality(int sellIn, int quality, int updateSellIn) {

        int updatedQuality;

        if (sellIn < updateSellIn || quality < 0 || quality > 50) {
            throw new IllegalArgumentException("invalid arguments");
        }

        if (quality == 0) {
            updatedQuality = 0;
        }else {
            int lag = sellIn - updateSellIn;
            updatedQuality = quality - lag;
        }

        return updatedQuality;
    }

}
