package stud11418012.develops.anticovid19.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import stud11418012.develops.anticovid19.R;
import stud11418012.develops.anticovid19.room.AppDatabase;

public class Biodata extends AppCompatActivity {
    EditText nama, jk;
    Button btn_save;
    stud11418012.develops.anticovid19.room.model.Biodata b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        nama = findViewById(R.id.edittext_nama);
        jk = findViewById(R.id.edittext_jk);
        btn_save = findViewById(R.id.btn_save);

        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b = new stud11418012.develops.anticovid19.room.model.Biodata();
                b.setNama(nama.getText().toString());
                b.setJk(jk.getText().toString());
                AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"appdatabase").allowMainThreadQueries().build();
                db.biodataDao().insertBiodata(b);
                Intent intent = new Intent(getApplicationContext(), Pengecekan.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
