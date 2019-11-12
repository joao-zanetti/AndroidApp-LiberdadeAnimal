package com.alo.liberdadeanimal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
  Developed by João Zanetti on 12/10/2016.
 */
public class FourthFragment extends Fragment {

    private ImageView imageView;

    private static final String ARG_SECTION_NUMBER = "section_number";


    public FourthFragment() {
    }

    public static FourthFragment newInstance(int position){
        FourthFragment fragment= new FourthFragment();
        Bundle args= new Bundle();
        args.putInt(ARG_SECTION_NUMBER,position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_fourth, container, false);


        return rootView;
    }
}
