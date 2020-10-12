package com.kotlin.inaction.chapter_6;


import java.io.File;
import java.util.List;

/**
 * @author wangzhichao
 * @date 2020/10/13
 */
public interface FileContentProcessor {
    void processContents(File path, byte[] binaryContents, List<String> textContents);
}
