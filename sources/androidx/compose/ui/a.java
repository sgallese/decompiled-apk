package androidx.compose.ui;

import androidx.compose.ui.e;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: Modifier.kt */
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: c  reason: collision with root package name */
    private final e f2317c;

    /* renamed from: d  reason: collision with root package name */
    private final e f2318d;

    /* compiled from: Modifier.kt */
    /* renamed from: androidx.compose.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0032a extends r implements p<String, e.b, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final C0032a f2319f = new C0032a();

        C0032a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, e.b bVar) {
            boolean z10;
            q.i(str, "acc");
            q.i(bVar, "element");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    public a(e eVar, e eVar2) {
        q.i(eVar, "outer");
        q.i(eVar2, "inner");
        this.f2317c = eVar;
        this.f2318d = eVar2;
    }

    @Override // androidx.compose.ui.e
    public /* synthetic */ e a(e eVar) {
        return v0.d.a(this, eVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.e
    public <R> R b(R r10, p<? super R, ? super e.b, ? extends R> pVar) {
        q.i(pVar, "operation");
        return (R) this.f2318d.b(this.f2317c.b(r10, pVar), pVar);
    }

    public final e e() {
        return this.f2318d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (q.d(this.f2317c, aVar.f2317c) && q.d(this.f2318d, aVar.f2318d)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.e
    public boolean h(l<? super e.b, Boolean> lVar) {
        q.i(lVar, "predicate");
        if (this.f2317c.h(lVar) && this.f2318d.h(lVar)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f2317c.hashCode() + (this.f2318d.hashCode() * 31);
    }

    public final e m() {
        return this.f2317c;
    }

    public String toString() {
        return '[' + ((String) b("", C0032a.f2319f)) + ']';
    }
}
