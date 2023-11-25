package p0;

import qc.h;

/* compiled from: MutableCounter.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f20741a;

    public b() {
        this(0, 1, null);
    }

    public final int a() {
        return this.f20741a;
    }

    public final void b(int i10) {
        this.f20741a += i10;
    }

    public final void c(int i10) {
        this.f20741a = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && this.f20741a == ((b) obj).f20741a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f20741a;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f20741a + ')';
    }

    public b(int i10) {
        this.f20741a = i10;
    }

    public /* synthetic */ b(int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
