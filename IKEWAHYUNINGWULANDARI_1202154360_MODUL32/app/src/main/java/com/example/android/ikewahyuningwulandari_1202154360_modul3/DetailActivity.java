package com.example.android.ikewahyuningwulandari_1202154360_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    private int counts = 1;
    private Button tambah, kurang;
    private TextView value;
    private ImageView battery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        String title = intent.getStringExtra("nama");
        String descs = intent.getStringExtra("descs");
        int gambar = intent.getIntExtra("gambar", 0);

        TextView textTitle = findViewById(R.id.title);
        TextView textDesc = findViewById(R.id.desc);
        ImageView imageGambar = findViewById(R.id.image);

        textTitle.setText(title);
        textDesc.setText(descs);
        imageGambar.setImageResource(gambar);

        tambah = findViewById(R.id.plus);
        kurang = findViewById(R.id.minus);
        value = findViewById(R.id.txt);
        battery = findViewById(R.id.battery);

        battery.setImageResource(R.drawable.battery_20);
        value.setText(Integer.toString(counts) + "L");

    }

    public void minus(View view) {
        counts--;
        if (value != null) {
            switch (counts) {
                case 6:
                    battery.setImageResource(R.drawable.battery_full);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
                case 5:
                    battery.setImageResource(R.drawable.battery_90);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.battery_60);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.battery_50);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 2:
                    battery.setImageResource(R.drawable.battery_30);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 1:
                    battery.setImageResource(R.drawable.battery_20);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

    public void plus(View view) {

        counts++;
        if (value != null) {
            switch (counts) {
                case 1:
                    battery.setImageResource(R.drawable.battery_20);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Low", Toast.LENGTH_LONG).show();
                    break;
                case 2:
                    battery.setImageResource(R.drawable.battery_30);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 3:
                    battery.setImageResource(R.drawable.battery_50);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 4:
                    battery.setImageResource(R.drawable.battery_60);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 5:
                    battery.setImageResource(R.drawable.battery_90);
                    value.setText(Integer.toString(counts) + "L");
                    break;
                case 6:
                    battery.setImageResource(R.drawable.battery_full);
                    value.setText(Integer.toString(counts) + "L");
                    Toast.makeText(this, "Battery Full", Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
