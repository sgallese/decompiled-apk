package r5;

import qc.q;

/* compiled from: Plugin.kt */
/* loaded from: classes.dex */
public interface f {

    /* compiled from: Plugin.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public static q5.a a(f fVar, q5.a aVar) {
            q.i(fVar, "this");
            q.i(aVar, "event");
            return aVar;
        }

        public static void b(f fVar, p5.a aVar) {
            q.i(fVar, "this");
            q.i(aVar, "amplitude");
            fVar.c(aVar);
        }
    }

    /* compiled from: Plugin.kt */
    /* loaded from: classes.dex */
    public enum b {
        Before,
        Enrichment,
        Destination,
        Utility,
        Observe
    }

    q5.a a(q5.a aVar);

    void b(p5.a aVar);

    void c(p5.a aVar);

    b getType();
}
