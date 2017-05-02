package com.awesome.samplekit;

import android.util.Log;

/**
 * Created by Fileas on 19.04.17.
 */
public class NewApi {


    public void obfuscated() {
        Log.d("API", "Test obfuscated");
    }

    public void nonobfuscated() {
        Log.d("API", "Test nonobfuscated");
    }

    public enum Server {

        Demo, Prod
    }

}
