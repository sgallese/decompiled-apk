package com.google.firebase.ktx;

import ad.g0;
import ad.o1;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ec.t;
import java.util.List;
import java.util.concurrent.Executor;
import k8.b0;
import k8.e;
import k8.h;
import k8.r;
import qc.q;

/* compiled from: Firebase.kt */
@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f11555a = new a<>();

        @Override // k8.h
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 a(e eVar) {
            Object f10 = eVar.f(b0.a(j8.a.class, Executor.class));
            q.h(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes3.dex */
    public static final class b<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f11556a = new b<>();

        @Override // k8.h
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 a(e eVar) {
            Object f10 = eVar.f(b0.a(j8.c.class, Executor.class));
            q.h(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes3.dex */
    public static final class c<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f11557a = new c<>();

        @Override // k8.h
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 a(e eVar) {
            Object f10 = eVar.f(b0.a(j8.b.class, Executor.class));
            q.h(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    /* loaded from: classes3.dex */
    public static final class d<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f11558a = new d<>();

        @Override // k8.h
        /* renamed from: b  reason: merged with bridge method [inline-methods] */
        public final g0 a(e eVar) {
            Object f10 = eVar.f(b0.a(j8.d.class, Executor.class));
            q.h(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return o1.a((Executor) f10);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k8.c<?>> getComponents() {
        List<k8.c<?>> l10;
        k8.c d10 = k8.c.e(b0.a(j8.a.class, g0.class)).b(r.k(b0.a(j8.a.class, Executor.class))).f(a.f11555a).d();
        q.h(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k8.c d11 = k8.c.e(b0.a(j8.c.class, g0.class)).b(r.k(b0.a(j8.c.class, Executor.class))).f(b.f11556a).d();
        q.h(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k8.c d12 = k8.c.e(b0.a(j8.b.class, g0.class)).b(r.k(b0.a(j8.b.class, Executor.class))).f(c.f11557a).d();
        q.h(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        k8.c d13 = k8.c.e(b0.a(j8.d.class, g0.class)).b(r.k(b0.a(j8.d.class, Executor.class))).f(d.f11558a).d();
        q.h(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        l10 = t.l(ca.h.b("fire-core-ktx", "20.3.2"), d10, d11, d12, d13);
        return l10;
    }
}
