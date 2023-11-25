package com.habitrpg.android.habitica.ui.views.stable;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.habitrpg.common.habitica.extensions.DataBindingUtilsKt;
import com.habitrpg.common.habitica.views.PixelArtView;
import qc.h;
import qc.q;

/* compiled from: MountView.kt */
/* loaded from: classes4.dex */
public final class MountView extends FrameLayout {
    public static final int $stable = 8;
    private final PixelArtView bodyView;
    private final PixelArtView headView;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.util.AttributeSet, qc.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MountView(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            qc.q.i(r3, r0)
            r0 = 0
            r1 = 2
            r2.<init>(r3, r0, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.views.stable.MountView.<init>(android.content.Context):void");
    }

    public final boolean getHasLoadedImages() {
        if (this.bodyView.getBitmap() != null && this.headView.getBitmap() != null) {
            return true;
        }
        return false;
    }

    public final void setMount(String str) {
        q.i(str, "key");
        DataBindingUtilsKt.loadImage$default(this.bodyView, "Mount_Body_" + str, null, 2, null);
        DataBindingUtilsKt.loadImage$default(this.headView, "Mount_Head_" + str, null, 2, null);
    }

    public /* synthetic */ MountView(Context context, AttributeSet attributeSet, int i10, h hVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MountView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        q.i(context, "context");
        PixelArtView pixelArtView = new PixelArtView(context, null, 0, 6, null);
        this.bodyView = pixelArtView;
        PixelArtView pixelArtView2 = new PixelArtView(context, null, 0, 6, null);
        this.headView = pixelArtView2;
        addView(pixelArtView);
        pixelArtView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(pixelArtView2);
        pixelArtView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }
}
