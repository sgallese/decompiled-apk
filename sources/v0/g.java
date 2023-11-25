package v0;

import hc.f;
import pc.p;
import qc.q;

/* compiled from: MotionDurationScale.kt */
/* loaded from: classes.dex */
public interface g extends f.b {

    /* renamed from: o  reason: collision with root package name */
    public static final b f24279o = b.f24280f;

    /* compiled from: MotionDurationScale.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static <R> R a(g gVar, R r10, p<? super R, ? super f.b, ? extends R> pVar) {
            q.i(pVar, "operation");
            return (R) f.b.a.a(gVar, r10, pVar);
        }

        public static <E extends f.b> E b(g gVar, f.c<E> cVar) {
            q.i(cVar, "key");
            return (E) f.b.a.b(gVar, cVar);
        }

        public static hc.f c(g gVar, f.c<?> cVar) {
            q.i(cVar, "key");
            return f.b.a.c(gVar, cVar);
        }

        public static hc.f d(g gVar, hc.f fVar) {
            q.i(fVar, "context");
            return f.b.a.d(gVar, fVar);
        }
    }

    /* compiled from: MotionDurationScale.kt */
    /* loaded from: classes.dex */
    public static final class b implements f.c<g> {

        /* renamed from: f  reason: collision with root package name */
        static final /* synthetic */ b f24280f = new b();

        private b() {
        }
    }

    float I();
}
