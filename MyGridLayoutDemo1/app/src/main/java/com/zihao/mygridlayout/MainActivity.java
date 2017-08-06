package com.zihao.mygridlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.zihao.R;
import com.zihao.view.MyGridLayout;
import com.zihao.view.MyGridLayout.GridAdatper;
import com.zihao.view.MyGridLayout.OnItemClickListener;

/**
 * 主界面
 * 
 * @author zihao
 * 
 */
public class MainActivity extends Activity {

	MyGridLayout grid;
	String titles[] = { "书签", "推荐", "订阅", "账户", "积分", "微博", "反馈", "关于我们", "书签",
			"推荐", "订阅", "账户", "积分", "微博", "反馈", "关于我们" };
	int[] srcs = {R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,
			R.drawable.a,R.drawable.a,};
//	int[] srcs = { R.drawable.actions_booktag, R.drawable.actions_comment,
//			R.drawable.actions_order, R.drawable.actions_account,
//			R.drawable.actions_cent, R.drawable.actions_weibo,
//			R.drawable.actions_feedback, R.drawable.actions_about,
//			R.drawable.actions_booktag, R.drawable.actions_comment,
//			R.drawable.actions_order, R.drawable.actions_account,
//			R.drawable.actions_cent, R.drawable.actions_weibo,
//			R.drawable.actions_feedback, R.drawable.actions_about };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		grid = (MyGridLayout) findViewById(R.id.list);
		grid.setGridAdapter(new GridAdatper() {

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
		grid.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(View v, int index) {
				Toast.makeText(getApplicationContext(), "item=" + index,
						Toast.LENGTH_LONG).show();
			}
		});
	}

}
