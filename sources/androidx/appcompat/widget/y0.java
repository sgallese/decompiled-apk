package androidx.appcompat.widget;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class y0 {

    /* renamed from: a  reason: collision with root package name */
    private int f1713a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f1714b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f1715c = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: d  reason: collision with root package name */
    private int f1716d = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: e  reason: collision with root package name */
    private int f1717e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f1718f = 0;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1719g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1720h = false;

    public int a() {
        if (this.f1719g) {
            return this.f1713a;
        }
        return this.f1714b;
    }

    public int b() {
        return this.f1713a;
    }

    public int c() {
        return this.f1714b;
    }

    public int d() {
        if (this.f1719g) {
            return this.f1714b;
        }
        return this.f1713a;
    }

    public void e(int i10, int i11) {
        this.f1720h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f1717e = i10;
            this.f1713a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1718f = i11;
            this.f1714b = i11;
        }
    }

    public void f(boolean z10) {
        if (z10 == this.f1719g) {
            return;
        }
        this.f1719g = z10;
        if (this.f1720h) {
            if (z10) {
                int i10 = this.f1716d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f1717e;
                }
                this.f1713a = i10;
                int i11 = this.f1715c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f1718f;
                }
                this.f1714b = i11;
                return;
            }
            int i12 = this.f1715c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = this.f1717e;
            }
            this.f1713a = i12;
            int i13 = this.f1716d;
            if (i13 == Integer.MIN_VALUE) {
                i13 = this.f1718f;
            }
            this.f1714b = i13;
            return;
        }
        this.f1713a = this.f1717e;
        this.f1714b = this.f1718f;
    }

    public void g(int i10, int i11) {
        this.f1715c = i10;
        this.f1716d = i11;
        this.f1720h = true;
        if (this.f1719g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1713a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1714b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1713a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1714b = i11;
        }
    }
}
