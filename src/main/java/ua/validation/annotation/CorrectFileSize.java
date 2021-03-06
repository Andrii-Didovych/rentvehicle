package ua.validation.annotation;

import ua.validation.FileValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = FileValidator.class)
public @interface CorrectFileSize {

    String message() default "Size of file is greater than 1MB or car has not added yet!";

    Class<?>[] groups() default {};

    Class<? extends Payload> [] payload() default {};

}
