package com.kurnia.quis;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        EditText Nilai_Tugas, Nilai_Quiz,Nilai_UTS,Nilai_UAS;
        Button PROSES_HITUNG,BERSIH;
        TextView HASIL;
        @SuppressLint("MissingInflatedId")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                Nilai_Tugas = (EditText) findViewById(R.id.Nilai_Tugas);
                Nilai_Quiz = (EditText)findViewById(R.id.Nilai_Quis);
                Nilai_UTS = (EditText)findViewById(R.id.Nilai_UTS);
                Nilai_UAS = (EditText)findViewById(R.id.Nilai_UAS);

                PROSES_HITUNG = (Button) findViewById(R.id.PROSES_HITUNG);
                BERSIH = (Button) findViewById(R.id.bersihkan);
                HASIL= (TextView) findViewById(R.id.hasil);

                PROSES_HITUNG.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                if(((Nilai_Tugas.getText().length()>0) && (Nilai_Quiz.getText().length()>0)&&(Nilai_UTS.getText().length()>0) && (Nilai_UAS.getText().length()>0)))
                                {
                                        double Tugas = Double.parseDouble(Nilai_Tugas.getText().toString());
                                        double Quiz = Double.parseDouble(Nilai_Quiz.getText().toString());
                                        double UTS = Double.parseDouble(Nilai_UTS.getText().toString());
                                        double UAS = Double.parseDouble(Nilai_UAS.getText().toString());
                                        double result = (Tugas*20/100) + (Quiz*20/100) + (UTS*30/100) + (UAS*30/100);
                                        HASIL.setText(Double.toString(result));
                                }
                                else {
                                        Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Nilai Tugas, Quiz, UTS, UAS", Toast.LENGTH_LONG);
                                        toast.show();
                                }
                        }
                });

                BERSIH.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                if((Nilai_Tugas.getText().length()>0) && (Nilai_Quiz.getText().length()>0)&&(Nilai_UTS.getText().length()>0) && (Nilai_UAS.getText().length()>0))
                                {
                                        double Tugas = Double.parseDouble(Nilai_Tugas.getText().toString());
                                        double Quiz = Double.parseDouble(Nilai_Quiz.getText().toString());
                                        double UTS = Double.parseDouble(Nilai_UTS.getText().toString());
                                        double UAS = Double.parseDouble(Nilai_UAS.getText().toString());
                                        double result = (Tugas*20/100) + (Quiz*20/100) + (UTS*30/100) + (UAS*30/100);
                                        HASIL.setText(Double.toString(result));
                                }
                                else {
                                        Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Nilai Tugas, Quiz, UTS, UAS", Toast.LENGTH_LONG);
                                        toast.show();
                                }
                        }
                });

                BERSIH.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                                Nilai_Tugas.setText("");
                                Nilai_Quiz.setText("");
                                Nilai_UTS.setText("");
                                HASIL.setText("0");
                                Nilai_Tugas.requestFocus();
                        }
                });
        }
}