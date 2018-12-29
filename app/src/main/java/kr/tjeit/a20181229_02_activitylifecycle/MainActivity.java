package kr.tjeit.a20181229_02_activitylifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {


    private android.widget.Button moveBtn;

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

        moveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,NextActivity.class);
                startActivity(intent);


            }
        });

    }

    @Override
    public void setvalues() {

    }

    @Override
    public void bindviews() {

        this.moveBtn = (Button) findViewById(R.id.moveBtn);

    }
}
