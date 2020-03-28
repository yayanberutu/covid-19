package stud11418012.develops.anticovid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import stud11418012.develops.anticovid19.R;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_riwayat);
    }
        //public boolean onCreateOptionMenu(Menu menu){
          //  MenuInflater inflater = getMenuInflater();
            //inflater.inflate(R.menu.menu_main, menu);
            //return true;
        //}
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==R.id.bio){
            startActivity(new Intent(this, Biodata.class));
        }else if (item.getItemId()== R.id.about){
            startActivity(new Intent(this, About.class));
        }else if (item.getItemId()==R.id.uji){
            startActivity(new Intent(this, Pengujian.class));
        }
        return true;
    }


}
