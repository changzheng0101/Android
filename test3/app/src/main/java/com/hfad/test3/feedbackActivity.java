package com.hfad.test3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class feedbackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
    }

    public void onClick(View view){
        EditText editText=(EditText)findViewById(R.id.edittext);
        String string=editText.getText().toString();
        //Log.v("message","the message is"+string);
        if(string.length()!=0) {
            CharSequence text = "提交成功，感谢您的宝贵意见！";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
            Intent intent = new Intent(feedbackActivity.this, MainActivity.class);
            startActivity(intent);
        }else{
            CharSequence text = "请您输入内容！";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        }
    }
}
