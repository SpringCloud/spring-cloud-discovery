package cn.springcloud.discovery.common.handler;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;
import cn.springcloud.discovery.common.constant.DiscoveryConstant;

public class RestErrorHandler extends DefaultResponseErrorHandler {
    private String cause;

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        // 这里绝对不能关闭InputStream
        InputStream inputStream = response.getBody();
        cause = IOUtils.toString(inputStream, DiscoveryConstant.ENCODING_UTF_8);
    }

    public String getCause() {
        return cause;
    }

}
