package learn.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ControlWhile {
    private static final Logger logger = LogManager.getLogger(ControlWhile.class);

    private static int getFactorial(int num){
        int result = 1;
        do {
            result *= num;
            num--;
        }while (num > 0);

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            int result = getFactorial(scanner.nextInt());
            logger.info("结果为:{}", result);
        }
    }
}
