import iam.dao.SPARK_SQLMapper;
import iam.db.SPARK_SQL;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.context.SpringContextTool;
import spring.test.YeWu;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception{

//        String[] testStr={
//                "2",
//                "a+b+3",
//                "(a-b)+3",
//                "a+(b*3"
//        };
//
//        for (String s:testStr){
//            System.out.println("Input expr:"+s);
//
//        }
        ApplicationContext context = SpringContextTool.context;

        testMybatis(context);
        YeWu yw = context.getBean("yeWu", YeWu.class);

        SPARK_SQLMapper sPARK_SQLMapper = (SPARK_SQLMapper) context.getBean("sPARK_SQLMapper");

        List<SPARK_SQL> spark_sqls = sPARK_SQLMapper.selectByAppId(Long.valueOf("150"));
        System.out.println("spark_sqls expr:"+spark_sqls.size());
        spark_sqls.forEach(System.out::println);

    }

    public static void testMybatis( ApplicationContext context){
        // 获得 app 执行逻辑
        SPARK_SQLMapper sPARK_SQLMapper = (SPARK_SQLMapper) context.getBean("sPARK_SQLMapper");
        List<SPARK_SQL> spark_sqls = sPARK_SQLMapper.selectByAppId(Long.valueOf(17));
        spark_sqls.forEach(System.out::println);

        spark_sqls.forEach(sql->{
            String optionsCol = sql.getOPTIONS();
            if(null!=optionsCol){
                String[] optionsCloSplit = optionsCol.split(";");
                for(String s:optionsCloSplit){
                    String[] ss = s.split(":");
                    System.out.println("k : "+ss[0]   +"    v   :" +ss[1]);

                    // 记录debug级别的信息
                    logger.debug(">>>>>>>>>This is debug message."+"k : "+ss[0]   +"    v   :" +ss[1]);
                    // 记录info级别的信息
                    logger.info("**********This is info message."+"k : "+ss[0]   +"    v   :" +ss[1]);
                    // 记录error级别的信息
                    logger.error("This is error message."+"k : "+ss[0]   +"    v   :" +ss[1]);
                }

            }
        });
    }
}
