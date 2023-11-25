package com.habitrpg.android.habitica.ui.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.InventoryRepository;
import com.habitrpg.android.habitica.databinding.FragmentStatsBinding;
import com.habitrpg.android.habitica.extensions.AlertDialogExtensionsKt;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.stats.BulkAllocateStatsDialog;
import com.habitrpg.android.habitica.ui.views.stats.StatsView;
import com.habitrpg.common.habitica.extensions.ContextExtensionsKt;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import com.habitrpg.shared.habitica.models.tasks.Attribute;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StatsFragment.kt */
/* loaded from: classes4.dex */
public final class StatsFragment extends Hilt_StatsFragment<FragmentStatsBinding> {
    public static final int $stable = 8;
    private FragmentStatsBinding binding;
    private boolean canAllocatePoints;
    public InventoryRepository inventoryRepository;
    private int totalConstitution;
    private int totalIntelligence;
    private int totalPerception;
    private int totalStrength;
    public MainUserViewModel userViewModel;

    /* JADX INFO: Access modifiers changed from: private */
    public final void allocatePoint(Attribute attribute) {
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new StatsFragment$allocatePoint$1(this, attribute, null), 1, null);
    }

    private final void changeAutoAllocationMode(String str) {
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioButton radioButton3 = null;
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new StatsFragment$changeAutoAllocationMode$1(this, str, null), 1, null);
        FragmentStatsBinding binding = getBinding();
        if (binding != null) {
            radioButton = binding.distributeEvenlyButton;
        } else {
            radioButton = null;
        }
        if (radioButton != null) {
            radioButton.setChecked(qc.q.d(str, Stats.AUTO_ALLOCATE_FLAT));
        }
        FragmentStatsBinding binding2 = getBinding();
        if (binding2 != null) {
            radioButton2 = binding2.distributeClassButton;
        } else {
            radioButton2 = null;
        }
        if (radioButton2 != null) {
            radioButton2.setChecked(qc.q.d(str, Stats.AUTO_ALLOCATE_CLASSBASED));
        }
        FragmentStatsBinding binding3 = getBinding();
        if (binding3 != null) {
            radioButton3 = binding3.distributeTaskButton;
        }
        if (radioButton3 != null) {
            radioButton3.setChecked(qc.q.d(str, Stats.AUTO_ALLOCATE_TASKBASED));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(StatsFragment statsFragment, CompoundButton compoundButton, boolean z10) {
        qc.q.i(statsFragment, "this$0");
        if (z10) {
            statsFragment.changeAutoAllocationMode(Stats.AUTO_ALLOCATE_FLAT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(StatsFragment statsFragment, CompoundButton compoundButton, boolean z10) {
        qc.q.i(statsFragment, "this$0");
        if (z10) {
            statsFragment.changeAutoAllocationMode(Stats.AUTO_ALLOCATE_CLASSBASED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(StatsFragment statsFragment, CompoundButton compoundButton, boolean z10) {
        qc.q.i(statsFragment, "this$0");
        if (z10) {
            statsFragment.changeAutoAllocationMode(Stats.AUTO_ALLOCATE_TASKBASED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(StatsFragment statsFragment, CompoundButton compoundButton, boolean z10) {
        qc.q.i(statsFragment, "this$0");
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(statsFragment), null, new StatsFragment$onViewCreated$6$1(statsFragment, z10, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(StatsFragment statsFragment, View view) {
        qc.q.i(statsFragment, "this$0");
        statsFragment.showHelpAlert(R.string.distribute_evenly_help);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(StatsFragment statsFragment, View view) {
        qc.q.i(statsFragment, "this$0");
        statsFragment.showHelpAlert(R.string.distribute_class_help);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7(StatsFragment statsFragment, View view) {
        qc.q.i(statsFragment, "this$0");
        statsFragment.showHelpAlert(R.string.distribute_task_help);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$8(StatsFragment statsFragment, View view) {
        qc.q.i(statsFragment, "this$0");
        if (statsFragment.canAllocatePoints) {
            statsFragment.showBulkAllocateDialog();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTotalConstitution(int i10) {
        StatsView statsView;
        this.totalConstitution = i10;
        FragmentStatsBinding binding = getBinding();
        if (binding != null) {
            statsView = binding.constitutionStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setTotalValue(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTotalIntelligence(int i10) {
        StatsView statsView;
        this.totalIntelligence = i10;
        FragmentStatsBinding binding = getBinding();
        if (binding != null) {
            statsView = binding.intelligenceStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setTotalValue(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTotalPerception(int i10) {
        StatsView statsView;
        this.totalPerception = i10;
        FragmentStatsBinding binding = getBinding();
        if (binding != null) {
            statsView = binding.perceptionStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setTotalValue(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTotalStrength(int i10) {
        StatsView statsView;
        this.totalStrength = i10;
        FragmentStatsBinding binding = getBinding();
        if (binding != null) {
            statsView = binding.strengthStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setTotalValue(i10);
        }
    }

    private final void showBulkAllocateDialog() {
        Context context = getContext();
        if (context != null) {
            new BulkAllocateStatsDialog(context, getUserRepository()).show();
        }
    }

    private final void showHelpAlert(int i10) {
        HabiticaAlertDialog habiticaAlertDialog;
        Context context = getContext();
        if (context != null) {
            habiticaAlertDialog = new HabiticaAlertDialog(context);
        } else {
            habiticaAlertDialog = null;
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.setMessage(i10);
        }
        if (habiticaAlertDialog != null) {
            AlertDialogExtensionsKt.addOkButton$default(habiticaAlertDialog, false, null, 3, null);
        }
        if (habiticaAlertDialog != null) {
            habiticaAlertDialog.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void updateAttributePoints(com.habitrpg.android.habitica.models.user.User r8) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.StatsFragment.updateAttributePoints(com.habitrpg.android.habitica.models.user.User):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStats(User user) {
        Outfit outfit;
        Gear gear;
        Items items = user.getItems();
        if (items != null && (gear = items.getGear()) != null) {
            outfit = gear.getEquipped();
        } else {
            outfit = null;
        }
        ArrayList arrayList = new ArrayList();
        if (outfit != null) {
            arrayList.add(outfit.getArmor());
            arrayList.add(outfit.getBack());
            arrayList.add(outfit.getBody());
            arrayList.add(outfit.getEyeWear());
            arrayList.add(outfit.getHead());
            arrayList.add(outfit.getHeadAccessory());
            arrayList.add(outfit.getShield());
            arrayList.add(outfit.getWeapon());
        }
        ExceptionHandlerKt.launchCatching$default(androidx.lifecycle.w.a(this), null, new StatsFragment$updateStats$2(this, arrayList, user, null), 1, null);
    }

    public final InventoryRepository getInventoryRepository() {
        InventoryRepository inventoryRepository = this.inventoryRepository;
        if (inventoryRepository != null) {
            return inventoryRepository;
        }
        qc.q.z("inventoryRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<String> d10;
        qc.q.i(layoutInflater, "inflater");
        setTutorialStepIdentifier(NavigationDrawerFragment.SIDEBAR_STATS);
        String string = getString(R.string.tutorial_stats);
        qc.q.h(string, "getString(...)");
        d10 = ec.s.d(string);
        setTutorialTexts(d10);
        setHidesToolbar(true);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        getInventoryRepository().close();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        StatsView statsView;
        StatsView statsView2;
        StatsView statsView3;
        LinearLayout linearLayout;
        ImageButton imageButton;
        ImageButton imageButton2;
        ImageButton imageButton3;
        SwitchMaterial switchMaterial;
        RadioButton radioButton;
        RadioButton radioButton2;
        RadioButton radioButton3;
        ImageButton imageButton4;
        ImageButton imageButton5;
        ImageButton imageButton6;
        ImageView imageView;
        ImageView imageView2;
        qc.q.i(view, "view");
        super.onViewCreated(view, bundle);
        FragmentStatsBinding binding = getBinding();
        if (binding != null && (imageView2 = binding.leftSparklesView) != null) {
            imageView2.setImageBitmap(HabiticaIconsHelper.imageOfAttributeSparklesLeft());
        }
        FragmentStatsBinding binding2 = getBinding();
        if (binding2 != null && (imageView = binding2.rightSparklesView) != null) {
            imageView.setImageBitmap(HabiticaIconsHelper.imageOfAttributeSparklesRight());
        }
        Context context = getContext();
        if (context != null) {
            int themeColor = ContextExtensionsKt.getThemeColor(context, R.attr.colorPrimaryOffset);
            FragmentStatsBinding binding3 = getBinding();
            if (binding3 != null && (imageButton6 = binding3.distributeEvenlyHelpButton) != null) {
                imageButton6.setImageBitmap(HabiticaIconsHelper.imageOfInfoIcon(themeColor));
            }
            FragmentStatsBinding binding4 = getBinding();
            if (binding4 != null && (imageButton5 = binding4.distributeClassHelpButton) != null) {
                imageButton5.setImageBitmap(HabiticaIconsHelper.imageOfInfoIcon(themeColor));
            }
            FragmentStatsBinding binding5 = getBinding();
            if (binding5 != null && (imageButton4 = binding5.distributeTaskHelpButton) != null) {
                imageButton4.setImageBitmap(HabiticaIconsHelper.imageOfInfoIcon(themeColor));
            }
        }
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new StatsFragment$sam$androidx_lifecycle_Observer$0(new StatsFragment$onViewCreated$2(this)));
        FragmentStatsBinding binding6 = getBinding();
        if (binding6 != null && (radioButton3 = binding6.distributeEvenlyButton) != null) {
            radioButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.w
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    StatsFragment.onViewCreated$lambda$1(StatsFragment.this, compoundButton, z10);
                }
            });
        }
        FragmentStatsBinding binding7 = getBinding();
        if (binding7 != null && (radioButton2 = binding7.distributeClassButton) != null) {
            radioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.x
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    StatsFragment.onViewCreated$lambda$2(StatsFragment.this, compoundButton, z10);
                }
            });
        }
        FragmentStatsBinding binding8 = getBinding();
        if (binding8 != null && (radioButton = binding8.distributeTaskButton) != null) {
            radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.y
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    StatsFragment.onViewCreated$lambda$3(StatsFragment.this, compoundButton, z10);
                }
            });
        }
        FragmentStatsBinding binding9 = getBinding();
        if (binding9 != null && (switchMaterial = binding9.automaticAllocationSwitch) != null) {
            switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.habitrpg.android.habitica.ui.fragments.z
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                    StatsFragment.onViewCreated$lambda$4(StatsFragment.this, compoundButton, z10);
                }
            });
        }
        FragmentStatsBinding binding10 = getBinding();
        StatsView statsView4 = null;
        if (binding10 != null) {
            statsView = binding10.strengthStatsView;
        } else {
            statsView = null;
        }
        if (statsView != null) {
            statsView.setAllocateAction(new StatsFragment$onViewCreated$7(this));
        }
        FragmentStatsBinding binding11 = getBinding();
        if (binding11 != null) {
            statsView2 = binding11.intelligenceStatsView;
        } else {
            statsView2 = null;
        }
        if (statsView2 != null) {
            statsView2.setAllocateAction(new StatsFragment$onViewCreated$8(this));
        }
        FragmentStatsBinding binding12 = getBinding();
        if (binding12 != null) {
            statsView3 = binding12.constitutionStatsView;
        } else {
            statsView3 = null;
        }
        if (statsView3 != null) {
            statsView3.setAllocateAction(new StatsFragment$onViewCreated$9(this));
        }
        FragmentStatsBinding binding13 = getBinding();
        if (binding13 != null) {
            statsView4 = binding13.perceptionStatsView;
        }
        if (statsView4 != null) {
            statsView4.setAllocateAction(new StatsFragment$onViewCreated$10(this));
        }
        FragmentStatsBinding binding14 = getBinding();
        if (binding14 != null && (imageButton3 = binding14.distributeEvenlyHelpButton) != null) {
            imageButton3.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StatsFragment.onViewCreated$lambda$5(StatsFragment.this, view2);
                }
            });
        }
        FragmentStatsBinding binding15 = getBinding();
        if (binding15 != null && (imageButton2 = binding15.distributeClassHelpButton) != null) {
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StatsFragment.onViewCreated$lambda$6(StatsFragment.this, view2);
                }
            });
        }
        FragmentStatsBinding binding16 = getBinding();
        if (binding16 != null && (imageButton = binding16.distributeTaskHelpButton) != null) {
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StatsFragment.onViewCreated$lambda$7(StatsFragment.this, view2);
                }
            });
        }
        FragmentStatsBinding binding17 = getBinding();
        if (binding17 != null && (linearLayout = binding17.statsAllocationButton) != null) {
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.fragments.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StatsFragment.onViewCreated$lambda$8(StatsFragment.this, view2);
                }
            });
        }
    }

    public final void setInventoryRepository(InventoryRepository inventoryRepository) {
        qc.q.i(inventoryRepository, "<set-?>");
        this.inventoryRepository = inventoryRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentStatsBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qc.q.i(layoutInflater, "inflater");
        FragmentStatsBinding inflate = FragmentStatsBinding.inflate(layoutInflater, viewGroup, false);
        qc.q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentStatsBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentStatsBinding fragmentStatsBinding) {
        this.binding = fragmentStatsBinding;
    }
}
