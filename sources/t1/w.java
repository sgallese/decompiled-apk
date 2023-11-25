package t1;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class w<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f23518a;

    /* renamed from: b  reason: collision with root package name */
    private final pc.p<T, T, T> f23519b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    /* loaded from: classes.dex */
    public static final class a extends qc.r implements pc.p<T, T, T> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f23520f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        public final T invoke(T t10, T t11) {
            if (t10 == null) {
                return t11;
            }
            return t10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(String str, pc.p<? super T, ? super T, ? extends T> pVar) {
        qc.q.i(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        qc.q.i(pVar, "mergePolicy");
        this.f23518a = str;
        this.f23519b = pVar;
    }

    public final String a() {
        return this.f23518a;
    }

    public final T b(T t10, T t11) {
        return this.f23519b.invoke(t10, t11);
    }

    public final void c(x xVar, wc.h<?> hVar, T t10) {
        qc.q.i(xVar, "thisRef");
        qc.q.i(hVar, "property");
        xVar.a(this, t10);
    }

    public String toString() {
        return "SemanticsPropertyKey: " + this.f23518a;
    }

    public /* synthetic */ w(String str, pc.p pVar, int i10, qc.h hVar) {
        this(str, (i10 & 2) != 0 ? a.f23520f : pVar);
    }
}
