package com.example.android.conde.com.onenoteredesign.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android.conde.com.onenoteredesign.Adapter.StickyNotesRecyclerAdapter;
import com.example.android.conde.com.onenoteredesign.R;
import com.example.android.conde.com.onenoteredesign.util.DummyData;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class StickyNoteFragment extends Fragment implements View.OnClickListener {

    private RecyclerView mStickyNotesRecyclerView;
    private FloatingActionButton mFabAddStickyNote;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sticky_note, container, false);
        mStickyNotesRecyclerView = view.findViewById(R.id.recyclerView);
        mFabAddStickyNote = view.findViewById(R.id.fab_add_sticky_note);
        initRecyclerView();
        return view;
    }

    private void initRecyclerView(){
        StickyNotesRecyclerAdapter adapter =
                new StickyNotesRecyclerAdapter(DummyData.generateStickyNotes());
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        mStickyNotesRecyclerView.setLayoutManager(manager);
        mStickyNotesRecyclerView.setAdapter(adapter);
    }

    @Override
    public void onClick(View view) {
        Snackbar.make(mFabAddStickyNote, "Add", Snackbar.LENGTH_SHORT).show();
    }
}
