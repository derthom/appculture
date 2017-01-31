package com.example.derrthom.appculture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.*;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        Button next=(Button)findViewById(R.id.firstb);

        next.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View view)
        {
            EditText name=(EditText)findViewById(R.id.editTextname);
            Intent intent=new Intent(first.this,second.class);
            intent.putExtra("name1",name.getText().toString());
            startActivity(intent);
        }
    });
    }
}
