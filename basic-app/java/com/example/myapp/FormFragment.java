package com.example.myapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class FormFragment extends Fragment {

    public FormFragment() {
        // Required empty public constructor
    }

    public static Fragment newInstance() {
        return new FormFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_form, container, false);

        final EditText nameEditText = view.findViewById(R.id.nameEditText);
        final Spinner countrySpinner = view.findViewById(R.id.countrySpinner);
        Button submitButton = view.findViewById(R.id.submitButton);

        // Create an ArrayAdapter for the Spinner and populate it with country options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                requireContext(),
                R.array.countries_array, // Use a string array resource for country names
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(adapter);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String country = countrySpinner.getSelectedItem().toString();

                // Pass the data to the activity
                if (getActivity() instanceof dynfrag) {
                    ((dynfrag) getActivity()).loadListFragment(name, country);
                }
            }
        });

        return view;
    }
}