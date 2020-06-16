package com.multimediary.telekomunikasi;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String title = "Alat Telekomunikasi";
    private RecyclerView rvTelekomunikasi;
    private ArrayList<Telekomunikasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvTelekomunikasi = findViewById(R.id.rv_telekomunikasi);
        rvTelekomunikasi.setHasFixedSize(true);

        list.addAll(TelekomunikasiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTelekomunikasi.setLayoutManager(new LinearLayoutManager(this));
        TelekomunikasiAdapter telekomunikasiAdapter = new TelekomunikasiAdapter(list);
        rvTelekomunikasi.setAdapter(telekomunikasiAdapter);

        telekomunikasiAdapter.setOnItemClickCallback(new TelekomunikasiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Telekomunikasi data) {
                showSelectedTelekomunikasi(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                Intent about = new Intent(MainActivity.this, About.class);
                startActivity(about);
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedTelekomunikasi(Telekomunikasi telekomunikasi) {
        Intent moveWithDataIntent = new Intent(MainActivity.this, TelekomunikasiDetail.class);
        moveWithDataIntent.putExtra(TelekomunikasiDetail.NAMA_ALAT, telekomunikasi.getName());
        moveWithDataIntent.putExtra(TelekomunikasiDetail.DETAIL_ALAT, telekomunikasi.getDetail());
        moveWithDataIntent.putExtra(TelekomunikasiDetail.TAHUN_ALAT, telekomunikasi.getYear());
        moveWithDataIntent.putExtra(TelekomunikasiDetail.PENEMU_ALAT, telekomunikasi.getFounder());
        moveWithDataIntent.putExtra("picture", telekomunikasi.getPhoto());
        startActivity(moveWithDataIntent);
    }
}
