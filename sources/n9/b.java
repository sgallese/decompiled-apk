package n9;

/* compiled from: SystemClock.java */
/* loaded from: classes3.dex */
public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static b f20299a;

    private b() {
    }

    public static b a() {
        if (f20299a == null) {
            f20299a = new b();
        }
        return f20299a;
    }

    @Override // n9.a
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}
