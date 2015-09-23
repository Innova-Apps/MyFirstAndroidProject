package com.innovaapps.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calcular(View view) {
        //recupero texto
        final EditText nro1 = (EditText) findViewById(R.id.numero_a);
        final EditText nro2 = (EditText) findViewById(R.id.numero_b);
        final EditText nro3 = (EditText) findViewById(R.id.numero_c);

        int nro1int = Integer.parseInt(nro1.getText().toString());
        int nro2int = Integer.parseInt(nro2.getText().toString());

        nro3.setText(String.valueOf(nro1int+nro2int));
        nro3.setVisibility(View.VISIBLE);

        YoYo.with(Techniques.BounceInDown)
                .duration(700)
                .playOn(nro3);

    }
}
