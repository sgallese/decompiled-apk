package g2;

import a1.e1;
import a1.m4;
import a1.p1;
import a1.r4;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: TextForegroundStyle.kt */
/* loaded from: classes.dex */
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f16079a = a.f16080a;

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f16080a = new a();

        private a() {
        }

        public final o a(e1 e1Var, float f10) {
            if (e1Var == null) {
                return b.f16081b;
            }
            if (e1Var instanceof r4) {
                return b(m.c(((r4) e1Var).b(), f10));
            }
            if (e1Var instanceof m4) {
                return new c((m4) e1Var, f10);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final o b(long j10) {
            boolean z10;
            if (j10 != p1.f146b.e()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new d(j10, null);
            }
            return b.f16081b;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    /* loaded from: classes.dex */
    public static final class b implements o {

        /* renamed from: b  reason: collision with root package name */
        public static final b f16081b = new b();

        private b() {
        }

        @Override // g2.o
        public /* synthetic */ o a(pc.a aVar) {
            return n.b(this, aVar);
        }

        @Override // g2.o
        public e1 b() {
            return null;
        }

        @Override // g2.o
        public /* synthetic */ o c(o oVar) {
            return n.a(this, oVar);
        }

        @Override // g2.o
        public float d() {
            return Float.NaN;
        }

        @Override // g2.o
        public long e() {
            return p1.f146b.e();
        }
    }

    o a(pc.a<? extends o> aVar);

    e1 b();

    o c(o oVar);

    float d();

    long e();
}
