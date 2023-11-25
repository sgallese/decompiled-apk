package h0;

import a1.p1;
import a1.r1;

/* compiled from: RippleTheme.kt */
/* loaded from: classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16411a = a.f16412a;

    /* compiled from: RippleTheme.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f16412a = new a();

        private a() {
        }

        public final f a(long j10, boolean z10) {
            if (z10) {
                if (r1.i(j10) > 0.5d) {
                    return p.b();
                }
                return p.c();
            }
            return p.a();
        }

        public final long b(long j10, boolean z10) {
            float i10 = r1.i(j10);
            if (!z10 && i10 < 0.5d) {
                return p1.f146b.f();
            }
            return j10;
        }
    }

    long a(j0.l lVar, int i10);

    f b(j0.l lVar, int i10);
}
