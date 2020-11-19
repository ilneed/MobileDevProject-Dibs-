package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.project.mobiledevprojectdibs.ui.home.HomeFragment;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SellerProfile#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SellerProfile extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SellerProfile() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SellerProfile.
     */
    // TODO: Rename and change types and number of parameters
    public static SellerProfile newInstance(String param1, String param2) {
        SellerProfile fragment = new SellerProfile();
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
    ImageButton closeButton;
    TextView sellerLocation, sellerName;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_seller_profile, container, false);

        sellerName = root.findViewById(R.id.sellerProfileName);
        sellerLocation = root.findViewById(R.id.sellerProfileLocation);
        Bundle bundle = this.getArguments();
        String sName = bundle.getString("sellerName");
        String sLocation = bundle.getString("sellerLocation");
        sellerName.setText(sName);
        sellerLocation.setText(sLocation);

        closeButton = root.findViewById(R.id.backButtonSP);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFragment = new HomeFragment();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.sellerProfile,homeFragment);
                transaction.commit();
            }
        });

        return root;
    }
}