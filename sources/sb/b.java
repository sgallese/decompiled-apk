package sb;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;

/* compiled from: AndroidSchedulers.java */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Scheduler f23061a = rb.a.d(new a());

    /* compiled from: AndroidSchedulers.java */
    /* loaded from: classes4.dex */
    static class a implements Callable<Scheduler> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public Scheduler call() throws Exception {
            return C0539b.f23062a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidSchedulers.java */
    /* renamed from: sb.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0539b {

        /* renamed from: a  reason: collision with root package name */
        static final Scheduler f23062a = new c(new Handler(Looper.getMainLooper()), false);
    }

    public static Scheduler a(Looper looper) {
        return b(looper, false);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler b(Looper looper, boolean z10) {
        if (looper != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (z10 && i10 < 22) {
                Message obtain = Message.obtain();
                try {
                    obtain.setAsynchronous(true);
                } catch (NoSuchMethodError unused) {
                    z10 = false;
                }
                obtain.recycle();
            }
            return new c(new Handler(looper), z10);
        }
        throw new NullPointerException("looper == null");
    }
}
