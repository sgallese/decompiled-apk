package com.habitrpg.android.habitica.ui.fragments.inventory.customization;

import com.habitrpg.android.habitica.models.inventory.Equipment;
import com.habitrpg.android.habitica.ui.activities.TaskFormActivity;
import com.habitrpg.android.habitica.ui.theme.HabiticaThemeKt;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import dc.w;
import j0.j1;
import j0.n;
import pc.p;
import qc.q;
import qc.r;

/* compiled from: AvatarOverviewFragment.kt */
/* loaded from: classes4.dex */
final class AvatarOverviewFragment$onCreateView$1$1 extends r implements p<j0.l, Integer, w> {
    final /* synthetic */ AvatarOverviewFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AvatarOverviewFragment.kt */
    /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$1$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends r implements p<j0.l, Integer, w> {
        final /* synthetic */ AvatarOverviewFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AvatarOverviewFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C02781 extends r implements p<String, String, w> {
            final /* synthetic */ AvatarOverviewFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C02781(AvatarOverviewFragment avatarOverviewFragment) {
                super(2);
                this.this$0 = avatarOverviewFragment;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ w invoke(String str, String str2) {
                invoke2(str, str2);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                q.i(str, TaskFormActivity.TASK_TYPE_KEY);
                this.this$0.displayCustomizationFragment(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AvatarOverviewFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$1$1$1$2  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass2 extends r implements p<String, String, w> {
            final /* synthetic */ AvatarOverviewFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AvatarOverviewFragment avatarOverviewFragment) {
                super(2);
                this.this$0 = avatarOverviewFragment;
            }

            @Override // pc.p
            public /* bridge */ /* synthetic */ w invoke(String str, String str2) {
                invoke2(str, str2);
                return w.f13270a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str, String str2) {
                q.i(str, TaskFormActivity.TASK_TYPE_KEY);
                this.this$0.displayAvatarEquipmentFragment(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AvatarOverviewFragment.kt */
        /* renamed from: com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment$onCreateView$1$1$1$3  reason: invalid class name */
        /* loaded from: classes4.dex */
        public static final class AnonymousClass3 extends r implements pc.q<String, String, Boolean, w> {
            final /* synthetic */ AvatarOverviewFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AvatarOverviewFragment avatarOverviewFragment) {
                super(3);
                this.this$0 = avatarOverviewFragment;
            }

            @Override // pc.q
            public /* bridge */ /* synthetic */ w invoke(String str, String str2, Boolean bool) {
                invoke(str, str2, bool.booleanValue());
                return w.f13270a;
            }

            public final void invoke(String str, String str2, boolean z10) {
                q.i(str, TaskFormActivity.TASK_TYPE_KEY);
                this.this$0.displayEquipmentFragment(str, str2, z10);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AvatarOverviewFragment avatarOverviewFragment) {
            super(2);
            this.this$0 = avatarOverviewFragment;
        }

        @Override // pc.p
        public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return w.f13270a;
        }

        public final void invoke(j0.l lVar, int i10) {
            j1 j1Var;
            j1 j1Var2;
            if ((i10 & 11) == 2 && lVar.t()) {
                lVar.z();
                return;
            }
            if (n.K()) {
                n.V(-308393964, i10, -1, "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (AvatarOverviewFragment.kt:83)");
            }
            MainUserViewModel userViewModel = this.this$0.getUserViewModel();
            boolean showCustomization = this.this$0.getShowCustomization();
            boolean z10 = !this.this$0.getShowCustomization();
            j1Var = this.this$0.battleGearWeapon;
            Equipment equipment = (Equipment) j1Var.getValue();
            boolean z11 = false;
            boolean z12 = equipment != null && equipment.getTwoHanded();
            j1Var2 = this.this$0.costumeWeapon;
            Equipment equipment2 = (Equipment) j1Var2.getValue();
            if (equipment2 != null && equipment2.getTwoHanded()) {
                z11 = true;
            }
            AvatarOverviewFragmentKt.AvatarOverviewView(userViewModel, showCustomization, z10, z12, z11, new C02781(this.this$0), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), lVar, MainUserViewModel.$stable, 0);
            if (n.K()) {
                n.U();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarOverviewFragment$onCreateView$1$1(AvatarOverviewFragment avatarOverviewFragment) {
        super(2);
        this.this$0 = avatarOverviewFragment;
    }

    @Override // pc.p
    public /* bridge */ /* synthetic */ w invoke(j0.l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return w.f13270a;
    }

    public final void invoke(j0.l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.t()) {
            lVar.z();
            return;
        }
        if (n.K()) {
            n.V(-1713299447, i10, -1, "com.habitrpg.android.habitica.ui.fragments.inventory.customization.AvatarOverviewFragment.onCreateView.<anonymous>.<anonymous> (AvatarOverviewFragment.kt:82)");
        }
        HabiticaThemeKt.HabiticaTheme(q0.c.b(lVar, -308393964, true, new AnonymousClass1(this.this$0)), lVar, 6);
        if (n.K()) {
            n.U();
        }
    }
}
