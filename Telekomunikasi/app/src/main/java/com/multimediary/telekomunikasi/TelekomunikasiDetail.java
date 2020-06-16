package com.multimediary.telekomunikasi;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelekomunikasiDetail  extends AppCompatActivity {
    public static final String NAMA_ALAT = "nama_alat";
    public static final String DETAIL_ALAT = "detail_alat";
    public static final String TAHUN_ALAT = "tahun_alat";
    public static final String PENEMU_ALAT = "penemu_alat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_detail_telekomunikasi);

        TextView tvDataReceivedName = findViewById(R.id.tv_item_detail_name);
        TextView tvDataReceivedDetail = findViewById(R.id.tv_item_detail_detail);
        TextView tvDataReceivedYear = findViewById(R.id.tv_tahun_alat_detail);
        TextView tvDataReceivedFounder = findViewById(R.id.tv_penemu_alat_detail);
        ImageView tvDataReceivedPhoto = findViewById(R.id.img_item_detail_photo);

        String detail = getIntent().getStringExtra(DETAIL_ALAT);
        String name = getIntent().getStringExtra(NAMA_ALAT);
        String year = getIntent().getStringExtra(TAHUN_ALAT);
        String founder = getIntent().getStringExtra(PENEMU_ALAT);
        int picture = getIntent().getIntExtra("picture",0);

        tvDataReceivedName.setText(name);
        tvDataReceivedDetail.setText(detail);
        tvDataReceivedYear.setText(year);
        tvDataReceivedFounder.setText(founder);
        tvDataReceivedPhoto.setImageResource(picture);
    }
}
