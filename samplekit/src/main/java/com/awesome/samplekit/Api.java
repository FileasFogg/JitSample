package com.awesome.samplekit;

import android.support.annotation.Keep;
import android.util.Log;

public class Api implements IApi{

    public static final String SHOULD_BE_OBF = "should be obfuscated";

    public static void testPrint() {
        Log.d("API", "Test print");
    }

    public Api() {
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
