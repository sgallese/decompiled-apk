package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import g6.g;
import i6.u;
import java.util.Arrays;
import java.util.List;
import k8.c;
import k8.e;
import k8.h;
import k8.r;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$getComponents$0(e eVar) {
        u.f((Context) eVar.a(Context.class));
        return u.c().g(a.f9300h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return Arrays.asList(c.c(g.class).h(LIBRARY_NAME).b(r.j(Context.class)).f(new h() { // from class: z8.a
            @Override // k8.h
            public final Object a(e eVar) {
                g lambda$getComponents$0;
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(eVar);
                return lambda$getComponents$0;
            }
        }).d(), ca.h.b(LIBRARY_NAME, "18.1.7"));
    }
}
