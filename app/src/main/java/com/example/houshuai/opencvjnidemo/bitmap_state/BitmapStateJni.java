package com.example.houshuai.opencvjnidemo.bitmap_state;

/**
 * @author 候帅
 *         Created by 候帅 on 2017/1/12. 15:10
 */

public class BitmapStateJni {
    static {
        System.loadLibrary("state-deal");
        System.loadLibrary("opencv_java3");
    }

    /**
     * 处理静态图片的JNI
     *
     * @param bitmap 传递的Bitmap对象
     * @param type   用来区分使用何种处理方式处理当前的图片
     */
    public final native int[] dealStateImage(Object bitmap, int type);


}
