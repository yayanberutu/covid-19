package stud11418012.develops.anticovid19.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import stud11418012.develops.anticovid19.R;

public class Riwayat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
//        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"biodata").allowMainThreadQueries().build();
//        if (db.biodataDao().getCount() == 0){
//            Intent intent = new Intent(getApplicationContext(), Biodata.class);
//            startActivity(intent);
//        }
    }

}
