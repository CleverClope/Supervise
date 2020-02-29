package com.example.supervise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menus,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.settingsid:
                Toast.makeText(this,"Settings Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.accountid:
                Toast.makeText(this,"Account Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.addid:
                Toast.makeText(this,"Add Now",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.viewid:
                Toast.makeText(this,"View Now",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem1:
                Toast.makeText(this,"sub item1 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem2:
                Toast.makeText(this,"sub item 2 selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.subitem3:
                Toast.makeText(this,"sub item 3 selected",Toast.LENGTH_SHORT).show();
                return true;


        }
        return super.onOptionsItemSelected(item);
    }
}
