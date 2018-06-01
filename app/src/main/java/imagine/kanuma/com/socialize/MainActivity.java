package imagine.kanuma.com.socialize;

import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ViewPager viewPager;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        toolbar =findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        //Viewpager
        viewPager.setAdapter(new PagerTimeline(this.getSupportFragmentManager()));
        viewPager.setCurrentItem(0);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
//               changeText(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });
    }


//    private void changeText(int position)
//    {
//        int activeColor = getResources().getColor(R.color.colorAccent);
//        int inactiveColor = getResources().getColor(R.color.colorBackLight);
//
//        int activeTextSize=18;
//        int inactiveTextSize=14;
//
//        switch(position)
//        {
//            case 0:
//                duringChangeText(activeColor,inactiveColor,inactiveColor,activeTextSize,inactiveTextSize,inactiveTextSize);
//                break;
//            case 1:
//                duringChangeText(inactiveColor,activeColor,inactiveColor,inactiveTextSize,activeTextSize,inactiveTextSize);
//                break;
//            case 2:
//                duringChangeText(inactiveColor,inactiveColor,activeColor,inactiveTextSize,inactiveTextSize,activeTextSize);
//                break;
//
//
//        }
//    }


//    private void duringChangeText(int profileColor,int feedsColor,int friendsColor,int profileTextSize,int feedsTextSize,int friendsTextSize)
//    {
//        txtProfile.setTextColor(profileColor);
//        txtFriends.setTextColor(friendsColor);
//        txtFeeds.setTextColor(feedsColor);
//
//        txtProfile.setTextSize(profileTextSize);
//        txtFeeds.setTextSize(feedsTextSize);
//        txtFriends.setTextSize(friendsTextSize);
//    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.app_bar_search)
        {
            Toast.makeText(this,"Menu Clicked",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();

        switch(id)
        {


        }

    }
}
