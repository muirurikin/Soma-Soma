package com.somasoma.harrymalex.somasoma.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.somasoma.harrymalex.somasoma.R;

/**
 * Created by mark2 on 29/09/16.
 */

public class LevelsFragment  extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.fragment_levels, parent, false);
    }

}
