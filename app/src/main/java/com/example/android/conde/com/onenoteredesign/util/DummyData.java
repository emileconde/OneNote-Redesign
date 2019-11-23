package com.example.android.conde.com.onenoteredesign.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.example.android.conde.com.onenoteredesign.R;
import com.example.android.conde.com.onenoteredesign.models.Notebook;
import com.example.android.conde.com.onenoteredesign.models.StickyNote;

import java.util.ArrayList;
import java.util.List;

import androidx.core.content.ContextCompat;

public class DummyData {

    private Drawable mIcon;

    public DummyData(Context context){
        mIcon = ContextCompat.getDrawable(context, R.drawable.ic_book);
    }




    public List<Notebook> generateNotebooks(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(mIcon, "My Notebook"));
        notebooks.add(new Notebook(mIcon, "School"));
        notebooks.add(new Notebook(mIcon, "Books"));
        notebooks.add(new Notebook(mIcon, "Project"));
        notebooks.add(new Notebook(mIcon, "Blank Notebook"));
        notebooks.add(new Notebook(mIcon, "Diaries"));
        return notebooks;
    }



    public static List<StickyNote> generateStickyNotes(){
        List<StickyNote> stickyNotes = new ArrayList<>();
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" ));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));
        stickyNotes.add(new StickyNote("2:15pm", "Lorem Ipsum is simply dummy text of the printing" +
                " and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s" +
                ", when an unknown printer took a galley of type and scrambled it to make a type specimen book. " +
                "It has survived not only five centuries, but also the leap into electronic typesetting, " +
                "remaining essentially unchanged. "));




        return stickyNotes;
    }



}
