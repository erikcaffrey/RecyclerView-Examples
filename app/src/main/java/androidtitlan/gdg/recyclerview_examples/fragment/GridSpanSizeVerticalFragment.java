package androidtitlan.gdg.recyclerview_examples.fragment;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import androidtitlan.gdg.recyclerview_examples.R;
import androidtitlan.gdg.recyclerview_examples.adapter.AdapterExample;
import androidtitlan.gdg.recyclerview_examples.model.Picture;

public class GridSpanSizeVerticalFragment extends BaseFragment {

    public static GridSpanSizeVerticalFragment newInstance() {
        return new GridSpanSizeVerticalFragment();
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_base;
    }

    @Override protected RecyclerView.LayoutManager getLayoutManager() {
        return getGridLayoutManager();
    }


    @Override protected RecyclerView.Adapter getAdapter(ArrayList<Picture> pictureList) {
        return new AdapterExample(pictureList,R.layout.item_type_two);
    }

    private GridLayoutManager getGridLayoutManager() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(
                getActivity(),
                2,
                RecyclerView.VERTICAL,
                false);

        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                //stagger rows custom
                return (position % 3 == 0 ? 2 : 1);
            }
        });
        return gridLayoutManager;
    }
}

