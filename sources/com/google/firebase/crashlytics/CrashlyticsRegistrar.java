package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;
import k8.c;
import k8.e;
import k8.h;
import k8.r;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public a b(e eVar) {
        return a.b((com.google.firebase.e) eVar.a(com.google.firebase.e.class), (j9.e) eVar.a(j9.e.class), eVar.i(n8.a.class), eVar.i(i8.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(a.class).h("fire-cls").b(r.j(com.google.firebase.e.class)).b(r.j(j9.e.class)).b(r.a(n8.a.class)).b(r.a(i8.a.class)).f(new h() { // from class: m8.f
            @Override // k8.h
            public final Object a(k8.e eVar) {
                com.google.firebase.crashlytics.a b10;
                b10 = CrashlyticsRegistrar.this.b(eVar);
                return b10;
            }
        }).e().d(), ca.h.b("fire-cls", "18.3.6"));
    }
}
