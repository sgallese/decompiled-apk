package i6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: TransportRuntime.java */
/* loaded from: classes.dex */
public class u implements t {

    /* renamed from: e  reason: collision with root package name */
    private static volatile v f17092e;

    /* renamed from: a  reason: collision with root package name */
    private final s6.a f17093a;

    /* renamed from: b  reason: collision with root package name */
    private final s6.a f17094b;

    /* renamed from: c  reason: collision with root package name */
    private final o6.e f17095c;

    /* renamed from: d  reason: collision with root package name */
    private final p6.r f17096d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(s6.a aVar, s6.a aVar2, o6.e eVar, p6.r rVar, p6.v vVar) {
        this.f17093a = aVar;
        this.f17094b = aVar2;
        this.f17095c = eVar;
        this.f17096d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        return i.a().i(this.f17093a.a()).k(this.f17094b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public static u c() {
        v vVar = f17092e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<g6.b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(g6.b.b("proto"));
    }

    public static void f(Context context) {
        if (f17092e == null) {
            synchronized (u.class) {
                if (f17092e == null) {
                    f17092e = e.d().a(context).build();
                }
            }
        }
    }

    @Override // i6.t
    public void a(o oVar, g6.h hVar) {
        this.f17095c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public p6.r e() {
        return this.f17096d;
    }

    public g6.g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
