package main.java.by.tc.task01.service.validation.validators;

import main.java.by.tc.task01.entity.enums.FilterType;
import main.java.by.tc.task01.service.validation.ValueValidator;

/**
 * Implements simple value validator for filter type
 */
public class FilterTypeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try{
            FilterType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
