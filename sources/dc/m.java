package dc;

import java.io.Serializable;

/* compiled from: Result.kt */
/* loaded from: classes4.dex */
public final class m<T> implements Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final a f13253f = new a(null);

    /* compiled from: Result.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    /* loaded from: classes4.dex */
    public static final class b implements Serializable {

        /* renamed from: f  reason: collision with root package name */
        public final Throwable f13254f;

        public b(Throwable th) {
            qc.q.i(th, "exception");
            this.f13254f = th;
        }

        public boolean equals(Object obj) {
            if ((obj instanceof b) && qc.q.d(this.f13254f, ((b) obj).f13254f)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f13254f.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f13254f + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f13254f;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static final boolean d(Object obj) {
        return !(obj instanceof b);
    }

    public static <T> Object a(Object obj) {
        return obj;
    }
}
