package com.kotlin.inaction.chapter_2;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author wzc
 * @date 2019/1/7
 */
public class ReadNumber {
    public Integer readNumber(BufferedReader bufferedReader) throws IOException {
        try {
            String line = bufferedReader.readLine();
            return Integer.parseInt(line);
        } catch (NumberFormatException e) {
            return null;
        } finally {
            bufferedReader.close();
        }
    }
}
