package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import g9.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import k8.b0;
import k8.r;
import l8.k;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ j9.e lambda$getComponents$0(k8.e eVar) {
        return new c((com.google.firebase.e) eVar.a(com.google.firebase.e.class), eVar.c(i.class), (ExecutorService) eVar.f(b0.a(j8.a.class, ExecutorService.class)), k.b((Executor) eVar.f(b0.a(j8.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k8.c<?>> getComponents() {
        return Arrays.asList(k8.c.c(j9.e.class).h(LIBRARY_NAME).b(r.j(com.google.firebase.e.class)).b(r.i(i.class)).b(r.k(b0.a(j8.a.class, ExecutorService.class))).b(r.k(b0.a(j8.b.class, Executor.class))).f(new k8.h() { // from class: j9.f
            @Override // k8.h
            public final Object a(k8.e eVar) {
                e lambda$getComponents$0;
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), g9.h.a(), ca.h.b(LIBRARY_NAME, "17.1.3"));
    }
}
