package com.example.nick.one;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int i;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void action ( View buttonview )
    {
        TextView x = (TextView) findViewById(R.id.textbox1);
        ImageView v = (ImageView) findViewById(R.id.imageView);

        Toast.makeText(this,"hello",Toast.LENGTH_LONG).show();
        Log.i("action","button pressed");
        Log.i("action", String.valueOf(i));

        if( i%2 == 0 )
        {
            buttonview.setAlpha(0);
            x.setText("sup nick?");

            v.setImageResource(R.drawable.triangle);

        }
        else
        {
            buttonview.setAlpha(1);
            x.setText("hello nick!");

            v.setImageResource(R.drawable.circle);
        }

        i++;

    }

}
