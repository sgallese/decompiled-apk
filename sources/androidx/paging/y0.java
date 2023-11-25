package androidx.paging;

import androidx.paging.q0;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MutableLoadStateCollection.kt */
/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private q0 f6193a;

    /* renamed from: b  reason: collision with root package name */
    private q0 f6194b;

    /* renamed from: c  reason: collision with root package name */
    private q0 f6195c;

    /* compiled from: MutableLoadStateCollection.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f6196a;

        static {
            int[] iArr = new int[t0.values().length];
            try {
                iArr[t0.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t0.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[t0.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6196a = iArr;
        }
    }

    public y0() {
        q0.c.a aVar = q0.c.f6001b;
        this.f6193a = aVar.b();
        this.f6194b = aVar.b();
        this.f6195c = aVar.b();
    }

    public final q0 a(t0 t0Var) {
        qc.q.i(t0Var, "loadType");
        int i10 = a.f6196a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return this.f6194b;
                }
                throw new NoWhenBranchMatchedException();
            }
            return this.f6195c;
        }
        return this.f6193a;
    }

    public final void b(s0 s0Var) {
        qc.q.i(s0Var, "states");
        this.f6193a = s0Var.f();
        this.f6195c = s0Var.d();
        this.f6194b = s0Var.e();
    }

    public final void c(t0 t0Var, q0 q0Var) {
        qc.q.i(t0Var, TaskFormActivity.TASK_TYPE_KEY);
        qc.q.i(q0Var, "state");
        int i10 = a.f6196a[t0Var.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f6194b = q0Var;
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            this.f6195c = q0Var;
            return;
        }
        this.f6193a = q0Var;
    }

    public final s0 d() {
        return new s0(this.f6193a, this.f6194b, this.f6195c);
    }
}
