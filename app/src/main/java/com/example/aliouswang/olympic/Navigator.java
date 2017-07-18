package com.example.aliouswang.olympic;

import android.content.Context;
import android.content.Intent;

/**
 * Created by aliouswang on 2017/7/17.
 */

public class Navigator {

    public static void navigate(Context context, Class<?> clazz) {
        context.startActivity(new Intent(context, clazz));
    }

}
