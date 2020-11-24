package com.example.testlibrary.utils;

import android.app.Activity;
import android.view.WindowManager;
import androidx.annotation.NonNull;

/**
 * created by YLG on 2020/2/24 窗口工具类
 */

public class WindowUtil {

    /**
     * 允许截屏
     *
     * @param activity
     */
    public static void allowScreenshot(@NonNull Activity activity) {
        if (null != activity) {
            activity.getWindow().clearFlags(WindowManager.LayoutParams.FLAG_SECURE);
        }
    }

    /**
     * 禁止截屏
     *
     * @param activity
     */
    public static void forbidScreenshot(@NonNull Activity activity) {
        if (null != activity) {
            activity.getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
        }
    }
}
