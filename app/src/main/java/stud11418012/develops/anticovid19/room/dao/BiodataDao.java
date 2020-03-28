package stud11418012.develops.anticovid19.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import stud11418012.develops.anticovid19.room.model.Biodata;

@Dao
public interface BiodataDao {
    @Query("SELECT count(*) FROM biodata")
    int getCount();

    @Insert
    public void insertBiodata(Biodata... biodata);
}
