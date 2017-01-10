package com.gsl.gsl.gtalkpbx.contactlist;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gsl.gsl.gtalkpbx.R;
import com.gsl.gsl.gtalkpbx.contactlist.adapters.AdapterContactList;

import java.util.Arrays;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private AdapterContactList mAdapterContactList;
    private String[] items = {"A","B","C","D","E","F","G","H","I"};

    public ContactListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_list, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewContactList);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapterContactList = new AdapterContactList(getActivity(), Arrays.asList(items));
        mRecyclerView.setAdapter(mAdapterContactList);

        return view;
    }

}
