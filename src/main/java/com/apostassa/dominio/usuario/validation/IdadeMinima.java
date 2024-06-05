package com.apostassa.dominio.usuario.validation;

import jakarta.validation.*;
import jakarta.validation.constraints.Past;

import java.lang.annotation.*;
import java.time.LocalDate;
import java.time.Period;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Past
@ReportAsSingleViolation
@Constraint(validatedBy = IdadeMinima.IdadeMinimaValidator.class)
public @interface IdadeMinima {
	
    String message() default "A idade mínima é {value} anos.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();

    public static class IdadeMinimaValidator implements ConstraintValidator<IdadeMinima, LocalDate> {

        private int value;

        @Override
        public void initialize(IdadeMinima constraintAnnotation) {
            this.value = constraintAnnotation.value();
        }

        @Override
        public boolean isValid(LocalDate dataNascimento, ConstraintValidatorContext context) {
            //Se o valor não for passado então retorna true
            if (dataNascimento == null){
                return true;
            }
            LocalDate hoje = LocalDate.now();
            Period period = Period.between(dataNascimento, hoje);
            int age = period.getYears();

            return age >= value;
        }
    }
}
