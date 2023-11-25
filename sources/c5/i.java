package c5;

import c5.c;
import qc.q;

/* compiled from: Size.kt */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final a f8846c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final i f8847d;

    /* renamed from: a  reason: collision with root package name */
    private final c f8848a;

    /* renamed from: b  reason: collision with root package name */
    private final c f8849b;

    /* compiled from: Size.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }
    }

    static {
        c.b bVar = c.b.f8841a;
        f8847d = new i(bVar, bVar);
    }

    public i(c cVar, c cVar2) {
        this.f8848a = cVar;
        this.f8849b = cVar2;
    }

    public final c a() {
        return this.f8849b;
    }

    public final c b() {
        return this.f8848a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (q.d(this.f8848a, iVar.f8848a) && q.d(this.f8849b, iVar.f8849b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f8848a.hashCode() * 31) + this.f8849b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f8848a + ", height=" + this.f8849b + ')';
    }
}
