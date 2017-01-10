package com.gsl.gsl.gtalkpbx.calllogg;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsl.gsl.gtalkpbx.R;
import com.gsl.gsl.gtalkpbx.calllogg.adapter.AdapterCallLogList;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class CallLoggFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private AdapterCallLogList mAdapterCallLogList;
    private String[] items = {"189","258","145","456","798","456","741","159","126"};



    public CallLoggFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call_logg, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewCallList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapterCallLogList = new AdapterCallLogList(getActivity(), Arrays.asList(items));
        mRecyclerView.setAdapter(mAdapterCallLogList);
        return view;
    }

}
