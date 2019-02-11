package com.xk.otherapk;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xk.resourceapk.R;

/**
 * 这个activity是其他apk中的。
 * @author xuekai1
 * @date 2019/2/11
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        Drawable drawable = Utils.getDrawable(this, "abc");
        ImageView imageView = (ImageView) findViewById(R.id.image);
        TextView textView = (TextView) findViewById(R.id.text);
        imageView.setImageDrawable(drawable);
        textView.setText(Utils.getString(this,"string1"));
        textView.setTextColor(Utils.getColor(this,"mainColor"));
    }
}
