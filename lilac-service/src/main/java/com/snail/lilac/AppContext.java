package com.snail.lilac;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Andy
 * @since 2013-5-14
 */
public class AppContext implements InitializingBean, ApplicationContextAware {

    private static final Logger     log = LoggerFactory.getLogger(AppContext.class);

    private static ApplicationContext applicationContext;

    /*
     * (non-Javadoc)
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.
     * ApplicationContext)
     */
    @Override
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AppContext.applicationContext = applicationContext;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        showSuccessMsg();
        log.info(System.getProperty("java.io.tmpdir"));
    }

    private void showSuccessMsg() {
        log.info("***************************************************************");
        log.info("***************************************************************");
        log.info("*****************LILAC START SUCCESSFULLY*************************");
        log.info("***************************************************************");
        log.info("***************************************************************");
    }

    public static <T> T getBean(String name, Class<T> requiredType) {
        return applicationContext.getBean(name, requiredType);
    }
}
