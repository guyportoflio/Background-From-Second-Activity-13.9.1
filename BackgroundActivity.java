package com.presly.backgroundfromsecondactivity1391;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by presly on 19/01/2018.
 */

public class BackgroundActivity extends AppCompatActivity{


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_gallery);
    }


    public void pickedImage1(View view) {
     Intent intent = new Intent();
     intent.putExtra("image", "b1");
     setResult(RESULT_OK, intent);
     finish();

    }
    public void pickedImage2(View view) {
        Intent intent = new Intent();
        intent.putExtra("image", "b2");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void pickedImage3(View view) {
        Intent intent = new Intent();
        intent.putExtra("image", "b3");
        setResult(RESULT_OK, intent);
        finish();
    }

    public void pickedImage4(View view) {
        Intent intent = new Intent();
        intent.putExtra("image", "b4");
        setResult(RESULT_OK, intent);
        finish();
    }


}
