package io.github.aixmi.common.exception;

/**
 * @author mcqj
 * @date 2020-11-24 下午 14:17
 */
public class SysException extends BaseException {
	private static final long serialVersionUID = 4355163994767354840L;

	public SysException(String errMessage) {
		super(errMessage);
	}

	public SysException(IErrorCode errCode, String errMessage) {
		super(errMessage);
		this.setErrCode(errCode);
	}

	public SysException(String errMessage, Throwable e) {
		super(errMessage, e);
	}

	public SysException(String errMessage, IErrorCode errorCode, Throwable e) {
		super(errMessage, e);
		this.setErrCode(errorCode);
	}
}
