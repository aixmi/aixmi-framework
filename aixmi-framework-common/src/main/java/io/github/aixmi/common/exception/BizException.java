package io.github.aixmi.common.exception;

/**
 * @author mcqj
 * @date 2020-11-24 下午 14:16
 */
public class BizException extends BaseException {
	private static final long serialVersionUID = 1L;

	public BizException(String errMessage) {
		super(errMessage);
	}

	public BizException(IErrorCode errCode, String errMessage) {
		super(errMessage);
		this.setErrCode(errCode);
	}

	public BizException(String errMessage, Throwable e) {
		super(errMessage, e);
	}
}
