package org.hotpoor.app.hotpoor_udp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MyGridLayout grid;
    String titles[] = { "书签", "推荐", "订阅", "账户", "积分", "微博", "反馈", "关于我们"};
    int[] srcs = {R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a,
            R.drawable.a,R.drawable.a};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = (MyGridLayout) findViewById(R.id.list);
        grid.setGridAdapter(new MyGridLayout.GridAdatper() {

            @Override
            public View getView(int index) {
                View view = getLayoutInflater().inflate(R.layout.actions_item,
                        null);
                ImageView iv = (ImageView) view.findViewById(R.id.iv);
                TextView tv = (TextView) view.findViewById(R.id.tv);
                iv.setImageResource(srcs[index]);
                tv.setText(titles[index]);
                return view;
            }

            @Override
            public int getCount() {
                return titles.length;
            }
        });
    }
}
