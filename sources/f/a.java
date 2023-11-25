package f;

import android.content.Context;
import android.content.Intent;
import qc.q;

/* compiled from: ActivityResultContract.kt */
/* loaded from: classes.dex */
public abstract class a<I, O> {

    /* compiled from: ActivityResultContract.kt */
    /* renamed from: f.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0343a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final T f14301a;

        public C0343a(T t10) {
            this.f14301a = t10;
        }

        public final T a() {
            return this.f14301a;
        }
    }

    public abstract Intent a(Context context, I i10);

    public C0343a<O> b(Context context, I i10) {
        q.i(context, "context");
        return null;
    }

    public abstract O c(int i10, Intent intent);
}
