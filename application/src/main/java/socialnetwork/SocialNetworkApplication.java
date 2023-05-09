package socialnetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import second.TestClass;

import java.util.logging.Logger;

@SpringBootApplication
//@EnableConfigurationProperties({ApplicationConfig.class})
//@EnableJpaRepositories(basePackages = {"socialnetwork.dataaccess.jpa.impl.dao"})
//@EnableWebSecurity
@ComponentScan(basePackages = {"second"})
public class SocialNetworkApplication {
    private static Logger log = Logger.getLogger(SocialNetworkApplication.class.getName());

    public static void main(String[] args) {
        var ctx = SpringApplication.run(SocialNetworkApplication.class, args);
//        ApplicationConfig config = ctx.getBean(ApplicationConfig.class);
//        log.info(config::toString);
        TestClass asd = ctx.getBean(TestClass.class);
    }
}
