package l7;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import v6.b;
import v6.k;

/* compiled from: MaterialRadioButton.java */
/* loaded from: classes3.dex */
public class a extends s {

    /* renamed from: t  reason: collision with root package name */
    private static final int f19596t = k.A;

    /* renamed from: u  reason: collision with root package name */
    private static final int[][] f19597u = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: r  reason: collision with root package name */
    private ColorStateList f19598r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f19599s;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.S);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f19598r == null) {
            int d10 = d7.a.d(this, b.f24640j);
            int d11 = d7.a.d(this, b.f24643m);
            int d12 = d7.a.d(this, b.f24647q);
            int[][] iArr = f19597u;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = d7.a.j(d12, d10, 1.0f);
            iArr2[1] = d7.a.j(d12, d11, 0.54f);
            iArr2[2] = d7.a.j(d12, d11, 0.38f);
            iArr2[3] = d7.a.j(d12, d11, 0.38f);
            this.f19598r = new ColorStateList(iArr, iArr2);
        }
        return this.f19598r;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19599s && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f19599s = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = l7.a.f19596t
            android.content.Context r8 = s7.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = v6.l.K4
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.p.i(r0, r1, r2, r3, r4, r5)
            int r10 = v6.l.L4
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = m7.c.a(r8, r9, r10)
            androidx.core.widget.c.d(r7, r8)
        L28:
            int r8 = v6.l.M4
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f19599s = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
