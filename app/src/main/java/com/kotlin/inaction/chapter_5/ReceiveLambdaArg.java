package com.kotlin.inaction.chapter_5;

/**
 * @author wzc
 * @date 2019/2/17
 */
public class ReceiveLambdaArg {
    public static void postponeComputation(long delay, Runnable computation) {
        try {
            Thread.sleep(delay );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        computation.run();
    }
}
