package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {
    Button moreButton;
    TextView moreTextView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_fragment, container, false);
        moreButton = (Button)v.findViewById(R.id.more_button);
        moreTextView = (TextView)v.findViewById(R.id.more_textView);
        moreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (moreTextView.getVisibility()== View.VISIBLE){
                    moreTextView.setVisibility(View.GONE);
                    }
                    else {
                    moreTextView.setVisibility(View.VISIBLE);
                }
            }
        });
        return v;
    }
}
