package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.entity.enums.ColorType;
import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implements simple value validator for color type
 */
public class ColorValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try{
            ColorType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
