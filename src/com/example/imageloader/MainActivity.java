package com.example.imageloader;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;
import com.squareup.picasso.Picasso;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class MainActivity extends Activity {

	DisplayImageOptions options;
	
	private static String IMAGE_URL = 
			"http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=png%E5%9B%BE%E7%89%87&step_word=&pn=1&spn=0&di=19863578130&pi=&rn=1&tn=baiduimagedetail&is=&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=2382124539%2C922770330&os=2412904080%2C1791369406&simid=3079304940%2C3730578101&adpicid=0&ln=1000&fr=&fmq=1457588986931_R&fm=&ic=undefined&s=undefined&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fimg.cool80.com%2Fi%2Fpng%2F374%2F02.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bv55sba_z%26e3Bv54AzdH3Frg2AzdH3Fdaal-l-dcAzdH3FMwLtA5HjG5g2Zi7-rg2-T7Pwg_z%26e3Bip4s&gsm=0";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ImageView imageView = (ImageView) findViewById(R.id.image);
		
		Picasso.with(this).load(IMAGE_URL).error(R.drawable.ic_launcher).into(imageView);
		
	}

	

}
