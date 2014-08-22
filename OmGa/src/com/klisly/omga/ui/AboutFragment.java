package com.klisly.omga.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.klisly.omga.R;
import com.klisly.omga.ui.base.BaseHomeFragment;
import com.klisly.omga.utils.ActivityUtil;

public class AboutFragment extends BaseHomeFragment{
	private TextView versionName;
	public static AboutFragment newInstance(){
		AboutFragment fragment = new AboutFragment();
		return fragment;
	}
	
	@Override
	protected int getLayoutId() {
		// TODO Auto-generated method stub
		return R.layout.fragment_about;
	}

	@Override
	protected void findViews(View view) {
		// TODO Auto-generated method stub
		versionName = (TextView)view.findViewById(R.id.version_name);
		
	}

	@Override
	protected void setupViews(Bundle bundle) {
		// TODO Auto-generated method stub
		versionName.setText(ActivityUtil.getVersionName(mContext));
	}

	@Override
	protected void setListener() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void fetchData() {
		// TODO Auto-generated method stub
		
	}


}
