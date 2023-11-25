package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.r;
import g7.a;
import v6.b;
import v6.d;
import v6.k;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: o0  reason: collision with root package name */
    private static final int f10368o0 = k.B;

    /* renamed from: p0  reason: collision with root package name */
    private static final int[][] f10369p0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: k0  reason: collision with root package name */
    private final a f10370k0;

    /* renamed from: l0  reason: collision with root package name */
    private ColorStateList f10371l0;

    /* renamed from: m0  reason: collision with root package name */
    private ColorStateList f10372m0;

    /* renamed from: n0  reason: collision with root package name */
    private boolean f10373n0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f24625b0);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f10371l0 == null) {
            int d10 = d7.a.d(this, b.f24647q);
            int d11 = d7.a.d(this, b.f24640j);
            float dimension = getResources().getDimension(d.f24680i0);
            if (this.f10370k0.e()) {
                dimension += r.e(this);
            }
            int c10 = this.f10370k0.c(d10, dimension);
            int[][] iArr = f10369p0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = d7.a.j(d10, d11, 1.0f);
            iArr2[1] = c10;
            iArr2[2] = d7.a.j(d10, d11, 0.38f);
            iArr2[3] = c10;
            this.f10371l0 = new ColorStateList(iArr, iArr2);
        }
        return this.f10371l0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f10372m0 == null) {
            int[][] iArr = f10369p0;
            int[] iArr2 = new int[iArr.length];
            int d10 = d7.a.d(this, b.f24647q);
            int d11 = d7.a.d(this, b.f24640j);
            int d12 = d7.a.d(this, b.f24643m);
            iArr2[0] = d7.a.j(d10, d11, 0.54f);
            iArr2[1] = d7.a.j(d10, d12, 0.32f);
            iArr2[2] = d7.a.j(d10, d11, 0.12f);
            iArr2[3] = d7.a.j(d10, d12, 0.12f);
            this.f10372m0 = new ColorStateList(iArr, iArr2);
        }
        return this.f10372m0;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10373n0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f10373n0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f10373n0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f10368o0
            android.content.Context r7 = s7.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            g7.a r7 = new g7.a
            r7.<init>(r0)
            r6.f10370k0 = r7
            int[] r2 = v6.l.f25014t6
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            int r9 = v6.l.f25024u6
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f10373n0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
