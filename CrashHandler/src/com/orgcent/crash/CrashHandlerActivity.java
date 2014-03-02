package com.orgcent.crash;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class CrashHandlerActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
	Button exceptionButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	initCrashHandler();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        exceptionButton = (Button) findViewById(R.id.btn_make_exception);
        exceptionButton.setOnClickListener(this);
    }
	@Override
	public void onClick(View v) {
		// 创建错误
        throw new NullPointerException();
	}
	/**
	 * 初始化异常捕获
	 * @param
	 * @return
	 * @date 2014年3月2日
	 * @author trs
	 */
	private void initCrashHandler() {
		CrashHandler crashHandler = CrashHandler.getInstance();
		crashHandler.init(this);
	}
}