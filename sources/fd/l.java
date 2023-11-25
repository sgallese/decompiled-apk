package fd;

import dc.m;

/* compiled from: FastServiceLoader.kt */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f15650a = false;

    static {
        Object a10;
        try {
            m.a aVar = dc.m.f13253f;
            a10 = dc.m.a(Class.forName("android.os.Build"));
        } catch (Throwable th) {
            m.a aVar2 = dc.m.f13253f;
            a10 = dc.m.a(dc.n.a(th));
        }
        dc.m.d(a10);
    }

    public static final boolean a() {
        return f15650a;
    }
}
