package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.p;
import dd.h0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Context, dd.l0<Float>> f2558a = new LinkedHashMap();

    /* compiled from: WindowRecomposer.android.kt */
    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ View f2559f;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ j0.b2 f2560m;

        a(View view, j0.b2 b2Var) {
            this.f2559f = view;
            this.f2560m = b2Var;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            qc.q.i(view, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            qc.q.i(view, "v");
            this.f2559f.removeOnAttachStateChangeListener(this);
            this.f2560m.V();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WindowRecomposer.android.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = {115, 121}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<dd.h<? super Float>, Continuation<? super dc.w>, Object> {

        /* renamed from: f  reason: collision with root package name */
        Object f2561f;

        /* renamed from: m  reason: collision with root package name */
        int f2562m;

        /* renamed from: p  reason: collision with root package name */
        private /* synthetic */ Object f2563p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ ContentResolver f2564q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ Uri f2565r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ c f2566s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ cd.d<dc.w> f2567t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ Context f2568u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ContentResolver contentResolver, Uri uri, c cVar, cd.d<dc.w> dVar, Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2564q = contentResolver;
            this.f2565r = uri;
            this.f2566s = cVar;
            this.f2567t = dVar;
            this.f2568u = context;
        }

        @Override // pc.p
        /* renamed from: a  reason: merged with bridge method [inline-methods] */
        public final Object invoke(dd.h<? super Float> hVar, Continuation<? super dc.w> continuation) {
            return ((b) create(hVar, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f2564q, this.f2565r, this.f2566s, this.f2567t, this.f2568u, continuation);
            bVar.f2563p = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:17:0x0049, B:21:0x0059, B:23:0x0061), top: B:36:0x0049 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0083 -> B:36:0x0049). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ic.b.d()
                int r1 = r9.f2562m
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r9.f2561f
                cd.f r1 = (cd.f) r1
                java.lang.Object r4 = r9.f2563p
                dd.h r4 = (dd.h) r4
                dc.n.b(r10)     // Catch: java.lang.Throwable -> L91
                r10 = r4
                goto L48
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                java.lang.Object r1 = r9.f2561f
                cd.f r1 = (cd.f) r1
                java.lang.Object r4 = r9.f2563p
                dd.h r4 = (dd.h) r4
                dc.n.b(r10)     // Catch: java.lang.Throwable -> L91
                r5 = r4
                r4 = r9
                goto L59
            L31:
                dc.n.b(r10)
                java.lang.Object r10 = r9.f2563p
                dd.h r10 = (dd.h) r10
                android.content.ContentResolver r1 = r9.f2564q
                android.net.Uri r4 = r9.f2565r
                r5 = 0
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r6 = r9.f2566s
                r1.registerContentObserver(r4, r5, r6)
                cd.d<dc.w> r1 = r9.f2567t     // Catch: java.lang.Throwable -> L91
                cd.f r1 = r1.iterator()     // Catch: java.lang.Throwable -> L91
            L48:
                r4 = r9
            L49:
                r4.f2563p = r10     // Catch: java.lang.Throwable -> L8f
                r4.f2561f = r1     // Catch: java.lang.Throwable -> L8f
                r4.f2562m = r3     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r5 = r1.a(r4)     // Catch: java.lang.Throwable -> L8f
                if (r5 != r0) goto L56
                return r0
            L56:
                r8 = r5
                r5 = r10
                r10 = r8
            L59:
                java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8f
                boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8f
                if (r10 == 0) goto L85
                r1.next()     // Catch: java.lang.Throwable -> L8f
                android.content.Context r10 = r4.f2568u     // Catch: java.lang.Throwable -> L8f
                android.content.ContentResolver r10 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L8f
                java.lang.String r6 = "animator_duration_scale"
                r7 = 1065353216(0x3f800000, float:1.0)
                float r10 = android.provider.Settings.Global.getFloat(r10, r6, r7)     // Catch: java.lang.Throwable -> L8f
                java.lang.Float r10 = kotlin.coroutines.jvm.internal.b.c(r10)     // Catch: java.lang.Throwable -> L8f
                r4.f2563p = r5     // Catch: java.lang.Throwable -> L8f
                r4.f2561f = r1     // Catch: java.lang.Throwable -> L8f
                r4.f2562m = r2     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r10 = r5.emit(r10, r4)     // Catch: java.lang.Throwable -> L8f
                if (r10 != r0) goto L83
                return r0
            L83:
                r10 = r5
                goto L49
            L85:
                android.content.ContentResolver r10 = r4.f2564q
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r0 = r4.f2566s
                r10.unregisterContentObserver(r0)
                dc.w r10 = dc.w.f13270a
                return r10
            L8f:
                r10 = move-exception
                goto L93
            L91:
                r10 = move-exception
                r4 = r9
            L93:
                android.content.ContentResolver r0 = r4.f2564q
                androidx.compose.ui.platform.WindowRecomposer_androidKt$c r1 = r4.f2566s
                r0.unregisterContentObserver(r1)
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WindowRecomposer.android.kt */
    /* loaded from: classes.dex */
    public static final class c extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ cd.d<dc.w> f2569a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(cd.d<dc.w> dVar, Handler handler) {
            super(handler);
            this.f2569a = dVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f2569a.p(dc.w.f13270a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.compose.ui.platform.r1] */
    public static final j0.b2 b(final View view, hc.f fVar, androidx.lifecycle.p pVar) {
        final j0.n1 n1Var;
        hc.f fVar2;
        qc.q.i(view, "<this>");
        qc.q.i(fVar, "coroutineContext");
        if (fVar.get(hc.d.f16598i) == null || fVar.get(j0.y0.f18923k) == null) {
            fVar = m0.f2750y.a().plus(fVar);
        }
        j0.y0 y0Var = (j0.y0) fVar.get(j0.y0.f18923k);
        if (y0Var != null) {
            j0.n1 n1Var2 = new j0.n1(y0Var);
            n1Var2.a();
            n1Var = n1Var2;
        } else {
            n1Var = null;
        }
        final qc.f0 f0Var = new qc.f0();
        v0.g gVar = (v0.g) fVar.get(v0.g.f24279o);
        v0.g gVar2 = gVar;
        if (gVar == null) {
            ?? r1Var = new r1();
            f0Var.f21676f = r1Var;
            gVar2 = r1Var;
        }
        if (n1Var != null) {
            fVar2 = n1Var;
        } else {
            fVar2 = hc.g.f16601f;
        }
        hc.f plus = fVar.plus(fVar2).plus(gVar2);
        final j0.b2 b2Var = new j0.b2(plus);
        b2Var.g0();
        final ad.k0 a10 = ad.l0.a(plus);
        if (pVar == null) {
            androidx.lifecycle.v a11 = androidx.lifecycle.d1.a(view);
            if (a11 != null) {
                pVar = a11.getLifecycle();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            view.addOnAttachStateChangeListener(new a(view, b2Var));
            pVar.a(new androidx.lifecycle.s() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2

                /* compiled from: WindowRecomposer.android.kt */
                /* loaded from: classes.dex */
                public /* synthetic */ class a {

                    /* renamed from: a  reason: collision with root package name */
                    public static final /* synthetic */ int[] f2575a;

                    static {
                        int[] iArr = new int[p.a.values().length];
                        try {
                            iArr[p.a.ON_CREATE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[p.a.ON_START.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[p.a.ON_STOP.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[p.a.ON_DESTROY.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[p.a.ON_PAUSE.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[p.a.ON_RESUME.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        try {
                            iArr[p.a.ON_ANY.ordinal()] = 7;
                        } catch (NoSuchFieldError unused7) {
                        }
                        f2575a = iArr;
                    }
                }

                /* compiled from: WindowRecomposer.android.kt */
                @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {394}, m = "invokeSuspend")
                /* loaded from: classes.dex */
                static final class b extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                    /* renamed from: f  reason: collision with root package name */
                    int f2576f;

                    /* renamed from: m  reason: collision with root package name */
                    private /* synthetic */ Object f2577m;

                    /* renamed from: p  reason: collision with root package name */
                    final /* synthetic */ qc.f0<r1> f2578p;

                    /* renamed from: q  reason: collision with root package name */
                    final /* synthetic */ j0.b2 f2579q;

                    /* renamed from: r  reason: collision with root package name */
                    final /* synthetic */ androidx.lifecycle.v f2580r;

                    /* renamed from: s  reason: collision with root package name */
                    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f2581s;

                    /* renamed from: t  reason: collision with root package name */
                    final /* synthetic */ View f2582t;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: WindowRecomposer.android.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
                    /* loaded from: classes.dex */
                    public static final class a extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {

                        /* renamed from: f  reason: collision with root package name */
                        int f2583f;

                        /* renamed from: m  reason: collision with root package name */
                        final /* synthetic */ dd.l0<Float> f2584m;

                        /* renamed from: p  reason: collision with root package name */
                        final /* synthetic */ r1 f2585p;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* compiled from: WindowRecomposer.android.kt */
                        /* renamed from: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a$a  reason: collision with other inner class name */
                        /* loaded from: classes.dex */
                        public static final class C0037a implements dd.h<Float> {

                            /* renamed from: f  reason: collision with root package name */
                            final /* synthetic */ r1 f2586f;

                            C0037a(r1 r1Var) {
                                this.f2586f = r1Var;
                            }

                            public final Object a(float f10, Continuation<? super dc.w> continuation) {
                                this.f2586f.a(f10);
                                return dc.w.f13270a;
                            }

                            @Override // dd.h
                            public /* bridge */ /* synthetic */ Object emit(Float f10, Continuation continuation) {
                                return a(f10.floatValue(), continuation);
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        a(dd.l0<Float> l0Var, r1 r1Var, Continuation<? super a> continuation) {
                            super(2, continuation);
                            this.f2584m = l0Var;
                            this.f2585p = r1Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                            return new a(this.f2584m, this.f2585p, continuation);
                        }

                        @Override // pc.p
                        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                            return ((a) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            Object d10;
                            d10 = ic.d.d();
                            int i10 = this.f2583f;
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                dc.n.b(obj);
                            } else {
                                dc.n.b(obj);
                                dd.l0<Float> l0Var = this.f2584m;
                                C0037a c0037a = new C0037a(this.f2585p);
                                this.f2583f = 1;
                                if (l0Var.collect(c0037a, this) == d10) {
                                    return d10;
                                }
                            }
                            throw new KotlinNothingValueException();
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(qc.f0<r1> f0Var, j0.b2 b2Var, androidx.lifecycle.v vVar, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f2578p = f0Var;
                        this.f2579q = b2Var;
                        this.f2580r = vVar;
                        this.f2581s = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
                        this.f2582t = view;
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
                        b bVar = new b(this.f2578p, this.f2579q, this.f2580r, this.f2581s, this.f2582t, continuation);
                        bVar.f2577m = obj;
                        return bVar;
                    }

                    @Override // pc.p
                    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
                        return ((b) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
                    @Override // kotlin.coroutines.jvm.internal.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                        /*
                            r11 = this;
                            java.lang.Object r0 = ic.b.d()
                            int r1 = r11.f2576f
                            r2 = 1
                            r3 = 0
                            if (r1 == 0) goto L1f
                            if (r1 != r2) goto L17
                            java.lang.Object r0 = r11.f2577m
                            ad.x1 r0 = (ad.x1) r0
                            dc.n.b(r12)     // Catch: java.lang.Throwable -> L14
                            goto L6c
                        L14:
                            r12 = move-exception
                            goto L86
                        L17:
                            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r12.<init>(r0)
                            throw r12
                        L1f:
                            dc.n.b(r12)
                            java.lang.Object r12 = r11.f2577m
                            r4 = r12
                            ad.k0 r4 = (ad.k0) r4
                            qc.f0<androidx.compose.ui.platform.r1> r12 = r11.f2578p     // Catch: java.lang.Throwable -> L84
                            T r12 = r12.f21676f     // Catch: java.lang.Throwable -> L84
                            androidx.compose.ui.platform.r1 r12 = (androidx.compose.ui.platform.r1) r12     // Catch: java.lang.Throwable -> L84
                            if (r12 == 0) goto L5d
                            android.view.View r1 = r11.f2582t     // Catch: java.lang.Throwable -> L84
                            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L84
                            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L84
                            java.lang.String r5 = "context.applicationContext"
                            qc.q.h(r1, r5)     // Catch: java.lang.Throwable -> L84
                            dd.l0 r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.a(r1)     // Catch: java.lang.Throwable -> L84
                            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L84
                            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L84
                            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L84
                            r12.a(r5)     // Catch: java.lang.Throwable -> L84
                            r5 = 0
                            r6 = 0
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$b$a     // Catch: java.lang.Throwable -> L84
                            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L84
                            r8 = 3
                            r9 = 0
                            ad.x1 r12 = ad.g.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L84
                            goto L5e
                        L5d:
                            r12 = r3
                        L5e:
                            j0.b2 r1 = r11.f2579q     // Catch: java.lang.Throwable -> L7f
                            r11.f2577m = r12     // Catch: java.lang.Throwable -> L7f
                            r11.f2576f = r2     // Catch: java.lang.Throwable -> L7f
                            java.lang.Object r1 = r1.s0(r11)     // Catch: java.lang.Throwable -> L7f
                            if (r1 != r0) goto L6b
                            return r0
                        L6b:
                            r0 = r12
                        L6c:
                            if (r0 == 0) goto L71
                            ad.x1.a.a(r0, r3, r2, r3)
                        L71:
                            androidx.lifecycle.v r12 = r11.f2580r
                            androidx.lifecycle.p r12 = r12.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.f2581s
                            r12.d(r0)
                            dc.w r12 = dc.w.f13270a
                            return r12
                        L7f:
                            r0 = move-exception
                            r10 = r0
                            r0 = r12
                            r12 = r10
                            goto L86
                        L84:
                            r12 = move-exception
                            r0 = r3
                        L86:
                            if (r0 == 0) goto L8b
                            ad.x1.a.a(r0, r3, r2, r3)
                        L8b:
                            androidx.lifecycle.v r0 = r11.f2580r
                            androidx.lifecycle.p r0 = r0.getLifecycle()
                            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.f2581s
                            r0.d(r1)
                            throw r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2.b.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // androidx.lifecycle.s
                public void c(androidx.lifecycle.v vVar, p.a aVar) {
                    qc.q.i(vVar, "source");
                    qc.q.i(aVar, "event");
                    int i10 = a.f2575a[aVar.ordinal()];
                    if (i10 == 1) {
                        ad.i.d(ad.k0.this, null, ad.m0.UNDISPATCHED, new b(f0Var, b2Var, vVar, this, view, null), 1, null);
                    } else if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                b2Var.V();
                                return;
                            }
                            return;
                        }
                        b2Var.g0();
                    } else {
                        j0.n1 n1Var3 = n1Var;
                        if (n1Var3 != null) {
                            n1Var3.d();
                        }
                        b2Var.r0();
                    }
                }
            });
            return b2Var;
        }
        throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
    }

    public static /* synthetic */ j0.b2 c(View view, hc.f fVar, androidx.lifecycle.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fVar = hc.g.f16601f;
        }
        if ((i10 & 2) != 0) {
            pVar = null;
        }
        return b(view, fVar, pVar);
    }

    public static final j0.p d(View view) {
        qc.q.i(view, "<this>");
        j0.p f10 = f(view);
        if (f10 != null) {
            return f10;
        }
        for (ViewParent parent = view.getParent(); f10 == null && (parent instanceof View); parent = parent.getParent()) {
            f10 = f((View) parent);
        }
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dd.l0<Float> e(Context context) {
        dd.l0<Float> l0Var;
        Map<Context, dd.l0<Float>> map = f2558a;
        synchronized (map) {
            dd.l0<Float> l0Var2 = map.get(context);
            if (l0Var2 == null) {
                ContentResolver contentResolver = context.getContentResolver();
                Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                cd.d b10 = cd.g.b(-1, null, null, 6, null);
                l0Var2 = dd.i.O(dd.i.z(new b(contentResolver, uriFor, new c(b10, androidx.core.os.i.a(Looper.getMainLooper())), b10, context, null)), ad.l0.b(), h0.a.b(dd.h0.f13324a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                map.put(context, l0Var2);
            }
            l0Var = l0Var2;
        }
        return l0Var;
    }

    public static final j0.p f(View view) {
        qc.q.i(view, "<this>");
        Object tag = view.getTag(v0.h.G);
        if (tag instanceof j0.p) {
            return (j0.p) tag;
        }
        return null;
    }

    private static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final j0.b2 h(View view) {
        qc.q.i(view, "<this>");
        if (view.isAttachedToWindow()) {
            View g10 = g(view);
            j0.p f10 = f(g10);
            if (f10 == null) {
                return w4.f2864a.a(g10);
            }
            if (f10 instanceof j0.b2) {
                return (j0.b2) f10;
            }
            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer".toString());
        }
        throw new IllegalStateException(("Cannot locate windowRecomposer; View " + view + " is not attached to a window").toString());
    }

    public static final void i(View view, j0.p pVar) {
        qc.q.i(view, "<this>");
        view.setTag(v0.h.G, pVar);
    }
}
