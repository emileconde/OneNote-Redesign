package com.example.android.conde.com.onenoteredesign.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.conde.com.onenoteredesign.Adapter.NotebooksRecyclerAdapter;
import com.example.android.conde.com.onenoteredesign.R;
import com.example.android.conde.com.onenoteredesign.util.DummyData;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NotebookFragment extends Fragment {

    private RecyclerView notebookRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notebook, container, false);
        notebookRecyclerView = view.findViewById(R.id.recyclerView);
        initRecyclerView();
        return view;
    }


    private void initRecyclerView(){
        NotebooksRecyclerAdapter adapter =
                new NotebooksRecyclerAdapter(new DummyData(getContext()).generateNotebooks(), getContext());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        notebookRecyclerView.setLayoutManager(layoutManager);
        notebookRecyclerView.setAdapter(adapter);
    }


}
