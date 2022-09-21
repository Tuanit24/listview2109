package com.example.taolist;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.ListViewAutoScrollHelper;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvmonan;
    ArrayList<monan> arrayMonan;
    monanadapter Monanadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvmonan = (ListView) findViewById(R.id.listviewmonan);
        arrayMonan = new ArrayList<>();
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));
        arrayMonan.add(new monan("VO XUAN TUAN", "2050531200319",R.drawable.avt));

        Monanadapter = new monanadapter(MainActivity.this,R.layout.activity_dong_mon_an, arrayMonan);
        lvmonan.setAdapter(Monanadapter);

        lvmonan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,detail.class);
                startActivity(intent);
            }
        });
        lvmonan.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                confirmDelete(i);
                return false;
            }
        });


    }
    public void confirmDelete(int position) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("");
        alert.setMessage("Bạn có muốn xóa không?");
        alert.setPositiveButton("Có", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                arrayMonan.remove(position);
                Monanadapter.notifyDataSetChanged();
            }
        });

        alert.setNegativeButton("Không", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alert.show();
    }

}