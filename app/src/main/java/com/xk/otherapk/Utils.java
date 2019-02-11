package com.xk.otherapk;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/**
 * 这个类放在其他apk中。其他apk可通过调用以下方法获取到资源
 * @author xuekai1
 * @date 2019/2/11
 */
public class Utils {
    public static Drawable getDrawable(Context context, String res) {
        Context packageContext = null;
        try {
            packageContext = context.createPackageContext("com.xk.resourceapk", Context.CONTEXT_IGNORE_SECURITY);
            Resources resources = packageContext.getResources();
            int identifier = packageContext.getResources().getIdentifier(res, "drawable", "com.xk.resourceapk");
            return resources.getDrawable(identifier);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getString(Context context, String res) {
        Context packageContext = null;
        try {
            packageContext = context.createPackageContext("com.xk.resourceapk", Context.CONTEXT_IGNORE_SECURITY);
            Resources resources = packageContext.getResources();
            int identifier = packageContext.getResources().getIdentifier(res, "string", "com.xk.resourceapk");
            return resources.getString(identifier);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static int getColor(Context context, String res) {
        Context packageContext = null;
        try {
            packageContext = context.createPackageContext("com.xk.resourceapk", Context.CONTEXT_IGNORE_SECURITY);
            Resources resources = packageContext.getResources();
            int identifier = packageContext.getResources().getIdentifier(res, "color", "com.xk.resourceapk");
            return resources.getColor(identifier);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


}
