package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.c1;
import androidx.core.view.p1;
import java.util.Iterator;
import java.util.List;

/* compiled from: InsetsAnimationCallback.java */
/* loaded from: classes3.dex */
class c extends c1.b {

    /* renamed from: c  reason: collision with root package name */
    private final View f9693c;

    /* renamed from: d  reason: collision with root package name */
    private int f9694d;

    /* renamed from: e  reason: collision with root package name */
    private int f9695e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f9696f;

    public c(View view) {
        super(0);
        this.f9696f = new int[2];
        this.f9693c = view;
    }

    @Override // androidx.core.view.c1.b
    public void b(c1 c1Var) {
        this.f9693c.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.c1.b
    public void c(c1 c1Var) {
        this.f9693c.getLocationOnScreen(this.f9696f);
        this.f9694d = this.f9696f[1];
    }

    @Override // androidx.core.view.c1.b
    public p1 d(p1 p1Var, List<c1> list) {
        Iterator<c1> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().c() & p1.m.a()) != 0) {
                this.f9693c.setTranslationY(w6.a.c(this.f9695e, 0, r0.b()));
                break;
            }
        }
        return p1Var;
    }

    @Override // androidx.core.view.c1.b
    public c1.a e(c1 c1Var, c1.a aVar) {
        this.f9693c.getLocationOnScreen(this.f9696f);
        int i10 = this.f9694d - this.f9696f[1];
        this.f9695e = i10;
        this.f9693c.setTranslationY(i10);
        return aVar;
    }
}
