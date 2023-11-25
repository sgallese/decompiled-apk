package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.k0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentWelcomeBinding;
import dc.n;
import dc.w;
import dd.g;
import dd.h;
import dd.x;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: WelcomeFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3", f = "WelcomeFragment.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WelcomeFragment$onViewCreated$3 extends l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ WelcomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeFragment$onViewCreated$3(WelcomeFragment welcomeFragment, Continuation<? super WelcomeFragment$onViewCreated$3> continuation) {
        super(2, continuation);
        this.this$0 = welcomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new WelcomeFragment$onViewCreated$3(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((WelcomeFragment$onViewCreated$3) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            xVar = this.this$0.displayNameVerificationEvents;
            g<Boolean> gVar = new g<Boolean>() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements h {
                    final /* synthetic */ h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @f(c = "com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2", f = "WelcomeFragment.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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
                    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r7)
                            goto L67
                        L29:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L31:
                            dc.n.b(r7)
                            dd.h r7 = r5.$this_unsafeFlow
                            java.lang.String r6 = (java.lang.String) r6
                            vc.f r2 = new vc.f
                            r4 = 30
                            r2.<init>(r3, r4)
                            if (r6 == 0) goto L4a
                            int r6 = r6.length()
                            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.d(r6)
                            goto L4b
                        L4a:
                            r6 = 0
                        L4b:
                            if (r6 == 0) goto L59
                            int r6 = r6.intValue()
                            boolean r6 = r2.m(r6)
                            if (r6 == 0) goto L59
                            r6 = 1
                            goto L5a
                        L59:
                            r6 = 0
                        L5a:
                            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L67
                            return r1
                        L67:
                            dc.w r6 = dc.w.f13270a
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(h<? super Boolean> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return w.f13270a;
                }
            };
            final WelcomeFragment welcomeFragment = this.this$0;
            h<? super Boolean> hVar = new h() { // from class: com.habitrpg.android.habitica.ui.fragments.setup.WelcomeFragment$onViewCreated$3.2
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), continuation);
                }

                public final Object emit(boolean z10, Continuation<? super w> continuation) {
                    EditText editText;
                    Drawable alertIcon;
                    EditText editText2;
                    Drawable checkmarkIcon;
                    if (z10) {
                        FragmentWelcomeBinding binding = WelcomeFragment.this.getBinding();
                        if (binding != null && (editText2 = binding.displayNameEditText) != null) {
                            checkmarkIcon = WelcomeFragment.this.getCheckmarkIcon();
                            editText2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, checkmarkIcon, (Drawable) null);
                        }
                        FragmentWelcomeBinding binding2 = WelcomeFragment.this.getBinding();
                        TextView textView = binding2 != null ? binding2.issuesTextView : null;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    } else {
                        FragmentWelcomeBinding binding3 = WelcomeFragment.this.getBinding();
                        if (binding3 != null && (editText = binding3.displayNameEditText) != null) {
                            alertIcon = WelcomeFragment.this.getAlertIcon();
                            editText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, alertIcon, (Drawable) null);
                        }
                        FragmentWelcomeBinding binding4 = WelcomeFragment.this.getBinding();
                        TextView textView2 = binding4 != null ? binding4.issuesTextView : null;
                        if (textView2 != null) {
                            textView2.setVisibility(0);
                        }
                        FragmentWelcomeBinding binding5 = WelcomeFragment.this.getBinding();
                        TextView textView3 = binding5 != null ? binding5.issuesTextView : null;
                        if (textView3 != null) {
                            Context context = WelcomeFragment.this.getContext();
                            textView3.setText(context != null ? context.getString(R.string.display_name_length_error) : null);
                        }
                    }
                    return w.f13270a;
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
