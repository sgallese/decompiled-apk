package t1;

/* compiled from: SemanticsConfiguration.kt */
/* loaded from: classes.dex */
public final class m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SemanticsConfiguration.kt */
    /* loaded from: classes.dex */
    static final class a<T> extends qc.r implements pc.a<T> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23463f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        public final T invoke() {
            return null;
        }
    }

    public static final <T> T a(l lVar, w<T> wVar) {
        qc.q.i(lVar, "<this>");
        qc.q.i(wVar, "key");
        return (T) lVar.k(wVar, a.f23463f);
    }
}
