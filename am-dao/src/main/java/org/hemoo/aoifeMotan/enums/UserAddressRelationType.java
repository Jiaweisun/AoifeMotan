package org.hemoo.aoifeMotan.enums;

/**
 * Created by sunjiawei on 2017/4/12.
 */
public enum UserAddressRelationType {
   ONE("one","first type"),
    TWO("two","second type");

    private String key;
    private String description;

    UserAddressRelationType(String key, String description) {
        this.key = key;
        this.description = description;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
