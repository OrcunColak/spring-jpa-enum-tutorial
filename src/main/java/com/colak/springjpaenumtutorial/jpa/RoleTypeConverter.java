package com.colak.springjpaenumtutorial.jpa;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class RoleTypeConverter implements AttributeConverter<RoleType, Character> {

    @Override
    public Character convertToDatabaseColumn(RoleType attribute) {
        if (attribute == null) {
            return null;
        }
        return attribute.getCode().charAt(0);
    }

    @Override
    public RoleType convertToEntityAttribute(Character dbData) {
        if (dbData == null) {
            return null;
        }
        return RoleType.fromCode(dbData.toString());
    }
}
