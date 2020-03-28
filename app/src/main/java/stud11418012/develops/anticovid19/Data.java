package stud11418012.develops.anticovid19;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "Person_table")
public class Data implements Serializable {

    public int getData;
    @PrimaryKey(autoGenerate = true)
    @NonNull

    @ColumnInfo(name = "id")
    private int id;
    @ColumnInfo(name = "nama")
    String nama;
    @ColumnInfo(name = "nim")
    String nim;
    @ColumnInfo(name = "Tempat Tanggal Lahir")
    String ttl;
    @ColumnInfo(name = "alamat")
    String alamat;
    @ColumnInfo(name = "Jenis Kelamin")
    String jeniskelamin;


    public Data(String datas) {
        nim = "11418012";
        nama= "Jessica";
        ttl ="Parapat, 20 Desember 2000";
        alamat ="Siborongborong";
        jeniskelamin="Perempuan";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJeniskelamin(){ return jeniskelamin;}

    public void setJeniskelamin(String jeniskelamin){ this.jeniskelamin=jeniskelamin;}
}