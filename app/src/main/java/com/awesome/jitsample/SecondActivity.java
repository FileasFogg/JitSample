package com.awesome.jitsample;

import android.util.Log;

/**
 * Created by Fileas on 23.02.17.
 */

public class SecondActivity {

    public static final String SHOULD_BE_OBF = "should be obfuscated";

    public static final String PUBLIC_VAR = "public var";

    public static void innerMethod() {
        Log.d("Second activity", "inner method");
    }
}
