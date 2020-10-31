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


public class SearchCompanionFragment extends Fragment {
    private List<Companion> companionList;
    private CompanionAdapter companionAdapter;
    private RecyclerView recyclerView;


    public SearchCompanionFragment() {
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
        companionList.add(new Companion("Ivan", 4, 6, 43, "Советский",
                        "Площадь свободы, Корстон, ЦПКиО им. Горького", "3 часа"));
        companionList.add(new Companion("Ivan", 4, 6, 43, "Советский",
                "Площадь свободы, Корстон, ЦПКиО им. Горького", "3 часа"));
        companionList.add(new Companion("Ivan", 4, 6, 43, "Советский",
                "Площадь свободы, Корстон, ЦПКиО им. Горького", "3 часа"));
        companionList.add(new Companion("Ivan", 4, 6, 43, "Советский",
                "Площадь свободы, Корстон, ЦПКиО им. Горького", "3 часа"));
        companionAdapter = new CompanionAdapter(companionList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(companionAdapter);
    }
}