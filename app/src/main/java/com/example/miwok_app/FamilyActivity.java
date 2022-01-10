package com.example.miwok_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;



import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create an array to store words
        ArrayList<Word> words = new ArrayList<Word>();


        words.add(new Word("Father","әpә"));
        words.add(new Word("Mother","әṭa"));
        words.add(new Word("Son","angsi"));
        words.add(new Word("Daughter","tune"));
        words.add(new Word("older brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","tete"));
        words.add(new Word("younger sister","kolliti"));
        words.add(new Word("grandmother","ama"));
        words.add(new Word("grandfather","paapa"));

        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}