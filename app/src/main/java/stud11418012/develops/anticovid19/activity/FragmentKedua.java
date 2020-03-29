package stud11418012.develops.anticovid19.activity;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import stud11418012.develops.anticovid19.R;


public class FragmentKedua extends Fragment {
    private Button btnnext2;
    private Button btnback1;

    public FragmentKedua(){}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kedua, container, false);
        ((Pengecekan) getActivity()).getSupportActionBar().setTitle("AntiCOVID19");
        ((Pengecekan) getActivity()).getSupportActionBar().setSubtitle("Pengecekan");
        ((Pengecekan) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnnext2 = (Button) view.findViewById(R.id.btnnext2);
        btnback1 = (Button) view.findViewById(R.id.btnback1);

        setHasOptionsMenu(true);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentKetiga fragmentKetiga = new FragmentKetiga();

                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_content, fragmentKetiga)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });
    }
}
