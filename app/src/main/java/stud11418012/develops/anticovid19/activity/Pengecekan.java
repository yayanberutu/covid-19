package stud11418012.develops.anticovid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.room.Room;

import stud11418012.develops.anticovid19.R;
import stud11418012.develops.anticovid19.room.AppDatabase;

public class Pengecekan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:app/src/main/java/stud11418012/develops/anticovid19/activity/Pengecekan.java
        setContentView(R.layout.activity_pengecekan);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"biodata").allowMainThreadQueries().build();
=======
        setContentView(R.layout.activity_pengujian);
        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class,"appdatabase").allowMainThreadQueries().build();
>>>>>>> 9e430d0ac12e1647535d89b004a942353fffbfdf:app/src/main/java/stud11418012/develops/anticovid19/activity/Pengujian.java
        if (db.biodataDao().getCount() == 0){
            Toast.makeText(getApplicationContext(), "Biodata anda harus diisi terlebih dahulu", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), BiodataActivity.class);
            startActivity(intent);
            finish();
        }
<<<<<<< HEAD:app/src/main/java/stud11418012/develops/anticovid19/activity/Pengecekan.java

        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        FragmentPertama fragmentPertama = new FragmentPertama();
        transaction.add(R.id.frame_content, fragmentPertama);
        transaction.addToBackStack("POTENSI TERTULAR DI LUAR RUMAH");
        transaction.commit();

=======
        else {
            String pesan = "Selamat datang " + db.biodataDao().getNama();
            Toast.makeText(getApplicationContext(), pesan, Toast.LENGTH_SHORT).show();
        }
>>>>>>> 9e430d0ac12e1647535d89b004a942353fffbfdf:app/src/main/java/stud11418012/develops/anticovid19/activity/Pengujian.java
    }
}
