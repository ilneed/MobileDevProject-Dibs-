package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CaliforniaMaki#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CaliforniaMaki extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CaliforniaMaki() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CaliforniaMaki.
     */
    // TODO: Rename and change types and number of parameters
    public static CaliforniaMaki newInstance(String param1, String param2) {
        CaliforniaMaki fragment = new CaliforniaMaki();
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
    Button orderButton;
    TextView productLabel, productPrice, sellerName, sellerLocation;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_california_maki, container, false);
        backButton = root.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodCategoryy foodCategoryy = new FoodCategoryy();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.californiaMaki,foodCategoryy);
                transaction.commit();
            }
        });
        productSeller = root.findViewById(R.id.productSeller);
        sellerName = root.findViewById(R.id.sellername);
        sellerLocation = root.findViewById(R.id.sellerlocation);
        productSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sName = sellerName.getText().toString();
                String sLocation = sellerLocation.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("sellerName",sName);
                bundle.putString("sellerLocation",sLocation);
                SellerProfile sellerProfile = new SellerProfile();
                sellerProfile.setArguments(bundle);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.californiaMaki, sellerProfile);
                transaction.commit();
            }
        });
        orderButton = root.findViewById(R.id.orderButton);
        productLabel = root.findViewById(R.id.selleritemlabel);
        productPrice = root.findViewById(R.id.selleritemprice);
        orderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String label = productLabel.getText().toString();
                String price = productPrice.getText().toString();
                Bundle bundle = new Bundle();
                bundle.putString("label",label);
                bundle.putString("price",price);
                OrderInterface orderInterface = new OrderInterface();
                orderInterface.setArguments(bundle);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.californiaMaki, orderInterface);
                transaction.commit();
            }
        });
        return root;
    }
}