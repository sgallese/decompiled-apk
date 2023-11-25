package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.p0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p7.g;
import p7.i;
import v6.h;
import v6.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RadialViewGroup.java */
/* loaded from: classes3.dex */
public class e extends ConstraintLayout {
    private final Runnable K;
    private int L;
    private g M;

    public e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.K);
            handler.post(this.K);
        }
    }

    private void t(List<View> list, androidx.constraintlayout.widget.d dVar, int i10) {
        Iterator<View> it = list.iterator();
        float f10 = 0.0f;
        while (it.hasNext()) {
            dVar.h(it.next().getId(), v6.f.f24714c, i10, f10);
            f10 += 360.0f / list.size();
        }
    }

    private Drawable u() {
        g gVar = new g();
        this.M = gVar;
        gVar.Z(new i(0.5f));
        this.M.b0(ColorStateList.valueOf(-1));
        return this.M;
    }

    private static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (view.getId() == -1) {
            view.setId(p0.m());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.M.b0(ColorStateList.valueOf(i10));
    }

    int v(int i10) {
        if (i10 == 2) {
            return Math.round(this.L * 0.66f);
        }
        return this.L;
    }

    public int w() {
        return this.L;
    }

    public void x(int i10) {
        this.L = i10;
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getId() != v6.f.f24714c && !y(childAt)) {
                int i11 = (Integer) childAt.getTag(v6.f.f24724m);
                if (i11 == null) {
                    i11 = 1;
                }
                if (!hashMap.containsKey(i11)) {
                    hashMap.put(i11, new ArrayList());
                }
                ((List) hashMap.get(i11)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            t((List) entry.getValue(), dVar, v(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }

    public e(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater.from(context).inflate(h.f24750j, this);
        p0.y0(this, u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f25063y5, i10, 0);
        this.L = obtainStyledAttributes.getDimensionPixelSize(l.f25073z5, 0);
        this.K = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.z();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
