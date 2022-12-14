package net.edutech.authenticatorapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class subjects1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects1);
        getWindow().setStatusBarColor(ContextCompat.getColor(subjects1.this,R.color.colorPrimaryDark));
        ImageView back12 =findViewById(R.id.back12);
        back12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                finish();

            }
        });

    }

    public void openactivity_v1(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Mathematics");
        startActivity(intent);
    }
    public void openactivity_v2(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Physics");
        startActivity(intent);
    }
    public void openactivity_v3(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Chemistry");
        startActivity(intent);
    }
    public void openactivity_v4(View view){
        Intent intent = new Intent(this, puc.class);
        intent.putExtra("subject1","Biology");
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        startActivity(intent);
        finish();

    }
}