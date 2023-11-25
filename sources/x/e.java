package x;

import kotlin.coroutines.Continuation;
import y.c0;

/* compiled from: LazyLayoutSemanticState.kt */
/* loaded from: classes.dex */
public final class e {

    /* compiled from: LazyLayoutSemanticState.kt */
    /* loaded from: classes.dex */
    public static final class a implements c0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f25556a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f25557b;

        a(a0 a0Var, boolean z10) {
            this.f25556a = a0Var;
            this.f25557b = z10;
        }

        @Override // y.c0
        public boolean a() {
            return this.f25556a.a();
        }

        @Override // y.c0
        public Object b(int i10, Continuation<? super dc.w> continuation) {
            Object d10;
            Object z10 = a0.z(this.f25556a, i10, 0, continuation, 2, null);
            d10 = ic.d.d();
            if (z10 == d10) {
                return z10;
            }
            return dc.w.f13270a;
        }

        @Override // y.c0
        public Object c(float f10, Continuation<? super dc.w> continuation) {
            Object d10;
            Object b10 = u.t.b(this.f25556a, f10, null, continuation, 2, null);
            d10 = ic.d.d();
            if (b10 == d10) {
                return b10;
            }
            return dc.w.f13270a;
        }

        @Override // y.c0
        public t1.b d() {
            if (this.f25557b) {
                return new t1.b(-1, 1);
            }
            return new t1.b(1, -1);
        }

        @Override // y.c0
        public float e() {
            return this.f25556a.l() + (this.f25556a.m() / 100000.0f);
        }
    }

    public static final c0 a(a0 a0Var, boolean z10) {
        qc.q.i(a0Var, "state");
        return new a(a0Var, z10);
    }
}
