package k1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PointerInputEventProcessor.kt */
/* loaded from: classes.dex */
final class d0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<b0, a> f19164a = new LinkedHashMap();

    /* compiled from: PointerInputEventProcessor.kt */
    /* loaded from: classes.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final long f19165a;

        /* renamed from: b  reason: collision with root package name */
        private final long f19166b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f19167c;

        /* renamed from: d  reason: collision with root package name */
        private final int f19168d;

        public /* synthetic */ a(long j10, long j11, boolean z10, int i10, qc.h hVar) {
            this(j10, j11, z10, i10);
        }

        public final boolean a() {
            return this.f19167c;
        }

        public final long b() {
            return this.f19166b;
        }

        public final long c() {
            return this.f19165a;
        }

        private a(long j10, long j11, boolean z10, int i10) {
            this.f19165a = j10;
            this.f19166b = j11;
            this.f19167c = z10;
            this.f19168d = i10;
        }
    }

    public final void a() {
        this.f19164a.clear();
    }

    public final j b(e0 e0Var, r0 r0Var) {
        long j10;
        boolean a10;
        long s10;
        qc.q.i(e0Var, "pointerInputEvent");
        qc.q.i(r0Var, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(e0Var.b().size());
        List<f0> b10 = e0Var.b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0Var = b10.get(i10);
            a aVar = this.f19164a.get(b0.a(f0Var.c()));
            if (aVar == null) {
                j10 = f0Var.j();
                s10 = f0Var.e();
                a10 = false;
            } else {
                long c10 = aVar.c();
                j10 = c10;
                a10 = aVar.a();
                s10 = r0Var.s(aVar.b());
            }
            linkedHashMap.put(b0.a(f0Var.c()), new c0(f0Var.c(), f0Var.j(), f0Var.e(), f0Var.a(), f0Var.g(), j10, s10, a10, false, f0Var.i(), (List) f0Var.b(), f0Var.h(), (qc.h) null));
            if (f0Var.a()) {
                this.f19164a.put(b0.a(f0Var.c()), new a(f0Var.j(), f0Var.f(), f0Var.a(), f0Var.i(), null));
            } else {
                this.f19164a.remove(b0.a(f0Var.c()));
            }
        }
        return new j(linkedHashMap, e0Var);
    }
}
