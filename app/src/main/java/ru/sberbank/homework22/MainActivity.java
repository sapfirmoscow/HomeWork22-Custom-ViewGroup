package ru.sberbank.homework22;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    MyCustomViewGroup myCustomViewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myCustomViewGroup = findViewById(R.id.myCustomLayout);



    }


}
