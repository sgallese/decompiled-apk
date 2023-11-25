package w0;

import java.util.List;

/* compiled from: Autofill.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f25252d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f25253e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final List<e0> f25254a;

    /* renamed from: b  reason: collision with root package name */
    private z0.h f25255b;

    /* renamed from: c  reason: collision with root package name */
    private final pc.l<String, dc.w> f25256c;

    /* compiled from: Autofill.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public final List<e0> a() {
        return this.f25254a;
    }

    public final z0.h b() {
        return this.f25255b;
    }

    public final pc.l<String, dc.w> c() {
        return this.f25256c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (qc.q.d(this.f25254a, c0Var.f25254a) && qc.q.d(this.f25255b, c0Var.f25255b) && qc.q.d(this.f25256c, c0Var.f25256c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f25254a.hashCode() * 31;
        z0.h hVar = this.f25255b;
        int i11 = 0;
        if (hVar != null) {
            i10 = hVar.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (hashCode + i10) * 31;
        pc.l<String, dc.w> lVar = this.f25256c;
        if (lVar != null) {
            i11 = lVar.hashCode();
        }
        return i12 + i11;
    }
}
