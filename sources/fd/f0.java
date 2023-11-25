package fd;

import dc.m;

/* compiled from: StackTraceRecovery.kt */
/* loaded from: classes4.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final StackTraceElement f15629a = new a.a().a();

    /* renamed from: b  reason: collision with root package name */
    private static final String f15630b;

    /* renamed from: c  reason: collision with root package name */
    private static final String f15631c;

    static {
        Object a10;
        Object a11;
        try {
            m.a aVar = dc.m.f13253f;
            a10 = dc.m.a(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th) {
            m.a aVar2 = dc.m.f13253f;
            a10 = dc.m.a(dc.n.a(th));
        }
        if (dc.m.b(a10) != null) {
            a10 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f15630b = (String) a10;
        try {
            a11 = dc.m.a(f0.class.getCanonicalName());
        } catch (Throwable th2) {
            m.a aVar3 = dc.m.f13253f;
            a11 = dc.m.a(dc.n.a(th2));
        }
        if (dc.m.b(a11) != null) {
            a11 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f15631c = (String) a11;
    }

    public static final <E extends Throwable> E a(E e10) {
        return e10;
    }
}
