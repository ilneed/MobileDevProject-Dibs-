package com.project.mobiledevprojectdibs;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TableRow;

import com.project.mobiledevprojectdibs.ui.home.HomeViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MyProducts#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MyProducts extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public MyProducts() {
        // Required empty public constructor
    }



    public static MyProducts newInstance(String param1, String param2) {
        MyProducts fragment = new MyProducts();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }

    ImageButton editButton;
    private HomeViewModel homeViewModel;
    TableRow myProductOne;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
      View root = inflater.inflate(R.layout.fragment_my_products, container, false);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                //textView.setText(s);

            }
        });

      editButton = root.findViewById(R.id.editimage1);
      editButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent in = new Intent(getActivity(),EditMyProduct.class);
              startActivity(in);
          }
      });

      myProductOne = root.findViewById(R.id.productOneTable);

      myProductOne.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              PerProductInterface perProductInterface = new PerProductInterface();
              FragmentTransaction transaction = getFragmentManager().beginTransaction();
              transaction.replace(R.id.myProducts,perProductInterface);
              transaction.commit();
          }
      });


    return root;
    }
}