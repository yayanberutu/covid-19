package stud11418012.develops.anticovid19.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import stud11418012.develops.anticovid19.room.model.Biodata;
import stud11418012.develops.anticovid19.room.model.Pengecekan;

@Dao
public interface BiodataDao {
    @Query("SELECT count(*) FROM biodata")
    public int getCount();

    @Insert
    public void insertBiodata(Biodata... biodata);

    @Query("SELECT nama from biodata LIMIT 1")
    public String getNama();


    @Query("SELECT * FROM pengecekan")
    List<Pengecekan> getPengecekan();

}
