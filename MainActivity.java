package com.presly.backgroundfromsecondactivity1391;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

     LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      linearLayout = (LinearLayout)findViewById(R.id.my_layout);

    }

    public void secondActivity(View view) {
        Intent intent = new Intent(this, BackgroundActivity.class);

        startActivityForResult(intent, 1);

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);


        if(requestCode == 1 && resultCode == RESULT_OK){
            String image = data.getStringExtra("image");
            if(image.matches("b1")){
              linearLayout.setBackgroundResource(R.drawable.b1);
            }

            if(image.matches("b2")){
                linearLayout.setBackgroundResource(R.drawable.b2);
            }

            if(image.matches("b3")){
                linearLayout.setBackgroundResource(R.drawable.b3);
            }

            if(image.matches("b4")){
                linearLayout.setBackgroundResource(R.drawable.b4);
            }

        }
    }



}
