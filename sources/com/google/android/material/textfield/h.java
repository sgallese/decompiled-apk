package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import p7.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CutoutDrawable.java */
/* loaded from: classes3.dex */
public class h extends p7.g {
    b M;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CutoutDrawable.java */
    @TargetApi(18)
    /* loaded from: classes3.dex */
    public static class c extends h {
        c(b bVar) {
            super(bVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p7.g
        public void r(Canvas canvas) {
            if (this.M.f10522w.isEmpty()) {
                super.r(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.M.f10522w);
            } else {
                canvas.clipRect(this.M.f10522w, Region.Op.DIFFERENCE);
            }
            super.r(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static h p0(b bVar) {
        return new c(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h q0(p7.k kVar) {
        if (kVar == null) {
            kVar = new p7.k();
        }
        return p0(new b(kVar, new RectF()));
    }

    @Override // p7.g, android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.M = new b(this.M);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean r0() {
        return !this.M.f10522w.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0() {
        t0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void t0(float f10, float f11, float f12, float f13) {
        if (f10 != this.M.f10522w.left || f11 != this.M.f10522w.top || f12 != this.M.f10522w.right || f13 != this.M.f10522w.bottom) {
            this.M.f10522w.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u0(RectF rectF) {
        t0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CutoutDrawable.java */
    /* loaded from: classes3.dex */
    public static final class b extends g.c {

        /* renamed from: w  reason: collision with root package name */
        private final RectF f10522w;

        @Override // p7.g.c, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h p02 = h.p0(this);
            p02.invalidateSelf();
            return p02;
        }

        private b(p7.k kVar, RectF rectF) {
            super(kVar, null);
            this.f10522w = rectF;
        }

        private b(b bVar) {
            super(bVar);
            this.f10522w = bVar.f10522w;
        }
    }

    private h(b bVar) {
        super(bVar);
        this.M = bVar;
    }
}
