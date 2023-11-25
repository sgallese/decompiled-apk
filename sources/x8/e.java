package x8;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f25874a;

    /* renamed from: b  reason: collision with root package name */
    public final String f25875b;

    /* renamed from: c  reason: collision with root package name */
    public final StackTraceElement[] f25876c;

    /* renamed from: d  reason: collision with root package name */
    public final e f25877d;

    public e(Throwable th, d dVar) {
        e eVar;
        this.f25874a = th.getLocalizedMessage();
        this.f25875b = th.getClass().getName();
        this.f25876c = dVar.a(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            eVar = new e(cause, dVar);
        } else {
            eVar = null;
        }
        this.f25877d = eVar;
    }
}
