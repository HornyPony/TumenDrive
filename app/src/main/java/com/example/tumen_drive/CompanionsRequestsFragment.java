package com.example.tumen_drive;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class CompanionsRequestsFragment extends Fragment {


    private List<Companion> companionList;
    private CompanionAdapter companionAdapter;
    private RecyclerView recyclerView;


    public CompanionsRequestsFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_search_companion, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        companionList = new ArrayList<>();

        recyclerView = view.findViewById(R.id.companionsRecyclerView);
        companionList.add(new Companion("Наташа", 4, 6, 21, "Ленинский",
                "Куда угодно в пределах района", "13:40"));
        companionList.add(new Companion("Роман", 6, 9, 25, "Ленинский",
                "Большой компанией прокатиться по району", "19:30"));
        companionList.add(new Companion("Олег", 1, 3, 12, "Восточный",
                "Съездить за шаурмой в компании новых знакомых", "12:40"));
        companionAdapter = new CompanionAdapter(companionList, CompanionsRequestsFragment.class.toString());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(companionAdapter);
    }
}