package com.example.springvalidations.validations;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CustomValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface  MyValid {
   public String message() default " Password must contain * ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
