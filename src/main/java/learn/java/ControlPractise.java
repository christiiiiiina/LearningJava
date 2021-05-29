package learn.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ControlPractise {
    private static final Logger logger = LogManager.getLogger(ControlPractise.class);

    private static final float BREAKPOINT = 0.618f;
    private static final float RANGE = 20;

    private static void nearGoldSection(){
        float minDiff = 100;
        float result;
        int son = 1;
        int mother = 1;
        for (int i = 1; i <= RANGE; i++) {
            for (int j = 1; j <= RANGE; j++) {
                if (0 == i % 2 && 0 == j % 2){
                    continue;
                }
                result = (float) i / j;
                float diff = result - BREAKPOINT;
                diff = diff < 0 ? 0 - diff : diff;
                if (diff < minDiff){
                    minDiff = diff;
                    son = i;
                    mother = j;
                }
            }
        }
        logger.info("离黄金分割点最近的两个数是{}/{}={}", son, mother, (float) son / mother);
    }

    private static void getNarcissusNumber(){
        for (int i = 100; i < 1000; i++) {
            int hundred = i / 100;
            int ten = i / 10 % 10;
            int single = i % 10;
            int result = (int) (Math.pow(hundred, 3) + Math.pow(ten, 3) + Math.pow(single, 3));
            if (result == i){
                logger.info("找到的水仙花数：{}", i);
            }
        }
    }

    public static void main(String[] args) {
        nearGoldSection();
        getNarcissusNumber();
    }
}
