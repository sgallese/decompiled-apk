package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import android.util.Log;
import com.habitrpg.android.habitica.models.CustomizationFilter;
import dc.n;
import dc.w;
import dd.x;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: AvatarCustomizationFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onViewCreated$4", f = "AvatarCustomizationFragment.kt", l = {148}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarCustomizationFragment$onViewCreated$4 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    int label;
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$onViewCreated$4(AvatarCustomizationFragment avatarCustomizationFragment, Continuation<? super AvatarCustomizationFragment$onViewCreated$4> continuation) {
        super(2, continuation);
        this.this$0 = avatarCustomizationFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarCustomizationFragment$onViewCreated$4(this.this$0, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarCustomizationFragment$onViewCreated$4) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        x xVar;
        d10 = ic.d.d();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n.b(obj);
        } else {
            n.b(obj);
            xVar = this.this$0.currentFilter;
            dd.h hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$onViewCreated$4.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((CustomizationFilter) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(CustomizationFilter customizationFilter, Continuation<? super w> continuation) {
                    Log.e("NewFilter", customizationFilter.toString());
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (xVar.collect(hVar, this) == d10) {
                return d10;
            }
        }
        throw new KotlinNothingValueException();
    }
}
