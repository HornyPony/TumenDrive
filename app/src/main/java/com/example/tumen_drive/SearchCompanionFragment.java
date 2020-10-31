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
        companionList.add(new Companion("Витя", 2, 3, 6, "Центральный",
                        "Хочу проехаться по Профсоюзной", "16:35"));
        companionList.add(new Companion("Алена", 2, 3, 12, "Центральный",
                "Хочу проехаться по району, заценить велодорожки", "19:35"));
        companionList.add(new Companion("Артем", 4, 7, 20, "Ленинский",
                "Ищу друзей для постоянных вело-прогулок", "20:35"));
        companionList.add(new Companion("Алексей", 1, 6, 12, "Центральный",
                "На Профсоюзной открыли новые вело-дорожки. Заценим?", "17:35"));
        companionAdapter = new CompanionAdapter(companionList, SearchCompanionFragment.class.toString());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(companionAdapter);
    }
}