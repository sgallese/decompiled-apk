package vc;

import ec.h0;

/* compiled from: Progressions.kt */
/* loaded from: classes4.dex */
public class d implements Iterable<Integer>, rc.a {

    /* renamed from: q  reason: collision with root package name */
    public static final a f25115q = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final int f25116f;

    /* renamed from: m  reason: collision with root package name */
    private final int f25117m;

    /* renamed from: p  reason: collision with root package name */
    private final int f25118p;

    /* compiled from: Progressions.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final d a(int i10, int i11, int i12) {
            return new d(i10, i11, i12);
        }
    }

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f25116f = i10;
                this.f25117m = kc.c.c(i10, i11, i12);
                this.f25118p = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f25116f != dVar.f25116f || this.f25117m != dVar.f25117m || this.f25118p != dVar.f25118p) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.f25116f;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f25116f * 31) + this.f25117m) * 31) + this.f25118p;
    }

    public final int i() {
        return this.f25117m;
    }

    public boolean isEmpty() {
        if (this.f25118p > 0) {
            if (this.f25116f > this.f25117m) {
                return true;
            }
        } else if (this.f25116f < this.f25117m) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f25118p;
    }

    @Override // java.lang.Iterable
    /* renamed from: k  reason: merged with bridge method [inline-methods] */
    public h0 iterator() {
        return new e(this.f25116f, this.f25117m, this.f25118p);
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        if (this.f25118p > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f25116f);
            sb2.append("..");
            sb2.append(this.f25117m);
            sb2.append(" step ");
            i10 = this.f25118p;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f25116f);
            sb2.append(" downTo ");
            sb2.append(this.f25117m);
            sb2.append(" step ");
            i10 = -this.f25118p;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
