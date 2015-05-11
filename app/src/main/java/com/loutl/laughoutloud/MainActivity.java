package com.loutl.laughoutloud;

        import android.graphics.Typeface;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarActivity;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;
        import android.app.Activity;

public class MainActivity extends ActionBarActivity {
    ListView list;
    String[] web = {
            "Love Jokes",
            "The Joker",
            "Childhood Jokes",
            "GHCoats",
            "LoutL Daily",
            "Yo Mama Jokes",
            "Naija Quotes"
    } ;
    Integer[] imageId = {
            R.drawable.mat,
            R.drawable.joker,
            R.drawable.des,
            R.drawable.gh,
            R.drawable.naija,
            R.drawable.yomama,
            R.drawable.ni

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//// Font path2
//        String f2 = "fonts/Raleway-Italic.ttf";
//
//        // text view label
//        TextView txt = (TextView) findViewById(R.id.txt);
//
//        // Loading Font Face
//        Typeface tf2 = Typeface.createFromAsset(getAssets(), f2);
//
//        // Applying font
//        txt.setTypeface(tf2);
        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }

}