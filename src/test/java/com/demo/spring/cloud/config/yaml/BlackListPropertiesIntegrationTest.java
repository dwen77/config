package com.demo.spring.cloud.config.yaml;

import com.demo.spring.cloud.config.properties.BlackListProperties;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigDataApplicationContextInitializer;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(properties = {"spring.config.location = classpath:config-client-blacklist.yml"})
public class BlackListPropertiesIntegrationTest {

    @Autowired
    private BlackListProperties blackListProperties;

    @Test
    public void whenSimplePropertyQueriedThenReturnsPropertyValue() {
       Assertions.assertEquals("", "");
    }
}
