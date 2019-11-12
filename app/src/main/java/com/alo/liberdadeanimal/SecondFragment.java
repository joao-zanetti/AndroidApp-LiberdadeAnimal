package com.alo.liberdadeanimal;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;


/**
  Developed by João Zanetti on 12/10/2016.
 */
public class SecondFragment extends Fragment  {

    private SearchView sv;
    private ListView lv;

    private static final String ARG_SECTION_NUMBER = "section_number";

    //this is one example.
    String[] empresas= {"Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA","Mcdonalds  NÃO TESTA",
            "Avon              TESTA","Avon              TESTA","Avon              TESTA","Avon              TESTA","Avon              TESTA","Avon              TESTA"};
    //You can create one function to fill the vector of companies (empresas[])

    ArrayAdapter<String> adapter;

    public SecondFragment() {
    }

    public static SecondFragment newInstance(int position){
        SecondFragment fragment= new SecondFragment();
        Bundle args= new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        lv=(ListView)getView().findViewById(R.id.listview1);
        sv=(SearchView)getView().findViewById(R.id.search1);


        adapter= new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,empresas) {



                        @Override
                        public View getView(int position, View convertView, ViewGroup parent) {

                            View view = super.getView(position, convertView, parent);
                            TextView text = (TextView) view.findViewById(android.R.id.text1);
                            text.setTextColor(Color.parseColor("#d5696264"));

                            return view;
                        }
                    };


        lv.setAdapter(adapter);

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_second, container, false);

        return rootView;
    }




}
