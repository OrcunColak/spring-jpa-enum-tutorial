package com.colak.springjpaenumtutorial.jpa;

import lombok.Getter;

@Getter
public enum RoleType {
    ADMIN("A"),
    USER("U"),
    GUEST("G");

    private final String code;

    RoleType(String code) {
        this.code = code;
    }

    public static RoleType fromCode(String code) {
        for (RoleType userType : RoleType.values()) {
            if (userType.getCode().equals(code)) {
                return userType;
            }
        }
        throw new IllegalArgumentException("Unknown code: " + code);
    }
}
