package bc;

import io.realm.a1;
import io.realm.d0;

/* compiled from: ObjectChange.java */
/* loaded from: classes4.dex */
public class a<E extends a1> {

    /* renamed from: a  reason: collision with root package name */
    private final E f8117a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f8118b;

    public a(E e10, d0 d0Var) {
        this.f8117a = e10;
        this.f8118b = d0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f8117a.equals(aVar.f8117a)) {
            return false;
        }
        d0 d0Var = this.f8118b;
        d0 d0Var2 = aVar.f8118b;
        if (d0Var != null) {
            return d0Var.equals(d0Var2);
        }
        if (d0Var2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f8117a.hashCode() * 31;
        d0 d0Var = this.f8118b;
        if (d0Var != null) {
            i10 = d0Var.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ObjectChange{object=" + this.f8117a + ", changeset=" + this.f8118b + '}';
    }
}
