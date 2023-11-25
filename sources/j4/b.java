package j4;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private boolean f19023a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f19024b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19025c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19026d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f19023a = z10;
        this.f19024b = z11;
        this.f19025c = z12;
        this.f19026d = z13;
    }

    public boolean a() {
        return this.f19023a;
    }

    public boolean b() {
        return this.f19025c;
    }

    public boolean c() {
        return this.f19026d;
    }

    public boolean d() {
        return this.f19024b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f19023a == bVar.f19023a && this.f19024b == bVar.f19024b && this.f19025c == bVar.f19025c && this.f19026d == bVar.f19026d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f19023a;
        int i10 = r02;
        if (this.f19024b) {
            i10 = r02 + 16;
        }
        int i11 = i10;
        if (this.f19025c) {
            i11 = i10 + UserVerificationMethods.USER_VERIFY_HANDPRINT;
        }
        if (this.f19026d) {
            return i11 + RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        }
        return i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f19023a), Boolean.valueOf(this.f19024b), Boolean.valueOf(this.f19025c), Boolean.valueOf(this.f19026d));
    }
}
