package stud11418012.develops.anticovid19.activity;

import android.content.Context;
import android.net.Uri;
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

public class  FragmentPertama extends Fragment {
    private Button btnnext1;

    public FragmentPertama(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pertama,container,false);
        ((Pengecekan) getActivity()).getSupportActionBar().setTitle("AntiCOVID19");
        ((Pengecekan) getActivity()).getSupportActionBar().setSubtitle("Pengecekan");
        ((Pengecekan) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        btnnext1 = view.findViewById(R.id.btnnext1);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        btnnext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentKedua fragmentKedua = new FragmentKedua();

                getFragmentManager().beginTransaction()
                        .replace(R.id.frame_content, fragmentKedua)
                        .addToBackStack(null)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                        .commit();
            }
        });
    }
}
