package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.material.progressindicator.b;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DrawingDelegate.java */
/* loaded from: classes3.dex */
public abstract class h<S extends b> {

    /* renamed from: a  reason: collision with root package name */
    S f10250a;

    /* renamed from: b  reason: collision with root package name */
    protected g f10251b;

    public h(S s10) {
        this.f10250a = s10;
    }

    abstract void a(Canvas canvas, Rect rect, float f10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Canvas canvas, Paint paint);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int e();

    /* JADX INFO: Access modifiers changed from: protected */
    public void f(g gVar) {
        this.f10251b = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(Canvas canvas, Rect rect, float f10) {
        this.f10250a.e();
        a(canvas, rect, f10);
    }
}
