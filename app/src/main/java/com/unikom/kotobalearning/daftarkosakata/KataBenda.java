package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.media.MediaPlayer.OnCompletionListener;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.R;

import java.io.IOException;

/*Cara Menambah Suara
* 1A. copy paste kan lagu ke file res -> raw
* 1B. Tambahkan dulu source code di file XML nya, nama file XML tertera pada line 26 atau ada di res->layout
* 2. Kemudian Tambahkan btnPlay pada line 21
* 3. setelah itu add id Button seperti pada line 32 dan 33
* 4. kemudian add onClick button seperti pada line 36 dan 37
* 5. kemudian add case - break, coppy kan saja dibawahnya dari line 49 - 53 (case -> break) paste di line bawahnya
* 6. untuk mengarahkan ke file lagu silahkan masukkan file nama lagu seperti pada line 51 cth : R.raw.nama_lagu
* 7. tambahkan disable button seperti pada line 60 & 61*/

public class KataBenda extends AppCompatActivity implements View.OnClickListener{

    private Button btnPlay, btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10,
            btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_benda);

        mp = new MediaPlayer();

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay1 = (Button) findViewById(R.id.btnPlay1);
        btnPlay2 = (Button) findViewById(R.id.btnPlay2);
        btnPlay3 = (Button) findViewById(R.id.btnPlay3);
        btnPlay4 = (Button) findViewById(R.id.btnPlay4);
        btnPlay5 = (Button) findViewById(R.id.btnPlay5);
        btnPlay6 = (Button) findViewById(R.id.btnPlay6);
        btnPlay7 = (Button) findViewById(R.id.btnPlay7);
        btnPlay8 = (Button) findViewById(R.id.btnPlay8);
        btnPlay9 = (Button) findViewById(R.id.btnPlay9);
        btnPlay10 = (Button) findViewById(R.id.btnPlay10);
        btnPlay11 = (Button) findViewById(R.id.btnPlay11);
        btnPlay12 = (Button) findViewById(R.id.btnPlay12);
        btnPlay13 = (Button) findViewById(R.id.btnPlay13);
        btnPlay14 = (Button) findViewById(R.id.btnPlay14);
        btnPlay15 = (Button) findViewById(R.id.btnPlay15);
        btnPlay16 = (Button) findViewById(R.id.btnPlay16);
        btnPlay17 = (Button) findViewById(R.id.btnPlay17);
        btnPlay18 = (Button) findViewById(R.id.btnPlay18);
        btnPlay19 = (Button) findViewById(R.id.btnPlay19);
        btnPlay20 = (Button) findViewById(R.id.btnPlay20);


        btnPlay.setOnClickListener(this);
        btnPlay1.setOnClickListener(this);
        btnPlay2.setOnClickListener(this);
        btnPlay3.setOnClickListener(this);
        btnPlay4.setOnClickListener(this);
        btnPlay5.setOnClickListener(this);
        btnPlay6.setOnClickListener(this);
        btnPlay7.setOnClickListener(this);
        btnPlay8.setOnClickListener(this);
        btnPlay9.setOnClickListener(this);
        btnPlay10.setOnClickListener(this);
        btnPlay11.setOnClickListener(this);
        btnPlay12.setOnClickListener(this);
        btnPlay13.setOnClickListener(this);
        btnPlay14.setOnClickListener(this);
        btnPlay15.setOnClickListener(this);
        btnPlay16.setOnClickListener(this);
        btnPlay17.setOnClickListener(this);
        btnPlay18.setOnClickListener(this);
        btnPlay19.setOnClickListener(this);
        btnPlay20.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.barang);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.topi);
                play();
                btnPlay1.setEnabled(false);
                break;
            case R.id.btnPlay2:
                mp = MediaPlayer.create(this, R.raw.payung);
                play();
                btnPlay2.setEnabled(false);
                break;
            case R.id.btnPlay3:
                mp = MediaPlayer.create(this, R.raw.kacamata);
                play();
                btnPlay3.setEnabled(false);
                break;
            case R.id.btnPlay4:
                mp = MediaPlayer.create(this, R.raw.saputangan);
                play();
                btnPlay4.setEnabled(false);
                break;
            case R.id.btnPlay5:
                mp = MediaPlayer.create(this, R.raw.handuk);
                play();
                btnPlay5.setEnabled(false);
                break;
            case R.id.btnPlay6:
                mp = MediaPlayer.create(this, R.raw.sabun);
                play();
                btnPlay6.setEnabled(false);
                break;
            case R.id.btnPlay7:
                mp = MediaPlayer.create(this, R.raw.shampo);
                play();
                btnPlay7.setEnabled(false);
                break;
            case R.id.btnPlay8:
                mp = MediaPlayer.create(this, R.raw.dompet);
                play();
                btnPlay8.setEnabled(false);
                break;
            case R.id.btnPlay9:
                mp = MediaPlayer.create(this, R.raw.uang);
                play();
                btnPlay9.setEnabled(false);
                break;
            case R.id.btnPlay10:
                mp = MediaPlayer.create(this, R.raw.sandal);
                play();
                btnPlay10.setEnabled(false);
                break;
            case R.id.btnPlay11:
                mp = MediaPlayer.create(this, R.raw.kaoskaki);
                play();
                btnPlay11.setEnabled(false);
                break;
            case R.id.btnPlay12:
                mp = MediaPlayer.create(this, R.raw.sepatu);
                play();
                btnPlay12.setEnabled(false);
                break;
            case R.id.btnPlay13:
                mp = MediaPlayer.create(this, R.raw.barangbawaan);
                play();
                btnPlay13.setEnabled(false);
                break;
            case R.id.btnPlay14:
                mp = MediaPlayer.create(this, R.raw.tas);
                play();
                btnPlay14.setEnabled(false);
                break;
            case R.id.btnPlay15:
                mp = MediaPlayer.create(this, R.raw.rokok);
                play();
                btnPlay15.setEnabled(false);
                break;
            case R.id.btnPlay16:
                mp = MediaPlayer.create(this, R.raw.korekapi);
                play();
                btnPlay16.setEnabled(false);
                break;
            case R.id.btnPlay17:
                mp = MediaPlayer.create(this, R.raw.obat);
                play();
                btnPlay17.setEnabled(false);
                break;
            case R.id.btnPlay18:
                mp = MediaPlayer.create(this, R.raw.kunci);
                play();
                btnPlay18.setEnabled(false);
                break;
            case R.id.btnPlay19:
                mp = MediaPlayer.create(this, R.raw.koran);
                play();
                btnPlay19.setEnabled(false);
                break;
            case R.id.btnPlay20:
                mp = MediaPlayer.create(this, R.raw.majalah);
                play();
                btnPlay20.setEnabled(false);
                break;
        }
    }

    public void stateAwal(){
        btnPlay.setEnabled(true);
        btnPlay1.setEnabled(true);
        btnPlay2.setEnabled(true);
        btnPlay3.setEnabled(true);
        btnPlay4.setEnabled(true);
        btnPlay5.setEnabled(true);
        btnPlay6.setEnabled(true);
        btnPlay7.setEnabled(true);
        btnPlay8.setEnabled(true);
        btnPlay9.setEnabled(true);
        btnPlay10.setEnabled(true);
        btnPlay11.setEnabled(true);
        btnPlay12.setEnabled(true);
        btnPlay13.setEnabled(true);
        btnPlay14.setEnabled(true);
        btnPlay15.setEnabled(true);
        btnPlay16.setEnabled(true);
        btnPlay17.setEnabled(true);
        btnPlay18.setEnabled(true);
        btnPlay19.setEnabled(true);
        btnPlay20.setEnabled(true);

    }

    /** Dijalankan Oleh Tombol Play */
    private void play() {
        /** Memanggil File MP3 ".mp3" */
        try {
            mp.prepare();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /** Menjalankan Audio */
        mp.start();

        /** Penanganan Ketika Suara Berakhir */
        mp.setOnCompletionListener(new OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stateAwal();
            }
        });
    }
}
