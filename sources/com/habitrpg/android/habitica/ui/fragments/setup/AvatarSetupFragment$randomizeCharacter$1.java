package com.habitrpg.android.habitica.ui.fragments.setup;

import ad.k0;
import com.habitrpg.android.habitica.data.UserRepository;
import dc.n;
import dc.w;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pc.p;

/* compiled from: AvatarSetupFragment.kt */
@f(c = "com.habitrpg.android.habitica.ui.fragments.setup.AvatarSetupFragment$randomizeCharacter$1", f = "AvatarSetupFragment.kt", l = {197}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarSetupFragment$randomizeCharacter$1 extends l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ HashMap<String, Object> $updateData;
    int label;
    final /* synthetic */ AvatarSetupFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarSetupFragment$randomizeCharacter$1(AvatarSetupFragment avatarSetupFragment, HashMap<String, Object> hashMap, Continuation<? super AvatarSetupFragment$randomizeCharacter$1> continuation) {
        super(2, continuation);
        this.this$0 = avatarSetupFragment;
        this.$updateData = hashMap;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarSetupFragment$randomizeCharacter$1(this.this$0, this.$updateData, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarSetupFragment$randomizeCharacter$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            HashMap<String, Object> hashMap = this.$updateData;
            this.label = 1;
            if (userRepository.updateUser(hashMap, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
