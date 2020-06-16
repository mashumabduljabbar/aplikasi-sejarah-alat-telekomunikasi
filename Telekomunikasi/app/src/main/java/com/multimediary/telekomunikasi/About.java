package com.multimediary.telekomunikasi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    private String title = "About";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_about);
        setActionBarTitle(title);
        TextView namaOrangGanteng = findViewById(R.id.tv_nama_orang_ganteng);
        TextView emailOrangGanteng = findViewById(R.id.tv_email_orang_ganteng);
        //ImageView fotoOrangGanteng = findViewById(R.id.orang_ganteng);

        String nama = "Ma'shum Abdul Jabbar";
        String email = "multimediary@gmail.com";
        //int picture = R.drawable.foto;

        namaOrangGanteng.setText(nama);
        emailOrangGanteng.setText(email);
        //fotoOrangGanteng.setImageResource(picture);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
