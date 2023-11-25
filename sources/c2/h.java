package c2;

import qc.q;

/* compiled from: Locale.kt */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8696b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final j f8697a;

    /* compiled from: Locale.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final h a() {
            return l.a().b().e(0);
        }
    }

    public h(j jVar) {
        q.i(jVar, "platformLocale");
        this.f8697a = jVar;
    }

    public final j a() {
        return this.f8697a;
    }

    public final String b() {
        return this.f8697a.a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return q.d(b(), ((h) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(String str) {
        this(l.a().c(str));
        q.i(str, "languageTag");
    }
}
