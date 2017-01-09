package com.gsl.gsl.gtalkpbx.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsl.gsl.gtalkpbx.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialerFragment extends Fragment {


    public DialerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dialer, container, false);

        return  view;
    }

}
