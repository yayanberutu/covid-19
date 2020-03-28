package stud11418012.develops.anticovid19.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;

import stud11418012.develops.anticovid19.R;
import stud11418012.develops.anticovid19.room.AppDatabase;

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
