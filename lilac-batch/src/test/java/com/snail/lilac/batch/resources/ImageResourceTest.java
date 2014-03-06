package com.snail.lilac.batch.resources;

import org.junit.Test;
import com.snail.lilac.core.logging.Logger;
import com.snail.lilac.core.logging.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * @author andy
 */
@DirtiesContext
@ContextConfiguration(locations = { "/spring/applicationContext-test.xml" })
public class ImageResourceTest extends AbstractJUnit4SpringContextTests {

    private final Logger log = LoggerFactory.getLogger(ImageResourceTest.class);

    @Test
    public void testGetResources() throws Exception {
        ImageResource imageResource = (ImageResource) applicationContext.getBean("imageResource");
        Resource[] resources = imageResource.getResources();
        for (Resource resource : resources) {
            log.info(resource.getFilename());
        }
    }

    @Test
    public void testResource() throws Exception {
        Resource resource = applicationContext.getResource("file:F:/Project/lilac/lilac-batch/src/test/resources/in/data.csv");
        log.info("resource:{} {}", new Object[] { resource.exists(), resource.getFile() });

        resource = applicationContext.getResource("classpath:in/data.csv");
        log.info("resource:{} {}", new Object[] { resource.exists(), resource.getFile() });

        resource = applicationContext.getResource(".");
        log.info("resource:{} {}", new Object[] { resource.exists(), resource.getFile() });

        resource = applicationContext.getResource("url:http://www.last.fm/robots.txt");
        log.info("resource:{} {}", new Object[] { resource.exists(), resource.getURL() });
    }
}
