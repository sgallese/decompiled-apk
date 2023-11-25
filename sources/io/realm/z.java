package io.realm;

/* compiled from: MutableRealmInteger.java */
/* loaded from: classes4.dex */
public abstract class z implements Comparable<z> {
    z() {
    }

    @Override // java.lang.Comparable
    /* renamed from: b  reason: merged with bridge method [inline-methods] */
    public final int compareTo(z zVar) {
        Long d10 = d();
        Long d11 = zVar.d();
        if (d10 == null) {
            if (d11 == null) {
                return 0;
            }
            return -1;
        } else if (d11 == null) {
            return 1;
        } else {
            return d10.compareTo(d11);
        }
    }

    public abstract Long d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        Long d10 = d();
        Long d11 = ((z) obj).d();
        if (d10 == null) {
            if (d11 == null) {
                return true;
            }
            return false;
        }
        return d10.equals(d11);
    }

    public final int hashCode() {
        Long d10 = d();
        if (d10 == null) {
            return 0;
        }
        return d10.hashCode();
    }
}
