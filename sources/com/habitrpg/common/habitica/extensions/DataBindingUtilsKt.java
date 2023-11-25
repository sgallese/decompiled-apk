package com.habitrpg.common.habitica.extensions;

import android.content.Context;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.q;

/* compiled from: DataBindingUtils.kt */
/* loaded from: classes4.dex */
public final class DataBindingUtilsKt {
    public static final void loadImage(PixelArtView pixelArtView, String str, String str2) {
        q.i(pixelArtView, "<this>");
        DataBindingUtils dataBindingUtils = DataBindingUtils.INSTANCE;
        if (dataBindingUtils.existsAsImage(str) && str != null) {
            String fullFilename = dataBindingUtils.getFullFilename(str, str2);
            if (q.d(pixelArtView.getTag(), fullFilename)) {
                return;
            }
            pixelArtView.setTag(fullFilename);
            pixelArtView.setImageDrawable(null);
            pixelArtView.setBitmap(null);
            Context context = pixelArtView.getContext();
            q.h(context, "getContext(...)");
            dataBindingUtils.loadImage(context, str, str2, new DataBindingUtilsKt$loadImage$1(pixelArtView, fullFilename), new DataBindingUtilsKt$loadImage$2(pixelArtView));
            return;
        }
        pixelArtView.setTag(null);
        pixelArtView.setImageDrawable(null);
        pixelArtView.setBitmap(null);
    }

    public static /* synthetic */ void loadImage$default(PixelArtView pixelArtView, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        loadImage(pixelArtView, str, str2);
    }
}
