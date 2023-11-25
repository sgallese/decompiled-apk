package ec;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: SlidingWindow.kt */
/* loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: SlidingWindow.kt */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", l = {34, 40, 49, 55, 58}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.k implements pc.p<xc.i<? super List<? extends T>>, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f14198m;

        /* renamed from: p  reason: collision with root package name */
        Object f14199p;

        /* renamed from: q  reason: collision with root package name */
        int f14200q;

        /* renamed from: r  reason: collision with root package name */
        int f14201r;

        /* renamed from: s  reason: collision with root package name */
        private /* synthetic */ Object f14202s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ int f14203t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ int f14204u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ Iterator<T> f14205v;

        /* renamed from: w  reason: collision with root package name */
        final /* synthetic */ boolean f14206w;

        /* renamed from: x  reason: collision with root package name */
        final /* synthetic */ boolean f14207x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i10, int i11, Iterator<? extends T> it, boolean z10, boolean z11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f14203t = i10;
            this.f14204u = i11;
            this.f14205v = it;
            this.f14206w = z10;
            this.f14207x = z11;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(xc.i<? super List<? extends T>> iVar, Continuation<? super dc.w> continuation) {
            return ((a) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f14203t, this.f14204u, this.f14205v, this.f14206w, this.f14207x, continuation);
            aVar.f14202s = obj;
            return aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0154  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00a6 -> B:16:0x0058). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x011d -> B:59:0x0120). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x014b -> B:72:0x014e). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ec.w0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(int i10, int i11) {
        boolean z10;
        String str;
        if (i10 > 0 && i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (i10 != i11) {
                str = "Both size " + i10 + " and step " + i11 + " must be greater than zero.";
            } else {
                str = "size " + i10 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Iterator<List<T>> b(Iterator<? extends T> it, int i10, int i11, boolean z10, boolean z11) {
        Iterator<List<T>> a10;
        qc.q.i(it, "iterator");
        if (it.hasNext()) {
            a10 = xc.k.a(new a(i10, i11, it, z11, z10, null));
            return a10;
        }
        return c0.f14170f;
    }
}
