package s0;

import j0.e0;
import j0.f0;
import j0.g3;
import j0.h0;
import j0.n;
import j0.y2;
import java.util.Arrays;
import pc.l;
import qc.q;
import qc.r;
import s0.f;

/* compiled from: RememberSaveable.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int f22892a = 36;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RememberSaveable.kt */
    /* loaded from: classes.dex */
    public static final class a extends r implements l<f0, e0> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f22893f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f22894m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ g3<i<T, Object>> f22895p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ g3<T> f22896q;

        /* compiled from: Effects.kt */
        /* renamed from: s0.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0526a implements e0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.a f22897a;

            public C0526a(f.a aVar) {
                this.f22897a = aVar;
            }

            @Override // j0.e0
            public void dispose() {
                this.f22897a.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RememberSaveable.kt */
        /* renamed from: s0.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0527b extends r implements pc.a<Object> {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ g3<i<T, Object>> f22898f;

            /* renamed from: m  reason: collision with root package name */
            final /* synthetic */ g3<T> f22899m;

            /* renamed from: p  reason: collision with root package name */
            final /* synthetic */ f f22900p;

            /* compiled from: RememberSaveable.kt */
            /* renamed from: s0.b$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            static final class C0528a implements k {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ f f22901a;

                C0528a(f fVar) {
                    this.f22901a = fVar;
                }

                @Override // s0.k
                public final boolean a(Object obj) {
                    q.i(obj, "it");
                    return this.f22901a.a(obj);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0527b(g3<? extends i<T, Object>> g3Var, g3<? extends T> g3Var2, f fVar) {
                super(0);
                this.f22898f = g3Var;
                this.f22899m = g3Var2;
                this.f22900p = fVar;
            }

            @Override // pc.a
            public final Object invoke() {
                return ((i) this.f22898f.getValue()).b(new C0528a(this.f22900p), this.f22899m.getValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f fVar, String str, g3<? extends i<T, Object>> g3Var, g3<? extends T> g3Var2) {
            super(1);
            this.f22893f = fVar;
            this.f22894m = str;
            this.f22895p = g3Var;
            this.f22896q = g3Var2;
        }

        @Override // pc.l
        public final e0 invoke(f0 f0Var) {
            q.i(f0Var, "$this$DisposableEffect");
            C0527b c0527b = new C0527b(this.f22895p, this.f22896q, this.f22893f);
            b.c(this.f22893f, c0527b.invoke());
            return new C0526a(this.f22893f.d(this.f22894m, c0527b));
        }
    }

    public static final <T> T b(Object[] objArr, i<T, ? extends Object> iVar, String str, pc.a<? extends T> aVar, j0.l lVar, int i10, int i11) {
        boolean z10;
        Object c10;
        int a10;
        q.i(objArr, "inputs");
        q.i(aVar, "init");
        lVar.e(441892779);
        if ((i11 & 2) != 0) {
            iVar = j.b();
        }
        T t10 = null;
        if ((i11 & 4) != 0) {
            str = null;
        }
        if (n.K()) {
            n.V(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:65)");
        }
        lVar.e(1059366469);
        if (str != null && str.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            int a11 = j0.j.a(lVar, 0);
            a10 = yc.b.a(f22892a);
            str = Integer.toString(a11, a10);
            q.h(str, "toString(this, checkRadix(radix))");
        }
        lVar.N();
        q.g(iVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        f fVar = (f) lVar.C(h.b());
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        lVar.e(-568225417);
        boolean z11 = false;
        for (Object obj : copyOf) {
            z11 |= lVar.Q(obj);
        }
        T t11 = (T) lVar.f();
        if (z11 || t11 == j0.l.f18688a.a()) {
            if (fVar != null && (c10 = fVar.c(str)) != null) {
                t10 = iVar.a(c10);
            }
            if (t10 == null) {
                t11 = aVar.invoke();
            } else {
                t11 = t10;
            }
            lVar.J(t11);
        }
        lVar.N();
        if (fVar != null) {
            h0.a(fVar, str, new a(fVar, str, y2.m(iVar, lVar, 0), y2.m(t11, lVar, 0)), lVar, 0);
        }
        if (n.K()) {
            n.U();
        }
        lVar.N();
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(f fVar, Object obj) {
        String str;
        if (obj != null && !fVar.a(obj)) {
            if (obj instanceof t0.q) {
                t0.q qVar = (t0.q) obj;
                if (qVar.c() != y2.j() && qVar.c() != y2.o() && qVar.c() != y2.l()) {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                } else {
                    str = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                }
            } else {
                str = obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }
}
