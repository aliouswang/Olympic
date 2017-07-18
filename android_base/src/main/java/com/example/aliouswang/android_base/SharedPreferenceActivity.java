package com.example.aliouswang.android_base;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by aliouswang on 2017/7/17.
 */

public class SharedPreferenceActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference);

        setupPreference();
    }

    private void setupPreference() {
        SharedPreferences sharedPreferences =
                getSharedPreferences("share_preference", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name", "Hxjb");
        editor.apply();

        SharedPreferencesCompat sharedPreferencesCompat;
    }
}
