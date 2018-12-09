package cn.springcloud.discovery.common.exception;

/**
 * 
 * @version 1.0.0
 * @author ituac
 * <b>desp:  Discovery-Exception</b>
 * <b>url: http://ituac.com</b>
 *
 */
public class DiscoveryException extends RuntimeException {

	private static final long serialVersionUID = -7053282767064039674L;
	
	public DiscoveryException() {
        super();
    }

    public DiscoveryException(String message) {
        super(message);
    }

    public DiscoveryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiscoveryException(Throwable cause) {
        super(cause);
    }
}
