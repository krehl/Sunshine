package de.kkrehl.udacity.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;
    ListView listView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> weatherData = new ArrayList<String>();
        weatherData.add("Today - Sunny - 88 / 63");
        weatherData.add("Tomorrow - Foggy - 10 / 46");
        weatherData.add("Weds - Cloudy - 72 / 63");
        weatherData.add("Thurs - Rainy - 64 / 51");
        weatherData.add("Fri - Foggy - 70 / 46");
        weatherData.add("Sat - Sunny - 76 / 68");

        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast,R.id.list_item_forecast_textView,weatherData);
        listView = (ListView) rootView.findViewById(R.id.listView_forecast);
        listView.setAdapter(mForecastAdapter);

        return rootView;
    }
}
