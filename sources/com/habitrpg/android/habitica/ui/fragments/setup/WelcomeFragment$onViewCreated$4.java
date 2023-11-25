package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.k0;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.i;
import dd.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: WelcomeFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4", f = "WelcomeFragment.kt", l = {116}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WelcomeFragment$onViewCreated$4 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$4(WelcomeFragment welcomeFragment, Continuation<? super WelcomeFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new WelcomeFragment$onViewCreated$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((WelcomeFragment$onViewCreated$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        final x xVar;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            n.b(obj);
            xVar = this.this$0.usernameVerificationEvents;
            final g u10 = i.u(new g<String>() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2", f = "WelcomeFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(h hVar) {
                        this.$this_unsafeFlow = hVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r8)
                            goto L66
                        L29:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L31:
                            dc.n.b(r8)
                            dd.h r8 = r6.$this_unsafeFlow
                            r2 = r7
                            java.lang.String r2 = (java.lang.String) r2
                            vc.f r4 = new vc.f
                            r5 = 30
                            r4.<init>(r3, r5)
                            if (r2 == 0) goto L4b
                            int r2 = r2.length()
                            java.lang.Integer r2 = kotlin.coroutines.jvm.internal.b.d(r2)
                            goto L4c
                        L4b:
                            r2 = 0
                        L4c:
                            if (r2 == 0) goto L5a
                            int r2 = r2.intValue()
                            boolean r2 = r4.m(r2)
                            if (r2 == 0) goto L5a
                            r2 = 1
                            goto L5b
                        L5a:
                            r2 = 0
                        L5b:
                            if (r2 == 0) goto L66
                            r0.label = r3
                            java.lang.Object r7 = r8.emit(r7, r0)
                            if (r7 != r1) goto L66
                            return r1
                        L66:
                            dc.w r7 = dc.w.f13270a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super String> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            });
            final WelcomeFragment welcomeFragment = this.this$0;
            g<VerifyUsernameResponse> gVar = new g<VerifyUsernameResponse>() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;
                    final /* synthetic */ WelcomeFragment this$0;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2", f = "WelcomeFragment.kt", l = {224, 223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= RecyclerView.UNDEFINED_DURATION;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(h hVar, WelcomeFragment welcomeFragment) {
                        this.$this_unsafeFlow = hVar;
                        this.this$0 = welcomeFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
                    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 2
                            r4 = 1
                            if (r2 == 0) goto L3c
                            if (r2 == r4) goto L34
                            if (r2 != r3) goto L2c
                            dc.n.b(r8)
                            goto L63
                        L2c:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L34:
                            java.lang.Object r7 = r0.L$0
                            dd.h r7 = (dd.h) r7
                            dc.n.b(r8)
                            goto L57
                        L3c:
                            dc.n.b(r8)
                            dd.h r8 = r6.$this_unsafeFlow
                            java.lang.String r7 = (java.lang.String) r7
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r2 = r6.this$0
                            com.habitrpg.android.habitica.data.UserRepository r2 = r2.getUserRepository()
                            r0.L$0 = r8
                            r0.label = r4
                            java.lang.Object r7 = r2.verifyUsername(r7, r0)
                            if (r7 != r1) goto L54
                            return r1
                        L54:
                            r5 = r8
                            r8 = r7
                            r7 = r5
                        L57:
                            r2 = 0
                            r0.L$0 = r2
                            r0.label = r3
                            java.lang.Object r7 = r7.emit(r8, r0)
                            if (r7 != r1) goto L63
                            return r1
                        L63:
                            dc.w r7 = dc.w.f13270a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super VerifyUsernameResponse> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar, welcomeFragment), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final WelcomeFragment welcomeFragment2 = this.this$0;
            h<? super VerifyUsernameResponse> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4.3
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((VerifyUsernameResponse) obj2, (Continuation<? super w>) continuation);
                }

                /* JADX WARN: Code restructure failed: missing block: B:5:0x0008, code lost:
                
                    if (r12.isUsable() == true) goto L8;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse r12, kotlin.coroutines.Continuation<? super dc.w> r13) {
                    /*
                        r11 = this;
                        r13 = 0
                        if (r12 == 0) goto Lb
                        boolean r0 = r12.isUsable()
                        r1 = 1
                        if (r0 != r1) goto Lb
                        goto Lc
                    Lb:
                        r1 = 0
                    Lc:
                        r0 = 0
                        if (r1 == 0) goto L39
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r13 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding r13 = r13.getBinding()
                        if (r13 == 0) goto L24
                        android.widget.EditText r13 = r13.usernameEditText
                        if (r13 == 0) goto L24
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r1 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        android.graphics.drawable.Drawable r1 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.access$getCheckmarkIcon(r1)
                        r13.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r1, r0)
                    L24:
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r13 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding r13 = r13.getBinding()
                        if (r13 == 0) goto L2f
                        android.widget.TextView r13 = r13.issuesTextView
                        goto L30
                    L2f:
                        r13 = r0
                    L30:
                        if (r13 != 0) goto L33
                        goto L8d
                    L33:
                        r1 = 8
                        r13.setVisibility(r1)
                        goto L8d
                    L39:
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r1 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding r1 = r1.getBinding()
                        if (r1 == 0) goto L4e
                        android.widget.EditText r1 = r1.usernameEditText
                        if (r1 == 0) goto L4e
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r2 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        android.graphics.drawable.Drawable r2 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.access$getAlertIcon(r2)
                        r1.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r2, r0)
                    L4e:
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r1 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding r1 = r1.getBinding()
                        if (r1 == 0) goto L59
                        android.widget.TextView r1 = r1.issuesTextView
                        goto L5a
                    L59:
                        r1 = r0
                    L5a:
                        if (r1 != 0) goto L5d
                        goto L60
                    L5d:
                        r1.setVisibility(r13)
                    L60:
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r13 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding r13 = r13.getBinding()
                        if (r13 == 0) goto L6b
                        android.widget.TextView r13 = r13.issuesTextView
                        goto L6c
                    L6b:
                        r13 = r0
                    L6c:
                        if (r13 != 0) goto L6f
                        goto L8d
                    L6f:
                        if (r12 == 0) goto L89
                        java.util.List r1 = r12.getIssues()
                        if (r1 == 0) goto L89
                        r2 = r1
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.lang.String r3 = "\n"
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 62
                        r10 = 0
                        java.lang.String r1 = ec.r.k0(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                        goto L8a
                    L89:
                        r1 = r0
                    L8a:
                        r13.setText(r1)
                    L8d:
                        com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment r13 = com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment.this
                        pc.l r13 = r13.getOnNameValid()
                        if (r13 == 0) goto La2
                        if (r12 == 0) goto L9f
                        boolean r12 = r12.isUsable()
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.b.a(r12)
                    L9f:
                        r13.invoke(r0)
                    La2:
                        dc.w r12 = dc.w.f13270a
                        return r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$4.AnonymousClass3.emit(com.habitrpg.shared.habitica.models.responses.VerifyUsernameResponse, kotlin.coroutines.Continuation):java.lang.Object");
                }
            };
            this.label = 1;
            if (gVar.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
