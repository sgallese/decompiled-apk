package com.habitrpg.android.habitica.ui.activities;

import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityClassSelectionBinding;
import com.habitrpg.android.habitica.extensions.BaseViewModelExtensionsKt;
import com.habitrpg.android.habitica.helpers.ReviewManager;
import com.habitrpg.android.habitica.models.user.Gear;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.Outfit;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaAlertDialog;
import com.habitrpg.android.habitica.ui.views.dialogs.HabiticaProgressDialog;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.views.AvatarView;

/* compiled from: ClassSelectionActivity.kt */
/* loaded from: classes4.dex */
public final class ClassSelectionActivity extends Hilt_ClassSelectionActivity {
    public static final int $stable = 8;
    private ActivityClassSelectionBinding binding;
    private String className;
    private Boolean classWasUnset;
    private String currentClass;
    private boolean isClassSelected;
    private String newClass = Stats.HEALER;
    private HabiticaProgressDialog progressDialog;
    public ReviewManager reviewManager;
    private Boolean shouldFinish;
    public MainUserViewModel userViewModel;

    public ClassSelectionActivity() {
        Boolean bool = Boolean.FALSE;
        this.classWasUnset = bool;
        this.shouldFinish = bool;
    }

    private final void checkForReviewPromptAfterClassSelection() {
        BaseViewModelExtensionsKt.observeOnce(getUserViewModel().getUser(), this, new androidx.lifecycle.g0() { // from class: com.habitrpg.android.habitica.ui.activities.v
            @Override // androidx.lifecycle.g0
            public final void onChanged(Object obj) {
                ClassSelectionActivity.checkForReviewPromptAfterClassSelection$lambda$7(ClassSelectionActivity.this, (User) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkForReviewPromptAfterClassSelection$lambda$7(ClassSelectionActivity classSelectionActivity, User user) {
        qc.q.i(classSelectionActivity, "this$0");
        if (user != null) {
            classSelectionActivity.getReviewManager().requestReview(classSelectionActivity, user.getLoginIncentives());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        if (qc.q.d(this.shouldFinish, Boolean.TRUE)) {
            HabiticaProgressDialog habiticaProgressDialog = this.progressDialog;
            if (habiticaProgressDialog != null) {
                habiticaProgressDialog.dismiss();
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displayClassChanged(String str) {
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(getString(R.string.class_changed, this.className));
        habiticaAlertDialog.setMessage(getString(R.string.class_changed_description, this.className));
        String string = getString(R.string.complete_tutorial);
        qc.q.h(string, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string, true, false, false, (pc.p) new ClassSelectionActivity$displayClassChanged$1(this), 12, (Object) null);
        String string2 = getString(R.string.learn_more);
        qc.q.h(string2, "getString(...)");
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, string2, false, false, false, (pc.p) new ClassSelectionActivity$displayClassChanged$2(this), 12, (Object) null);
        habiticaAlertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.habitrpg.android.habitica.ui.activities.u
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                ClassSelectionActivity.displayClassChanged$lambda$5(ClassSelectionActivity.this, dialogInterface);
            }
        });
        habiticaAlertDialog.enqueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void displayClassChanged$lambda$5(ClassSelectionActivity classSelectionActivity, DialogInterface dialogInterface) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.dismiss();
    }

    private final void displayConfirmationDialogForClass() {
        if (this.isClassSelected) {
            HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
            habiticaAlertDialog.setTitle(getString(R.string.change_class_selected_confirmation, this.className));
            habiticaAlertDialog.setMessage(getString(R.string.change_class_confirmation_message));
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.choose_class, true, false, false, (pc.p) new ClassSelectionActivity$displayConfirmationDialogForClass$1(this), 12, (Object) null);
            HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.dialog_go_back, false, false, false, (pc.p) null, 28, (Object) null);
            habiticaAlertDialog.show();
            return;
        }
        HabiticaAlertDialog habiticaAlertDialog2 = new HabiticaAlertDialog(this);
        habiticaAlertDialog2.setTitle(getString(R.string.class_confirmation, this.className));
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.choose_class, true, false, false, (pc.p) new ClassSelectionActivity$displayConfirmationDialogForClass$2(this), 12, (Object) null);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog2, (int) R.string.dialog_go_back, false, false, false, (pc.p) null, 28, (Object) null);
        habiticaAlertDialog2.show();
    }

    private final HabiticaProgressDialog displayProgressDialog(String str) {
        return HabiticaProgressDialog.Companion.show(this, str, 300);
    }

    private final void healerSelected() {
        setClassName(getString(R.string.healer));
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        activityClassSelectionBinding.selectedDescriptionTextView.setText(getString(R.string.healer_description));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        activityClassSelectionBinding3.selectedWrapperView.setBackgroundColor(androidx.core.content.a.c(this, R.color.yellow_100));
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.selectedTitleTextView.setTextColor(androidx.core.content.a.c(this, R.color.dark_brown));
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        activityClassSelectionBinding5.selectedDescriptionTextView.setTextColor(androidx.core.content.a.c(this, R.color.dark_brown));
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.selectedButton.setBackgroundResource(R.drawable.layout_rounded_bg_yellow_10);
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding7;
        }
        TextView textView = activityClassSelectionBinding2.healerButton;
        qc.q.h(textView, "healerButton");
        updateButtonBackgrounds(textView, androidx.core.content.a.e(this, R.drawable.layout_rounded_bg_window_yellow_border));
    }

    private final void mageSelected() {
        setClassName(getString(R.string.mage));
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        activityClassSelectionBinding.selectedDescriptionTextView.setText(getString(R.string.mage_description));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        activityClassSelectionBinding3.selectedWrapperView.setBackgroundColor(androidx.core.content.a.c(this, R.color.blue_10));
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.selectedTitleTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        activityClassSelectionBinding5.selectedDescriptionTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.selectedButton.setBackgroundResource(R.drawable.layout_rounded_bg_gray_alpha);
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding7;
        }
        TextView textView = activityClassSelectionBinding2.mageButton;
        qc.q.h(textView, "mageButton");
        updateButtonBackgrounds(textView, androidx.core.content.a.e(this, R.drawable.layout_rounded_bg_window_blue_border));
    }

    private final User makeUser(Preferences preferences, Outfit outfit) {
        Gear gear;
        User user = new User();
        user.setPreferences(preferences);
        user.setItems(new Items());
        Items items = user.getItems();
        if (items != null) {
            items.setGear(new Gear());
        }
        Items items2 = user.getItems();
        if (items2 != null) {
            gear = items2.getGear();
        } else {
            gear = null;
        }
        if (gear != null) {
            gear.setEquipped(outfit);
        }
        return user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(ClassSelectionActivity classSelectionActivity, View view) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.setNewClass(Stats.HEALER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$1(ClassSelectionActivity classSelectionActivity, View view) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.setNewClass("mage");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$2(ClassSelectionActivity classSelectionActivity, View view) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.setNewClass(Stats.ROGUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$3(ClassSelectionActivity classSelectionActivity, View view) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.setNewClass(Stats.WARRIOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$4(ClassSelectionActivity classSelectionActivity, View view) {
        qc.q.i(classSelectionActivity, "this$0");
        classSelectionActivity.displayConfirmationDialogForClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void optOutOfClasses() {
        this.shouldFinish = Boolean.TRUE;
        String string = getString(R.string.opting_out_progress);
        qc.q.h(string, "getString(...)");
        displayProgressDialog(string);
        ad.g.d(androidx.lifecycle.w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new ClassSelectionActivity$optOutOfClasses$1(this, null), 2, null);
    }

    private final void optOutSelected() {
        HabiticaAlertDialog habiticaAlertDialog = new HabiticaAlertDialog(this);
        habiticaAlertDialog.setTitle(getString(R.string.opt_out_confirmation));
        habiticaAlertDialog.setMessage(getString(R.string.opt_out_description));
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.opt_out_class, true, true, false, (pc.p) new ClassSelectionActivity$optOutSelected$1(this), 8, (Object) null);
        HabiticaAlertDialog.addButton$default(habiticaAlertDialog, (int) R.string.close, false, false, false, (pc.p) null, 28, (Object) null);
        habiticaAlertDialog.show();
    }

    private final void rogueSelected() {
        setClassName(getString(R.string.rogue));
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        activityClassSelectionBinding.selectedDescriptionTextView.setText(getString(R.string.rogue_description));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        activityClassSelectionBinding3.selectedWrapperView.setBackgroundColor(androidx.core.content.a.c(this, R.color.brand_200));
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.selectedTitleTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        activityClassSelectionBinding5.selectedDescriptionTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.selectedButton.setBackgroundResource(R.drawable.layout_rounded_bg_gray_alpha);
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding7;
        }
        TextView textView = activityClassSelectionBinding2.rogueButton;
        qc.q.h(textView, "rogueButton");
        updateButtonBackgrounds(textView, androidx.core.content.a.e(this, R.drawable.layout_rounded_bg_window_brand_border));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void selectClass(String str) {
        this.shouldFinish = Boolean.TRUE;
        if (qc.q.d(str, "mage")) {
            str = Stats.MAGE;
        }
        if (this.isClassSelected) {
            String string = getString(R.string.changing_class_progress);
            qc.q.h(string, "getString(...)");
            ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new ClassSelectionActivity$selectClass$1(this, str, displayProgressDialog(string), null), 2, null);
        } else {
            String string2 = getString(R.string.choosing_class_progress);
            qc.q.h(string2, "getString(...)");
            ad.g.d(androidx.lifecycle.w.a(this), ad.a1.c(), null, new ClassSelectionActivity$selectClass$2(this, str, displayProgressDialog(string2), null), 2, null);
        }
        checkForReviewPromptAfterClassSelection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAvatarViews(Preferences preferences) {
        Outfit outfit = new Outfit();
        outfit.setArmor("armor_healer_5");
        outfit.setHead("head_healer_5");
        outfit.setShield("shield_healer_5");
        outfit.setWeapon("weapon_healer_6");
        User makeUser = makeUser(preferences, outfit);
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        AvatarView avatarView = activityClassSelectionBinding.healerAvatarView;
        qc.q.h(avatarView, "healerAvatarView");
        AvatarView.setAvatar$default(avatarView, makeUser, null, 2, null);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfHealerLightBg());
        ActivityClassSelectionBinding activityClassSelectionBinding2 = this.binding;
        if (activityClassSelectionBinding2 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding2 = null;
        }
        activityClassSelectionBinding2.healerButton.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
        Outfit outfit2 = new Outfit();
        outfit2.setArmor("armor_wizard_5");
        outfit2.setHead("head_wizard_5");
        outfit2.setWeapon("weapon_wizard_6");
        User makeUser2 = makeUser(preferences, outfit2);
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        AvatarView avatarView2 = activityClassSelectionBinding3.mageAvatarView;
        qc.q.h(avatarView2, "mageAvatarView");
        AvatarView.setAvatar$default(avatarView2, makeUser2, null, 2, null);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfMageLightBg());
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.mageButton.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
        Outfit outfit3 = new Outfit();
        outfit3.setArmor("armor_rogue_5");
        outfit3.setHead("head_rogue_5");
        outfit3.setShield("shield_rogue_6");
        outfit3.setWeapon("weapon_rogue_6");
        User makeUser3 = makeUser(preferences, outfit3);
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        AvatarView avatarView3 = activityClassSelectionBinding5.rogueAvatarView;
        qc.q.h(avatarView3, "rogueAvatarView");
        AvatarView.setAvatar$default(avatarView3, makeUser3, null, 2, null);
        BitmapDrawable bitmapDrawable3 = new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfRogueLightBg());
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.rogueButton.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable3, (Drawable) null, (Drawable) null, (Drawable) null);
        Outfit outfit4 = new Outfit();
        outfit4.setArmor("armor_warrior_5");
        outfit4.setHead("head_warrior_5");
        outfit4.setShield("shield_warrior_5");
        outfit4.setWeapon("weapon_warrior_6");
        User makeUser4 = makeUser(preferences, outfit4);
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding7 = null;
        }
        AvatarView avatarView4 = activityClassSelectionBinding7.warriorAvatarView;
        qc.q.h(avatarView4, "warriorAvatarView");
        AvatarView.setAvatar$default(avatarView4, makeUser4, null, 2, null);
        BitmapDrawable bitmapDrawable4 = new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfWarriorLightBg());
        ActivityClassSelectionBinding activityClassSelectionBinding8 = this.binding;
        if (activityClassSelectionBinding8 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding8 = null;
        }
        activityClassSelectionBinding8.warriorButton.setCompoundDrawablesWithIntrinsicBounds(bitmapDrawable4, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    private final void setClassName(String str) {
        this.className = str;
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        activityClassSelectionBinding.selectedTitleTextView.setText(getString(R.string.x_class, this.className));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding3;
        }
        activityClassSelectionBinding2.selectedButton.setText(getString(R.string.become_x, this.className));
    }

    private final void setNewClass(String str) {
        this.newClass = str;
        switch (str.hashCode()) {
            case -1221263211:
                if (str.equals(Stats.HEALER)) {
                    healerSelected();
                    return;
                }
                return;
            case -787397269:
                if (str.equals(Stats.MAGE)) {
                    mageSelected();
                    return;
                }
                return;
            case 3343730:
                if (str.equals("mage")) {
                    mageSelected();
                    return;
                }
                return;
            case 108690906:
                if (str.equals(Stats.ROGUE)) {
                    rogueSelected();
                    return;
                }
                return;
            case 1124565314:
                if (str.equals(Stats.WARRIOR)) {
                    warriorSelected();
                    return;
                }
                return;
            default:
                return;
        }
    }

    private final void updateButtonBackgrounds(TextView textView, Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable e10 = androidx.core.content.a.e(this, R.drawable.layout_rounded_bg_window);
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        TextView textView2 = activityClassSelectionBinding.healerButton;
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        if (qc.q.d(activityClassSelectionBinding3.healerButton, textView)) {
            drawable2 = drawable;
        } else {
            drawable2 = e10;
        }
        textView2.setBackground(drawable2);
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        TextView textView3 = activityClassSelectionBinding4.mageButton;
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        if (qc.q.d(activityClassSelectionBinding5.mageButton, textView)) {
            drawable3 = drawable;
        } else {
            drawable3 = e10;
        }
        textView3.setBackground(drawable3);
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        TextView textView4 = activityClassSelectionBinding6.rogueButton;
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding7 = null;
        }
        if (qc.q.d(activityClassSelectionBinding7.rogueButton, textView)) {
            drawable4 = drawable;
        } else {
            drawable4 = e10;
        }
        textView4.setBackground(drawable4);
        ActivityClassSelectionBinding activityClassSelectionBinding8 = this.binding;
        if (activityClassSelectionBinding8 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding8 = null;
        }
        TextView textView5 = activityClassSelectionBinding8.warriorButton;
        ActivityClassSelectionBinding activityClassSelectionBinding9 = this.binding;
        if (activityClassSelectionBinding9 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding9;
        }
        if (!qc.q.d(activityClassSelectionBinding2.warriorButton, textView)) {
            drawable = e10;
        }
        textView5.setBackground(drawable);
    }

    private final void warriorSelected() {
        setClassName(getString(R.string.warrior));
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        activityClassSelectionBinding.selectedDescriptionTextView.setText(getString(R.string.warrior_description));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        activityClassSelectionBinding3.selectedWrapperView.setBackgroundColor(androidx.core.content.a.c(this, R.color.maroon_50));
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.selectedTitleTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        activityClassSelectionBinding5.selectedDescriptionTextView.setTextColor(androidx.core.content.a.c(this, R.color.white));
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.selectedButton.setBackgroundResource(R.drawable.layout_rounded_bg_gray_alpha);
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding7;
        }
        TextView textView = activityClassSelectionBinding2.warriorButton;
        qc.q.h(textView, "warriorButton");
        updateButtonBackgrounds(textView, androidx.core.content.a.e(this, R.drawable.layout_rounded_bg_window_red_border));
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityClassSelectionBinding inflate = ActivityClassSelectionBinding.inflate(getLayoutInflater());
        qc.q.h(inflate, "inflate(...)");
        this.binding = inflate;
        if (inflate == null) {
            qc.q.z("binding");
            inflate = null;
        }
        LinearLayout root = inflate.getRoot();
        qc.q.h(root, "getRoot(...)");
        return root;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_class_selection);
    }

    public final ReviewManager getReviewManager() {
        ReviewManager reviewManager = this.reviewManager;
        if (reviewManager != null) {
            return reviewManager;
        }
        qc.q.z("reviewManager");
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

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityClassSelectionBinding activityClassSelectionBinding = this.binding;
        ActivityClassSelectionBinding activityClassSelectionBinding2 = null;
        if (activityClassSelectionBinding == null) {
            qc.q.z("binding");
            activityClassSelectionBinding = null;
        }
        setSupportActionBar(activityClassSelectionBinding.toolbar);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        ClassSelectionActivityArgs classSelectionActivityArgs = (ClassSelectionActivityArgs) new k3.g(qc.g0.b(ClassSelectionActivityArgs.class), new ClassSelectionActivity$onCreate$$inlined$navArgs$1(this)).getValue();
        this.isClassSelected = classSelectionActivityArgs.getIsClassSelected();
        String className = classSelectionActivityArgs.getClassName();
        this.currentClass = className;
        if (className == null) {
            className = Stats.HEALER;
        }
        setNewClass(className);
        getUserViewModel().getUser().j(this, new ClassSelectionActivity$sam$androidx_lifecycle_Observer$0(new ClassSelectionActivity$onCreate$1(this)));
        ActivityClassSelectionBinding activityClassSelectionBinding3 = this.binding;
        if (activityClassSelectionBinding3 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding3 = null;
        }
        activityClassSelectionBinding3.healerWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassSelectionActivity.onCreate$lambda$0(ClassSelectionActivity.this, view);
            }
        });
        ActivityClassSelectionBinding activityClassSelectionBinding4 = this.binding;
        if (activityClassSelectionBinding4 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding4 = null;
        }
        activityClassSelectionBinding4.mageWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassSelectionActivity.onCreate$lambda$1(ClassSelectionActivity.this, view);
            }
        });
        ActivityClassSelectionBinding activityClassSelectionBinding5 = this.binding;
        if (activityClassSelectionBinding5 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding5 = null;
        }
        activityClassSelectionBinding5.rogueWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassSelectionActivity.onCreate$lambda$2(ClassSelectionActivity.this, view);
            }
        });
        ActivityClassSelectionBinding activityClassSelectionBinding6 = this.binding;
        if (activityClassSelectionBinding6 == null) {
            qc.q.z("binding");
            activityClassSelectionBinding6 = null;
        }
        activityClassSelectionBinding6.warriorWrapper.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassSelectionActivity.onCreate$lambda$3(ClassSelectionActivity.this, view);
            }
        });
        ActivityClassSelectionBinding activityClassSelectionBinding7 = this.binding;
        if (activityClassSelectionBinding7 == null) {
            qc.q.z("binding");
        } else {
            activityClassSelectionBinding2 = activityClassSelectionBinding7;
        }
        activityClassSelectionBinding2.selectedButton.setOnClickListener(new View.OnClickListener() { // from class: com.habitrpg.android.habitica.ui.activities.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClassSelectionActivity.onCreate$lambda$4(ClassSelectionActivity.this, view);
            }
        });
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        getMenuInflater().inflate(R.menu.class_selection, menu);
        return true;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.opt_out) {
            optOutSelected();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setReviewManager(ReviewManager reviewManager) {
        qc.q.i(reviewManager, "<set-?>");
        this.reviewManager = reviewManager;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
