package l1;

import ec.o;
import kotlin.NoWhenBranchMatchedException;
import qc.h;
import qc.q;

/* compiled from: VelocityTracker.kt */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f19484a;

    /* renamed from: b  reason: collision with root package name */
    private final a f19485b;

    /* renamed from: c  reason: collision with root package name */
    private final int f19486c;

    /* renamed from: d  reason: collision with root package name */
    private final l1.a[] f19487d;

    /* renamed from: e  reason: collision with root package name */
    private int f19488e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f19489f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f19490g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f19491h;

    /* compiled from: VelocityTracker.kt */
    /* loaded from: classes.dex */
    public enum a {
        Lsq2,
        Impulse
    }

    /* compiled from: VelocityTracker.kt */
    /* renamed from: l1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0436b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f19492a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f19492a = iArr;
        }
    }

    public b(boolean z10, a aVar) {
        q.i(aVar, "strategy");
        this.f19484a = z10;
        this.f19485b = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = C0436b.f19492a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i11 = 3;
        }
        this.f19486c = i11;
        this.f19487d = new l1.a[20];
        this.f19489f = new float[20];
        this.f19490g = new float[20];
        this.f19491h = new float[3];
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return d.f(fArr2, fArr, i10, 2, this.f19491h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f19488e + 1) % 20;
        this.f19488e = i10;
        d.g(this.f19487d, i10, j10, f10);
    }

    public final float c() {
        float d10;
        float[] fArr = this.f19489f;
        float[] fArr2 = this.f19490g;
        int i10 = this.f19488e;
        l1.a aVar = this.f19487d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        l1.a aVar2 = aVar;
        while (true) {
            l1.a aVar3 = this.f19487d[i10];
            if (aVar3 != null) {
                float b10 = (float) (aVar.b() - aVar3.b());
                float abs = (float) Math.abs(aVar3.b() - aVar2.b());
                if (b10 > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i11] = aVar3.a();
                fArr2[i11] = -b10;
                if (i10 == 0) {
                    i10 = 20;
                }
                i10--;
                i11++;
                if (i11 >= 20) {
                    break;
                }
                aVar2 = aVar3;
            } else {
                break;
            }
        }
        if (i11 < this.f19486c) {
            return 0.0f;
        }
        int i12 = C0436b.f19492a[this.f19485b.ordinal()];
        if (i12 == 1) {
            d10 = d.d(fArr, fArr2, i11, this.f19484a);
        } else if (i12 == 2) {
            d10 = b(fArr, fArr2, i11);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return d10 * 1000;
    }

    public final void d() {
        o.t(this.f19487d, null, 0, 0, 6, null);
        this.f19488e = 0;
    }

    public /* synthetic */ b(boolean z10, a aVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }
}
