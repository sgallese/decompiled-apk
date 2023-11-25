package y;

import y.c;

/* compiled from: IntervalList.kt */
/* loaded from: classes.dex */
public final class g0<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final k0.f<c.a<T>> f26080a = new k0.f<>(new c.a[16], 0);

    /* renamed from: b  reason: collision with root package name */
    private int f26081b;

    /* renamed from: c  reason: collision with root package name */
    private c.a<? extends T> f26082c;

    private final void c(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < getSize()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i10 + ", size " + getSize());
    }

    private final boolean d(c.a<? extends T> aVar, int i10) {
        int b10 = aVar.b();
        if (i10 >= aVar.b() + aVar.a() || b10 > i10) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final c.a<T> e(int i10) {
        int b10;
        c.a aVar = (c.a<? extends T>) this.f26082c;
        if (aVar == null || !d(aVar, i10)) {
            k0.f<c.a<T>> fVar = this.f26080a;
            b10 = d.b(fVar, i10);
            c.a aVar2 = (c.a<T>) fVar.n()[b10];
            this.f26082c = aVar2;
            return aVar2;
        }
        return aVar;
    }

    @Override // y.c
    public void a(int i10, int i11, pc.l<? super c.a<? extends T>, dc.w> lVar) {
        boolean z10;
        int b10;
        qc.q.i(lVar, "block");
        c(i10);
        c(i11);
        if (i11 >= i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            b10 = d.b(this.f26080a, i10);
            int b11 = this.f26080a.n()[b10].b();
            while (b11 <= i11) {
                c.a<T> aVar = this.f26080a.n()[b10];
                lVar.invoke(aVar);
                b11 += aVar.a();
                b10++;
            }
            return;
        }
        throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
    }

    public final void b(int i10, T t10) {
        boolean z10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 == 0) {
                return;
            }
            c.a<T> aVar = new c.a<>(getSize(), i10, t10);
            this.f26081b = getSize() + i10;
            this.f26080a.d(aVar);
            return;
        }
        throw new IllegalArgumentException(("size should be >=0, but was " + i10).toString());
    }

    @Override // y.c
    public c.a<T> get(int i10) {
        c(i10);
        return e(i10);
    }

    @Override // y.c
    public int getSize() {
        return this.f26081b;
    }
}
