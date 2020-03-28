package stud11418012.develops.anticovid19.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import stud11418012.develops.anticovid19.DataListAdapter;
import stud11418012.develops.anticovid19.DataViewModel;
import stud11418012.develops.anticovid19.R;

public class MainActivity extends AppCompatActivity {

    private DataViewModel mDataViewModel;
    public static final int NEW_DATA_ACTIVITY_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDataViewModel = ViewModelProviders.of(this).get(DataViewModel.class);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final DataListAdapter adapter = new DataListAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DataBaru.class);
                startActivityForResult(intent, NEW_DATA_ACTIVITY_REQUEST_CODE);
            }
        });

        mDataViewModel.getmAllDatas().observe(this, new Observer<List<Data>>() {
            @Override
            public void onChanged(@Nullable final List<Data> datas) {
                // Update the cached copy of the words in the adapter.
                adapter.setDatas(datas);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == NEW_DATA_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            Data data1 = new Data(data.getStringExtra(DataBaru.EXTRA_REPLY));
            mDataViewModel.insert(data1);
        } else {
            Toast.makeText(
                    getApplicationContext(),
                    R.string.empty_not_saved,
                    Toast.LENGTH_LONG).show();
        }
    }

}
