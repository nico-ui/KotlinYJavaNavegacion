package com.example.kotlinjavanavegacion;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBack = findViewById(R.id.btnBack);
    }

    public void clickBack(View view){
        Context context = getApplicationContext();
        CharSequence text = "click boton back";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent downloadIntent = new Intent(this, MainActivity.class);
        startActivity(downloadIntent);
    }

}