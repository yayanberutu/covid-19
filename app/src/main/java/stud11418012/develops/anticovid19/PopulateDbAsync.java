package stud11418012.develops.anticovid19;

import android.os.AsyncTask;

public class PopulateDbAsync extends AsyncTask<Void, Void, Void> {
    private final Dao mDao;
    private String[] datas ={"11418012", "Jessica", "Parapat, 20 Desember 200", "Siborongborong"};

    PopulateDbAsync(Database db){mDao = db.dao();}

    @Override
    protected Void doInBackground(final Void... params) {
        // Start the app with a clean database every time.
        // Not needed if you only populate the database
        // when it is first created
        mDao.deleteAll();

        for (int i = 0; i <= datas.length - 1; i++) {
            Data data = new Data(datas[i]);
            mDao.insert(data);
        }
        return null;
    }
}
