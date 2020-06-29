package br.com.unipar.auxiliocaixa;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


    public class SecondActivity extends AppCompatActivity {
        private EditText idcpf, idnascimento, idrendamensal;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public double calcularenda (View view) {
            Bundle b = getIntent().getExtras();
            double renda = b.getDouble("renda")* 0.7;
            if (renda > 475) {
                return 475;
            }
            return renda;
        }

        public double calculadata (View view) {
            Bundle b = getIntent().getExtras();
            double renda = b.getDouble("renda")* 0.7;
            if (renda > 475) {
                return 475;
            }
            return renda;
        }
    }
