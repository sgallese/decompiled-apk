package k1;

import android.view.MotionEvent;
import java.util.List;
import java.util.Map;

/* compiled from: InternalPointerEvent.android.kt */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b0, c0> f19195a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f19196b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19197c;

    public j(Map<b0, c0> map, e0 e0Var) {
        qc.q.i(map, "changes");
        qc.q.i(e0Var, "pointerInputEvent");
        this.f19195a = map;
        this.f19196b = e0Var;
    }

    public final Map<b0, c0> a() {
        return this.f19195a;
    }

    public final MotionEvent b() {
        return this.f19196b.a();
    }

    public final boolean c() {
        return this.f19197c;
    }

    public final boolean d(long j10) {
        f0 f0Var;
        List<f0> b10 = this.f19196b.b();
        int size = b10.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                f0Var = b10.get(i10);
                if (b0.d(f0Var.c(), j10)) {
                    break;
                }
                i10++;
            } else {
                f0Var = null;
                break;
            }
        }
        f0 f0Var2 = f0Var;
        if (f0Var2 == null) {
            return false;
        }
        return f0Var2.d();
    }

    public final void e(boolean z10) {
        this.f19197c = z10;
    }
}
