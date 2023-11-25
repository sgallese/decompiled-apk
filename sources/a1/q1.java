package a1;

import android.graphics.ColorFilter;

/* compiled from: ColorFilter.kt */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: b  reason: collision with root package name */
    public static final a f163b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final ColorFilter f164a;

    /* compiled from: ColorFilter.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public static /* synthetic */ q1 b(a aVar, long j10, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = a1.f62b.z();
            }
            return aVar.a(j10, i10);
        }

        public final q1 a(long j10, int i10) {
            return g0.a(j10, i10);
        }
    }

    public q1(ColorFilter colorFilter) {
        qc.q.i(colorFilter, "nativeColorFilter");
        this.f164a = colorFilter;
    }

    public final ColorFilter a() {
        return this.f164a;
    }
}
