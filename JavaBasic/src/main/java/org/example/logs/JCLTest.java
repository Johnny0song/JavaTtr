package org.example.logs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class JCLTest {

    private static final String[] classesToDiscover =
            new String[]{"org.apache.commons.logging.impl.Log4JLogger",
                    "org.apache.commons.logging.impl.Jdk14Logger",
                    "org.apache.commons.logging.impl.Jdk13LumberjackLogger",
                    "org.apache.commons.logging.impl.SimpleLog"};

    public JCLTest(){
    }

    @Test
    public void testQuick() {
        // 创建日志对象
        Log log = LogFactory.getLog(JCLTest.class);

        log.info("info");
        log.debug("debug");
    }
}
