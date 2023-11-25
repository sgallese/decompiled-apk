package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.p;
import v6.l;

/* compiled from: BaseProgressIndicatorSpec.java */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public int f10207a;

    /* renamed from: b  reason: collision with root package name */
    public int f10208b;

    /* renamed from: c  reason: collision with root package name */
    public int[] f10209c = new int[0];

    /* renamed from: d  reason: collision with root package name */
    public int f10210d;

    /* renamed from: e  reason: collision with root package name */
    public int f10211e;

    /* renamed from: f  reason: collision with root package name */
    public int f10212f;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(Context context, AttributeSet attributeSet, int i10, int i11) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(v6.d.f24674f0);
        TypedArray i12 = p.i(context, attributeSet, l.f24838c0, i10, i11, new int[0]);
        this.f10207a = m7.c.c(context, i12, l.f24918k0, dimensionPixelSize);
        this.f10208b = Math.min(m7.c.c(context, i12, l.f24908j0, 0), this.f10207a / 2);
        this.f10211e = i12.getInt(l.f24878g0, 0);
        this.f10212f = i12.getInt(l.f24848d0, 0);
        c(context, i12);
        d(context, i12);
        i12.recycle();
    }

    private void c(Context context, TypedArray typedArray) {
        int i10 = l.f24858e0;
        if (!typedArray.hasValue(i10)) {
            this.f10209c = new int[]{d7.a.b(context, v6.b.f24645o, -1)};
        } else if (typedArray.peekValue(i10).type != 1) {
            this.f10209c = new int[]{typedArray.getColor(i10, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
            this.f10209c = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    private void d(Context context, TypedArray typedArray) {
        int i10 = l.f24898i0;
        if (typedArray.hasValue(i10)) {
            this.f10210d = typedArray.getColor(i10, -1);
            return;
        }
        this.f10210d = this.f10209c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f10 = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f10210d = d7.a.a(this.f10210d, (int) (f10 * 255.0f));
    }

    public boolean a() {
        if (this.f10212f != 0) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (this.f10211e != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void e();
}
