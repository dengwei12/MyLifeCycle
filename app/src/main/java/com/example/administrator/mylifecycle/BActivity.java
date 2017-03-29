package com.example.administrator.mylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/29.
 */

public class BActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainb);
        Log.e("B","<=====onCreate");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("B","<=====onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("B","<=====onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("B","<=====onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("B","<=====onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("B","<=====onResume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("B","<=====onDestroy");
    }
}
