package com.kotlin.inaction.chapter_9.java_generics.basic.base_04;

/**
 * 实现泛型接口的非泛型类
 *
 * @author wangzhichao
 * @date 2019/11/01
 */
public class InfoImpl implements Info<String> {
    private String var;
    @Override
    public void setVar(String var) {
        this.var = var;
    }

    @Override
    public String getVar() {
        return var;
    }
}
