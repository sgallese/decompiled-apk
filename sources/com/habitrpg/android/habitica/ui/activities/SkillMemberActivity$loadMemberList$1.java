package com.habitrpg.android.habitica.ui.activities;

import android.content.Intent;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import kotlin.coroutines.Continuation;

/* compiled from: SkillMemberActivity.kt */
/* loaded from: classes4.dex */
final class SkillMemberActivity$loadMemberList$1 extends qc.r implements pc.l<String, dc.w> {
    final /* synthetic */ SkillMemberActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SkillMemberActivity.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$1$1", f = "SkillMemberActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.activities.SkillMemberActivity$loadMemberList$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements pc.p<ad.k0, Continuation<? super dc.w>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ SkillMemberActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(String str, SkillMemberActivity skillMemberActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = str;
            this.this$0 = skillMemberActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<dc.w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.this$0, continuation);
        }

        @Override // pc.p
        public final Object invoke(ad.k0 k0Var, Continuation<? super dc.w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(dc.w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ic.d.d();
            if (this.label == 0) {
                dc.n.b(obj);
                Intent intent = new Intent();
                intent.putExtra("member_id", this.$it);
                this.this$0.setResult(-1, intent);
                this.this$0.finish();
                return dc.w.f13270a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkillMemberActivity$loadMemberList$1(SkillMemberActivity skillMemberActivity) {
        super(1);
        this.this$0 = skillMemberActivity;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ dc.w invoke(String str) {
        invoke2(str);
        return dc.w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        qc.q.i(str, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(str, this.this$0, null), 1, null);
    }
}
