package com.baishakhee.fragmenttofragmetpassdata;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    TextView name,phone;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view=inflater.inflate(R.layout.fragment_second, container, false);

        name=view.findViewById(R.id.name);
        phone=view.findViewById(R.id.phone);
        String userName ;
        String userPhone;
        Bundle bundle=this.getArguments();
        if( bundle != null) {
             userName = bundle.getString("userName");
             userPhone = bundle.getString("userPhone");
            System.out.println("sOrder.......name....."+userName);
            Log.d(TAG,userName);
            name.setText(userName);
            phone.setText(userPhone);
            System.out.println("sOrder.......name....."+name.getText().toString());
            System.out.println("sOrder.......phone......."+phone.getText().toString());
        }else {
            name.setText("userName");
            phone.setText("userPhone");
        }


        // Inflate the layout for this fragment
        return view;
    }
}