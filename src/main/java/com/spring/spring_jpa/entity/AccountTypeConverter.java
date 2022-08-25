package com.spring.spring_jpa.entity;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class AccountTypeConverter implements AttributeConverter<AccountType, String> {
    @Override
    public String convertToDatabaseColumn(AccountType attribute) {
        if (attribute == null) return null;
        return attribute.getCode();

    }

    @Override
    public AccountType convertToEntityAttribute(String dbData) {
        if (dbData == null) return null;
        return Stream.of(AccountType.values())
                .filter(c -> c.getCode().equals(dbData)).
                findFirst().orElseThrow(IllegalArgumentException::new);

    }
}
