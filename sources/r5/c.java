package r5;

import qc.q;
import r5.f;

/* compiled from: Plugin.kt */
/* loaded from: classes.dex */
public interface c extends f {

    /* compiled from: Plugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static void a(c cVar) {
            q.i(cVar, "this");
        }

        public static q5.c b(c cVar, q5.c cVar2) {
            q.i(cVar, "this");
            q.i(cVar2, "payload");
            return cVar2;
        }

        public static q5.e c(c cVar, q5.e eVar) {
            q.i(cVar, "this");
            q.i(eVar, "payload");
            return eVar;
        }

        public static q5.i d(c cVar, q5.i iVar) {
            q.i(cVar, "this");
            q.i(iVar, "payload");
            return iVar;
        }

        public static void e(c cVar, p5.a aVar) {
            q.i(cVar, "this");
            q.i(aVar, "amplitude");
            f.a.b(cVar, aVar);
        }

        public static q5.a f(c cVar, q5.a aVar) {
            q.i(cVar, "this");
            q.i(aVar, "payload");
            return aVar;
        }
    }

    q5.c d(q5.c cVar);

    q5.i e(q5.i iVar);

    q5.a f(q5.a aVar);

    void flush();

    q5.e g(q5.e eVar);
}
