package com.wyh.cch.db;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.wyh.cch.R;

public class DetailForm extends FragmentActivity {
  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.detail_activity);
  }
  
  @Override
  public void onResume() {
    super.onResume();
    
    String restaurantId=getIntent().getStringExtra(LunchList.ID_EXTRA);
    
    if (restaurantId!=null) {
      DetailFragment details=(DetailFragment)getSupportFragmentManager()
                                                .findFragmentById(R.id.details);
                                
      if (details!=null) {
        details.loadRestaurant(restaurantId);
      }
    }
  }
}