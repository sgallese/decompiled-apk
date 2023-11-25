package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import v6.k;

/* loaded from: classes3.dex */
public final class CircularProgressIndicator extends a<e> {
    public static final int C = k.f24815y;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24636h);
    }

    private void s() {
        setIndeterminateDrawable(j.t(getContext(), (e) this.f10190f));
        setProgressDrawable(f.v(getContext(), (e) this.f10190f));
    }

    public int getIndicatorDirection() {
        return ((e) this.f10190f).f10234i;
    }

    public int getIndicatorInset() {
        return ((e) this.f10190f).f10233h;
    }

    public int getIndicatorSize() {
        return ((e) this.f10190f).f10232g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.a
    /* renamed from: r  reason: merged with bridge method [inline-methods] */
    public e i(Context context, AttributeSet attributeSet) {
        return new e(context, attributeSet);
    }

    public void setIndicatorDirection(int i10) {
        ((e) this.f10190f).f10234i = i10;
        invalidate();
    }

    public void setIndicatorInset(int i10) {
        S s10 = this.f10190f;
        if (((e) s10).f10233h != i10) {
            ((e) s10).f10233h = i10;
            invalidate();
        }
    }

    public void setIndicatorSize(int i10) {
        int max = Math.max(i10, getTrackThickness() * 2);
        S s10 = this.f10190f;
        if (((e) s10).f10232g != max) {
            ((e) s10).f10232g = max;
            ((e) s10).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i10) {
        super.setTrackThickness(i10);
        ((e) this.f10190f).e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, C);
        s();
    }
}
