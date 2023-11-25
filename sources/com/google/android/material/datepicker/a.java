package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.p0;

/* compiled from: CalendarItemStyle.java */
/* loaded from: classes3.dex */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Rect f9903a;

    /* renamed from: b  reason: collision with root package name */
    private final ColorStateList f9904b;

    /* renamed from: c  reason: collision with root package name */
    private final ColorStateList f9905c;

    /* renamed from: d  reason: collision with root package name */
    private final ColorStateList f9906d;

    /* renamed from: e  reason: collision with root package name */
    private final int f9907e;

    /* renamed from: f  reason: collision with root package name */
    private final p7.k f9908f;

    private a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i10, p7.k kVar, Rect rect) {
        androidx.core.util.i.d(rect.left);
        androidx.core.util.i.d(rect.top);
        androidx.core.util.i.d(rect.right);
        androidx.core.util.i.d(rect.bottom);
        this.f9903a = rect;
        this.f9904b = colorStateList2;
        this.f9905c = colorStateList;
        this.f9906d = colorStateList3;
        this.f9907e = i10;
        this.f9908f = kVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(Context context, int i10) {
        boolean z10;
        if (i10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        androidx.core.util.i.b(z10, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, v6.l.f24832b4);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(v6.l.f24842c4, 0), obtainStyledAttributes.getDimensionPixelOffset(v6.l.f24862e4, 0), obtainStyledAttributes.getDimensionPixelOffset(v6.l.f24852d4, 0), obtainStyledAttributes.getDimensionPixelOffset(v6.l.f24872f4, 0));
        ColorStateList a10 = m7.c.a(context, obtainStyledAttributes, v6.l.f24882g4);
        ColorStateList a11 = m7.c.a(context, obtainStyledAttributes, v6.l.f24932l4);
        ColorStateList a12 = m7.c.a(context, obtainStyledAttributes, v6.l.f24912j4);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(v6.l.f24922k4, 0);
        p7.k m10 = p7.k.b(context, obtainStyledAttributes.getResourceId(v6.l.f24892h4, 0), obtainStyledAttributes.getResourceId(v6.l.f24902i4, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a10, a11, a12, dimensionPixelSize, m10, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f9903a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f9903a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(TextView textView) {
        e(textView, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(TextView textView, ColorStateList colorStateList) {
        p7.g gVar = new p7.g();
        p7.g gVar2 = new p7.g();
        gVar.setShapeAppearanceModel(this.f9908f);
        gVar2.setShapeAppearanceModel(this.f9908f);
        if (colorStateList == null) {
            colorStateList = this.f9905c;
        }
        gVar.b0(colorStateList);
        gVar.i0(this.f9907e, this.f9906d);
        textView.setTextColor(this.f9904b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f9904b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f9903a;
        p0.y0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
