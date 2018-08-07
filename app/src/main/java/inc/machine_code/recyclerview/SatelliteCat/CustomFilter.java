package inc.machine_code.recyclerview.SatelliteCat;

import android.widget.Filter;

import java.util.ArrayList;
import java.util.List;

import inc.machine_code.recyclerview.CountryAdapter;
import inc.machine_code.recyclerview.CountryList;

public class CustomFilter extends Filter {

    ArrayList<CountryList> filterList;
    CountryAdapter adapter;

    public CustomFilter(ArrayList<CountryList> filterList, CountryAdapter filterlist) {
        this.filterList = filterList;
        this.adapter = filterlist;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults results = new FilterResults();

        if (constraint != null && constraint.length() > 0) {
            //CHANGE TO UPPER
            constraint = constraint.toString().toUpperCase();
            //STORE OUR FILTERED PLAYERS
            ArrayList<CountryList> filteredPlayers = new ArrayList<>();

            for (int i = 0; i < filterList.size(); i++) {
                //CHECK
                if (filterList.get(i).getCountryName().toUpperCase().contains(constraint)) {
                    //ADD PLAYER TO FILTERED PLAYERS
                    filteredPlayers.add(filterList.get(i));
                }
                if (filterList.get(i).getSatelliteCount().toUpperCase().contains(constraint)) {
                    filteredPlayers.add(filterList.get(i));
                }
            }

            results.count = filteredPlayers.size();
            results.values = filteredPlayers;
        } else {
            results.count = filterList.size();
            results.values = filterList;

        }

        return results;
    }

    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.countryList = (ArrayList<CountryList>) results.values;

        //REFRESH
        adapter.notifyDataSetChanged();
    }
}
