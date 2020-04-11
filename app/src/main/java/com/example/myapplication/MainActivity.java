package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate((savedInstanceState));
        setContentView(R.layout.activity_main);
        findViewById(R.id.Word_Color).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ((TextView) findViewById (R.id.textView)).setTextColor(
                        getResources().getColor(R.color.Red));
            }
        });
        findViewById(R.id.Back_Color).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               findViewById (R.id.rootView).setBackgroundColor(getResources().getColor(R.color.Green));
               findViewById(R.id.Back_Color).setBackgroundColor(getResources().getColor(R.color.Green));
               findViewById(R.id.Word_Color).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });
        findViewById(R.id.edit_text).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence txt = ((TextView) findViewById(R.id.Text)).getText();
                ((TextView) findViewById (R.id.textView)).setText(txt);
            }
        }));
        findViewById(R.id.rootView).setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.Word_Color)).setTextColor(getResources().getColor(R.color.Black));
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.White));
            }
        }));


    }
}
