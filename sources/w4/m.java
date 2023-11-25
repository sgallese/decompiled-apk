package w4;

import qc.q;
import t4.o0;

/* compiled from: FetchResult.kt */
/* loaded from: classes.dex */
public final class m extends h {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f25403a;

    /* renamed from: b  reason: collision with root package name */
    private final String f25404b;

    /* renamed from: c  reason: collision with root package name */
    private final t4.f f25405c;

    public m(o0 o0Var, String str, t4.f fVar) {
        super(null);
        this.f25403a = o0Var;
        this.f25404b = str;
        this.f25405c = fVar;
    }

    public final t4.f a() {
        return this.f25405c;
    }

    public final o0 b() {
        return this.f25403a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (q.d(this.f25403a, mVar.f25403a) && q.d(this.f25404b, mVar.f25404b) && this.f25405c == mVar.f25405c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f25403a.hashCode() * 31;
        String str = this.f25404b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + this.f25405c.hashCode();
    }
}
