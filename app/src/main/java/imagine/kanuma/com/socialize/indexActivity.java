package imagine.kanuma.com.socialize;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.squareup.picasso.Picasso;

public class indexActivity extends AppCompatActivity {

    private ImageView loginBackgroundImage;
    private LinearLayout loginBtn;

    private Intent nextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        loginBtn =findViewById(R.id.idLoginButton);
        loginBackgroundImage = findViewById(R.id.loginBackground);

        //https://www.pexels.com/photo/road-landscape-nature-forest-39811/

        Picasso.get().load("https://html5box.com/html5lightbox/images/skynight.jpg").into(loginBackgroundImage);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity = new Intent(indexActivity.this,MainActivity.class);
                startActivity(nextActivity);
            }
        });

    }
}
