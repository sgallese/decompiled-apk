package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* compiled from: ViewGroup.kt */
/* loaded from: classes.dex */
public final class t0 {

    /* compiled from: ViewGroup.kt */
    /* loaded from: classes.dex */
    public static final class a implements xc.g<View> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4245a;

        a(ViewGroup viewGroup) {
            this.f4245a = viewGroup;
        }

        @Override // xc.g
        public Iterator<View> iterator() {
            return t0.c(this.f4245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewGroup.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewGroupKt$descendants$1", f = "ViewGroup.kt", l = {119, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.k implements pc.p<xc.i<? super View>, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        Object f4246m;

        /* renamed from: p  reason: collision with root package name */
        Object f4247p;

        /* renamed from: q  reason: collision with root package name */
        int f4248q;

        /* renamed from: r  reason: collision with root package name */
        int f4249r;

        /* renamed from: s  reason: collision with root package name */
        int f4250s;

        /* renamed from: t  reason: collision with root package name */
        private /* synthetic */ Object f4251t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4252u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ViewGroup viewGroup, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f4252u = viewGroup;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(xc.i<? super View> iVar, Continuation<? super dc.w> continuation) {
            return ((b) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f4252u, continuation);
            bVar.f4251t = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008a -> B:22:0x008c). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0093 -> B:24:0x0097). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r11.f4250s
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L3d
                if (r1 == r3) goto L28
                if (r1 != r2) goto L20
                int r1 = r11.f4249r
                int r4 = r11.f4248q
                java.lang.Object r5 = r11.f4246m
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.f4251t
                xc.i r6 = (xc.i) r6
                dc.n.b(r12)
                r12 = r11
                goto L8c
            L20:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L28:
                int r1 = r11.f4249r
                int r4 = r11.f4248q
                java.lang.Object r5 = r11.f4247p
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.f4246m
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.f4251t
                xc.i r7 = (xc.i) r7
                dc.n.b(r12)
                r12 = r11
                goto L6c
            L3d:
                dc.n.b(r12)
                java.lang.Object r12 = r11.f4251t
                xc.i r12 = (xc.i) r12
                android.view.ViewGroup r1 = r11.f4252u
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L4c:
                if (r5 >= r4) goto L9c
                android.view.View r7 = r1.getChildAt(r5)
                r6.f4251t = r12
                r6.f4246m = r1
                r6.f4247p = r7
                r6.f4248q = r5
                r6.f4249r = r4
                r6.f4250s = r3
                java.lang.Object r8 = r12.a(r7, r6)
                if (r8 != r0) goto L65
                return r0
            L65:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L6c:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L93
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                xc.g r5 = androidx.core.view.t0.b(r5)
                r12.f4251t = r7
                r12.f4246m = r6
                r8 = 0
                r12.f4247p = r8
                r12.f4248q = r4
                r12.f4249r = r1
                r12.f4250s = r2
                java.lang.Object r5 = r7.e(r5, r12)
                if (r5 != r0) goto L8a
                return r0
            L8a:
                r5 = r6
                r6 = r7
            L8c:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L97
            L93:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L97:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L4c
            L9c:
                dc.w r12 = dc.w.f13270a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.t0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ViewGroup.kt */
    /* loaded from: classes.dex */
    public static final class c implements Iterator<View>, rc.a {

        /* renamed from: f  reason: collision with root package name */
        private int f4253f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ ViewGroup f4254m;

        c(ViewGroup viewGroup) {
            this.f4254m = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public View next() {
            ViewGroup viewGroup = this.f4254m;
            int i10 = this.f4253f;
            this.f4253f = i10 + 1;
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f4253f < this.f4254m.getChildCount()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f4254m;
            int i10 = this.f4253f - 1;
            this.f4253f = i10;
            viewGroup.removeViewAt(i10);
        }
    }

    public static final xc.g<View> a(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    public static final xc.g<View> b(ViewGroup viewGroup) {
        xc.g<View> b10;
        b10 = xc.k.b(new b(viewGroup, null));
        return b10;
    }

    public static final Iterator<View> c(ViewGroup viewGroup) {
        return new c(viewGroup);
    }
}
