package inc.machine_code.recyclerview.SatelliteCat;

import android.app.LauncherActivity;

import java.io.Serializable;

public class Satellite extends LauncherActivity.ListItem implements Serializable {

  private int Code_No;
    private String Name;
    private String Code_Name;
    private String Date;
    private int image;

    public Satellite(int code_No, String name, String code_Name, String date, int image) {
        Code_No = code_No;
        Name = name;
        Code_Name = code_Name;
        Date = date;
        this.image = image;
    }

    public int getCode_No() {
        return Code_No;
    }

    public void setCode_No(int code_No) {
        Code_No = code_No;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCode_Name() {
        return Code_Name;
    }

    public void setCode_Name(String code_Name) {
        Code_Name = code_Name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
