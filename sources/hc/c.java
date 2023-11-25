package hc;

import hc.f;
import java.io.Serializable;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes4.dex */
public final class c implements f, Serializable {

    /* renamed from: f  reason: collision with root package name */
    private final f f16595f;

    /* renamed from: m  reason: collision with root package name */
    private final f.b f16596m;

    /* compiled from: CoroutineContextImpl.kt */
    /* loaded from: classes4.dex */
    static final class a extends r implements p<String, f.b, String> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f16597f = new a();

        a() {
            super(2);
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, f.b bVar) {
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

    public c(f fVar, f.b bVar) {
        q.i(fVar, "left");
        q.i(bVar, "element");
        this.f16595f = fVar;
        this.f16596m = bVar;
    }

    private final boolean a(f.b bVar) {
        return q.d(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (a(cVar.f16596m)) {
            f fVar = cVar.f16595f;
            if (fVar instanceof c) {
                cVar = (c) fVar;
            } else {
                q.g(fVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return a((f.b) fVar);
            }
        }
        return false;
    }

    private final int f() {
        int i10 = 2;
        c cVar = this;
        while (true) {
            f fVar = cVar.f16595f;
            if (fVar instanceof c) {
                cVar = (c) fVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f() != f() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // hc.f
    public <R> R fold(R r10, p<? super R, ? super f.b, ? extends R> pVar) {
        q.i(pVar, "operation");
        return pVar.invoke((Object) this.f16595f.fold(r10, pVar), this.f16596m);
    }

    @Override // hc.f
    public <E extends f.b> E get(f.c<E> cVar) {
        q.i(cVar, "key");
        c cVar2 = this;
        while (true) {
            E e10 = (E) cVar2.f16596m.get(cVar);
            if (e10 != null) {
                return e10;
            }
            f fVar = cVar2.f16595f;
            if (fVar instanceof c) {
                cVar2 = (c) fVar;
            } else {
                return (E) fVar.get(cVar);
            }
        }
    }

    public int hashCode() {
        return this.f16595f.hashCode() + this.f16596m.hashCode();
    }

    @Override // hc.f
    public f minusKey(f.c<?> cVar) {
        q.i(cVar, "key");
        if (this.f16596m.get(cVar) != null) {
            return this.f16595f;
        }
        f minusKey = this.f16595f.minusKey(cVar);
        if (minusKey == this.f16595f) {
            return this;
        }
        if (minusKey == g.f16601f) {
            return this.f16596m;
        }
        return new c(minusKey, this.f16596m);
    }

    @Override // hc.f
    public f plus(f fVar) {
        return f.a.a(this, fVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f16597f)) + ']';
    }
}
