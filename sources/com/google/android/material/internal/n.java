package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: TextDrawableHelper.java */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: c  reason: collision with root package name */
    private float f10174c;

    /* renamed from: f  reason: collision with root package name */
    private m7.d f10177f;

    /* renamed from: a  reason: collision with root package name */
    private final TextPaint f10172a = new TextPaint(1);

    /* renamed from: b  reason: collision with root package name */
    private final m7.f f10173b = new a();

    /* renamed from: d  reason: collision with root package name */
    private boolean f10175d = true;

    /* renamed from: e  reason: collision with root package name */
    private WeakReference<b> f10176e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    class a extends m7.f {
        a() {
        }

        @Override // m7.f
        public void a(int i10) {
            n.this.f10175d = true;
            b bVar = (b) n.this.f10176e.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // m7.f
        public void b(Typeface typeface, boolean z10) {
            if (!z10) {
                n.this.f10175d = true;
                b bVar = (b) n.this.f10176e.get();
                if (bVar != null) {
                    bVar.a();
                }
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public n(b bVar) {
        g(bVar);
    }

    private float c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f10172a.measureText(charSequence, 0, charSequence.length());
    }

    public m7.d d() {
        return this.f10177f;
    }

    public TextPaint e() {
        return this.f10172a;
    }

    public float f(String str) {
        if (!this.f10175d) {
            return this.f10174c;
        }
        float c10 = c(str);
        this.f10174c = c10;
        this.f10175d = false;
        return c10;
    }

    public void g(b bVar) {
        this.f10176e = new WeakReference<>(bVar);
    }

    public void h(m7.d dVar, Context context) {
        if (this.f10177f != dVar) {
            this.f10177f = dVar;
            if (dVar != null) {
                dVar.o(context, this.f10172a, this.f10173b);
                b bVar = this.f10176e.get();
                if (bVar != null) {
                    this.f10172a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f10172a, this.f10173b);
                this.f10175d = true;
            }
            b bVar2 = this.f10176e.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void i(boolean z10) {
        this.f10175d = z10;
    }

    public void j(Context context) {
        this.f10177f.n(context, this.f10172a, this.f10173b);
    }
}
