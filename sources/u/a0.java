package u;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;
import s.k1;
import s.x1;

/* compiled from: UpdatableAnimationState.kt */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: e  reason: collision with root package name */
    private static final a f23758e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final s.n f23759f = new s.n(0.0f);

    /* renamed from: g  reason: collision with root package name */
    private static final x1<s.n> f23760g = s.k.g(0.0f, 0.0f, null, 7, null).a(k1.f(qc.j.f21682a));

    /* renamed from: a  reason: collision with root package name */
    private long f23761a = Long.MIN_VALUE;

    /* renamed from: b  reason: collision with root package name */
    private s.n f23762b = f23759f;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23763c;

    /* renamed from: d  reason: collision with root package name */
    private float f23764d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UpdatableAnimationState.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qc.h hVar) {
            this();
        }

        public final x1<s.n> a() {
            return a0.f23760g;
        }

        public final s.n b() {
            return a0.f23759f;
        }

        public final boolean c(float f10) {
            if (Math.abs(f10) < 0.01f) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpdatableAnimationState.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", l = {100, 146}, m = "animateToZero")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f23765f;

        /* renamed from: m  reason: collision with root package name */
        Object f23766m;

        /* renamed from: p  reason: collision with root package name */
        Object f23767p;

        /* renamed from: q  reason: collision with root package name */
        float f23768q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f23769r;

        /* renamed from: t  reason: collision with root package name */
        int f23771t;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23769r = obj;
            this.f23771t |= RecyclerView.UNDEFINED_DURATION;
            return a0.this.h(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpdatableAnimationState.kt */
    /* loaded from: classes.dex */
    public static final class c extends qc.r implements pc.l<Long, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ float f23773m;

        /* renamed from: p  reason: collision with root package name */
        final /* synthetic */ pc.l<Float, dc.w> f23774p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(float f10, pc.l<? super Float, dc.w> lVar) {
            super(1);
            this.f23773m = f10;
            this.f23774p = lVar;
        }

        public final void a(long j10) {
            boolean z10;
            long f10;
            if (a0.this.f23761a == Long.MIN_VALUE) {
                a0.this.f23761a = j10;
            }
            s.n nVar = new s.n(a0.this.i());
            if (this.f23773m == 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                f10 = sc.c.f(((float) (j10 - a0.this.f23761a)) / this.f23773m);
            } else {
                f10 = a0.f23758e.a().b(new s.n(a0.this.i()), a0.f23758e.b(), a0.this.f23762b);
            }
            long j11 = f10;
            float f11 = a0.f23758e.a().d(j11, nVar, a0.f23758e.b(), a0.this.f23762b).f();
            a0.this.f23762b = a0.f23758e.a().c(j11, nVar, a0.f23758e.b(), a0.this.f23762b);
            a0.this.f23761a = j10;
            float i10 = a0.this.i() - f11;
            a0.this.j(f11);
            this.f23774p.invoke(Float.valueOf(i10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
            a(l10.longValue());
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UpdatableAnimationState.kt */
    /* loaded from: classes.dex */
    public static final class d extends qc.r implements pc.l<Long, dc.w> {

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ pc.l<Float, dc.w> f23776m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(pc.l<? super Float, dc.w> lVar) {
            super(1);
            this.f23776m = lVar;
        }

        public final void a(long j10) {
            float i10 = a0.this.i();
            a0.this.j(0.0f);
            this.f23776m.invoke(Float.valueOf(i10));
        }

        @Override // pc.l
        public /* bridge */ /* synthetic */ dc.w invoke(Long l10) {
            a(l10.longValue());
            return dc.w.f13270a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r9 == false) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a2 -> B:60:0x00a5). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(pc.l<? super java.lang.Float, dc.w> r13, pc.a<dc.w> r14, kotlin.coroutines.Continuation<? super dc.w> r15) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u.a0.h(pc.l, pc.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final float i() {
        return this.f23764d;
    }

    public final void j(float f10) {
        this.f23764d = f10;
    }
}
