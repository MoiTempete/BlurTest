package com.moi.tempete.blur.jni;

import android.graphics.Bitmap;

public class ImageBlur {
    public static native void blurIntArray(int[] pImg, int w, int h, int r);

    public static native void blurBitMap(Bitmap bitmap, int r);

    static {
        System.loadLibrary("ImageBlur");
    }
}
