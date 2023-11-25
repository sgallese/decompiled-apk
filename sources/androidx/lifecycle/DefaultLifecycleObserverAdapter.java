package androidx.lifecycle;

import androidx.lifecycle.p;

/* compiled from: DefaultLifecycleObserverAdapter.kt */
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements s {

    /* renamed from: f  reason: collision with root package name */
    private final i f4854f;

    /* renamed from: m  reason: collision with root package name */
    private final s f4855m;

    /* compiled from: DefaultLifecycleObserverAdapter.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4856a;

        static {
            int[] iArr = new int[p.a.values().length];
            try {
                iArr[p.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f4856a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(i iVar, s sVar) {
        qc.q.i(iVar, "defaultLifecycleObserver");
        this.f4854f = iVar;
        this.f4855m = sVar;
    }

    @Override // androidx.lifecycle.s
    public void c(v vVar, p.a aVar) {
        qc.q.i(vVar, "source");
        qc.q.i(aVar, "event");
        switch (a.f4856a[aVar.ordinal()]) {
            case 1:
                this.f4854f.onCreate(vVar);
                break;
            case 2:
                this.f4854f.onStart(vVar);
                break;
            case 3:
                this.f4854f.onResume(vVar);
                break;
            case 4:
                this.f4854f.onPause(vVar);
                break;
            case 5:
                this.f4854f.onStop(vVar);
                break;
            case 6:
                this.f4854f.onDestroy(vVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        s sVar = this.f4855m;
        if (sVar != null) {
            sVar.c(vVar, aVar);
        }
    }
}
