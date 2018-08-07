package inc.machine_code.recyclerview;

import android.app.LauncherActivity;
import android.graphics.Bitmap;

import java.io.Serializable;

public class CountryList extends LauncherActivity.ListItem implements Serializable{

    private int id;
    private String CountryName;
    private String SatelliteCount;
    private int image;

    public CountryList(int id, String countryName, String satelliteCount, int image) {
        this.id = id;
        CountryName = countryName;
        SatelliteCount = satelliteCount;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }

    public String getSatelliteCount() {
        return SatelliteCount;
    }

    public void setSatelliteCount(String satelliteCount) {
        SatelliteCount = satelliteCount;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getImage() {
        return image;
    }

}
