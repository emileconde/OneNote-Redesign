package com.example.android.conde.com.onenoteredesign.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.android.conde.com.onenoteredesign.R;
import com.example.android.conde.com.onenoteredesign.models.Notebook;
import com.example.android.conde.com.onenoteredesign.util.RandomColorGenerator;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NotebooksRecyclerAdapter extends
        RecyclerView.Adapter<NotebooksRecyclerAdapter.NotebooksViewHolder> {


    private List<Notebook> mNotebookList;
    private Context mContext;

    public NotebooksRecyclerAdapter(List<Notebook> notebookList, Context context) {
        mNotebookList = notebookList;
        mContext = context;
    }


    @NonNull
    @Override
    public NotebooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notebook_item_layout, parent, false);
        return new NotebooksViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull NotebooksViewHolder holder, int position) {
        Notebook notebook = mNotebookList.get(position);
        holder.bind(notebook);
    }



    @Override
    public int getItemCount() {
        return mNotebookList != null ? mNotebookList.size() : 0;
    }




    class NotebooksViewHolder extends RecyclerView.ViewHolder{
        private ImageView mImageView;
        private TextView mTitleTextView;
        NotebooksViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.iv_notebook_icon);
            mTitleTextView = itemView.findViewById(R.id.tv_notebook_title);
        }


        void bind(Notebook notebook){
            Glide.with(mContext)
                    .load(notebook.getIcon())
                    .into(mImageView);

            mTitleTextView.setText(notebook.getTitle());

            int color = RandomColorGenerator.generateColor();

            mImageView.setColorFilter((color),
                    android.graphics.PorterDuff.Mode.SRC_IN);


        }


    }



}
