package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import k8.b0;
import k8.e;
import k8.h;
import k8.r;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$getComponents$0(b0 b0Var, e eVar) {
        return new c((Context) eVar.a(Context.class), (ScheduledExecutorService) eVar.f(b0Var), (com.google.firebase.e) eVar.a(com.google.firebase.e.class), (j9.e) eVar.a(j9.e.class), ((com.google.firebase.abt.component.a) eVar.a(com.google.firebase.abt.component.a.class)).b("frc"), eVar.c(i8.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<k8.c<?>> getComponents() {
        final b0 a10 = b0.a(j8.b.class, ScheduledExecutorService.class);
        return Arrays.asList(k8.c.c(c.class).h(LIBRARY_NAME).b(r.j(Context.class)).b(r.k(a10)).b(r.j(com.google.firebase.e.class)).b(r.j(j9.e.class)).b(r.j(com.google.firebase.abt.component.a.class)).b(r.i(i8.a.class)).f(new h() { // from class: da.o
            @Override // k8.h
            public final Object a(k8.e eVar) {
                com.google.firebase.remoteconfig.c lambda$getComponents$0;
                lambda$getComponents$0 = RemoteConfigRegistrar.lambda$getComponents$0(b0.this, eVar);
                return lambda$getComponents$0;
            }
        }).e().d(), ca.h.b(LIBRARY_NAME, "21.3.0"));
    }
}
