package kr.tjeit.a20181229_02_activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindviews();
        setupEvents();
        setvalues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setvalues() {

    }

    @Override
    public void bindviews() {

    }
}
