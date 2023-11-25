package k1;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: PointerEvent.android.kt */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final List<c0> f19232a;

    /* renamed from: b  reason: collision with root package name */
    private final j f19233b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19234c;

    /* renamed from: d  reason: collision with root package name */
    private final int f19235d;

    /* renamed from: e  reason: collision with root package name */
    private int f19236e;

    public r(List<c0> list, j jVar) {
        qc.q.i(list, "changes");
        this.f19232a = list;
        this.f19233b = jVar;
        MotionEvent e10 = e();
        this.f19234c = q.a(e10 != null ? e10.getButtonState() : 0);
        MotionEvent e11 = e();
        this.f19235d = p0.b(e11 != null ? e11.getMetaState() : 0);
        this.f19236e = a();
    }

    private final int a() {
        MotionEvent e10 = e();
        if (e10 != null) {
            int actionMasked = e10.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return u.f19238a.f();
                            case 9:
                                return u.f19238a.a();
                            case 10:
                                return u.f19238a.b();
                            default:
                                return u.f19238a.g();
                        }
                    }
                    return u.f19238a.c();
                }
                return u.f19238a.e();
            }
            return u.f19238a.d();
        }
        List<c0> list = this.f19232a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c0 c0Var = list.get(i10);
            if (s.d(c0Var)) {
                return u.f19238a.e();
            }
            if (s.b(c0Var)) {
                return u.f19238a.d();
            }
        }
        return u.f19238a.c();
    }

    public final int b() {
        return this.f19234c;
    }

    public final List<c0> c() {
        return this.f19232a;
    }

    public final j d() {
        return this.f19233b;
    }

    public final MotionEvent e() {
        j jVar = this.f19233b;
        if (jVar != null) {
            return jVar.b();
        }
        return null;
    }

    public final int f() {
        return this.f19236e;
    }

    public final void g(int i10) {
        this.f19236e = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(List<c0> list) {
        this(list, null);
        qc.q.i(list, "changes");
    }
}
