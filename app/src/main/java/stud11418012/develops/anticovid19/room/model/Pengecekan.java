package stud11418012.develops.anticovid19.room.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Pengecekan {
    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "tanggal")
    public String tanggal;

    @ColumnInfo(name = "jlhBenar")
    public int jlhBenar;


    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJlhBenar() {
        return jlhBenar;
    }

    public void setJlhBenar(int jlhBenar) {
        this.jlhBenar = jlhBenar;
    }
}
