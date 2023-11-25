package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f3871e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f3872a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3873b;

    /* renamed from: c  reason: collision with root package name */
    public final int f3874c;

    /* renamed from: d  reason: collision with root package name */
    public final int f3875d;

    /* compiled from: Insets.java */
    /* loaded from: classes.dex */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f3872a = i10;
        this.f3873b = i11;
        this.f3874c = i12;
        this.f3875d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f3872a, bVar2.f3872a), Math.max(bVar.f3873b, bVar2.f3873b), Math.max(bVar.f3874c, bVar2.f3874c), Math.max(bVar.f3875d, bVar2.f3875d));
    }

    public static b b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f3871e;
        }
        return new b(i10, i11, i12, i13);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        int i10;
        int i11;
        int i12;
        int i13;
        i10 = insets.left;
        i11 = insets.top;
        i12 = insets.right;
        i13 = insets.bottom;
        return b(i10, i11, i12, i13);
    }

    public Insets e() {
        return a.a(this.f3872a, this.f3873b, this.f3874c, this.f3875d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f3875d == bVar.f3875d && this.f3872a == bVar.f3872a && this.f3874c == bVar.f3874c && this.f3873b == bVar.f3873b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f3872a * 31) + this.f3873b) * 31) + this.f3874c) * 31) + this.f3875d;
    }

    public String toString() {
        return "Insets{left=" + this.f3872a + ", top=" + this.f3873b + ", right=" + this.f3874c + ", bottom=" + this.f3875d + '}';
    }
}
