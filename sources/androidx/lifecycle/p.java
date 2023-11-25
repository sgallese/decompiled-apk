package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Lifecycle.kt */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private AtomicReference<Object> f5029a = new AtomicReference<>();

    /* compiled from: Lifecycle.kt */
    /* loaded from: classes.dex */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0099a Companion = new C0099a(null);

        /* compiled from: Lifecycle.kt */
        /* renamed from: androidx.lifecycle.p$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0099a {

            /* compiled from: Lifecycle.kt */
            /* renamed from: androidx.lifecycle.p$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public /* synthetic */ class C0100a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f5030a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f5030a = iArr;
                }
            }

            private C0099a() {
            }

            public /* synthetic */ C0099a(qc.h hVar) {
                this();
            }

            public final a a(b bVar) {
                qc.q.i(bVar, "state");
                int i10 = C0100a.f5030a[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return a.ON_PAUSE;
                    }
                    return a.ON_STOP;
                }
                return a.ON_DESTROY;
            }

            public final a b(b bVar) {
                qc.q.i(bVar, "state");
                int i10 = C0100a.f5030a[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 4) {
                            return null;
                        }
                        return a.ON_DESTROY;
                    }
                    return a.ON_PAUSE;
                }
                return a.ON_STOP;
            }

            public final a c(b bVar) {
                qc.q.i(bVar, "state");
                int i10 = C0100a.f5030a[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 5) {
                            return null;
                        }
                        return a.ON_CREATE;
                    }
                    return a.ON_RESUME;
                }
                return a.ON_START;
            }

            public final a d(b bVar) {
                qc.q.i(bVar, "state");
                int i10 = C0100a.f5030a[bVar.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return null;
                        }
                        return a.ON_RESUME;
                    }
                    return a.ON_START;
                }
                return a.ON_CREATE;
            }
        }

        /* compiled from: Lifecycle.kt */
        /* loaded from: classes.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f5031a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f5031a = iArr;
            }
        }

        public static final a downFrom(b bVar) {
            return Companion.a(bVar);
        }

        public static final a downTo(b bVar) {
            return Companion.b(bVar);
        }

        public static final a upFrom(b bVar) {
            return Companion.c(bVar);
        }

        public static final a upTo(b bVar) {
            return Companion.d(bVar);
        }

        public final b getTargetState() {
            switch (b.f5031a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.kt */
    /* loaded from: classes.dex */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean isAtLeast(b bVar) {
            qc.q.i(bVar, "state");
            if (compareTo(bVar) >= 0) {
                return true;
            }
            return false;
        }
    }

    public abstract void a(u uVar);

    public abstract b b();

    public final AtomicReference<Object> c() {
        return this.f5029a;
    }

    public abstract void d(u uVar);
}
