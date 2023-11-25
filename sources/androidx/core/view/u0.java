package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.coroutines.Continuation;

/* compiled from: View.kt */
/* loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: View.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {414, 416}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements pc.p<xc.i<? super View>, Continuation<? super dc.w>, Object> {

        /* renamed from: m  reason: collision with root package name */
        int f4255m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f4256p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ View f4257q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f4257q = view;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(xc.i<? super View> iVar, Continuation<? super dc.w> continuation) {
            return ((a) create(iVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f4257q, continuation);
            aVar.f4256p = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
            xc.i iVar;
            d10 = ic.d.d();
            int i10 = this.f4255m;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        dc.n.b(obj);
                        return dc.w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = (xc.i) this.f4256p;
                dc.n.b(obj);
            } else {
                dc.n.b(obj);
                iVar = (xc.i) this.f4256p;
                View view = this.f4257q;
                this.f4256p = iVar;
                this.f4255m = 1;
                if (iVar.a(view, this) == d10) {
                    return d10;
                }
            }
            View view2 = this.f4257q;
            if (view2 instanceof ViewGroup) {
                xc.g<View> b10 = t0.b((ViewGroup) view2);
                this.f4256p = null;
                this.f4255m = 2;
                if (iVar.e(b10, this) == d10) {
                    return d10;
                }
            }
            return dc.w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: View.kt */
    /* loaded from: classes.dex */
    public /* synthetic */ class b extends qc.n implements pc.l<ViewParent, ViewParent> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f4258w = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // pc.l
        /* renamed from: h  reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final xc.g<View> a(View view) {
        xc.g<View> b10;
        b10 = xc.k.b(new a(view, null));
        return b10;
    }

    public static final xc.g<ViewParent> b(View view) {
        xc.g<ViewParent> f10;
        f10 = xc.m.f(view.getParent(), b.f4258w);
        return f10;
    }
}
