package ad;

import hc.f;

/* compiled from: CoroutineName.kt */
/* loaded from: classes4.dex */
public final class j0 extends hc.a {

    /* renamed from: m  reason: collision with root package name */
    public static final a f529m = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private final String f530f;

    /* compiled from: CoroutineName.kt */
    /* loaded from: classes4.dex */
    public static final class a implements f.c<j0> {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    public final String A0() {
        return this.f530f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j0) && qc.q.d(this.f530f, ((j0) obj).f530f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f530f.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f530f + ')';
    }
}
