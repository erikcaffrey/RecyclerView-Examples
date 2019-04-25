package androidtitlan.gdg.recyclerview_examples.drawer;

import android.view.MenuItem;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.fragment.GridHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridQualifiersVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridSpanSizeVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.GridVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.ItemTypesVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.LinearHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.LinearVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.ResponsiveLinearVerticalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.StaggeredHorizontalFragment;
import androidtitlan.gdg.recyclerview_examples.fragment.StaggeredVerticalFragment;

public class DrawerInteractorImpl implements DrawerInteractor {

    @Override
    public void navigateTo(MenuItem item, DrawerLayout drawerLayout, DrawerListener listener) {

        switch (item.getItemId()) {
            case R.id.nav_linear_v:
                listener.replaceFragment(LinearVerticalFragment.newInstance());
                break;
            case R.id.nav_linear_h:
                listener.replaceFragment(LinearHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_v:
                listener.replaceFragment(GridVerticalFragment.newInstance());
                break;
            case R.id.nav_grid_h:
                listener.replaceFragment(GridHorizontalFragment.newInstance());
                break;
            case R.id.nav_grid_span:
                listener.replaceFragment(GridSpanSizeVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_v:
                listener.replaceFragment(StaggeredVerticalFragment.newInstance());
                break;
            case R.id.nav_staggered_h:
                listener.replaceFragment(StaggeredHorizontalFragment.newInstance());
                break;

            case R.id.nav_item_types:
                listener.replaceFragment(ItemTypesVerticalFragment.newInstance());
                break;
            case R.id.nav_item_responsive:
                listener.replaceFragment(ResponsiveLinearVerticalFragment.newInstance());
                break;
            case R.id.nav_item_qualifiers:
                listener.replaceFragment(GridQualifiersVerticalFragment.newInstance());
                break;

        }
        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
