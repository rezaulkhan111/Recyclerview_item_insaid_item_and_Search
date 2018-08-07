package inc.machine_code.recyclerview;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import inc.machine_code.recyclerview.SatelliteCat.Satellite;
import inc.machine_code.recyclerview.SatelliteCat.SatelliteAdapter;

public class SecondActivity extends AppCompatActivity implements SatelliteAdapter.InterfaceCallback {
    List<Satellite> satellieList = new ArrayList<>();


    private RecyclerView mRecyclerView;


    //satellieList = satelli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mRecyclerView = findViewById(R.id.rv_country_name_flag);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        List<Satellite> satelli = (ArrayList<Satellite>) intent.getSerializableExtra("savedUser");
        satellieList = satelli;

        SatelliteAdapter adapter = new SatelliteAdapter(this, satellieList);
        mRecyclerView.setAdapter(adapter);


    }


    @Override
    public void inClickEvent(Satellite country) {
        Intent intent1 = new Intent(getApplicationContext(), SecondActivity.class);

        switch (country.getCode_No()) {
            case 1:

                startActivity(intent1);
                break;
        }
    }

}
