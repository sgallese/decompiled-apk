package com.habitrpg.android.habitica.ui.activities;

import androidx.recyclerview.widget.RecyclerView;
import com.habitrpg.android.habitica.models.members.Member;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.adapter.social.PartyMemberRecyclerViewAdapter;
import java.util.List;
import kotlin.coroutines.Continuation;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SkillMemberActivity.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2", f = "SkillMemberActivity.kt", l = {67}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SkillMemberActivity$loadMemberList$2 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
    int label;
    final /* synthetic */ SkillMemberActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillMemberActivity$loadMemberList$2(SkillMemberActivity skillMemberActivity, Continuation<? super SkillMemberActivity$loadMemberList$2> continuation) {
        super(2, continuation);
        this.this$0 = skillMemberActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
        return new SkillMemberActivity$loadMemberList$2(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
        return ((SkillMemberActivity$loadMemberList$2) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                dc.n.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            dc.n.b(obj);
            final dd.g<User> user = this.this$0.getUserRepository().getUser();
            dd.g R = dd.i.R(dd.i.u(new dd.g<String>() { // from class: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                /* renamed from: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements dd.h {
                    final /* synthetic */ dd.h $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2", f = "SkillMemberActivity.kt", l = {223}, m = "emit")
                    /* renamed from: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
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

                    public AnonymousClass2(dd.h hVar) {
                        this.$this_unsafeFlow = hVar;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // dd.h
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2$1 r0 = (com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2$1 r0 = new com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = ic.b.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            dc.n.b(r6)
                            goto L4f
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            dc.n.b(r6)
                            dd.h r6 = r4.$this_unsafeFlow
                            com.habitrpg.android.habitica.models.user.User r5 = (com.habitrpg.android.habitica.models.user.User) r5
                            if (r5 == 0) goto L45
                            com.habitrpg.android.habitica.models.social.UserParty r5 = r5.getParty()
                            if (r5 == 0) goto L45
                            java.lang.String r5 = r5.getId()
                            goto L46
                        L45:
                            r5 = 0
                        L46:
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4f
                            return r1
                        L4f:
                            dc.w r5 = dc.w.f13270a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // dd.g
                public Object collect(dd.h<? super String> hVar, Continuation continuation) {
                    Object d11;
                    Object collect = dd.g.this.collect(new AnonymousClass2(hVar), continuation);
                    d11 = ic.d.d();
                    if (collect == d11) {
                        return collect;
                    }
                    return dc.w.f13270a;
                }
            }), new SkillMemberActivity$loadMemberList$2$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            final SkillMemberActivity skillMemberActivity = this.this$0;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$2.3
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super dc.w>) continuation);
                }

                public final Object emit(List<? extends Member> list, Continuation<? super dc.w> continuation) {
                    PartyMemberRecyclerViewAdapter partyMemberRecyclerViewAdapter;
                    partyMemberRecyclerViewAdapter = SkillMemberActivity.this.viewAdapter;
                    if (partyMemberRecyclerViewAdapter != null) {
                        partyMemberRecyclerViewAdapter.setData(list);
                    }
                    return dc.w.f13270a;
                }
            };
            this.label = 1;
            if (R.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return dc.w.f13270a;
    }
}
