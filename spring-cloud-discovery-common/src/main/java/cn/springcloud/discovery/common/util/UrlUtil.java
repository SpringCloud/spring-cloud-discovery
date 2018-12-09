package cn.springcloud.discovery.common.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @version 1.0.0
 * @author ituac
 * <b>desp:  url-util</b>
 * <b>url: http://ituac.com</b>
 *
 */

public class UrlUtil {
	
	public static String formatUrl(String url) {
        if (!url.startsWith("http://")) {
            url = "http://" + url;
        }

        if (!url.endsWith("/")) {
            url = url + "/";
        }

        return url;
    }

    public static String formatContextPath(String contextPath) {
        if (StringUtils.isEmpty(contextPath)) {
            contextPath = "/";
        } else {
            if (!contextPath.startsWith("/")) {
                contextPath = "/" + contextPath;
            }
            if (!contextPath.endsWith("/")) {
                contextPath = contextPath + "/";
            }
        }

        return contextPath;
    }
	
}
