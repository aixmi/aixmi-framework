package io.github.aixmi.validation.validators;

import io.github.aixmi.validation.constraints.EnumValue;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author mcqj
 * @link https://www.baeldung.com/javax-validations-enums
 * @date 2020-11-25 下午 15:35
 */
public class EnumValueConstraintsValidator implements ConstraintValidator<EnumValue, Enum> {

	@Override
	public void initialize(EnumValue constraintAnnotation) {

	}

	@Override
	public boolean isValid(Enum value, ConstraintValidatorContext context) {
		return false;
	}
}
