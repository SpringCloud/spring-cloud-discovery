package cn.springcloud.discovery.common.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.client.ResponseErrorHandler;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.type.TypeReference;
import cn.springcloud.discovery.common.handler.RestErrorHandler;

/**
 * 
 * @version 1.0.0
 * @author ituac
 * <b>desp:  reset-util</b>
 * <b>url: http://ituac.com</b>
 *
 */


public class RestUtil {

	public static <T> T fromJson(RestTemplate restTemplate, String result, TypeReference<T> typeReference) {
        try {
            return JsonUtil.fromJson(result, typeReference);
        } catch (Exception e) {
            String cause = getCause(restTemplate);
            if (StringUtils.isNotEmpty(cause)) {
                throw new IllegalArgumentException(cause);
            }

            throw e;
        }
    }

    public static String getCause(RestTemplate restTemplate) {
        ResponseErrorHandler responseErrorHandler = restTemplate.getErrorHandler();
        if (responseErrorHandler instanceof RestErrorHandler) {
            RestErrorHandler errorHandler = (RestErrorHandler) responseErrorHandler;

            return errorHandler.getCause();
        }

        return null;
    }
	
}
