package com.snail.lilac.service.id;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import com.snail.lilac.logging.Logger;
import com.snail.lilac.logging.LoggerFactory;

/**
 * @author Andy
 */
@Component
public class UUIDHexGenerator extends AbstractUUIDGenerator {

    private static final Logger log       = LoggerFactory.getLogger(UUIDHexGenerator.class);

    private static boolean      warned    = false;

    private static final String SEPARATOR = "-";

    public UUIDHexGenerator(){
        if (!warned) {
            warned = true;
            log.warn("using UUIDHexGenerator");
        }
    }

    @Override
    public Serializable generate() {
        return new StringBuilder(36).append(format(getIP())).append(SEPARATOR).append(format(getJVM())).append(SEPARATOR).append(format(getHiTime())).append(SEPARATOR).append(format(getLoTime())).append(SEPARATOR).append(format(getCount())).toString().toUpperCase();
    }

    protected String format(int intValue) {
        String formatted = Integer.toHexString(intValue);
        StringBuilder buf = new StringBuilder("00000000");
        buf.replace(8 - formatted.length(), 8, formatted);
        return buf.toString();
    }

    protected String format(short shortValue) {
        String formatted = Integer.toHexString(shortValue);
        StringBuilder buf = new StringBuilder("0000");
        buf.replace(4 - formatted.length(), 4, formatted);
        return buf.toString();
    }

}
