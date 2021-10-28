package com.moringaschool.rubisevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    @BindView(R.id.searchEvent) EditText mSearchEvent;
    @BindView(R.id.searchButton)  Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view==mSearchButton){
            String searchInput=mSearchButton.getText().toString();
                Intent intent=new Intent(MainActivity.this, Events.class);
                intent.putExtra("searchInput",searchInput);
                startActivity(intent);


        }

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}