package learn.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * @author Administrator
 */
public class ControlFor {

    private static final Logger logger = LogManager.getLogger(ControlFor.class);

    private static void getMoney(int day){
        int total = 1;
        for (int i = 0; i < day; i++) {
            total *= 2;
        }
        logger.info("{}天后，收入是：{}", day, total);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            getMoney(scanner.nextInt());
        }
    }

}
