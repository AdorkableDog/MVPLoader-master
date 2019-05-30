package com.base.example;


import android.app.Activity;

import com.base.mvploader.presenter.IPresenter;
import com.base.mvploader.view.IView;

/**
 * 创建一个类作为纽带，将view、presenter、model的接口方法都串联在一起，更加便于管理
 */
public final class MainContacts {
	interface IMain extends IView<Activity> {
		void showTips(boolean isSucceess);
	}


	interface IMainPre extends IPresenter {
		void login(String username, String password);
	}

	interface IMainLgc {
		boolean login(String username, String password);
	}
}
