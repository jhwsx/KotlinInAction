package com.kotlin.inaction.chapter_4;

/**
 * @author wzc
 * @date 2019/1/26
 */
public class Client3 {
    private String name;
    private int postalCode;

    public String getName() {
        return name == null ? "" : name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }


}
