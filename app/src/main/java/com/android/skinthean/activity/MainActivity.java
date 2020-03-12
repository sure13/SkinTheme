package com.android.skinthean.activity;

import android.content.Intent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.skinthean.base.BaseActivity;
import com.android.skinthean.skin.SkinManager;

import butterknife.BindView;
import butterknife.OnClick;
import com.android.skinthean.R;
import com.blankj.utilcode.util.SPUtils;

public class MainActivity extends BaseActivity {

    @BindView(R.id.tv_am_change_skin_blue)
    TextView tvAmChangeSkinBlue;
    @BindView(R.id.tv_am_change_skin_green)
    TextView tvAmChangeSkinGreen;
    @BindView(R.id.tv_am_change_default)
    TextView tvAmChangeDefault;



    private String TAG="MainActivity";


    @Override
    protected void initData() {

    }

    @Override
    public int getContetId() {
        return R.layout.activity_main;
    }

    @OnClick({ R.id.tv_am_change_skin_blue, R.id.tv_am_change_skin_green, R.id.tv_am_change_default})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tv_am_change_skin_blue:
                SkinManager.getInstance().loadSkin("");
                skinFactory.apply();
                SPUtils.getInstance().put(Constant.CURRENT_SKIN,"");
                break;
            case R.id.tv_am_change_skin_green:
                SkinManager.getInstance().loadSkin("skingreen-debug.apk");
                skinFactory.apply();
                SPUtils.getInstance().put(Constant.CURRENT_SKIN,"skingreen-debug.apk");
                break;
            case R.id.tv_am_change_default:
                SkinManager.getInstance().loadSkin("skinred-debug.apk");
                skinFactory.apply();
                SPUtils.getInstance().put(Constant.CURRENT_SKIN,"skinred-debug.apk");
                break;
        }
    }
}
