package com.fiqri.menghitungbangundatar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    //TODO variabel global
    Button mHitung;
    EditText mAlas, mTinggi;
    TextView mOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO menghubungkan
        mAlas = findViewById(R.id.edtAlas);
        mTinggi= findViewById(R.id.edtTinggi);
        mOutput = findViewById(R.id.txtOutput);
        mHitung = findViewById(R.id.btnHitung);
        //TODO aksi
        mHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO onClick
                hitung();
            }
        });
    }
    private void hitung() {
        //TODO aksi menghilang
        String alas = mAlas.getText().toString();
        String tinggi = mTinggi.getText().toString();
        if (TextUtils.isEmpty(alas) || TextUtils.isEmpty(tinggi) ) {
            Toast.makeText(this, "Masih Kosong", Toast.LENGTH_SHORT).show();
        }else {
            //TODO parsing dari String ke int
            int ialas = Integer.parseInt(alas);
            int itinggi = Integer.parseInt(tinggi);
            //TODO menghitung Luas
            double luas = (ialas * itinggi) / 2;
            //TODO mencari garis miring
            double sisimiring = ((ialas / 2) * (ialas / 2)) + (itinggi * itinggi);
            double hasilmiring = Math.sqrt(sisimiring);
            //TODO mencari keliling
            double keliling = hasilmiring + hasilmiring + ialas;
            //TODO parsing double ke string
            String hasil = "Kelilingnya : " + String.valueOf(keliling) + "\nLuasnya : " + String.valueOf(luas);
            //TODO set ke textView
            mOutput.setText(hasil);
        }
    }
}
