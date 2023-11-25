package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.l;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.c;
import g6.g;
import j8.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import k8.b0;
import k8.e;
import k8.h;
import k8.r;
import s9.b;
import t9.a;

@Keep
/* loaded from: classes3.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b lambda$getComponents$0(b0 b0Var, e eVar) {
        return new b((com.google.firebase.e) eVar.a(com.google.firebase.e.class), (l) eVar.c(l.class).get(), (Executor) eVar.f(b0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static s9.e providesFirebasePerformance(e eVar) {
        eVar.a(b.class);
        return a.b().b(new u9.a((com.google.firebase.e) eVar.a(com.google.firebase.e.class), (j9.e) eVar.a(j9.e.class), eVar.c(c.class), eVar.c(g.class))).a().a();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<k8.c<?>> getComponents() {
        final b0 a10 = b0.a(d.class, Executor.class);
        return Arrays.asList(k8.c.c(s9.e.class).h(LIBRARY_NAME).b(r.j(com.google.firebase.e.class)).b(r.l(c.class)).b(r.j(j9.e.class)).b(r.l(g.class)).b(r.j(b.class)).f(new h() { // from class: s9.c
            @Override // k8.h
            public final Object a(k8.e eVar) {
                e providesFirebasePerformance;
                providesFirebasePerformance = FirebasePerfRegistrar.providesFirebasePerformance(eVar);
                return providesFirebasePerformance;
            }
        }).d(), k8.c.c(b.class).h(EARLY_LIBRARY_NAME).b(r.j(com.google.firebase.e.class)).b(r.i(l.class)).b(r.k(a10)).e().f(new h() { // from class: s9.d
            @Override // k8.h
            public final Object a(k8.e eVar) {
                b lambda$getComponents$0;
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(b0.this, eVar);
                return lambda$getComponents$0;
            }
        }).d(), ca.h.b(LIBRARY_NAME, "20.3.1"));
    }
}
