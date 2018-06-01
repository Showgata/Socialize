package imagine.kanuma.com.socialize;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerTimeline extends FragmentPagerAdapter {

    private Fragment currentFragment;

    public PagerTimeline(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                currentFragment = new ProfileFragment();
                break;
            case 1:
                currentFragment = new NotifyFragment();
                break;
            case 2:
                currentFragment = new ChatFragment();
                break;
        }

        return currentFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
