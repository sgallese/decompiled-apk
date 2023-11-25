package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.p;
import v6.l;

/* compiled from: CircularProgressIndicatorSpec.java */
/* loaded from: classes3.dex */
public final class e extends b {

    /* renamed from: g  reason: collision with root package name */
    public int f10232g;

    /* renamed from: h  reason: collision with root package name */
    public int f10233h;

    /* renamed from: i  reason: collision with root package name */
    public int f10234i;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, v6.b.f24636h);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, CircularProgressIndicator.C);
    }

    public e(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(v6.d.f24672e0);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(v6.d.f24670d0);
        TypedArray i12 = p.i(context, attributeSet, l.H1, i10, i11, new int[0]);
        this.f10232g = Math.max(m7.c.c(context, i12, l.K1, dimensionPixelSize), this.f10207a * 2);
        this.f10233h = m7.c.c(context, i12, l.J1, dimensionPixelSize2);
        this.f10234i = i12.getInt(l.I1, 0);
        i12.recycle();
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.b
    public void e() {
    }
}
