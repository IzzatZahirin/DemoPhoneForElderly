package sg.edu.rp.c346.id20042321.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnson;
    Button btndaughter;
    Button btnbrowser;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            btnson=findViewById(R.id.buttonCallSon);
            btndaughter=findViewById(R.id.buttonCallDaughter);
            btnbrowser=findViewById (R.id.buttonGoBrowser);

            btnson.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent (Intent.ACTION_DIAL, Uri.parse(("tel:"+92240336)));
                    startActivity(intent);
                }
            });

            btndaughter.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse(("tel:"+89675543)));
                    startActivity(intent);
                }
            });

            btnbrowser.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent. ACTION_VIEW, Uri.parse("http://www.amazon.com"));
                    startActivity(intent);

                }
            });

        }
}