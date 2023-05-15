package com.ifbacam.tigershutcalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private SwitchCompat opcaoCompleta, opcaoLight,opcaoChurrasco;
    private SeekBar vodkaSeekBar,iceSeekBar,refriSeekBar, sucoSeekBar, cervejaSeekBar ;

    private TextView textFirstRow, textSecondRow, textThirdRow, textFourthRow, textFifthRow;

    private ToggleButton btnCustom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opcaoCompleta = findViewById(R.id.opcaoCompleta);
        opcaoLight = findViewById(R.id.opcaoLight);
        opcaoChurrasco = findViewById(R.id.opcaoChurrasco);

        vodkaSeekBar = findViewById(R.id.vodkaSeekBar);
        iceSeekBar = findViewById(R.id.iceSeekBar);
        refriSeekBar = findViewById(R.id.refriSeekBar);
        sucoSeekBar = findViewById(R.id.sucoSeekBar);
        cervejaSeekBar = findViewById(R.id.cervejaSeekBar);

        textFirstRow = findViewById(R.id.textFirtsRow);
        textSecondRow = findViewById(R.id.textSecondRow);
        textThirdRow = findViewById(R.id.textThirdRow);
        textFourthRow = findViewById(R.id.textFourthRow);
        textFifthRow = findViewById(R.id.textFifthRow);

        btnCustom = findViewById(R.id.btnCustom);
    }
    public void unselectSwitchs (View view){
    if (view == opcaoLight) {
        opcaoCompleta.setChecked(false);
        opcaoChurrasco.setChecked(false);
    } else if (view == opcaoChurrasco) {
        opcaoCompleta.setChecked(false);
        opcaoLight.setChecked(false);
    } else if (view == opcaoCompleta) {
        opcaoLight.setChecked(false);
        opcaoChurrasco.setChecked(false);
    }
    }
    public void customDrinks (View view){

        if (opcaoLight.isEnabled() && opcaoChurrasco.isEnabled() && opcaoCompleta.isEnabled()){
            opcaoLight.setEnabled(false);
            opcaoChurrasco.setEnabled(false);
            opcaoCompleta.setEnabled(false);
        } else {
            opcaoLight.setEnabled(true);
            opcaoChurrasco.setEnabled(true);
            opcaoCompleta.setEnabled(true);
        }
    }

    public void mudarTitulo(View view){
        if (view == opcaoLight) {

        } else if (view == opcaoChurrasco) {

        } else if (view == opcaoCompleta) {
            textFirstRow.setText(Bebidas.VODKA.titulo);
            textSecondRow.setText(Bebidas.ICE.titulo);
            textThirdRow.setText(Bebidas.REFRI.titulo);
            textFourthRow.setText(Bebidas.SUCO.titulo);
            textFifthRow.setText(Bebidas.CERVEJA.titulo);
        }
    }
    public void ativarOpcaoLight(View view){
        unselectSwitchs(view);

    }
    public void ativarOpcaoChurrasco(View view){
        unselectSwitchs(view);

    }
    public void ativarOpcaoCompleta(View view){
        unselectSwitchs(view);

    }
}