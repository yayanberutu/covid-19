package stud11418012.develops.anticovid19;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

class DataViewModel extends AndroidViewModel {
    private DataRepository mRepository;
    private LiveData<List<Data>> mAllDatas;

    public DataViewModel(Application application){
        super(application);
        mRepository = new DataRepository(application);
        mAllDatas = mRepository.getmAllDatas();
    }
    LiveData<List<Data>> getmAllDatas(){
        return mAllDatas;
    }
    public void insert(Data data){
        mRepository.insert(data);
    }
}

