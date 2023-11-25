package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import o.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: f  reason: collision with root package name */
    private final int f1743f;

    /* renamed from: m  reason: collision with root package name */
    private final int f1744m;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1743f = getResources().getDimensionPixelOffset(a.f20323b);
        this.f1744m = getResources().getDimensionPixelOffset(a.f20322a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1743f * 2), this.f1744m), 1073741824), i11);
    }
}
