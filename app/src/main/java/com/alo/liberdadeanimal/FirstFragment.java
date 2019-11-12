package com.alo.liberdadeanimal;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
  Developed by João Zanetti on 12/10/2016.
 */
public class FirstFragment extends Fragment {

    private ImageView imageView;

    private static final String ARG_SECTION_NUMBER = "section_number";

    public FirstFragment() {
    }

    public static FirstFragment newInstance(int position){
        FirstFragment fragment= new FirstFragment();
        Bundle args= new Bundle();
        args.putInt(ARG_SECTION_NUMBER,position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        imageView = (ImageView)getView().findViewById(R.id.logo);
        final ViewPager pager = (ViewPager) getActivity().findViewById(R.id.pager);

        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);

        // faz findvyew by id
        // seta listeners

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

}
