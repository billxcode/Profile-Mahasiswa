package org.technologue.dev.profilemahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "EXTRA NAME";
    public static String EXTRA_NIM = "EXTRA NIM";
    public static String EXTRA_TANGGAL = "EXTRA TANGGAL";
    public static String EXTRA_TEMPAT = "EXTRA TEMPAT";

    private TextView textName;
    private TextView textNIM;
    private TextView textTanggal;
    private TextView textTempat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String name = getIntent().getStringExtra(EXTRA_NAME).toString();
        String nim = getIntent().getStringExtra(EXTRA_NIM).toString();
        String tanggal = getIntent().getStringExtra(EXTRA_TANGGAL).toString();
        String tempat = getIntent().getStringExtra(EXTRA_TEMPAT).toString();
        textName = (TextView) findViewById(R.id.resultNama);
        textNIM = (TextView) findViewById(R.id.resultNim);
        textTanggal = (TextView) findViewById(R.id.resultTanggal);
        textTempat = (TextView) findViewById(R.id.resultTempat);

        textName.setText(name);
        textNIM.setText(nim);
        textTanggal.setText(tanggal);
        textTempat.setText(tempat);
    }
}
