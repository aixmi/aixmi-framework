package io.github.aixmi.validation.constraints;

import io.github.aixmi.validation.validators.EnumValueConstraintsValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.Valid;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author mcqj
 * @date 2020-11-25 下午 15:34
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {EnumValueConstraintsValidator.class})
@Valid
public @interface EnumValue {

	Class<? extends Enum> value();

	String message() default "{io.github.aixmi.constraints.EnumValue.message}";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}
