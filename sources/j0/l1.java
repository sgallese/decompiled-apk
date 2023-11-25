package j0;

import kotlin.KotlinNothingValueException;

/* compiled from: Applier.kt */
/* loaded from: classes.dex */
public final class l1<N> implements f<N> {

    /* renamed from: a  reason: collision with root package name */
    private final f<N> f18695a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18696b;

    /* renamed from: c  reason: collision with root package name */
    private int f18697c;

    public l1(f<N> fVar, int i10) {
        qc.q.i(fVar, "applier");
        this.f18695a = fVar;
        this.f18696b = i10;
    }

    @Override // j0.f
    public void a(int i10, int i11) {
        int i12;
        f<N> fVar = this.f18695a;
        if (this.f18697c == 0) {
            i12 = this.f18696b;
        } else {
            i12 = 0;
        }
        fVar.a(i10 + i12, i11);
    }

    @Override // j0.f
    public N b() {
        return this.f18695a.b();
    }

    @Override // j0.f
    public void c(int i10, N n10) {
        int i11;
        f<N> fVar = this.f18695a;
        if (this.f18697c == 0) {
            i11 = this.f18696b;
        } else {
            i11 = 0;
        }
        fVar.c(i10 + i11, n10);
    }

    @Override // j0.f
    public void clear() {
        n.w("Clear is not valid on OffsetApplier".toString());
        throw new KotlinNothingValueException();
    }

    @Override // j0.f
    public void d(N n10) {
        this.f18697c++;
        this.f18695a.d(n10);
    }

    @Override // j0.f
    public /* synthetic */ void e() {
        e.a(this);
    }

    @Override // j0.f
    public void f(int i10, int i11, int i12) {
        int i13;
        if (this.f18697c == 0) {
            i13 = this.f18696b;
        } else {
            i13 = 0;
        }
        this.f18695a.f(i10 + i13, i11 + i13, i12);
    }

    @Override // j0.f
    public void g() {
        boolean z10;
        int i10 = this.f18697c;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f18697c = i10 - 1;
            this.f18695a.g();
            return;
        }
        n.w("OffsetApplier up called with no corresponding down".toString());
        throw new KotlinNothingValueException();
    }

    @Override // j0.f
    public void h(int i10, N n10) {
        int i11;
        f<N> fVar = this.f18695a;
        if (this.f18697c == 0) {
            i11 = this.f18696b;
        } else {
            i11 = 0;
        }
        fVar.h(i10 + i11, n10);
    }

    @Override // j0.f
    public /* synthetic */ void i() {
        e.b(this);
    }
}
