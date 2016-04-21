package ice_pbru.dangchoung.natchanon.electronicdevice01;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit

    private Button aboutmeButton;
    private ListView eleclistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind widget

        bindWidget();

        buttonController();

        createListView();
    }//Main Method

    private void createListView() {
        final int[] intIcon = {};

    }//createListView

    private void buttonController() {
        aboutmeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.facebook.com/natchanon.dangchoung"));
                startActivity(intent);
            }
        });
    }//ButtonController

    private void bindWidget() {
        aboutmeButton = (Button) findViewById(R.id.button);
        eleclistview = (ListView) findViewById(R.id.listView);
    }//bind widget
}
