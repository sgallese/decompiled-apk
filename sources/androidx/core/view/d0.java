package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a  reason: collision with root package name */
    private ViewParent f4159a;

    /* renamed from: b  reason: collision with root package name */
    private ViewParent f4160b;

    /* renamed from: c  reason: collision with root package name */
    private final View f4161c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4162d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f4163e;

    public d0(View view) {
        this.f4161c = view;
    }

    private boolean h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent i15;
        int i16;
        int i17;
        int[] iArr3;
        if (!m() || (i15 = i(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f4161c.getLocationInWindow(iArr);
            i16 = iArr[0];
            i17 = iArr[1];
        } else {
            i16 = 0;
            i17 = 0;
        }
        if (iArr2 == null) {
            int[] j10 = j();
            j10[0] = 0;
            j10[1] = 0;
            iArr3 = j10;
        } else {
            iArr3 = iArr2;
        }
        v0.d(i15, this.f4161c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f4161c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i16;
            iArr[1] = iArr[1] - i17;
        }
        return true;
    }

    private ViewParent i(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return null;
            }
            return this.f4160b;
        }
        return this.f4159a;
    }

    private int[] j() {
        if (this.f4163e == null) {
            this.f4163e = new int[2];
        }
        return this.f4163e;
    }

    private void o(int i10, ViewParent viewParent) {
        if (i10 != 0) {
            if (i10 == 1) {
                this.f4160b = viewParent;
                return;
            }
            return;
        }
        this.f4159a = viewParent;
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return v0.a(i10, this.f4161c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent i10;
        if (!m() || (i10 = i(0)) == null) {
            return false;
        }
        return v0.b(i10, this.f4161c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent i13;
        int i14;
        int i15;
        if (!m() || (i13 = i(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f4161c.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        v0.c(i13, this.f4161c, i10, i11, iArr, i12);
        if (iArr2 != null) {
            this.f4161c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return false;
        }
        return true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        h(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return h(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return h(i10, i11, i12, i13, iArr, i14, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i10) {
        if (i(i10) != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.f4162d;
    }

    public void n(boolean z10) {
        if (this.f4162d) {
            p0.U0(this.f4161c);
        }
        this.f4162d = z10;
    }

    public boolean p(int i10) {
        return q(i10, 0);
    }

    public boolean q(int i10, int i11) {
        if (l(i11)) {
            return true;
        }
        if (m()) {
            View view = this.f4161c;
            for (ViewParent parent = this.f4161c.getParent(); parent != null; parent = parent.getParent()) {
                if (v0.f(parent, view, this.f4161c, i10, i11)) {
                    o(i11, parent);
                    v0.e(parent, view, this.f4161c, i10, i11);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i10) {
        ViewParent i11 = i(i10);
        if (i11 != null) {
            v0.g(i11, this.f4161c, i10);
            o(i10, null);
        }
    }
}
