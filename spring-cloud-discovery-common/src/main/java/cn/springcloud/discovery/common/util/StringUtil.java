package cn.springcloud.discovery.common.util;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @version 1.0.0
 * @author ituac
 * <b>desp: string-util </b>
 * <b>url: http://ituac.com</b>
 *
 */

public class StringUtil {
	
	public static List<String> splitToList(String value, String separate) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }

        String[] valueArray = StringUtils.split(value, separate);

        return Arrays.asList(valueArray);
    }
	
}
