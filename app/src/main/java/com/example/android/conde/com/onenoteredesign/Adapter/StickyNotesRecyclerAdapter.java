package com.example.android.conde.com.onenoteredesign.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.conde.com.onenoteredesign.R;
import com.example.android.conde.com.onenoteredesign.models.StickyNote;
import com.example.android.conde.com.onenoteredesign.util.RandomColorGenerator;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StickyNotesRecyclerAdapter extends
        RecyclerView.Adapter<StickyNotesRecyclerAdapter.StickyNotesViewHolder> {

    private List<StickyNote> mStickyNoteList;

    public StickyNotesRecyclerAdapter(List<StickyNote> stickyNoteList) {
        mStickyNoteList = stickyNoteList;
    }

    @NonNull
    @Override
    public StickyNotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sticky_note_item_layout, parent, false);
        return new StickyNotesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StickyNotesViewHolder holder, int position) {
        StickyNote stickyNote = mStickyNoteList.get(position);
        holder.bind(stickyNote);
    }

    @Override
    public int getItemCount() {
        return mStickyNoteList != null ? mStickyNoteList.size() : 0;
    }


    class StickyNotesViewHolder extends RecyclerView.ViewHolder{

        private TextView mStickyNoteTextView;

        StickyNotesViewHolder(@NonNull View itemView) {
            super(itemView);
            mStickyNoteTextView = itemView.findViewById(R.id.tv_sticky_note);
        }

            void bind(StickyNote stickyNote){
            mStickyNoteTextView.setText(stickyNote.getContent());
            mStickyNoteTextView.setBackgroundColor(RandomColorGenerator.generateColor());
        }
    }




}
