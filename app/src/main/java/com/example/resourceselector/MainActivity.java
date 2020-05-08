package com.example.resourceselector;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private FloatingActionButton floatingActionButton;
    private ViewGroup viewGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewGroup=findViewById(R.id.fragmentContainer);
        floatingActionButton=findViewById(R.id.actionbutton);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }


    private void show()
    {
        if(viewGroup!=null)
        {
            DetailFragment detailFragment=new DetailFragment();
                    getSupportFragmentManager()
                    .beginTransaction()
                            .add(R.id.fragmentContainer,detailFragment)
                            .commit();
        }
        else {
            Intent intent=new Intent(MainActivity.this,DetailActivity.class);
           startActivity(intent);


        }
    }
}
