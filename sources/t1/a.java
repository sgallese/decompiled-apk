package t1;

import dc.c;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes.dex */
public final class a<T extends dc.c<? extends Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    private final String f23406a;

    /* renamed from: b  reason: collision with root package name */
    private final T f23407b;

    public a(String str, T t10) {
        this.f23406a = str;
        this.f23407b = t10;
    }

    public final T a() {
        return this.f23407b;
    }

    public final String b() {
        return this.f23406a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (qc.q.d(this.f23406a, aVar.f23406a) && qc.q.d(this.f23407b, aVar.f23407b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        String str = this.f23406a;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        T t10 = this.f23407b;
        if (t10 != null) {
            i11 = t10.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return "AccessibilityAction(label=" + this.f23406a + ", action=" + this.f23407b + ')';
    }
}
