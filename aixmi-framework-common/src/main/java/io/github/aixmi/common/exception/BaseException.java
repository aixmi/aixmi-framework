package io.github.aixmi.common.exception;

/**
 * @author mcqj
 * @date 2020-11-24 下午 14:16
 */
public class BaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private IErrorCode errCode;

	public BaseException(String msg) {
		super(msg);
	}

	public BaseException(String msg, Throwable e) {
		super(msg, e);
	}

	public IErrorCode getErrCode() {
		return errCode;
	}

	public void setErrCode(IErrorCode errCode) {
		this.errCode = errCode;
	}
}
