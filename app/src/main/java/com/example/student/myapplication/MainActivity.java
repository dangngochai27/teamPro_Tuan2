package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> ls;
    ArrayAdapter<String> arrayls;
    EditText edt_NoiDung;
    ListView lvw_1;

<<<<<<< HEAD
    int viTriChon=-1;


=======
    int viTriChon = -1;
>>>>>>> 3990d130ef18bed74add184858340a09e3394dad

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD
=======
        //Anh Xa
>>>>>>> 3990d130ef18bed74add184858340a09e3394dad
        AnhXa();
        ls = new ArrayList<String>();
        String[] some_array = getResources().getStringArray(R.array.mangListView);
        ls.addAll(Arrays.asList(some_array));

<<<<<<< HEAD

=======
>>>>>>> 3990d130ef18bed74add184858340a09e3394dad
        arrayls = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,ls);
        lvw_1.setAdapter(arrayls);
        arrayls.notifyDataSetChanged();
        lvw_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                viTriChon = i;

                edt_NoiDung.setText(ls.get(i));
            }
        });
<<<<<<< HEAD

=======
>>>>>>> 3990d130ef18bed74add184858340a09e3394dad
    }
    void AnhXa(){
        edt_NoiDung = findViewById(R.id.edt_NoiDung);
        lvw_1 = findViewById(R.id.lvw_1);
    }
<<<<<<< HEAD
    public void Sua(View view) {
        if (viTriChon >= 0 ){
            if (!edt_NoiDung.getText().toString().isEmpty()){
                String nameEdit = edt_NoiDung.getText().toString();
                ls.set(viTriChon,nameEdit);
                arrayls.notifyDataSetChanged();
            }else {
                Toast.makeText(MainActivity.this,"Khong duoc de trong noi dung",Toast.LENGTH_LONG).show();
            }

        } else {
            Toast.makeText(MainActivity.this,"Moi ban chon ten muon sua",Toast.LENGTH_LONG).show();
=======

    public void Them(View view) {
        String x = edt_NoiDung.getText().toString();
        if (x.length()!=0){
            ls.add(x);
            arrayls.notifyDataSetChanged();


        }else {
            Toast.makeText(MainActivity.this,"Moi Ban Nhap Thong Tin Can Them",Toast.LENGTH_LONG).show();
            edt_NoiDung.clearFocus();
>>>>>>> 3990d130ef18bed74add184858340a09e3394dad
        }
    }
}
