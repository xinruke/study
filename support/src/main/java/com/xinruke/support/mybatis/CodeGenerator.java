package com.xinruke.support.mybatis;

import com.xinruke.support.mybatis.generator.MainGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CodeGenerator {

    public void generate() {
        List<String> warnings = new ArrayList<>();
        boolean overwrite = true;
        File configFile = new File(System.getProperty("user.dir") + "/support/src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MainGenerator myBatisGenerator = new MainGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
            System.out.println("Congratulation！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
