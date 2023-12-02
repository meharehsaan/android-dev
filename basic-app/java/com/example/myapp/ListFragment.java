package com.example.myapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {

    private static final String ARG_NAME = "Name";
    private static final String ARG_COUNTRY = "Country";

    private String name;
    private String country;

    public ListFragment() {

    }

    public static ListFragment newInstance(String name, String country) {
        ListFragment fragment = new ListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        args.putString(ARG_COUNTRY, country);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_NAME);
            country = getArguments().getString(ARG_COUNTRY);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView nameTextView = view.findViewById(R.id.nameTextView);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView countryTextView = view.findViewById(R.id.countryTextView);

        nameTextView.setText(name);
        countryTextView.setText(country);

        return view;
    }
}