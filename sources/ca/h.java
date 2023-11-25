package ca;

import android.content.Context;
import k8.r;

/* compiled from: LibraryVersionComponent.java */
/* loaded from: classes3.dex */
public class h {

    /* compiled from: LibraryVersionComponent.java */
    /* loaded from: classes3.dex */
    public interface a<T> {
        String a(T t10);
    }

    public static k8.c<?> b(String str, String str2) {
        return k8.c.l(f.a(str, str2), f.class);
    }

    public static k8.c<?> c(final String str, final a<Context> aVar) {
        return k8.c.m(f.class).b(r.j(Context.class)).f(new k8.h() { // from class: ca.g
            @Override // k8.h
            public final Object a(k8.e eVar) {
                f d10;
                d10 = h.d(str, aVar, eVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f d(String str, a aVar, k8.e eVar) {
        return f.a(str, aVar.a((Context) eVar.a(Context.class)));
    }
}
