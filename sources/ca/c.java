package ca;

import java.util.Iterator;
import java.util.Set;
import k8.r;

/* compiled from: DefaultUserAgentPublisher.java */
/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a  reason: collision with root package name */
    private final String f8896a;

    /* renamed from: b  reason: collision with root package name */
    private final d f8897b;

    c(Set<f> set, d dVar) {
        this.f8896a = e(set);
        this.f8897b = dVar;
    }

    public static k8.c<i> c() {
        return k8.c.c(i.class).b(r.m(f.class)).f(new k8.h() { // from class: ca.b
            @Override // k8.h
            public final Object a(k8.e eVar) {
                i d10;
                d10 = c.d(eVar);
                return d10;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(k8.e eVar) {
        return new c(eVar.g(f.class), d.a());
    }

    private static String e(Set<f> set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<f> it = set.iterator();
        while (it.hasNext()) {
            f next = it.next();
            sb2.append(next.b());
            sb2.append('/');
            sb2.append(next.c());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    @Override // ca.i
    public String a() {
        if (this.f8897b.b().isEmpty()) {
            return this.f8896a;
        }
        return this.f8896a + ' ' + e(this.f8897b.b());
    }
}
