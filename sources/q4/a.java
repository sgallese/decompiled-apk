package q4;

import android.content.Context;

/* compiled from: Coil.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21376a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static g f21377b;

    /* renamed from: c  reason: collision with root package name */
    private static h f21378c;

    private a() {
    }

    public static final g a(Context context) {
        g gVar = f21377b;
        if (gVar == null) {
            return f21376a.b(context);
        }
        return gVar;
    }

    private final synchronized g b(Context context) {
        h hVar;
        g a10;
        g gVar = f21377b;
        if (gVar != null) {
            return gVar;
        }
        h hVar2 = f21378c;
        if (hVar2 == null || (a10 = hVar2.a()) == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof h) {
                hVar = (h) applicationContext;
            } else {
                hVar = null;
            }
            if (hVar != null) {
                a10 = hVar.a();
            } else {
                a10 = i.a(context);
            }
        }
        f21378c = null;
        f21377b = a10;
        return a10;
    }

    public static final synchronized void c(g gVar) {
        synchronized (a.class) {
            f21378c = null;
            f21377b = gVar;
        }
    }
}
