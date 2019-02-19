package com.example.dayone;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    EditText edtNama;
    Spinner spinKota;
    CheckBox chkBola;
    CheckBox chkTennis;

    ListView listMerk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.belajar_list);

        listMerk = findViewById(R.id.list_merk);
        listMerk.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listMerk.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

//        inisialisasi
//        btnSave = findViewById(R.id.btn_simpan);
//        edtNama = findViewById(R.id.edt_nama);
//        spinKota = findViewById(R.id.spinner_asal);
//        chkBola = findViewById(R.id.chk_bola);
//        chkTennis = findViewById(R.id.chk_tennis);
//
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String nama;
//                String asal;
//                String hobi = "";
//
//                nama = edtNama.getText().toString();
//                asal = spinKota.getSelectedItem().toString();

//                if (edtNama.getText().toString().equals("")) {
//                    Toast.makeText(MainActivity.this, "Tidak boleh kosong", Toast.LENGTH_SHORT).show();
//                }

//                if (nama.isEmpty()) {
//                    edtNama.setError("Nama Tidak Boleh Kosong");
//                } else {
//                    if (chkBola.isChecked() == true) {
//                        hobi = "Bola";
//                    }
//
//                    if (chkTennis.isChecked() == true) {
//                        if (hobi.equals("")) {
//                            hobi = "Tennis";
//                        } else {
//                            hobi = hobi +  ", Tennis";
//                        }
//                    }
//
//                    Toast.makeText(MainActivity.this,
//                            "Nama : " + nama +
//                                    "\nAsal : " + asal +
//                                    "\nHobi : " + hobi,
//                            Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

//        switch (item.getItemId()) {
//            case R.id.action_save:
//                Toast.makeText(this, "save", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.action_delete:
//                Toast.makeText(this, "delet", Toast.LENGTH_SHORT).show();
//                break;
//        }

        if (item.getItemId() == R.id.action_save) {
            Toast.makeText(this, "Action Save", Toast.LENGTH_SHORT).show();
        } else if (item.getItemId() == R.id.action_delete) {
            edtNama.setText("");
            chkBola.setChecked(false);
            chkTennis.setChecked(false);
            spinKota.setSelection(0);
        }

        return super.onOptionsItemSelected(item);
    }
}
