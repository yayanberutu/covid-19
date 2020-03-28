package stud11418012.develops.anticovid19;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;


@androidx.room.Dao
public interface Dao {
    @Insert
    void insert(Data data);

    @Query("DELETE FROM Person_table")
    void deleteAll();

    @Query("SELECT * from Person_table ORDER BY nim ASC")
    LiveData<List<Data>> getAllDatas();
}
