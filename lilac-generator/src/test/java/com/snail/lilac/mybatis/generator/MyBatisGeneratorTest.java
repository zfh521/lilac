package com.snail.lilac.mybatis.generator;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.VerboseProgressCallback;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.logging.Log;
import org.mybatis.generator.logging.LogFactory;

/**
 * @author Andy
 */
public class MyBatisGeneratorTest {

    Log log = LogFactory.getLog(MyBatisGeneratorTest.class);

    @Test
    public void testGenerateMyBatis3() throws Exception {
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        InputStream configFile = this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
        Configuration config = cp.parseConfiguration(configFile);

        DefaultShellCallback shellCallback = new DefaultShellCallback(true);

        try {
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
            myBatisGenerator.generate(new VerboseProgressCallback());
            log.warn(warnings.toString());
        } catch (InvalidConfigurationException e) {
            throw e;
        }
    }
}
