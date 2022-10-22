package com.semih.basithesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText editTxtBirinciSayi, getEditTxtIkinciSayi;
    private TextView txtSonuc;
    private String birinciSayi, ikinciSayi;
    private double s1, s2;
    private Hesapla hesapla;
    private double sonuc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTxtBirinciSayi = (EditText) findViewById(R.id.editTxtBirinciSayi);
        getEditTxtIkinciSayi = (EditText) findViewById(R.id.editTxtIkinciSayi);
        txtSonuc = (TextView)findViewById(R.id.textViewSonuc);
        
    }

    public void btnHesapla(View v) {
        birinciSayi = editTxtBirinciSayi.getText().toString();
        ikinciSayi = getEditTxtIkinciSayi.getText().toString();

        if (!TextUtils.isEmpty(birinciSayi) && !TextUtils.isEmpty(ikinciSayi)) {
            s1 = Double.parseDouble(birinciSayi);
            s2 = Double.parseDouble(ikinciSayi);
            //s1 = Integer.valueOf(birinciSayi);
            //s2 = Integer.valueOf(ikinciSayi);
            hesapla = new Hesapla(s1, s2);

            switch (v.getId()) {
                case R.id.btnTopla:
                    sonuc = hesapla.toplam();
                    break;

                case R.id.btnFark:
                    sonuc = hesapla.fark();
                    break;

                case R.id.btnCarp:
                    sonuc = hesapla.carpma();
                    break;

                case R.id.btnBolme:
                    sonuc = hesapla.bolme();
                    break;

            }
            txtSonuc.setText("Sonuç : "+ sonuc);
        }
    }
}