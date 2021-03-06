package com.edwin.loopviewpager.utils;

import android.util.Log;

/**
 * 打印Log
 *
 * @USER Edwin
 * @DATE 16/6/12 上午1:02
 */
public class L {
    private static final boolean mDug = true;
    private static final String TAG = "Edwin";

    public static void e(String msg) {
        if (mDug)
            Log.e(TAG, msg);
    }

    public static void e(String TAG, String msg) {
        if (mDug)
            Log.e(TAG, msg);
    }

    public static void e(String TAG, Throwable tr) {
        if (mDug)
            Log.e(TAG, "Error——", tr);
    }

    public static void e(String TAG, String msg, Throwable tr) {
        if (mDug)
            Log.e(TAG, msg, tr);
    }
}
