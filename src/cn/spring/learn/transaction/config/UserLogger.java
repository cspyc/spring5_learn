package cn.spring.learn.transaction.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Pi
 * @date 2021-05-02 15:52
 */
public class UserLogger {

    private static final Logger log = LoggerFactory.getLogger(UserLogger.class);

    public static void main(String[] args) {
        log.info("手动输出日志！");
        log.warn("hell log4j2");
    }

}
