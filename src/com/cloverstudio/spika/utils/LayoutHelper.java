/*
 * The MIT License (MIT)
 * 
 * Copyright � 2013 Clover Studio Ltd. All rights reserved.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.cloverstudio.spika.utils;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;

/**
 * LayoutHelper
 * 
 * Calculates new measures and scales views according to koeficient value.
 */

public class LayoutHelper {
	
	/**
	 * @author wolf for dynamic change imageview inside relativelayout
	 * @param context
	 * @param koef
	 *            - with this koeficient width of the screen will be divided
	 * @param imageView
	 */
	public static void scaleWidthAndHeight(Context context, float koef, ImageView imageView) {
		int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
		imageView.getLayoutParams().width = (int) (screenWidth / koef);
		imageView.getLayoutParams().height = (int) (screenWidth / koef);
	}
	
	public static void scaleWidth(Context context, float koef, ImageView imageView) {
		int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
		imageView.getLayoutParams().width = (int) (screenWidth / koef);
	}

	/**
	 * @author wolf for dynamic change imageview inside linearlayout
	 * @param context
	 * @param koef
	 *            - with this koeficient width of the screen will be divided
	 * @param imageView
	 */
//	public static void scaleWidthAndHeightLinearLayout(Context context, float koef, ImageView imageView) {
//		int screenWidth = context.getResources().getDisplayMetrics().widthPixels;
//		android.widget.LinearLayout.LayoutParams params = (android.widget.LinearLayout.LayoutParams) imageView.getLayoutParams();
//		params.width = (int) (screenWidth / koef);
//		params.height = (int) (screenWidth / koef);
//		imageView.setLayoutParams(params);
//	}

}
