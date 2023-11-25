package io.noties.markwon.image;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* compiled from: AsyncDrawable.java */
/* loaded from: classes4.dex */
public class a extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private final String f17179a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17180b;

    /* renamed from: c  reason: collision with root package name */
    private final l f17181c;

    /* renamed from: d  reason: collision with root package name */
    private final m f17182d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f17183e;

    /* renamed from: f  reason: collision with root package name */
    private Drawable f17184f;

    /* renamed from: g  reason: collision with root package name */
    private Drawable.Callback f17185g;

    /* renamed from: h  reason: collision with root package name */
    private int f17186h;

    /* renamed from: i  reason: collision with root package name */
    private float f17187i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f17188j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f17189k = false;

    /* compiled from: AsyncDrawable.java */
    /* renamed from: io.noties.markwon.image.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private class C0407a implements Drawable.Callback {

        /* renamed from: f  reason: collision with root package name */
        private final Drawable.Callback f17190f;

        C0407a(Drawable.Callback callback) {
            this.f17190f = callback;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            this.f17190f.invalidateDrawable(a.this);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            this.f17190f.scheduleDrawable(a.this, runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f17190f.unscheduleDrawable(a.this, runnable);
        }
    }

    public a(String str, b bVar, m mVar, l lVar) {
        this.f17179a = str;
        this.f17180b = bVar;
        this.f17182d = mVar;
        this.f17181c = lVar;
        Drawable d10 = bVar.d(this);
        this.f17183e = d10;
        if (d10 != null) {
            m(d10);
        }
    }

    private void g() {
        if (this.f17186h == 0) {
            this.f17188j = true;
            setBounds(j(this.f17184f));
            return;
        }
        this.f17188j = false;
        Rect k10 = k();
        this.f17184f.setBounds(k10);
        this.f17184f.setCallback(this.f17185g);
        setBounds(k10);
        invalidateSelf();
    }

    private static Rect j(Drawable drawable) {
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            if (!bounds.isEmpty()) {
                return bounds;
            }
            Rect b10 = i.b(drawable);
            if (!b10.isEmpty()) {
                return b10;
            }
        }
        return new Rect(0, 0, 1, 1);
    }

    private Rect k() {
        return this.f17182d.resolveImageSize(this);
    }

    public String a() {
        return this.f17179a;
    }

    public l b() {
        return this.f17181c;
    }

    public float c() {
        return this.f17187i;
    }

    public int d() {
        return this.f17186h;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (f()) {
            this.f17184f.draw(canvas);
        }
    }

    public Drawable e() {
        return this.f17184f;
    }

    public boolean f() {
        if (this.f17184f != null) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (f()) {
            return this.f17184f.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (f()) {
            return this.f17184f.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (f()) {
            return this.f17184f.getOpacity();
        }
        return -2;
    }

    public void h(int i10, float f10) {
        this.f17186h = i10;
        this.f17187i = f10;
        if (this.f17188j) {
            g();
        }
    }

    public boolean i() {
        if (getCallback() != null) {
            return true;
        }
        return false;
    }

    public void l(Drawable.Callback callback) {
        C0407a c0407a;
        boolean z10;
        if (callback == null) {
            c0407a = null;
        } else {
            c0407a = new C0407a(callback);
        }
        this.f17185g = c0407a;
        super.setCallback(callback);
        if (this.f17185g != null) {
            Drawable drawable = this.f17184f;
            if (drawable != null && drawable.getCallback() == null) {
                this.f17184f.setCallback(this.f17185g);
            }
            Drawable drawable2 = this.f17184f;
            if (drawable2 != null && drawable2 != this.f17183e) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (drawable2 != null) {
                drawable2.setCallback(this.f17185g);
                Drawable drawable3 = this.f17184f;
                if ((drawable3 instanceof Animatable) && this.f17189k) {
                    ((Animatable) drawable3).start();
                }
            }
            if (z10) {
                this.f17180b.b(this);
                return;
            }
            return;
        }
        Drawable drawable4 = this.f17184f;
        if (drawable4 != null) {
            drawable4.setCallback(null);
            Drawable drawable5 = this.f17184f;
            if (drawable5 instanceof Animatable) {
                Animatable animatable = (Animatable) drawable5;
                boolean isRunning = animatable.isRunning();
                this.f17189k = isRunning;
                if (isRunning) {
                    animatable.stop();
                }
            }
        }
        this.f17180b.a(this);
    }

    protected void m(Drawable drawable) {
        Drawable drawable2 = this.f17184f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        Rect bounds = drawable.getBounds();
        if (bounds.isEmpty()) {
            Rect b10 = i.b(drawable);
            if (b10.isEmpty()) {
                drawable.setBounds(0, 0, 1, 1);
            } else {
                drawable.setBounds(b10);
            }
            setBounds(drawable.getBounds());
            n(drawable);
            return;
        }
        this.f17184f = drawable;
        drawable.setCallback(this.f17185g);
        setBounds(bounds);
        this.f17188j = false;
    }

    public void n(Drawable drawable) {
        this.f17189k = false;
        Drawable drawable2 = this.f17184f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f17184f = drawable;
        g();
    }

    public String toString() {
        return "AsyncDrawable{destination='" + this.f17179a + "', imageSize=" + this.f17181c + ", result=" + this.f17184f + ", canvasWidth=" + this.f17186h + ", textSize=" + this.f17187i + ", waitingForDimensions=" + this.f17188j + '}';
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
