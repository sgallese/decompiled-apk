package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CalendarStyle.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    final a f9909a;

    /* renamed from: b  reason: collision with root package name */
    final a f9910b;

    /* renamed from: c  reason: collision with root package name */
    final a f9911c;

    /* renamed from: d  reason: collision with root package name */
    final a f9912d;

    /* renamed from: e  reason: collision with root package name */
    final a f9913e;

    /* renamed from: f  reason: collision with root package name */
    final a f9914f;

    /* renamed from: g  reason: collision with root package name */
    final a f9915g;

    /* renamed from: h  reason: collision with root package name */
    final Paint f9916h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(m7.b.d(context, v6.b.A, f.class.getCanonicalName()), v6.l.S3);
        this.f9909a = a.a(context, obtainStyledAttributes.getResourceId(v6.l.V3, 0));
        this.f9915g = a.a(context, obtainStyledAttributes.getResourceId(v6.l.T3, 0));
        this.f9910b = a.a(context, obtainStyledAttributes.getResourceId(v6.l.U3, 0));
        this.f9911c = a.a(context, obtainStyledAttributes.getResourceId(v6.l.W3, 0));
        ColorStateList a10 = m7.c.a(context, obtainStyledAttributes, v6.l.X3);
        this.f9912d = a.a(context, obtainStyledAttributes.getResourceId(v6.l.Z3, 0));
        this.f9913e = a.a(context, obtainStyledAttributes.getResourceId(v6.l.Y3, 0));
        this.f9914f = a.a(context, obtainStyledAttributes.getResourceId(v6.l.f24822a4, 0));
        Paint paint = new Paint();
        this.f9916h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
