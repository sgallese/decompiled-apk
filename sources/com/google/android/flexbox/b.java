package com.google.android.flexbox;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexLine.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    int f9379e;

    /* renamed from: f  reason: collision with root package name */
    int f9380f;

    /* renamed from: g  reason: collision with root package name */
    int f9381g;

    /* renamed from: h  reason: collision with root package name */
    int f9382h;

    /* renamed from: i  reason: collision with root package name */
    int f9383i;

    /* renamed from: j  reason: collision with root package name */
    float f9384j;

    /* renamed from: k  reason: collision with root package name */
    float f9385k;

    /* renamed from: l  reason: collision with root package name */
    int f9386l;

    /* renamed from: m  reason: collision with root package name */
    int f9387m;

    /* renamed from: o  reason: collision with root package name */
    int f9389o;

    /* renamed from: p  reason: collision with root package name */
    int f9390p;

    /* renamed from: q  reason: collision with root package name */
    boolean f9391q;

    /* renamed from: r  reason: collision with root package name */
    boolean f9392r;

    /* renamed from: a  reason: collision with root package name */
    int f9375a = Integer.MAX_VALUE;

    /* renamed from: b  reason: collision with root package name */
    int f9376b = Integer.MAX_VALUE;

    /* renamed from: c  reason: collision with root package name */
    int f9377c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    int f9378d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: n  reason: collision with root package name */
    List<Integer> f9388n = new ArrayList();

    public int a() {
        return this.f9381g;
    }

    public int b() {
        return this.f9382h;
    }

    public int c() {
        return this.f9382h - this.f9383i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(View view, int i10, int i11, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f9375a = Math.min(this.f9375a, (view.getLeft() - flexItem.V()) - i10);
        this.f9376b = Math.min(this.f9376b, (view.getTop() - flexItem.c0()) - i11);
        this.f9377c = Math.max(this.f9377c, view.getRight() + flexItem.A0() + i12);
        this.f9378d = Math.max(this.f9378d, view.getBottom() + flexItem.R() + i13);
    }
}
