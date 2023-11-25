package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import pc.l;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: AvatarSetupFragment.kt */
/* loaded from: classes4.dex */
final class AvatarSetupFragment$onViewCreated$1 extends r implements l<Map<String, ? extends Object>, w> {
    final /* synthetic */ AvatarSetupFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarSetupFragment.kt */
    @f(c = "com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment$onViewCreated$1$1", f = "AvatarSetupFragment.kt", l = {65}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Map<String, Object> $it;
        int label;
        final /* synthetic */ AvatarSetupFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AvatarSetupFragment avatarSetupFragment, Map<String, ? extends Object> map, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = avatarSetupFragment;
            this.$it = map;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$it, continuation);
        }

        @Override // pc.p
        public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
            return ((AnonymousClass1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d10;
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
                UserRepository userRepository = this.this$0.getUserRepository();
                Map<String, ? extends Object> map = this.$it;
                this.label = 1;
                if (userRepository.updateUser(map, this) == d10) {
                    return d10;
                }
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarSetupFragment$onViewCreated$1(AvatarSetupFragment avatarSetupFragment) {
        super(1);
        this.this$0 = avatarSetupFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Map<String, ? extends Object> map) {
        invoke2(map);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Map<String, ? extends Object> map) {
        q.i(map, "it");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, map, null), 1, null);
    }
}
