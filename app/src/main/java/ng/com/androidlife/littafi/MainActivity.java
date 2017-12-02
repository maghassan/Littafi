package ng.com.androidlife.littafi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton book1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book1 = (ImageButton) findViewById(R.id.book1);
        book1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent book1 = new Intent(MainActivity.this, Drawer1.class);
                MainActivity.this.startActivity(book1);
            }
        });
    }
}
