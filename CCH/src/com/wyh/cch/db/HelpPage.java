package com.wyh.cch.db;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import com.wyh.cch.R;

public class HelpPage extends Activity {
  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    setContentView(R.layout.help);
    
    WebView browser=(WebView)findViewById(R.id.webkit);
    
    browser.loadUrl("file:///android_asset/help.html");
  }
}