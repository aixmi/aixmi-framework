package io.github.aixmi.spring.support;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;


public class SpringELUtil {


	private final SpelExpressionParser parser;
	private final StandardEvaluationContext context;

	public SpringELUtil(ProceedingJoinPoint pjp) {
		this.parser = new SpelExpressionParser();
		this.context = new StandardEvaluationContext();
		extractArguments(pjp);
	}


	private void extractArguments(ProceedingJoinPoint pjp) {
		MethodSignature methodSignature = (MethodSignature) pjp.getSignature();

		String[] names = methodSignature.getParameterNames();
		Object[] args = pjp.getArgs();

		for (int i = 0; i < names.length; i++) {
			this.context.setVariable(names[i], args[i]);
		}
	}

	public Object calculate(String expr) {
		if (expr == null || expr.trim().isEmpty()) {
			return null;
		}
		return this.parser.parseRaw(expr).getValue(this.context);
	}
}
