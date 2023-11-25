package dd;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class j {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object[] f13328f;

        /* compiled from: SafeCollector.common.kt */
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {114}, m = "collect")
        /* renamed from: dd.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0307a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: f  reason: collision with root package name */
            /* synthetic */ Object f13329f;

            /* renamed from: m  reason: collision with root package name */
            int f13330m;

            /* renamed from: q  reason: collision with root package name */
            Object f13332q;

            /* renamed from: r  reason: collision with root package name */
            Object f13333r;

            /* renamed from: s  reason: collision with root package name */
            int f13334s;

            /* renamed from: t  reason: collision with root package name */
            int f13335t;

            public C0307a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13329f = obj;
                this.f13330m |= RecyclerView.UNDEFINED_DURATION;
                return a.this.collect(null, this);
            }
        }

        public a(Object[] objArr) {
            this.f13328f = objArr;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x005d -> B:19:0x0060). Please submit an issue!!! */
        @Override // dd.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(dd.h<? super T> r8, kotlin.coroutines.Continuation<? super dc.w> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof dd.j.a.C0307a
                if (r0 == 0) goto L13
                r0 = r9
                dd.j$a$a r0 = (dd.j.a.C0307a) r0
                int r1 = r0.f13330m
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13330m = r1
                goto L18
            L13:
                dd.j$a$a r0 = new dd.j$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f13329f
                java.lang.Object r1 = ic.b.d()
                int r2 = r0.f13330m
                r3 = 1
                if (r2 == 0) goto L3e
                if (r2 != r3) goto L36
                int r8 = r0.f13335t
                int r2 = r0.f13334s
                java.lang.Object r4 = r0.f13333r
                dd.h r4 = (dd.h) r4
                java.lang.Object r5 = r0.f13332q
                dd.j$a r5 = (dd.j.a) r5
                dc.n.b(r9)
                r9 = r4
                goto L60
            L36:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3e:
                dc.n.b(r9)
                java.lang.Object[] r9 = r7.f13328f
                int r9 = r9.length
                r2 = 0
                r5 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L49:
                if (r2 >= r8) goto L62
                java.lang.Object[] r4 = r5.f13328f
                r4 = r4[r2]
                r0.f13332q = r5
                r0.f13333r = r9
                r0.f13334s = r2
                r0.f13335t = r8
                r0.f13330m = r3
                java.lang.Object r4 = r9.emit(r4, r0)
                if (r4 != r1) goto L60
                return r1
            L60:
                int r2 = r2 + r3
                goto L49
            L62:
                dc.w r8 = dc.w.f13270a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: dd.j.a.collect(dd.h, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SafeCollector.common.kt */
    /* loaded from: classes4.dex */
    public static final class b<T> implements g<T> {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Object f13336f;

        public b(Object obj) {
            this.f13336f = obj;
        }

        @Override // dd.g
        public Object collect(h<? super T> hVar, Continuation<? super dc.w> continuation) {
            Object d10;
            Object emit = hVar.emit((Object) this.f13336f, continuation);
            d10 = ic.d.d();
            if (emit == d10) {
                return emit;
            }
            return dc.w.f13270a;
        }
    }

    public static final <T> g<T> a(pc.p<? super cd.p<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        return new dd.b(pVar, null, 0, null, 14, null);
    }

    public static final <T> g<T> b() {
        return f.f13319f;
    }

    public static final <T> g<T> c(pc.p<? super h<? super T>, ? super Continuation<? super dc.w>, ? extends Object> pVar) {
        return new a0(pVar);
    }

    public static final <T> g<T> d(T t10) {
        return new b(t10);
    }

    public static final <T> g<T> e(T... tArr) {
        return new a(tArr);
    }
}
