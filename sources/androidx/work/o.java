package androidx.work;

import android.annotation.SuppressLint;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface o {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f7597a;
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0172b f7598b;

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f7599a;

            public a(Throwable th) {
                this.f7599a = th;
            }

            public Throwable a() {
                return this.f7599a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f7599a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: androidx.work.o$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0172b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0172b() {
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f7597a = new b.c();
        f7598b = new b.C0172b();
    }
}
