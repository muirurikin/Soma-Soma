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

public class QuestionsFragment extends Fragment{


    View mview;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);

        mview=inflater.inflate(R.layout.fragment_questions, container, false);
        return mview;
    }
}
