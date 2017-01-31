package com.example.derrthom.appculture;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.*;


public class second extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name1");
        textView2.setText("Hello "+name+",Welcome to the collective!");
        Button next=(Button)findViewById(R.id.resumego);
        next.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(second.this,third_Scroll.class);
                startActivity(intent);
            }
        });

    }
}
