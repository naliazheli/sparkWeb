package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by naliazheli on 3/27/2017.
 */
@Component
public class YeWu {
    @Autowired
            @Qualifier("MFA")
    MF mf;
}
