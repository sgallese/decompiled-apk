package a2;

import a2.v;
import android.content.Context;
import android.graphics.Typeface;
import androidx.recyclerview.widget.RecyclerView;
import dc.m;
import kotlin.coroutines.Continuation;

/* compiled from: AndroidFontLoader.android.kt */
/* loaded from: classes.dex */
public final class b implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f227a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f228b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AndroidFontLoader.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {61, 62}, m = "awaitLoad")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: f  reason: collision with root package name */
        Object f229f;

        /* renamed from: m  reason: collision with root package name */
        Object f230m;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f231p;

        /* renamed from: r  reason: collision with root package name */
        int f233r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f231p = obj;
            this.f233r |= RecyclerView.UNDEFINED_DURATION;
            return b.this.c(null, this);
        }
    }

    public b(Context context) {
        qc.q.i(context, "context");
        this.f227a = context.getApplicationContext();
    }

    @Override // a2.h0
    public Object a() {
        return this.f228b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @Override // a2.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a2.k r7, kotlin.coroutines.Continuation<? super android.graphics.Typeface> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a2.b.a
            if (r0 == 0) goto L13
            r0 = r8
            a2.b$a r0 = (a2.b.a) r0
            int r1 = r0.f233r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233r = r1
            goto L18
        L13:
            a2.b$a r0 = new a2.b$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f231p
            java.lang.Object r1 = ic.b.d()
            int r2 = r0.f233r
            r3 = 2
            r4 = 1
            java.lang.String r5 = "context"
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r7 = r0.f230m
            a2.k r7 = (a2.k) r7
            java.lang.Object r0 = r0.f229f
            a2.b r0 = (a2.b) r0
            dc.n.b(r8)
            goto L63
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            dc.n.b(r8)
            return r8
        L42:
            dc.n.b(r8)
            boolean r8 = r7 instanceof a2.a
            if (r8 != 0) goto L8c
            boolean r8 = r7 instanceof a2.p0
            if (r8 == 0) goto L75
            r8 = r7
            a2.p0 r8 = (a2.p0) r8
            android.content.Context r2 = r6.f227a
            qc.q.h(r2, r5)
            r0.f229f = r6
            r0.f230m = r7
            r0.f233r = r3
            java.lang.Object r8 = a2.c.b(r8, r2, r0)
            if (r8 != r1) goto L62
            return r1
        L62:
            r0 = r6
        L63:
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            a2.p0 r7 = (a2.p0) r7
            a2.b0 r7 = r7.e()
            android.content.Context r0 = r0.f227a
            qc.q.h(r0, r5)
            android.graphics.Typeface r7 = a2.o0.c(r8, r7, r0)
            return r7
        L75:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown font type: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
        L8c:
            a2.a r7 = (a2.a) r7
            r7.d()
            android.content.Context r7 = r6.f227a
            qc.q.h(r7, r5)
            r0.f233r = r4
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.b.c(a2.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // a2.h0
    /* renamed from: d  reason: merged with bridge method [inline-methods] */
    public Typeface b(k kVar) {
        Object a10;
        Typeface typeface;
        qc.q.i(kVar, "font");
        Typeface typeface2 = null;
        if (!(kVar instanceof a2.a)) {
            if (!(kVar instanceof p0)) {
                return null;
            }
            int a11 = kVar.a();
            v.a aVar = v.f331a;
            if (v.e(a11, aVar.b())) {
                Context context = this.f227a;
                qc.q.h(context, "context");
                typeface = c.c((p0) kVar, context);
            } else if (v.e(a11, aVar.c())) {
                try {
                    m.a aVar2 = dc.m.f13253f;
                    Context context2 = this.f227a;
                    qc.q.h(context2, "context");
                    a10 = dc.m.a(c.c((p0) kVar, context2));
                } catch (Throwable th) {
                    m.a aVar3 = dc.m.f13253f;
                    a10 = dc.m.a(dc.n.a(th));
                }
                if (!dc.m.c(a10)) {
                    typeface2 = a10;
                }
                typeface = typeface2;
            } else if (v.e(a11, aVar.a())) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            } else {
                throw new IllegalArgumentException("Unknown loading type " + ((Object) v.g(kVar.a())));
            }
            b0 e10 = ((p0) kVar).e();
            Context context3 = this.f227a;
            qc.q.h(context3, "context");
            return o0.c(typeface, e10, context3);
        }
        ((a2.a) kVar).d();
        qc.q.h(this.f227a, "context");
        throw null;
    }
}
