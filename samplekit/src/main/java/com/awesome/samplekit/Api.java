package com.awesome.samplekit;

import android.support.annotation.Keep;
import android.util.Log;

/**
 * JAVA doc task works 11111  111 !!!
 */
public class Api implements IApi {

    public static final String SHOULD_BE_OBF = "should be obfuscated";

    public Api() {
    }

    /**
     * Method doc works!
     * */
    public static void testPrint() {
        Log.d("API", "Test print");
    }

    public void obfuscated() {
        Log.d("API", "Test obfuscated");
    }

    @Keep
    public void nonobfuscated() {
        Log.d("API", "Test nonobfuscated");
    }

    public enum Server {

        Demo, Prod
    }
}
