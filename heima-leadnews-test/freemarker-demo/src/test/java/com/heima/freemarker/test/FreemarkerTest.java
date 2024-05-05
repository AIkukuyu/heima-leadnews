package com.heima.freemarker.test;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@SpringBootTest(classes = FreemarkerTest.class)
@RunWith(SpringRunner.class)
public class FreemarkerTest {
    @Autowired
    private Configuration configuration;

    @Test
    public void test() throws IOException {
        Template template = configuration.getTemplate(".ftl");

        /**
         *
         */
//        template.process();

    }
}
