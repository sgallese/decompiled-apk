package androidx.work;

import android.util.Log;

/* compiled from: Logger.java */
/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private static l f7594a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final int f7595b = 20;

    /* compiled from: Logger.java */
    /* loaded from: classes.dex */
    public static class a extends l {

        /* renamed from: c  reason: collision with root package name */
        private int f7596c;

        public a(int i10) {
            super(i10);
            this.f7596c = i10;
        }

        @Override // androidx.work.l
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f7596c <= 3) {
                if (thArr != null && thArr.length >= 1) {
                    Log.d(str, str2, thArr[0]);
                } else {
                    Log.d(str, str2);
                }
            }
        }

        @Override // androidx.work.l
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f7596c <= 6) {
                if (thArr != null && thArr.length >= 1) {
                    Log.e(str, str2, thArr[0]);
                } else {
                    Log.e(str, str2);
                }
            }
        }

        @Override // androidx.work.l
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f7596c <= 4) {
                if (thArr != null && thArr.length >= 1) {
                    Log.i(str, str2, thArr[0]);
                } else {
                    Log.i(str, str2);
                }
            }
        }

        @Override // androidx.work.l
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f7596c <= 2) {
                if (thArr != null && thArr.length >= 1) {
                    Log.v(str, str2, thArr[0]);
                } else {
                    Log.v(str, str2);
                }
            }
        }

        @Override // androidx.work.l
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f7596c <= 5) {
                if (thArr != null && thArr.length >= 1) {
                    Log.w(str, str2, thArr[0]);
                } else {
                    Log.w(str, str2);
                }
            }
        }
    }

    public l(int i10) {
    }

    public static synchronized l c() {
        l lVar;
        synchronized (l.class) {
            if (f7594a == null) {
                f7594a = new a(3);
            }
            lVar = f7594a;
        }
        return lVar;
    }

    public static synchronized void e(l lVar) {
        synchronized (l.class) {
            f7594a = lVar;
        }
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f7595b;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
