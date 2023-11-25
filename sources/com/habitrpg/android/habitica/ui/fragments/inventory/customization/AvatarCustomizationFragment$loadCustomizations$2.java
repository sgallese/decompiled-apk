package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.android.habitica.models.inventory.Customization;
import dc.n;
import dc.w;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: AvatarCustomizationFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$2", f = "AvatarCustomizationFragment.kt", l = {234}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class AvatarCustomizationFragment$loadCustomizations$2 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ String $otherCategory;
    final /* synthetic */ String $type;
    int label;
    final /* synthetic */ AvatarCustomizationFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarCustomizationFragment$loadCustomizations$2(AvatarCustomizationFragment avatarCustomizationFragment, String str, String str2, Continuation<? super AvatarCustomizationFragment$loadCustomizations$2> continuation) {
        super(2, continuation);
        this.this$0 = avatarCustomizationFragment;
        this.$type = str;
        this.$otherCategory = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new AvatarCustomizationFragment$loadCustomizations$2(this.this$0, this.$type, this.$otherCategory, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((AvatarCustomizationFragment$loadCustomizations$2) create(k0Var, continuation)).invokeSuspend(w.f13270a);
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
            dd.g<List<Customization>> customizations = this.this$0.getCustomizationRepository().getCustomizations(this.$type, this.$otherCategory, true);
            final AvatarCustomizationFragment avatarCustomizationFragment = this.this$0;
            dd.h<? super List<Customization>> hVar = new dd.h() { // from class: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarCustomizationFragment$loadCustomizations$2.1
                @Override // dd.h
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List) obj2, (Continuation<? super w>) continuation);
                }

                public final Object emit(List<? extends Customization> list, Continuation<? super w> continuation) {
                    AvatarCustomizationFragment.this.getAdapter$Habitica_2311256681_prodRelease().setAdditionalSetItems(list);
                    return w.f13270a;
                }
            };
            this.label = 1;
            if (customizations.collect(hVar, this) == d10) {
                return d10;
            }
        }
        return w.f13270a;
    }
}
