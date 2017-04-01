package spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by naliazheli on 4/1/2017.
 */
public class SpringContextTool {
    static{
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.load("/spring.xml");
        ctx.refresh();
        context=ctx;
    }
    public static ApplicationContext context;
}
