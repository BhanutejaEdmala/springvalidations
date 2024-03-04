package com.example.springvalidations.validations;
import com.example.springvalidations.entities.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
//@Component
public class AllValid implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }
    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"uname","uname");
        User user  = (User) target;
//        if(user.getPassword().length()<3){
//            errors.rejectValue("password","password");
//        }
    }
}
