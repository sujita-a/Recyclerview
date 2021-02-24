package edu.tu.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv = (RecyclerView) findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        String arr[] = {"C", "C++", "Java", ".Net", "Javascript", "PHP", "Python","C", "C++", "Java", ".Net", "Javascript", "PHP", "Python","C", "C++", "Java", ".Net", "Javascript", "PHP", "Python"};
        rcv.setAdapter(new myAdapter(arr));
    }
}