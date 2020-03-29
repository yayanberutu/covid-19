package stud11418012.develops.anticovid19.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import stud11418012.develops.anticovid19.room.dao.BiodataDao;
import stud11418012.develops.anticovid19.room.model.Biodata;
import stud11418012.develops.anticovid19.room.model.Pengecekan;

@Database(entities = {Biodata.class, Pengecekan.class}, version = 1,exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract BiodataDao biodataDao();
}
