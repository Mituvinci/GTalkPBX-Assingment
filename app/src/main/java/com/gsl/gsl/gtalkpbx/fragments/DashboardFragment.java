package com.gsl.gsl.gtalkpbx.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsl.gsl.gtalkpbx.R;
import com.gsl.gsl.gtalkpbx.adapter.AdapterItem;

import java.util.Arrays;


public class DashboardFragment extends Fragment {


    private RecyclerView mRecyclerView;
    private AdapterItem mAdapterItem;
    private String[] items = {"Demo","Dhaka","Genusys","Home Office","HR & Admin","PBX_MP","Technical","Undefined","Lab Plexstar"};



    public DashboardFragment() {
        // Required empty public constructor
    }


    public static DashboardFragment newInstance(String param1, String param2) {
        DashboardFragment fragment = new DashboardFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapterItem = new AdapterItem(getActivity(), Arrays.asList(items));
        mRecyclerView.setAdapter(mAdapterItem);


        return view;
    }

}
