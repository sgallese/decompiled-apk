package j0;

import android.os.Looper;
import android.util.Log;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* compiled from: ActualAndroid.android.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final dc.f f18532a = dc.g.b(a.f18533f);

    /* compiled from: ActualAndroid.android.kt */
    /* loaded from: classes.dex */
    static final class a extends qc.r implements pc.a<y0> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f18533f = new a();

        a() {
            super(0);
        }

        @Override // pc.a
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final y0 invoke() {
            if (Looper.getMainLooper() != null) {
                return z.f18936f;
            }
            return h2.f18648f;
        }
    }

    public static final e1 a(float f10) {
        return new ParcelableSnapshotMutableFloatState(f10);
    }

    public static final g1 b(int i10) {
        return new ParcelableSnapshotMutableIntState(i10);
    }

    public static final i1 c(long j10) {
        return new ParcelableSnapshotMutableLongState(j10);
    }

    public static final <T> t0.q<T> d(T t10, x2<T> x2Var) {
        qc.q.i(x2Var, "policy");
        return new ParcelableSnapshotMutableState(t10, x2Var);
    }

    public static final void e(String str, Throwable th) {
        qc.q.i(str, "message");
        qc.q.i(th, "e");
        Log.e("ComposeInternal", str, th);
    }
}
