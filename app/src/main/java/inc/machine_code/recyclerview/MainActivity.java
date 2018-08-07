package inc.machine_code.recyclerview;

import android.app.SearchManager;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import android.support.v7.widget.SearchView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import inc.machine_code.recyclerview.SatelliteCat.Satellite;

public class MainActivity extends AppCompatActivity implements CountryAdapter.ICallback, Serializable {

    ArrayList<CountryList> countryList = new ArrayList<>();
    List<Satellite> satellieList = new ArrayList<>();
    CountryAdapter adapter;
    private RecyclerView mRecyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        initRecyclerViewList();

        adapter = new CountryAdapter(this, countryList);

        mRecyclerView.setAdapter(adapter);
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                adapter.getFilter().filter(newText);
//                return false;
//            }
//        });


    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menuitem, menu);
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView;
        searchView = (SearchView) menu.findItem(R.id.menu_search).getActionView();
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {

                adapter.getFilter().filter(query);
                return false;
            }
        });
        return true;
    }


    private void initRecyclerViewList() {
        countryList.add(new CountryList(1, "ALGERIA", "6", R.mipmap.ic_algeria_foreground));
        countryList.add(new CountryList(2, "ARGENTINA", "18", R.mipmap.ic_argentina_foreground));
        countryList.add(new CountryList(3, "AUSTRALIA", "21", R.mipmap.ic_australia_foreground));
        countryList.add(new CountryList(4, "AZERBAIJAN", "1", R.mipmap.ic_azerbaijan_foreground));
        countryList.add(new CountryList(5, "BELARUS", "2", R.mipmap.ic_belarus_foreground));
        countryList.add(new CountryList(6, "BOLIVIA", "1", R.mipmap.ic_bolivia_foreground));
        countryList.add(new CountryList(7, "BRAZIL", "17", R.mipmap.ic_brazil_foreground));
        countryList.add(new CountryList(8, "BULGARIA", "1", R.mipmap.ic_bulgaria_foreground));
        countryList.add(new CountryList(9, "CANADA", "48", R.mipmap.ic_canada_foreground));
        countryList.add(new CountryList(10, "CHILE", "3", R.mipmap.ic_chile_foreground));
        countryList.add(new CountryList(11, "CHINA", "296", R.mipmap.ic_china_foreground));
        countryList.add(new CountryList(12, "CZECHIA", "3", R.mipmap.ic_czechia_foreground));
        countryList.add(new CountryList(13, "DENMARK", "9", R.mipmap.ic_denmark_foreground));
        countryList.add(new CountryList(14, "ECUADOR", "2", R.mipmap.ic_ecuador_foreground));
        countryList.add(new CountryList(15, "EGYPT", "5", R.mipmap.ic_egypt_foreground));
        countryList.add(new CountryList(16, "ESTONIA", "1", R.mipmap.ic_estonia_foreground));
        countryList.add(new CountryList(17, "FRANCE", "68", R.mipmap.ic_france_foreground));
        countryList.add(new CountryList(18, "GERMANY", "52", R.mipmap.ic_germany_foreground));
        countryList.add(new CountryList(19, "GREECE", "4", R.mipmap.ic_greece_foreground));
        countryList.add(new CountryList(20, "INDIA", "88", R.mipmap.ic_india_foreground));
        countryList.add(new CountryList(21, "INDONESIA", "16", R.mipmap.ic_indonesia_foreground));
        countryList.add(new CountryList(22, "IRAN", "1", R.mipmap.ic_iran_foreground));
        countryList.add(new CountryList(23, "IRAQ", "1", R.mipmap.ic_iraq_foreground));
        countryList.add(new CountryList(24, "ISRAEL", "17", R.mipmap.ic_israel_foreground));
        countryList.add(new CountryList(25, "ITALY", "27", R.mipmap.ic_italy_foreground));
        countryList.add(new CountryList(26, "JAPAN", "173", R.mipmap.ic_japan_foreground));
        countryList.add(new CountryList(27, "KAZAKHSTAN", "6", R.mipmap.ic_kazakhstan_foreground));
        countryList.add(new CountryList(28, "LAOS", "1", R.mipmap.ic_laos_foreground));
        countryList.add(new CountryList(29, "LATVIA", "1", R.mipmap.ic_latvia_foreground));
        countryList.add(new CountryList(30, "LITHUANIA", "1", R.mipmap.ic_lithuania_foreground));
        countryList.add(new CountryList(31, "LUXEMBOURG", "4", R.mipmap.ic_luxembourg_foreground));
        countryList.add(new CountryList(32, "MALAYSIA", "7", R.mipmap.ic_malaysia_foreground));
        countryList.add(new CountryList(33, "MEXICO", "12", R.mipmap.ic_mexico_foreground));
        countryList.add(new CountryList(34, "MOROCCO", "1", R.mipmap.ic_morocco_foreground));
        countryList.add(new CountryList(35, "NETHERLANDS", "6", R.mipmap.ic_netherlands_foreground));
        countryList.add(new CountryList(36, "NIGERIA", "6", R.mipmap.ic_nigeria_foreground));
        countryList.add(new CountryList(37, "NORTH KOREA", "2", R.mipmap.ic_north_korea_foreground));
        countryList.add(new CountryList(38, "NORTH KOREA", "2", R.mipmap.ic_norway_foreground));
        countryList.add(new CountryList(39, "PAKISTAN", "3", R.mipmap.ic_pakistan_foreground));
        countryList.add(new CountryList(40, "PERU", "1", R.mipmap.ic_peru_foreground));
        countryList.add(new CountryList(41, "PHILIPPINES", "2", R.mipmap.ic_philippines_foreground));
        countryList.add(new CountryList(42, "POLAND", "2", R.mipmap.ic_poland_foreground));
        countryList.add(new CountryList(43, "PORTUGAL", "2", R.mipmap.ic_portugal_foreground));
        countryList.add(new CountryList(44, "RUSSIA", "1505", R.mipmap.ic_russia_foreground));
        countryList.add(new CountryList(45, "SAUDI ARABIA", "13", R.mipmap.ic_saudi_arabia_foreground));
        countryList.add(new CountryList(46, "SINGAPORE", "9", R.mipmap.ic_singapore_foreground));
        countryList.add(new CountryList(47, "SLOVAKIA", "1", R.mipmap.ic_slovakia_foreground));
        countryList.add(new CountryList(48, "SOUTH AFRICA", "6", R.mipmap.ic_south_africa_foreground));
        countryList.add(new CountryList(49, "SOUTH KOREA", "24", R.mipmap.ic_south_korea_foreground));
        countryList.add(new CountryList(50, "SPAIN", "23", R.mipmap.ic_spain_foreground));
        countryList.add(new CountryList(51, "SWEDEN", "12", R.mipmap.ic_sweden_foreground));
        countryList.add(new CountryList(52, "TAIWAN", "9", R.mipmap.ic_taiwan_foreground));
        countryList.add(new CountryList(53, "THAILAND", "9", R.mipmap.ic_thailand_foreground));
        countryList.add(new CountryList(54, "TURKEY", "14", R.mipmap.ic_turkey_foreground));
        countryList.add(new CountryList(55, "UNITED ARAB EMIRATES", "9", R.mipmap.ic_united_arab_emirates_foreground));
        countryList.add(new CountryList(56, "UNITED KINGDOM", "42", R.mipmap.ic_united_kingdom_foreground));
        countryList.add(new CountryList(57, "USA", "1619", R.mipmap.ic_united_states_of_america_foreground));
        countryList.add(new CountryList(58, "URUGUAY", "1", R.mipmap.ic_uruguay_foreground));
        countryList.add(new CountryList(59, "VENEZUELA", "3", R.mipmap.ic_venezuela_foreground));
        countryList.add(new CountryList(60, "VIETNAM", "3", R.mipmap.ic_vietnam_foreground));

    }

    public List<Satellite> Listall() {
        satellieList.clear();
        satellieList.add(new Satellite(10, "ddddd", "ddddd", "101010", R.mipmap.anothertest_photo_foreground));
        satellieList.add(new Satellite(10, "ddddd", "ddddd", "101010", R.mipmap.ic_kazakhstan_foreground));

        return satellieList;

    }

    @Override
    public void inClickEvent(CountryList country) {

        Intent intent = new Intent(this, SecondActivity.class);

        switch (country.getId()) {
            case 1:
                intent.putExtra("savedUser", (Serializable) Listall());
                onStateNotSaved();
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("savedUser", (Serializable) Listall());
                onStateNotSaved();
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("savedUser", (Serializable) Listall());
                onStateNotSaved();
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("savedUser", (Serializable) Listall());
                startActivity(intent);
                break;


        }
    }

}

