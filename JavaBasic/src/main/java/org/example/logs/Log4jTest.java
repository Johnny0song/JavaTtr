package org.example.logs;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

public class Log4jTest {
    @Test
    public void testQuick(){
        // 初始化系统配置，不需要配置文件
        BasicConfigurator.configure();

        // 创建日志记录器对象
        Logger logger = Logger.getLogger(Log4jTest.class);

        logger.info("hello log4j");
    }
}
