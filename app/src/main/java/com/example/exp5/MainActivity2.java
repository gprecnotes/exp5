package com.example.exp5;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity2 extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i=getIntent();
        TextView tv=findViewById(R.id.un);
        tv.setText(i.getExtras().getString("un"));
        tv=findViewById(R.id.pwd);
        tv.setText(i.getExtras().getString("pwd"));
    }
}