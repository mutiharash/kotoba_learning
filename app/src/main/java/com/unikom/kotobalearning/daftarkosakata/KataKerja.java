package com.unikom.kotobalearning.daftarkosakata;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.media.MediaPlayer.OnCompletionListener;

import androidx.appcompat.app.AppCompatActivity;

import com.unikom.kotobalearning.R;

import java.io.IOException;

public class KataKerja extends AppCompatActivity implements View.OnClickListener {

    private Button btnPlay, btnPlay1, btnPlay2, btnPlay3, btnPlay4, btnPlay5, btnPlay6, btnPlay7, btnPlay8, btnPlay9, btnPlay10, btnPlay11, btnPlay12, btnPlay13, btnPlay14, btnPlay15, btnPlay16, btnPlay17, btnPlay18, btnPlay19, btnPlay20, btnPlay21, btnPlay22, btnPlay23, btnPlay24, btnPlay25, btnPlay26, btnPlay27, btnPlay28, btnPlay29, btnPlay30, btnPlay31, btnPlay32, btnPlay33, btnPlay34, btnPlay35, btnPlay36, btnPlay37, btnPlay38, btnPlay39, btnPlay40, btnPlay41, btnPlay42, btnPlay43, btnPlay44, btnPlay45, btnPlay46, btnPlay47, btnPlay48, btnPlay49, btnPlay50, btnPlay51, btnPlay52, btnPlay53, btnPlay54, btnPlay55, btnPlay56, btnPlay57, btnPlay58, btnPlay59, btnPlay60, btnPlay61, btnPlay62, btnPlay63, btnPlay64, btnPlay65, btnPlay66, btnPlay67, btnPlay68, btnPlay69, btnPlay70, btnPlay71, btnPlay72, btnPlay73, btnPlay74;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_daftar_kerja);

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
        btnPlay21 = (Button) findViewById(R.id.btnPlay21);
        btnPlay22 = (Button) findViewById(R.id.btnPlay22);
        btnPlay23 = (Button) findViewById(R.id.btnPlay23);
        btnPlay24 = (Button) findViewById(R.id.btnPlay24);
        btnPlay25 = (Button) findViewById(R.id.btnPlay25);
        btnPlay26 = (Button) findViewById(R.id.btnPlay26);
        btnPlay27 = (Button) findViewById(R.id.btnPlay27);
        btnPlay28 = (Button) findViewById(R.id.btnPlay28);
        btnPlay29 = (Button) findViewById(R.id.btnPlay29);
        btnPlay30 = (Button) findViewById(R.id.btnPlay30);
        btnPlay31 = (Button) findViewById(R.id.btnPlay31);
        btnPlay32 = (Button) findViewById(R.id.btnPlay32);
        btnPlay33 = (Button) findViewById(R.id.btnPlay33);
        btnPlay34 = (Button) findViewById(R.id.btnPlay34);
        btnPlay35 = (Button) findViewById(R.id.btnPlay35);
        btnPlay36 = (Button) findViewById(R.id.btnPlay36);
        btnPlay37 = (Button) findViewById(R.id.btnPlay37);
        btnPlay38 = (Button) findViewById(R.id.btnPlay38);
        btnPlay39 = (Button) findViewById(R.id.btnPlay39);
        btnPlay40 = (Button) findViewById(R.id.btnPlay40);
        btnPlay41 = (Button) findViewById(R.id.btnPlay41);
        btnPlay42 = (Button) findViewById(R.id.btnPlay42);
        btnPlay43 = (Button) findViewById(R.id.btnPlay43);
        btnPlay44 = (Button) findViewById(R.id.btnPlay44);
        btnPlay45 = (Button) findViewById(R.id.btnPlay45);
        btnPlay46 = (Button) findViewById(R.id.btnPlay46);
        btnPlay47 = (Button) findViewById(R.id.btnPlay47);
        btnPlay48 = (Button) findViewById(R.id.btnPlay48);
        btnPlay49 = (Button) findViewById(R.id.btnPlay49);
        btnPlay50 = (Button) findViewById(R.id.btnPlay50);
        btnPlay51 = (Button) findViewById(R.id.btnPlay51);
        btnPlay52 = (Button) findViewById(R.id.btnPlay52);
        btnPlay53 = (Button) findViewById(R.id.btnPlay53);
        btnPlay54 = (Button) findViewById(R.id.btnPlay54);
        btnPlay55 = (Button) findViewById(R.id.btnPlay55);
        btnPlay56 = (Button) findViewById(R.id.btnPlay56);
        btnPlay57 = (Button) findViewById(R.id.btnPlay57);
        btnPlay58 = (Button) findViewById(R.id.btnPlay58);
        btnPlay59 = (Button) findViewById(R.id.btnPlay59);
        btnPlay60 = (Button) findViewById(R.id.btnPlay60);
        btnPlay61 = (Button) findViewById(R.id.btnPlay61);
        btnPlay62 = (Button) findViewById(R.id.btnPlay62);
        btnPlay63 = (Button) findViewById(R.id.btnPlay63);
        btnPlay64 = (Button) findViewById(R.id.btnPlay64);
        btnPlay65 = (Button) findViewById(R.id.btnPlay65);
        btnPlay66 = (Button) findViewById(R.id.btnPlay66);
        btnPlay67 = (Button) findViewById(R.id.btnPlay67);
        btnPlay68 = (Button) findViewById(R.id.btnPlay68);
        btnPlay69 = (Button) findViewById(R.id.btnPlay69);
        btnPlay70 = (Button) findViewById(R.id.btnPlay70);
        btnPlay71 = (Button) findViewById(R.id.btnPlay71);
        btnPlay72 = (Button) findViewById(R.id.btnPlay72);
        btnPlay73 = (Button) findViewById(R.id.btnPlay73);
        btnPlay74 = (Button) findViewById(R.id.btnPlay74);

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
        btnPlay21.setOnClickListener(this);
        btnPlay22.setOnClickListener(this);
        btnPlay23.setOnClickListener(this);
        btnPlay24.setOnClickListener(this);
        btnPlay25.setOnClickListener(this);
        btnPlay26.setOnClickListener(this);
        btnPlay27.setOnClickListener(this);
        btnPlay28.setOnClickListener(this);
        btnPlay29.setOnClickListener(this);
        btnPlay30.setOnClickListener(this);
        btnPlay31.setOnClickListener(this);
        btnPlay32.setOnClickListener(this);
        btnPlay33.setOnClickListener(this);
        btnPlay34.setOnClickListener(this);
        btnPlay35.setOnClickListener(this);
        btnPlay36.setOnClickListener(this);
        btnPlay37.setOnClickListener(this);
        btnPlay38.setOnClickListener(this);
        btnPlay39.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnPlay:
                mp = MediaPlayer.create(this, R.raw.buka);
                play();
                btnPlay.setEnabled(false);
                break;
            case R.id.btnPlay1:
                mp = MediaPlayer.create(this, R.raw.berjalankaki);
                play();
                btnPlay1.setEnabled(false);
            case R.id.btnPlay2:
                mp = MediaPlayer.create(this, R.raw.bertiup);
                play();
                btnPlay2.setEnabled(false);
                break;
            case R.id.btnPlay3:
                mp = MediaPlayer.create(this, R.raw.mnegenakancelana);
                play();
                btnPlay3.setEnabled(false);
                break;
            case R.id.btnPlay4:
                mp = MediaPlayer.create(this, R.raw.berkerja);
                play();
                btnPlay4.setEnabled(false);
                break;
            case R.id.btnPlay5:
                mp = MediaPlayer.create(this, R.raw.menarik1);
                play();
                btnPlay5.setEnabled(false);
                break;
            case R.id.btnPlay6:
                mp = MediaPlayer.create(this, R.raw.pergi);
                play();
                btnPlay6.setEnabled(false);
                break;
            case R.id.btnPlay7:
                mp = MediaPlayer.create(this, R.raw.menulis);
                play();
                btnPlay7.setEnabled(false);
                break;
            case R.id.btnPlay8:
                mp = MediaPlayer.create(this, R.raw.mendengar);
                play();
                btnPlay8.setEnabled(false);
                break;
            case R.id.btnPlay9:
                mp = MediaPlayer.create(this, R.raw.menggosok);
                play();
                btnPlay9.setEnabled(false);
                break;
            case R.id.btnPlay10:
                mp = MediaPlayer.create(this, R.raw.bersuara);
                play();
                btnPlay10.setEnabled(false);
                break;
            case R.id.btnPlay11:
                mp = MediaPlayer.create(this, R.raw.meletakan);
                play();
                btnPlay11.setEnabled(false);
                break;
            case R.id.btnPlay12:
                mp = MediaPlayer.create(this, R.raw.berkembang);
                play();
                btnPlay12.setEnabled(false);
                break;
            case R.id.btnPlay13:
                mp = MediaPlayer.create(this, R.raw.tiba);
                play();
                btnPlay13.setEnabled(false);
                break;
            case R.id.btnPlay14:
                mp = MediaPlayer.create(this, R.raw.meninggalkan);
                play();
                btnPlay14.setEnabled(false);
                break;
            case R.id.btnPlay15:
                mp = MediaPlayer.create(this, R.raw.berenang);
                play();
                btnPlay15.setEnabled(false);
                break;
            case R.id.btnPlay16:
                mp = MediaPlayer.create(this, R.raw.bermain);
                play();
                btnPlay16.setEnabled(false);
                break;
            case R.id.btnPlay17:
                mp = MediaPlayer.create(this, R.raw.berbaris);
                play();
                btnPlay17.setEnabled(false);
                break;
            case R.id.btnPlay18:
                mp = MediaPlayer.create(this, R.raw.terbang);
                play();
                btnPlay18.setEnabled(false);
                break;
            case R.id.btnPlay19:
                mp = MediaPlayer.create(this, R.raw.memanggil);
                play();
                btnPlay19.setEnabled(false);
                break;
            case R.id.btnPlay20:
                mp = MediaPlayer.create(this, R.raw.minum);
                play();
                btnPlay20.setEnabled(false);
                break;
            case R.id.btnPlay21:
                mp = MediaPlayer.create(this, R.raw.tinggal);
                play();
                btnPlay21.setEnabled(false);
                break;
            case R.id.btnPlay22:
                mp = MediaPlayer.create(this, R.raw.meminta);
                play();
                btnPlay22.setEnabled(false);
                break;
            case R.id.btnPlay23:
                mp = MediaPlayer.create(this, R.raw.beristirahat);
                play();
                btnPlay23.setEnabled(false);
                break;
            case R.id.btnPlay24:
                mp = MediaPlayer.create(this, R.raw.membaca);
                play();
                btnPlay24.setEnabled(false);
                break;
            case R.id.btnPlay25:
                mp = MediaPlayer.create(this, R.raw.mati);
                play();
                btnPlay25.setEnabled(false);
                break;
            case R.id.btnPlay26:
                mp = MediaPlayer.create(this, R.raw.bertemu);
                play();
                btnPlay26.setEnabled(false);
                break;
            case R.id.btnPlay27:
                mp = MediaPlayer.create(this, R.raw.mencuci);
                play();
                btnPlay27.setEnabled(false);
                break;
            case R.id.btnPlay28:
                mp = MediaPlayer.create(this, R.raw.berbeda);
                play();
                btnPlay28.setEnabled(false);
                break;
            case R.id.btnPlay29:
                mp = MediaPlayer.create(this, R.raw.berkata);
                play();
                btnPlay29.setEnabled(false);
                break;
            case R.id.btnPlay30:
                mp = MediaPlayer.create(this, R.raw.membeli);
                play();
                btnPlay30.setEnabled(false);
                break;
            case R.id.btnPlay31:
                mp = MediaPlayer.create(this, R.raw.belajar);
                play();
                btnPlay31.setEnabled(false);
                break;
            case R.id.btnPlay32:
                mp = MediaPlayer.create(this, R.raw.menghisap);
                play();
                btnPlay32.setEnabled(false);
                break;
            case R.id.btnPlay33:
                mp = MediaPlayer.create(this, R.raw.memakai);
                play();
                btnPlay33.setEnabled(false);
                break;
            case R.id.btnPlay34:
                mp = MediaPlayer.create(this, R.raw.bernyanyi);
                play();
                btnPlay34.setEnabled(false);
                break;
            case R.id.btnPlay35:
                mp = MediaPlayer.create(this, R.raw.menunggu);
                play();
                btnPlay35.setEnabled(false);
                break;
            case R.id.btnPlay36:
                mp = MediaPlayer.create(this, R.raw.membawa);
                play();
                btnPlay36.setEnabled(false);
                break;
            case R.id.btnPlay37:
                mp = MediaPlayer.create(this, R.raw.berdiri);
                play();
                btnPlay37.setEnabled(false);
                break;
            case R.id.btnPlay38:
                mp = MediaPlayer.create(this, R.raw.ada);
                play();
                btnPlay38.setEnabled(false);
                break;
            case R.id.btnPlay39:
                mp = MediaPlayer.create(this, R.raw.turun);
                play();
                btnPlay39.setEnabled(false);
                break;
            case R.id.btnPlay40:
                mp = MediaPlayer.create(this, R.raw.masuk);
                play();
                btnPlay40.setEnabled(false);
                break;
            case R.id.btnPlay41:
                mp = MediaPlayer.create(this, R.raw.mulai);
                play();
                btnPlay41.setEnabled(false);
                break;
            case R.id.btnPlay42:
                mp = MediaPlayer.create(this, R.raw.menempelkan);
                play();
                btnPlay42.setEnabled(false);
                break;
            case R.id.btnPlay43:
                mp = MediaPlayer.create(this, R.raw.berlari);
                play();
                btnPlay43.setEnabled(false);
                break;
            case R.id.btnPlay45:
                mp = MediaPlayer.create(this, R.raw.butuh);
                play();
                btnPlay45.setEnabled(false);
                break;
            case R.id.btnPlay46:
                mp = MediaPlayer.create(this, R.raw.pulang);
                play();
                btnPlay46.setEnabled(false);
                break;
            case R.id.btnPlay47:
                mp = MediaPlayer.create(this, R.raw.memerlukan);
                play();
                btnPlay47.setEnabled(false);
                break;
            case R.id.btnPlay48:
                mp = MediaPlayer.create(this, R.raw.memotong);
                play();
                btnPlay48.setEnabled(false);
                break;
            case R.id.btnPlay49:
                mp = MediaPlayer.create(this, R.raw.menyusahkan);
                play();
                btnPlay49.setEnabled(false);
                break;
            case R.id.btnPlay50:
                mp = MediaPlayer.create(this, R.raw.mendung);
                play();
                btnPlay50.setEnabled(false);
                break;
            case R.id.btnPlay51:
                mp = MediaPlayer.create(this, R.raw.membelok);
                play();
                btnPlay51.setEnabled(false);
                break;
            case R.id.btnPlay52:
                mp = MediaPlayer.create(this, R.raw.menjadi);
                play();
                btnPlay52.setEnabled(false);
                break;
            case R.id.btnPlay53:
                mp = MediaPlayer.create(this, R.raw.mendaki);
                play();
                btnPlay53.setEnabled(false);
                break;
            case R.id.btnPlay54:
                mp = MediaPlayer.create(this, R.raw.naikkendaraan);
                play();
                btnPlay54.setEnabled(false);
                break;
            case R.id.btnPlay55:
                mp = MediaPlayer.create(this, R.raw.selesai);
                play();
                btnPlay55.setEnabled(false);
                break;
            case R.id.btnPlay56:
                mp = MediaPlayer.create(this, R.raw.tutup);
                play();
                btnPlay56.setEnabled(false);
                break;
            case R.id.btnPlay57:
                mp = MediaPlayer.create(this, R.raw.mengenal);
                play();
                btnPlay57.setEnabled(false);
                break;
            case R.id.btnPlay58:
                mp = MediaPlayer.create(this, R.raw.duduk);
                play();
                btnPlay58.setEnabled(false);
                break;
            case R.id.btnPlay59:
                mp = MediaPlayer.create(this, R.raw.berhenti);
                play();
                btnPlay59.setEnabled(false);
                break;
            case R.id.btnPlay60:
                mp = MediaPlayer.create(this, R.raw.mengambil);
                play();
                btnPlay60.setEnabled(false);
                break;
            case R.id.btnPlay61:
                mp = MediaPlayer.create(this, R.raw.membuat);
                play();
                btnPlay61.setEnabled(false);
                break;
            case R.id.btnPlay62:
                mp = MediaPlayer.create(this, R.raw.menjual);
                play();
                btnPlay62.setEnabled(false);
                break;
            case R.id.btnPlay63:
                mp = MediaPlayer.create(this, R.raw.mengerti);
                play();
                btnPlay63.setEnabled(false);
                break;
            case R.id.btnPlay64:
                mp = MediaPlayer.create(this, R.raw.menyeberang);
                play();
                btnPlay64.setEnabled(false);
                break;
            case R.id.btnPlay65:
                mp = MediaPlayer.create(this, R.raw.melakukan);
                play();
                btnPlay65.setEnabled(false);
                break;
            case R.id.btnPlay66:
                mp = MediaPlayer.create(this, R.raw.mengeluarkan);
                play();
                btnPlay66.setEnabled(false);
                break;
            case R.id.btnPlay67:
                mp = MediaPlayer.create(this, R.raw.berbicara);
                play();
                btnPlay67.setEnabled(false);
                break;
            case R.id.btnPlay68:
                mp = MediaPlayer.create(this, R.raw.mengembalikan);
                play();
                btnPlay68.setEnabled(false);
                break;
            case R.id.btnPlay69:
                mp = MediaPlayer.create(this, R.raw.meminjamkan);
                play();
                btnPlay69.setEnabled(false);
                break;
            case R.id.btnPlay70:
                mp = MediaPlayer.create(this, R.raw.menghapus);
                play();
                btnPlay70.setEnabled(false);
                break;
            case R.id.btnPlay71:
                mp = MediaPlayer.create(this, R.raw.menghilangkan);
                play();
                btnPlay71.setEnabled(false);
                break;
            case R.id.btnPlay72:
                mp = MediaPlayer.create(this, R.raw.mendorong);
                play();
                btnPlay72.setEnabled(false);
                break;
            case R.id.btnPlay73:
                mp = MediaPlayer.create(this, R.raw.mengulurkantangan);
                play();
                btnPlay73.setEnabled(false);
                break;
            case R.id.btnPlay74:
                mp = MediaPlayer.create(this, R.raw.menyerahkan);
                play();
                btnPlay74.setEnabled(false);
                break;
        }
    }

    public void stateAwal() {
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
        btnPlay21.setEnabled(true);
        btnPlay22.setEnabled(true);
        btnPlay23.setEnabled(true);
        btnPlay24.setEnabled(true);
        btnPlay25.setEnabled(true);
        btnPlay26.setEnabled(true);
        btnPlay27.setEnabled(true);
        btnPlay28.setEnabled(true);
        btnPlay29.setEnabled(true);
        btnPlay30.setEnabled(true);
        btnPlay31.setEnabled(true);
        btnPlay32.setEnabled(true);
        btnPlay33.setEnabled(true);
        btnPlay34.setEnabled(true);
        btnPlay35.setEnabled(true);
        btnPlay36.setEnabled(true);
        btnPlay37.setEnabled(true);
        btnPlay38.setEnabled(true);
        btnPlay39.setEnabled(true);
        btnPlay40.setEnabled(true);
        btnPlay41.setEnabled(true);
        btnPlay42.setEnabled(true);
        btnPlay43.setEnabled(true);
        btnPlay44.setEnabled(true);
        btnPlay45.setEnabled(true);
        btnPlay46.setEnabled(true);
        btnPlay47.setEnabled(true);
        btnPlay48.setEnabled(true);
        btnPlay49.setEnabled(true);
        btnPlay50.setEnabled(true);
        btnPlay51.setEnabled(true);
        btnPlay52.setEnabled(true);
        btnPlay53.setEnabled(true);
        btnPlay54.setEnabled(true);
        btnPlay55.setEnabled(true);
        btnPlay56.setEnabled(true);
        btnPlay57.setEnabled(true);
        btnPlay58.setEnabled(true);
        btnPlay59.setEnabled(true);
        btnPlay60.setEnabled(true);
        btnPlay61.setEnabled(true);
        btnPlay62.setEnabled(true);
        btnPlay63.setEnabled(true);
        btnPlay64.setEnabled(true);
        btnPlay65.setEnabled(true);
        btnPlay66.setEnabled(true);
        btnPlay67.setEnabled(true);
        btnPlay68.setEnabled(true);
        btnPlay69.setEnabled(true);
        btnPlay70.setEnabled(true);
        btnPlay71.setEnabled(true);
        btnPlay72.setEnabled(true);
        btnPlay73.setEnabled(true);
        btnPlay74.setEnabled(true);

    }

    /**
     * Dijalankan Oleh Tombol Play
     */
    private void play() {
        /** Memanggil File MP3 "indonesiaraya.mp3" */

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
