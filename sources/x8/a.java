package x8;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f25869a;

    /* renamed from: b  reason: collision with root package name */
    private final d[] f25870b;

    /* renamed from: c  reason: collision with root package name */
    private final b f25871c;

    public a(int i10, d... dVarArr) {
        this.f25869a = i10;
        this.f25870b = dVarArr;
        this.f25871c = new b(i10);
    }

    @Override // x8.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f25869a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (d dVar : this.f25870b) {
            if (stackTraceElementArr2.length <= this.f25869a) {
                break;
            }
            stackTraceElementArr2 = dVar.a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f25869a) {
            return this.f25871c.a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
