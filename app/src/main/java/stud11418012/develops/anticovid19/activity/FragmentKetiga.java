package stud11418012.develops.anticovid19.activity;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import stud11418012.develops.anticovid19.R;

public class FragmentKetiga extends Fragment {

    private Button btnnext3;
    private Button btnback2;
    public FragmentKetiga(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ketiga, container, false);
        ((Pengecekan) getActivity()).getSupportActionBar().setTitle("AntiCOVID19");
        ((Pengecekan) getActivity()).getSupportActionBar().setSubtitle("pengecekan");
        ((Pengecekan) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnnext3 = (Button) view.findViewById(R.id.btnnext3);
        btnback2 = (Button) view.findViewById(R.id.btnback2);

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnnext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentKeempat fragmentKeempat = new FragmentKeempat();

                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_content, fragmentKeempat)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
    }

}
