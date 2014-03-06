package com.snail.lilac.core;

import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author andy
 * @since 2013-5-14
 */
public class SpringContextHolder implements InitializingBean, ApplicationContextAware {

    private static final Logger     log = LoggerFactory.getLogger(SpringContextHolder.class);

    private static ApplicationContext applicationContext;

    /*
     * (non-Javadoc)
     * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.
     * ApplicationContext)
     */
    @Override
    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringContextHolder.applicationContext = applicationContext;
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
