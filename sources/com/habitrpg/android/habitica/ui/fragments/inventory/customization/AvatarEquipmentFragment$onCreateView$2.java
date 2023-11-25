package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import ad.k0;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import dc.n;
import dc.w;
import kotlin.coroutines.Continuation;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: AvatarEquipmentFragment.kt */
/* loaded from: classes4.dex */
final class AvatarEquipmentFragment$onCreateView$2 extends r implements pc.l<Equipment, w> {
    final /* synthetic */ AvatarEquipmentFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarEquipmentFragment.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment$onCreateView$2$1", f = "AvatarEquipmentFragment.kt", l = {64, 65}, m = "invokeSuspend")
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarEquipmentFragment$onCreateView$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
        final /* synthetic */ Equipment $equipment;
        int label;
        final /* synthetic */ AvatarEquipmentFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AvatarEquipmentFragment avatarEquipmentFragment, Equipment equipment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = avatarEquipmentFragment;
            this.$equipment = equipment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation<w> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$equipment, continuation);
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
                if (i10 != 1) {
                    if (i10 == 2) {
                        n.b(obj);
                        return w.f13270a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                n.b(obj);
            } else {
                n.b(obj);
                InventoryRepository inventoryRepository = this.this$0.getInventoryRepository();
                String key = this.$equipment.getKey();
                if (key == null) {
                    key = "";
                }
                this.label = 1;
                if (inventoryRepository.purchaseItem("gear", key, 1, this) == d10) {
                    return d10;
                }
            }
            UserRepository userRepository = this.this$0.getUserRepository();
            this.label = 2;
            if (UserRepository.DefaultImpls.retrieveUser$default(userRepository, false, true, false, this, 5, null) == d10) {
                return d10;
            }
            return w.f13270a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarEquipmentFragment$onCreateView$2(AvatarEquipmentFragment avatarEquipmentFragment) {
        super(1);
        this.this$0 = avatarEquipmentFragment;
    }

    @Override // pc.l
    public /* bridge */ /* synthetic */ w invoke(Equipment equipment) {
        invoke2(equipment);
        return w.f13270a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Equipment equipment) {
        q.i(equipment, NavigationDrawerFragment.SIDEBAR_EQUIPMENT);
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this.this$0), null, new AnonymousClass1(this.this$0, equipment, null), 1, null);
    }
}
