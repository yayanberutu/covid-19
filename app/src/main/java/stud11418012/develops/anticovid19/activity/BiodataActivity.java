package stud11418012.develops.anticovid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import stud11418012.develops.anticovid19.R;
import stud11418012.develops.anticovid19.room.AppDatabase;
import stud11418012.develops.anticovid19.room.model.Biodata;

public class BiodataActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_save;
    private TextView bi, nama, jk, alamat, ttl;
    private EditText edittext_nama, edittext_alamat, edittext_ttl;
    private AppDatabase database;
    private RadioButton r_jk, pria, wanita;
    private String jenisKelamin;
    Biodata b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nama = findViewById(R.id.nama);
        alamat = findViewById(R.id.alamat);
        ttl = findViewById(R.id.ttl);
        pria = findViewById(R.id.pria);
        wanita = findViewById(R.id.wanita);
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(this);

        if (pria.isChecked()){
            jenisKelamin ="Pria";
        }else if (wanita.isChecked()){
            jenisKelamin="Wanita";
        }
    }

   /* @SuppressLint("StaticFieldLeak")
    private void insertData(final Biodata biodata){
        new AsyncTask<Void, Void, Long>(){
            @Override
            protected Long doInbackground(Void... voids){
                return database.biodataDao().insertBiodata(biodata);
            }
            @Override
            protected void onPostExecute(Long status){
                Toast.makeText()
            }
        }
    }*/

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn_save){
            AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"appdatabase").allowMainThreadQueries().build();
            b = new Biodata();
            b.setNama(nama.getText().toString());
            b.setJk(jenisKelamin);
            b.setTtl(ttl.getText().toString());
            b.setAlamat(alamat.getText().toString());
            db.biodataDao().insertBiodata(b);
            Intent intent = new Intent(getApplicationContext(), Pengecekan.class);
            startActivity(intent);
            finish();
        }

    }
}
