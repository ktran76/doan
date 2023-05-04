package validator;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.ConstraintViolation;
import java.util.Set;

@Component
public class WebAppValidator implements Validator {
    @Autowired
    private javax.validation.Validator beanValidator;
    private Set<Validator> springValidators;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Set<ConstraintViolation<Object>> beans = this.beanValidator.validate(o);
        for (ConstraintViolation<Object> objectConstraintViolation : beans)
            errors.rejectValue(objectConstraintViolation.getPropertyPath().toString(), objectConstraintViolation.getMessageTemplate(), objectConstraintViolation.getMessage());
        for (Validator v : this.springValidators)
            v.validate(o, errors);
    }

    public void setSpringValidators(Set<Validator> springValidators) {
        this.springValidators = springValidators;
    }
}
