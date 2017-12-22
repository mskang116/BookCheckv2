package com.example.mskan.bookcheckv2;

import android.app.Activity;

/**
 * Created by mskan on 2017-05-21.
 */

public class CardViewItem {
	public String Title;
	public Integer Iconimage;
	public String URL;
	public String mode;
	public Class Nextclass;

	public CardViewItem(String title, Integer image, String url, String mode, Class nextclass) {
		this.Title = title;
		this.Iconimage = image;
		this.URL = url;
		this.mode = mode;
		this.Nextclass = nextclass;
	}

}
