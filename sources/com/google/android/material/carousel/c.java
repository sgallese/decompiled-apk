package com.google.android.material.carousel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: KeylineState.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float f9789a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C0233c> f9790b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9791c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9792d;

    /* compiled from: KeylineState.java */
    /* loaded from: classes3.dex */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final float f9793a;

        /* renamed from: c  reason: collision with root package name */
        private C0233c f9795c;

        /* renamed from: d  reason: collision with root package name */
        private C0233c f9796d;

        /* renamed from: b  reason: collision with root package name */
        private final List<C0233c> f9794b = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        private int f9797e = -1;

        /* renamed from: f  reason: collision with root package name */
        private int f9798f = -1;

        /* renamed from: g  reason: collision with root package name */
        private float f9799g = 0.0f;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(float f10) {
            this.f9793a = f10;
        }

        private static float f(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b a(float f10, float f11, float f12) {
            return b(f10, f11, f12, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b b(float f10, float f11, float f12, boolean z10) {
            if (f12 <= 0.0f) {
                return this;
            }
            C0233c c0233c = new C0233c(Float.MIN_VALUE, f10, f11, f12);
            if (z10) {
                if (this.f9795c == null) {
                    this.f9795c = c0233c;
                    this.f9797e = this.f9794b.size();
                }
                if (this.f9798f != -1 && this.f9794b.size() - this.f9798f > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 == this.f9795c.f9803d) {
                    this.f9796d = c0233c;
                    this.f9798f = this.f9794b.size();
                } else {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
            } else if (this.f9795c == null && c0233c.f9803d < this.f9799g) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            } else {
                if (this.f9796d != null && c0233c.f9803d > this.f9799g) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f9799g = c0233c.f9803d;
            this.f9794b.add(c0233c);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b c(float f10, float f11, float f12, int i10) {
            return d(f10, f11, f12, i10, false);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b d(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    b((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c e() {
            if (this.f9795c != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f9794b.size(); i10++) {
                    C0233c c0233c = this.f9794b.get(i10);
                    arrayList.add(new C0233c(f(this.f9795c.f9801b, this.f9793a, this.f9797e, i10), c0233c.f9801b, c0233c.f9802c, c0233c.f9803d));
                }
                return new c(this.f9793a, arrayList, this.f9797e, this.f9798f);
            }
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: KeylineState.java */
    /* renamed from: com.google.android.material.carousel.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0233c {

        /* renamed from: a  reason: collision with root package name */
        final float f9800a;

        /* renamed from: b  reason: collision with root package name */
        final float f9801b;

        /* renamed from: c  reason: collision with root package name */
        final float f9802c;

        /* renamed from: d  reason: collision with root package name */
        final float f9803d;

        C0233c(float f10, float f11, float f12, float f13) {
            this.f9800a = f10;
            this.f9801b = f11;
            this.f9802c = f12;
            this.f9803d = f13;
        }

        static C0233c a(C0233c c0233c, C0233c c0233c2, float f10) {
            return new C0233c(w6.a.a(c0233c.f9800a, c0233c2.f9800a, f10), w6.a.a(c0233c.f9801b, c0233c2.f9801b, f10), w6.a.a(c0233c.f9802c, c0233c2.f9802c, f10), w6.a.a(c0233c.f9803d, c0233c2.f9803d, f10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c i(c cVar, c cVar2, float f10) {
        if (cVar.d() == cVar2.d()) {
            List<C0233c> e10 = cVar.e();
            List<C0233c> e11 = cVar2.e();
            if (e10.size() == e11.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < cVar.e().size(); i10++) {
                    arrayList.add(C0233c.a(e10.get(i10), e11.get(i10), f10));
                }
                return new c(cVar.d(), arrayList, w6.a.c(cVar.b(), cVar2.b(), f10), w6.a.c(cVar.g(), cVar2.g(), f10));
            }
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c j(c cVar) {
        boolean z10;
        b bVar = new b(cVar.d());
        float f10 = cVar.c().f9801b - (cVar.c().f9803d / 2.0f);
        for (int size = cVar.e().size() - 1; size >= 0; size--) {
            C0233c c0233c = cVar.e().get(size);
            float f11 = (c0233c.f9803d / 2.0f) + f10;
            if (size >= cVar.b() && size <= cVar.g()) {
                z10 = true;
            } else {
                z10 = false;
            }
            bVar.b(f11, c0233c.f9802c, c0233c.f9803d, z10);
            f10 += c0233c.f9803d;
        }
        return bVar.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233c a() {
        return this.f9790b.get(this.f9791c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f9791c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233c c() {
        return this.f9790b.get(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float d() {
        return this.f9789a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<C0233c> e() {
        return this.f9790b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233c f() {
        return this.f9790b.get(this.f9792d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f9792d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0233c h() {
        return this.f9790b.get(r0.size() - 1);
    }

    private c(float f10, List<C0233c> list, int i10, int i11) {
        this.f9789a = f10;
        this.f9790b = Collections.unmodifiableList(list);
        this.f9791c = i10;
        this.f9792d = i11;
    }
}
