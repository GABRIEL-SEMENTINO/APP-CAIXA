package br.com.unipar.auxiliocaixa;

import androidx.appcompat.app.AppCompatActivity;
//import br.com.unipar.auxiliocaixa.SecondActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {
        private EditText idcpf, idnascimento, idrendamensal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void proximaTela(View view) throws ParseException {
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();

        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = fmt.parse(MainActivity.this.idnascimento.getText().toString());

        if (dataNascimento.getYear() > (new Date().getYear() - 18)) {
            // enviar para tela erro
            return;
        }

        b.putString("idrenda", MainActivity.this.idrendamensal.getText().toString());
        b.putDouble("idDataDePagamento", Double.parseDouble(MainActivity.this.idnascimento.getText().toString()));
        intent.putExtras(b);
        startActivity(intent);
        finish();
    }
}