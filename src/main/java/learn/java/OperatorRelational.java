package learn.java;

import java.util.logging.Logger;

/**
 * @author Administrator
 */
public class OperatorRelational {
    private static final Logger logger = Logger.getLogger("OperatorRelational");

    public void judgeRelation(int num1, int num2){
        if (num1 < num2){
            logger.info("{}小于{}");
        }else if (num1 == num2){
            logger.info("{}等于{}");
        }else {
            logger.info("{}大于{}");
        }
    }
}
