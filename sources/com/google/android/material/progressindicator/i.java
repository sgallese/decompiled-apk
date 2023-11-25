package com.google.android.material.progressindicator;

import android.animation.Animator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndeterminateAnimatorDelegate.java */
/* loaded from: classes3.dex */
public abstract class i<T extends Animator> {

    /* renamed from: a  reason: collision with root package name */
    protected j f10252a;

    /* renamed from: b  reason: collision with root package name */
    protected final float[] f10253b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f10254c;

    /* JADX INFO: Access modifiers changed from: protected */
    public i(int i10) {
        this.f10253b = new float[i10 * 2];
        this.f10254c = new int[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public float b(int i10, int i11, int i12) {
        return (i10 - i11) / i12;
    }

    public abstract void c();

    public abstract void d(androidx.vectordrawable.graphics.drawable.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(j jVar) {
        this.f10252a = jVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void f();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void g();

    public abstract void h();
}
