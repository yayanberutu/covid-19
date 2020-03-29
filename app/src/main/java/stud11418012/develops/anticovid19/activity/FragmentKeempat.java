package stud11418012.develops.anticovid19.activity;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import stud11418012.develops.anticovid19.R;

public class FragmentKeempat extends Fragment {
   public FragmentKeempat(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_keempat, container, false);
        ((Pengecekan) getActivity()).getSupportActionBar().setTitle("AntiCOVID19");
        ((Pengecekan) getActivity()).getSupportActionBar().setSubtitle("pengecekan");
        ((Pengecekan) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setHasOptionsMenu(true);
        return view;
    }
}
