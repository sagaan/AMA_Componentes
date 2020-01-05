package com.ama.componentes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton btnBoton2 = findViewById(R.id.btnBoton2);
        btnBoton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "ENCENDIDO", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "APAGADO", Toast.LENGTH_SHORT).show();
                }
            }
        });

        final CheckBox cbxUno = findViewById(R.id.cbxUno);
        cbxUno.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    cbxUno.setText("Me marcaste");
                }else{
                    cbxUno.setText("Me desmarcaste");
                }
            }
        });

        final TextView txtOpc = findViewById(R.id.txtOpc);
        RadioGroup rgrpUno = findViewById(R.id.rgrpUno);
        rgrpUno.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                txtOpc.setText("ID RadioButton: " + checkedId);
            }
        });
    }
}
