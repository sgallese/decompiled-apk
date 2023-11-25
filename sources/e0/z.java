package e0;

import a1.p1;

/* compiled from: TextSelectionColors.kt */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private final long f13728a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13729b;

    public /* synthetic */ z(long j10, long j11, qc.h hVar) {
        this(j10, j11);
    }

    public final long a() {
        return this.f13729b;
    }

    public final long b() {
        return this.f13728a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        if (p1.q(this.f13728a, zVar.f13728a) && p1.q(this.f13729b, zVar.f13729b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (p1.w(this.f13728a) * 31) + p1.w(this.f13729b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) p1.x(this.f13728a)) + ", selectionBackgroundColor=" + ((Object) p1.x(this.f13729b)) + ')';
    }

    private z(long j10, long j11) {
        this.f13728a = j10;
        this.f13729b = j11;
    }
}
