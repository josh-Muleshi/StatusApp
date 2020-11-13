package cd.amateurMobileDev.statusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ListPojo> list;
    AdapterList adapterList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        listShow();

        adapterList = new AdapterList<>(this,list);
        listView.setAdapter(adapterList);

    }

    private void listShow() {
        list = new ArrayList<ListPojo>();

        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im4));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im1));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im5));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im7));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im8));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im9));
        list.add(new ListPojo("Afro", "my africa queen", R.drawable.ic_im10));

    }
}