package b3;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import b3.b;

/* compiled from: SpringAnimation.java */
/* loaded from: classes.dex */
public final class d extends b<d> {
    private e A;
    private float B;
    private boolean C;

    public <K> d(K k10, c<K> cVar) {
        super(k10, cVar);
        this.A = null;
        this.B = Float.MAX_VALUE;
        this.C = false;
    }

    private void o() {
        e eVar = this.A;
        if (eVar != null) {
            double a10 = eVar.a();
            if (a10 <= this.f7904g) {
                if (a10 >= this.f7905h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // b3.b
    public void i() {
        o();
        this.A.g(d());
        super.i();
    }

    @Override // b3.b
    boolean k(long j10) {
        if (this.C) {
            float f10 = this.B;
            if (f10 != Float.MAX_VALUE) {
                this.A.e(f10);
                this.B = Float.MAX_VALUE;
            }
            this.f7899b = this.A.a();
            this.f7898a = 0.0f;
            this.C = false;
            return true;
        }
        if (this.B != Float.MAX_VALUE) {
            this.A.a();
            long j11 = j10 / 2;
            b.o h10 = this.A.h(this.f7899b, this.f7898a, j11);
            this.A.e(this.B);
            this.B = Float.MAX_VALUE;
            b.o h11 = this.A.h(h10.f7910a, h10.f7911b, j11);
            this.f7899b = h11.f7910a;
            this.f7898a = h11.f7911b;
        } else {
            b.o h12 = this.A.h(this.f7899b, this.f7898a, j10);
            this.f7899b = h12.f7910a;
            this.f7898a = h12.f7911b;
        }
        float max = Math.max(this.f7899b, this.f7905h);
        this.f7899b = max;
        float min = Math.min(max, this.f7904g);
        this.f7899b = min;
        if (!n(min, this.f7898a)) {
            return false;
        }
        this.f7899b = this.A.a();
        this.f7898a = 0.0f;
        return true;
    }

    public void l(float f10) {
        if (e()) {
            this.B = f10;
            return;
        }
        if (this.A == null) {
            this.A = new e(f10);
        }
        this.A.e(f10);
        i();
    }

    public boolean m() {
        if (this.A.f7914b > 0.0d) {
            return true;
        }
        return false;
    }

    boolean n(float f10, float f11) {
        return this.A.c(f10, f11);
    }

    public d p(e eVar) {
        this.A = eVar;
        return this;
    }

    public void q() {
        if (m()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f7903f) {
                    this.C = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }
}
