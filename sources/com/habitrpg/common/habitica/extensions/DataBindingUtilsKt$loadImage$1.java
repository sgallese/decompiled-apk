package com.habitrpg.common.habitica.extensions;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.b;
import com.habitrpg.common.habitica.views.PixelArtView;
import dc.w;
import pc.l;
import qc.q;
import qc.r;
import yc.v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DataBindingUtils.kt */
/* loaded from: classes4.dex */
public final class DataBindingUtilsKt$loadImage$1 extends r implements l<Drawable, w> {
    final /* synthetic */ String $fullname;
    final /* synthetic */ PixelArtView $this_loadImage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataBindingUtilsKt$loadImage$1(PixelArtView pixelArtView, String str) {
        super(1);
        this.$this_loadImage = pixelArtView;
        this.$fullname = str;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Drawable drawable) {
        invoke2(drawable);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Drawable drawable) {
        boolean q10;
        q.i(drawable, "it");
        if (q.d(this.$this_loadImage.getTag(), this.$fullname)) {
            PixelArtView pixelArtView = this.$this_loadImage;
            Bitmap bitmap = null;
            q10 = v.q(this.$fullname, "gif", false, 2, null);
            if (q10) {
                this.$this_loadImage.setImageDrawable(drawable);
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
            } else {
                bitmap = b.b(drawable, 0, 0, null, 7, null);
            }
            pixelArtView.setBitmap(bitmap);
        }
    }
}
