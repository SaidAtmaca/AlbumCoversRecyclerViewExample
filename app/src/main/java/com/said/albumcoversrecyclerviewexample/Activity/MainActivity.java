package com.said.albumcoversrecyclerviewexample.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.said.albumcoversrecyclerviewexample.Adapter.AlbumRowAdapter;
import com.said.albumcoversrecyclerviewexample.Model.AlbumRow;
import com.said.albumcoversrecyclerviewexample.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<AlbumRow> albumRowArrayList;
    RecyclerView recyclerView;
    AlbumRowAdapter albumRowAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewSettings();
        fillTheArrayList();
    }


    public void fillTheArrayList(){

        albumRowArrayList.add(new AlbumRow("Nirvana","Nevermind","1991",R.drawable.nirvana));
        albumRowArrayList.add(new AlbumRow("AC/DC","Let There Be Rock","1977",R.drawable.acdc));
        albumRowArrayList.add(new AlbumRow("John Lennon","Art Record Covers","1986",R.drawable.johnlennon));
        albumRowArrayList.add(new AlbumRow("The Beatles","Abbey Road","1969",R.drawable.beatles));
        albumRowArrayList.add(new AlbumRow("Pink Floyd","The Dark Side Of The Moon","1973",R.drawable.pinkfloyd));
        albumRowArrayList.add(new AlbumRow("Troye Sivan","Blue Neighbourhood","2015",R.drawable.troyeswan));
        albumRowArrayList.add(new AlbumRow("Arctic Monkeys","Suck It And See","2011",R.drawable.arcticmonkeys));
        albumRowArrayList.add(new AlbumRow("Metallica","Master of Puppets","1986",R.drawable.metallica));
        albumRowArrayList.add(new AlbumRow("Queen","The Miracle","1989",R.drawable.queen));
    }



    public void viewSettings(){
        recyclerView=findViewById(R.id.recyclerView);
        albumRowArrayList=new ArrayList<>();
        albumRowAdapter= new AlbumRowAdapter(albumRowArrayList);
        recyclerView.setAdapter(albumRowAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}