package com.project.mobiledevprojectdibs;

import android.os.Bundle;

import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
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
 * Use the {@link FriedChicken#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FriedChicken extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FriedChicken() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FriedChicken.
     */
    // TODO: Rename and change types and number of parameters
    public static FriedChicken newInstance(String param1, String param2) {
        FriedChicken fragment = new FriedChicken();
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
    Button buttonOrder;
    TextView productLabel, productPrice;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_fried_chicken, container, false);
        backButton = root.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FoodCategoryy foodCategoryy = new FoodCategoryy();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.friedChicken,foodCategoryy);
                transaction.commit();
            }
        });
        productSeller = root.findViewById(R.id.productSeller);
        productSeller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SellerProfile sellerProfile = new SellerProfile();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.friedChicken, sellerProfile);
                transaction.commit();
            }
        });
        productLabel = root.findViewById(R.id.sellItemLabel);
        productPrice = root.findViewById(R.id.sellItemPrice);

        buttonOrder = root.findViewById(R.id.orderButton);
        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewOrderInterface newOrderInterface = new NewOrderInterface();
                Bundle orderDetails = new Bundle();
                orderDetails.putString("nameOfProduct",productLabel.getText().toString());
                orderDetails.putString("priceOfProduct",productPrice.getText().toString());
                newOrderInterface.setArguments(orderDetails);
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.friedChicken,newOrderInterface);
                transaction.commit();
            }
        });
        return root;
    }

}