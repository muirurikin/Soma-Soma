package com.somasoma.harrymalex.somasoma.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.somasoma.harrymalex.somasoma.R;

/**
 * Created by mark2 on 28/09/16.
 */

public class QuizesFragment  extends android.support.v4.app.Fragment{

    // The onCreateView method is called when Fragment should create its View object hierarchy,
    // either dynamically or via XML layout inflation.
    View mview;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        mview = inflater.inflate(R.layout.fragment_quiz, parent, false);
        ///return inflater.inflate(R.layout.fragment_quiz, parent, false);
        return mview;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }

}
