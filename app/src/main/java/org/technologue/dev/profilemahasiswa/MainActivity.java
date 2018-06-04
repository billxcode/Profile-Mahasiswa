package org.technologue.dev.profilemahasiswa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button showName;
    private EditText textName;
    private EditText textNIM;
    private EditText textTanggal;
    private EditText textTempat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showName = (Button) findViewById(R.id.btnShowName);
        textName = (EditText) findViewById(R.id.editTextName);
        textNIM = (EditText) findViewById(R.id.editText2);
        textTanggal = (EditText) findViewById(R.id.editText5);
        textTempat = (EditText) findViewById(R.id.editText4);
        showName.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        int btn = view.getId();
        if (btn == R.id.btnShowName){
            String name = textName.getText().toString();
            String nim = textNIM.getText().toString();
            String tanggal = textTanggal.getText().toString();
            String tempat = textTempat.getText().toString();
            Intent resultActivity = new Intent(MainActivity.this, ResultActivity.class);
            resultActivity.putExtra(ResultActivity.EXTRA_NAME, name);
            resultActivity.putExtra(ResultActivity.EXTRA_NIM, nim);
            resultActivity.putExtra(ResultActivity.EXTRA_TANGGAL, tanggal);
            resultActivity.putExtra(ResultActivity.EXTRA_TEMPAT, tempat);
            startActivity(resultActivity);
        }
    }
}
