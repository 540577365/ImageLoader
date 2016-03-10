package com.example.imageloader;


import com.nostra13.universalimageloader.cache.disc.naming.Md5FileNameGenerator;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;

import android.app.Application;

public class MyApplication extends Application{
	
	
	@Override
	public void onCreate() {
		super.onCreate();
		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(getApplicationContext())
												//设置线程优先级
												.threadPriority(Thread.NORM_PRIORITY)
												//当同一个Uri获取不同大小的图片，缓存到内存中，只缓存一个。
												.denyCacheImageMultipleSizesInMemory()
												//设置缓存文件的名字
												.discCacheFileNameGenerator(new Md5FileNameGenerator())
												//缓存文件的最大个数
												.discCacheFileCount(60)
												//设置图片下载和显示的工作队列排序
												.tasksProcessingOrder(QueueProcessingType.LIFO)
												.build();
		//初始化Imageloader参数，全局引用
		ImageLoader.getInstance().init(config);
	}

}
