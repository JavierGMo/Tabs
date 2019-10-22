package com.morajavier.desliza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnPestana;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPestana = (Button)findViewById(R.id.btnTabs);

        btnPestana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irPestaana = new Intent(MainActivity.this, TabActivity.class);
                startActivity(irPestaana);
            }
        });


    }
}
