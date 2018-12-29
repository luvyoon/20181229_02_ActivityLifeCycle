package kr.tjeit.a20181229_02_activitylifecycle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NextActivity extends BaseActivity {

    private android.widget.Button closeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        bindviews();
        setupEvents();
        setvalues();

        Toast.makeText(mContext, "Next - onCreate", Toast.LENGTH_SHORT).show();
        
        

    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(mContext, "Next - onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(mContext, "Next - onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setupEvents() {
        
      
        


        closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });


    }

    @Override
    public void setvalues() {

    }

    @Override
    public void bindviews() {
        this.closeBtn = (Button) findViewById(R.id.closeBtn);

    }
}
