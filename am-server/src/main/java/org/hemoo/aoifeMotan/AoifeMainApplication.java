package org.hemoo.aoifeMotan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunjiawei on 2017/3/31.
 */

/**
 * @SpringBootApplication = @Config+ @EnableAutoConfiguration + @ComponentScan = @Autowired *
 * @RestController = @ResponseBody + @Controller = 配合 = @RequestMapping
 */
//@RestController
@Controller
@SpringBootApplication
public class AoifeMainApplication {

    public static void main(String [] args) {
        SpringApplication.run(AoifeMainApplication.class, args);
    }
}
