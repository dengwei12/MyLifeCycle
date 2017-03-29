package com.example.administrator.mylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("A","<=====onCreat");
        btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,BActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("A","<=====onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("A","<=====onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("A","<=====onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("A","<=====onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("A","<=====onPause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("A","<=====onDestory");
    }
}
