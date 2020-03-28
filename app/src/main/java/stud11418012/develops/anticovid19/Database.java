package stud11418012.develops.anticovid19;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@androidx.room.Database(entities = {Data.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract Dao dao();

    private static Database INSTANCE;
    private static RoomDatabase.Callback sRoomDatabaseCallback= new RoomDatabase.Callback(){
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db){
            super.onOpen(db);
            new PopulateDbAsync(INSTANCE).execute();
        }
    };

    public static Database getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (Database.class){
                if (INSTANCE==null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            Database.class, "data_database")
                            .fallbackToDestructiveMigration()
                            .addCallback(sRoomDatabaseCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
