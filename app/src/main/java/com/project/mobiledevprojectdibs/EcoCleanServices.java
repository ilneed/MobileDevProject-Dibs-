package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TableRow;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EcoCleanServices#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EcoCleanServices extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EcoCleanServices() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EcoCleanServices.
     */
    // TODO: Rename and change types and number of parameters
    public static EcoCleanServices newInstance(String param1, String param2) {
        EcoCleanServices fragment = new EcoCleanServices();
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
    ImageButton backButton;
    TableRow productSeller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_eco_clean_services, container, false);
        backButton = root.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceCategoryy serviceCategoryy = new ServiceCategoryy();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.ecoCleanServices,serviceCategoryy);
                transaction.commit();
            }
        });
        productSeller = root.findViewById(R.id.productSeller);
        productSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SellerProfile sellerProfile = new SellerProfile();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.ecoCleanServices, sellerProfile);
                transaction.commit();
            }
        });
        return root;
    }
}