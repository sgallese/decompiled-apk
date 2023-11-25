package dd;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
/* loaded from: classes4.dex */
public final class m0<T> extends ed.a<o0> implements x<T>, g, ed.o<T> {

    /* renamed from: s  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f13361s = AtomicReferenceFieldUpdater.newUpdater(m0.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: r  reason: collision with root package name */
    private int f13362r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateFlow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f13363f;

        /* renamed from: m  reason: collision with root package name */
        Object f13364m;

        /* renamed from: p  reason: collision with root package name */
        Object f13365p;

        /* renamed from: q  reason: collision with root package name */
        Object f13366q;

        /* renamed from: r  reason: collision with root package name */
        Object f13367r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f13368s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ m0<T> f13369t;

        /* renamed from: u  reason: collision with root package name */
        int f13370u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0<T> m0Var, Continuation<? super a> continuation) {
            super(continuation);
            this.f13369t = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13368s = obj;
            this.f13370u |= RecyclerView.UNDEFINED_DURATION;
            return this.f13369t.collect(null, this);
        }
    }

    public m0(Object obj) {
        this._state = obj;
    }

    private final boolean q(Object obj, Object obj2) {
        int i10;
        o0[] n10;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13361s;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !qc.q.d(obj3, obj)) {
                return false;
            }
            if (qc.q.d(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f13362r;
            if ((i11 & 1) == 0) {
                int i12 = i11 + 1;
                this.f13362r = i12;
                o0[] n11 = n();
                dc.w wVar = dc.w.f13270a;
                while (true) {
                    o0[] o0VarArr = n11;
                    if (o0VarArr != null) {
                        for (o0 o0Var : o0VarArr) {
                            if (o0Var != null) {
                                o0Var.g();
                            }
                        }
                    }
                    synchronized (this) {
                        i10 = this.f13362r;
                        if (i10 == i12) {
                            this.f13362r = i12 + 1;
                            return true;
                        }
                        n10 = n();
                        dc.w wVar2 = dc.w.f13270a;
                    }
                    n11 = n10;
                    i12 = i10;
                }
            } else {
                this.f13362r = i11 + 2;
                return true;
            }
        }
    }

    @Override // dd.b0
    public List<T> a() {
        List<T> d10;
        d10 = ec.s.d(getValue());
        return d10;
    }

    @Override // dd.x
    public boolean b(T t10, T t11) {
        if (t10 == null) {
            t10 = (T) ed.r.f14280a;
        }
        if (t11 == null) {
            t11 = (T) ed.r.f14280a;
        }
        return q(t10, t11);
    }

    @Override // dd.w
    public void c() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b7, code lost:
    
        if (qc.q.d(r11, r12) == false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:36:0x00ae, B:38:0x00b3, B:48:0x00d4, B:50:0x00da, B:40:0x00b9, B:44:0x00c0, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:57:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [ed.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d8 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ea -> B:34:0x00a6). Please submit an issue!!! */
    @Override // dd.b0, dd.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(dd.h<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.m0.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ed.o
    public g<T> d(hc.f fVar, int i10, cd.a aVar) {
        return n0.d(this, fVar, i10, aVar);
    }

    @Override // dd.w
    public boolean e(T t10) {
        setValue(t10);
        return true;
    }

    @Override // dd.w, dd.h
    public Object emit(T t10, Continuation<? super dc.w> continuation) {
        setValue(t10);
        return dc.w.f13270a;
    }

    @Override // dd.x, dd.l0
    public T getValue() {
        fd.g0 g0Var = ed.r.f14280a;
        T t10 = (T) f13361s.get(this);
        if (t10 == g0Var) {
            return null;
        }
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ed.a
    /* renamed from: o  reason: merged with bridge method [inline-methods] */
    public o0 j() {
        return new o0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ed.a
    /* renamed from: p  reason: merged with bridge method [inline-methods] */
    public o0[] k(int i10) {
        return new o0[i10];
    }

    @Override // dd.x
    public void setValue(T t10) {
        if (t10 == null) {
            t10 = (T) ed.r.f14280a;
        }
        q(null, t10);
    }
}
