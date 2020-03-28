package stud11418012.develops.anticovid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;


import stud11418012.develops.anticovid19.R;

public class MainActivity extends AppCompatActivity {

    public static final int NEW_DATA_ACTIVITY_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, (android.view.Menu) menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, About.class));
        } else if (item.getItemId() == R.id.uji) {
            startActivity(new Intent(this, Pengujian.class));
        } else if (item.getItemId() == R.id.bio) {
            startActivity(new Intent(this, Biodata.class));
        }
        return true;
    }



}
