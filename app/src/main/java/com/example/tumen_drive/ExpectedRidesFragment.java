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


public class ExpectedRidesFragment extends Fragment {

    private List<Companion> companionList;
    private CompanionAdapter companionAdapter;
    private RecyclerView recyclerView;


    public ExpectedRidesFragment() {
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
        companionList.add(new Companion("Настя", 2, 5, 12, "Центральный район",
                "Хотим посетить Дом Обороны", "15:20"));
        companionList.add(new Companion("Дима", 2, 2, 15, "Центральный район",
                "Я в Тюмени недавно. Хочу ознакомиться с районом, найти друзей", "16:50"));
        companionAdapter = new CompanionAdapter(companionList, ExpectedRidesFragment.class.toString());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(companionAdapter);
    }
}