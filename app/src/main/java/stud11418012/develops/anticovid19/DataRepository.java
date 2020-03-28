package stud11418012.develops.anticovid19;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

class DataRepository {
    private Dao mDao;
    private LiveData<List<Data>> mAllDatas;

    DataRepository(Application application){
        Database db = Database.getDatabase(application);
        mDao = db.dao();
        mAllDatas = mDao.getAllDatas();
    }
    LiveData<List<Data>> getmAllDatas(){
        return mAllDatas;
    }

    public void insert (Data data){
        new insertAsyncTask(mDao).execute(data);
    }

    private static class insertAsyncTask extends AsyncTask<Data, Void, Void> {

        private Dao mAsyncTaskDao;

        insertAsyncTask(Dao dao) {
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Data... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
