package com.github.pgcomb.spbt.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * Title: com.github.pgcomb.spbt.template.ApplicationMain <br>
 * Description: com.github.pgcomb.spbt.template.ApplicationMain <br>
 * Date: 2019年04月02日
 *
 * @author 王东旭
 * @version 1.0.0
 * @since jdk8
 */
@SpringBootApplication
public class ApplicationMain {
    private static final Logger LOG = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication springApplication = new SpringApplication(ApplicationMain.class);
        Properties properties = new Properties();
        properties.put("spring.profiles.default","dev");
        springApplication.setDefaultProperties(properties);
        ConfigurableApplicationContext run = springApplication.run(args);
        ConfigurableEnvironment env = run.getEnvironment();

        String protocol = "http";
        if (env.getProperty("server.ssl.key-store") != null) {
            protocol = "https";
        }
        LOG.info(
                "\n----------------------------------------------------------\n\t"
                        + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\t{}://localhost:{}\n\t"
                        + "External: \t{}://{}:{}\n\t"
                        + "Profile(s): \t{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"), protocol, env.getProperty("server.port"), protocol,
                InetAddress.getLocalHost().getHostAddress(), env.getProperty("server.port"),
                env.getActiveProfiles().length == 0 ? env.getDefaultProfiles() : env.getActiveProfiles());

    }
}
