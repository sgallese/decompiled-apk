package v1;

/* compiled from: AndroidTextStyle.android.kt */
/* loaded from: classes.dex */
public final class c {
    public static final z a(x xVar, w wVar) {
        return new z(xVar, wVar);
    }

    public static final w b(w wVar, w wVar2, float f10) {
        qc.q.i(wVar, "start");
        qc.q.i(wVar2, "stop");
        if (wVar.c() == wVar2.c()) {
            return wVar;
        }
        return new w(((g) c0.d(g.c(wVar.b()), g.c(wVar2.b()), f10)).i(), ((Boolean) c0.d(Boolean.valueOf(wVar.c()), Boolean.valueOf(wVar2.c()), f10)).booleanValue(), null);
    }

    public static final x c(x xVar, x xVar2, float f10) {
        qc.q.i(xVar, "start");
        qc.q.i(xVar2, "stop");
        return xVar;
    }
}
