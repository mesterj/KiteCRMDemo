package com.kite.joco.kitecrmdemo;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.roomorama.caldroid.CaldroidFragment;
import com.roomorama.caldroid.CaldroidGridAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentCalDroid extends CaldroidFragment {

    public static final String TAG="Naptár";

    public FragmentCalDroid() {
        // Required empty public constructor
    }

    /*@Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }*/

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        Bundle args = new Bundle();
        args.putInt(CaldroidFragment.START_DAY_OF_WEEK, CaldroidFragment.MONDAY); // Tuesday
        this.setArguments(args);
        super.onViewCreated(view, savedInstanceState);
    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Calendar cal = Calendar.getInstance();

        savedInstanceState = new Bundle();
        savedInstanceState.putInt(CaldroidFragment.MONTH,cal.get(Calendar.MONTH)+1);
        savedInstanceState.putInt(CaldroidFragment.YEAR,cal.get(Calendar.YEAR));
        savedInstanceState.putInt(CaldroidFragment.START_DAY_OF_WEEK,CaldroidFragment.MONDAY);// A hét első napja hétfő
        this.setArguments(savedInstanceState);
        return inflater.inflate(R.layout.fragment_cal_droid, container, false);
    }*/

    @Override
    public CaldroidGridAdapter getNewDatesGridAdapter(int month, int year) {
        // TODO Auto-generated method stub
        return new CrmCaldroidAdapter(getActivity(), month, year,
                getCaldroidData(), extraData);
    }

}
