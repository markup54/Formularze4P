package com.example.fragmenty4p;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fragmenty4p.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    EditText editText;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       button = findViewById(R.id.button);
       editText = findViewById(R.id.editTextTextPersonName);

       button.setOnClickListener(
               new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       String tekstWpisany = editText.getText().toString();
                       Toast.makeText(MainActivity2.this,tekstWpisany,Toast.LENGTH_SHORT).show();
                   }
               }
       );
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RadioGroup wszystkieRadio = findViewById(R.id.radioGroup);
                int wybranyId = wszystkieRadio.getCheckedRadioButtonId();
                if(wybranyId == R.id.radioButton){
                    Toast.makeText(MainActivity2.this,
                            "Dobra odpowiedź",
                            Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity2.this,"Zła odpowiedź",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        Spinner spinner =findViewById(R.id.spinner);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==2){
                Toast.makeText(MainActivity2.this,
                        "Dobra odpowiedź",
                        Toast.LENGTH_SHORT).show();
            }
                else{
                Toast.makeText(MainActivity2.this,"Zła odpowiedź",
                        Toast.LENGTH_SHORT).show();
            }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        CheckBox checkBoxGniezno = findViewById(R.id.checkBox);
        CheckBox checkBoxZabrze = findViewById(R.id.checkBox2);
        CheckBox checkBoxKrakow = findViewById(R.id.checkBox3);
        checkBoxGniezno.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b){
                            Toast.makeText(MainActivity2.this,
                                    "Dobra odpowiedź",
                                    Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(MainActivity2.this,
                                    "Zła odpowiedź",
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if(checkBoxGniezno.isChecked()
                        && checkBoxKrakow.isChecked()
                        && !checkBoxZabrze.isChecked())
                            Toast.makeText(MainActivity2.this,
                                    "Wszystko zaznaczono poprawnie",
                                    Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}