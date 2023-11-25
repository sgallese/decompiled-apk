package com.habitrpg.android.habitica.ui.activities;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.ActivityFixcharacterBinding;
import com.habitrpg.android.habitica.extensions.DrawableExtendsionsKt;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import java.util.HashMap;

/* compiled from: FixCharacterValuesActivity.kt */
/* loaded from: classes4.dex */
public final class FixCharacterValuesActivity extends Hilt_FixCharacterValuesActivity {
    public static final int $stable = 8;
    private ActivityFixcharacterBinding binding;
    private User user;
    public MainUserViewModel userViewModel;

    private final double getDoubleValue(EditText editText) {
        try {
            return Double.parseDouble(editText.getText().toString());
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    private final void setIconBackground(View view, int i10) {
        Drawable e10 = androidx.core.content.a.e(this, R.drawable.layout_rounded_bg);
        if (e10 != null) {
            DrawableExtendsionsKt.setTintWith(e10, i10, PorterDuff.Mode.MULTIPLY);
        }
        if (e10 != null) {
            e10.setAlpha(50);
        }
        view.setBackground(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUser(User user) {
        this.user = user;
        if (user != null) {
            updateFields(user);
        }
    }

    private final void updateFields(User user) {
        Stats stats = user.getStats();
        if (stats == null) {
            return;
        }
        ActivityFixcharacterBinding activityFixcharacterBinding = this.binding;
        ActivityFixcharacterBinding activityFixcharacterBinding2 = null;
        if (activityFixcharacterBinding == null) {
            qc.q.z("binding");
            activityFixcharacterBinding = null;
        }
        activityFixcharacterBinding.healthEditText.setText(String.valueOf(stats.getHp()));
        ActivityFixcharacterBinding activityFixcharacterBinding3 = this.binding;
        if (activityFixcharacterBinding3 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding3 = null;
        }
        activityFixcharacterBinding3.experienceEditText.setText(String.valueOf(stats.getExp()));
        ActivityFixcharacterBinding activityFixcharacterBinding4 = this.binding;
        if (activityFixcharacterBinding4 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding4 = null;
        }
        activityFixcharacterBinding4.goldEditText.setText(String.valueOf(stats.getGp()));
        ActivityFixcharacterBinding activityFixcharacterBinding5 = this.binding;
        if (activityFixcharacterBinding5 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding5 = null;
        }
        activityFixcharacterBinding5.manaEditText.setText(String.valueOf(stats.getMp()));
        ActivityFixcharacterBinding activityFixcharacterBinding6 = this.binding;
        if (activityFixcharacterBinding6 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding6 = null;
        }
        activityFixcharacterBinding6.levelEditText.setText(String.valueOf(stats.getLvl()));
        ActivityFixcharacterBinding activityFixcharacterBinding7 = this.binding;
        if (activityFixcharacterBinding7 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding7 = null;
        }
        activityFixcharacterBinding7.streakEditText.setText(String.valueOf(user.getStreakCount()));
        String habitClass = stats.getHabitClass();
        if (habitClass != null) {
            switch (habitClass.hashCode()) {
                case -1221263211:
                    if (habitClass.equals(Stats.HEALER)) {
                        ActivityFixcharacterBinding activityFixcharacterBinding8 = this.binding;
                        if (activityFixcharacterBinding8 == null) {
                            qc.q.z("binding");
                            activityFixcharacterBinding8 = null;
                        }
                        View view = activityFixcharacterBinding8.levelIconBackgroundView;
                        qc.q.h(view, "levelIconBackgroundView");
                        setIconBackground(view, androidx.core.content.a.c(this, R.color.yellow_500));
                        ActivityFixcharacterBinding activityFixcharacterBinding9 = this.binding;
                        if (activityFixcharacterBinding9 == null) {
                            qc.q.z("binding");
                        } else {
                            activityFixcharacterBinding2 = activityFixcharacterBinding9;
                        }
                        activityFixcharacterBinding2.levelIconView.setImageBitmap(HabiticaIconsHelper.imageOfHealerLightBg());
                        return;
                    }
                    return;
                case -787397269:
                    if (habitClass.equals(Stats.MAGE)) {
                        ActivityFixcharacterBinding activityFixcharacterBinding10 = this.binding;
                        if (activityFixcharacterBinding10 == null) {
                            qc.q.z("binding");
                            activityFixcharacterBinding10 = null;
                        }
                        View view2 = activityFixcharacterBinding10.levelIconBackgroundView;
                        qc.q.h(view2, "levelIconBackgroundView");
                        setIconBackground(view2, androidx.core.content.a.c(this, R.color.blue_500));
                        ActivityFixcharacterBinding activityFixcharacterBinding11 = this.binding;
                        if (activityFixcharacterBinding11 == null) {
                            qc.q.z("binding");
                        } else {
                            activityFixcharacterBinding2 = activityFixcharacterBinding11;
                        }
                        activityFixcharacterBinding2.levelIconView.setImageBitmap(HabiticaIconsHelper.imageOfMageLightBg());
                        return;
                    }
                    return;
                case 108690906:
                    if (habitClass.equals(Stats.ROGUE)) {
                        ActivityFixcharacterBinding activityFixcharacterBinding12 = this.binding;
                        if (activityFixcharacterBinding12 == null) {
                            qc.q.z("binding");
                            activityFixcharacterBinding12 = null;
                        }
                        View view3 = activityFixcharacterBinding12.levelIconBackgroundView;
                        qc.q.h(view3, "levelIconBackgroundView");
                        setIconBackground(view3, androidx.core.content.a.c(this, R.color.brand_500));
                        ActivityFixcharacterBinding activityFixcharacterBinding13 = this.binding;
                        if (activityFixcharacterBinding13 == null) {
                            qc.q.z("binding");
                        } else {
                            activityFixcharacterBinding2 = activityFixcharacterBinding13;
                        }
                        activityFixcharacterBinding2.levelIconView.setImageBitmap(HabiticaIconsHelper.imageOfRogueLightBg());
                        return;
                    }
                    return;
                case 1124565314:
                    if (habitClass.equals(Stats.WARRIOR)) {
                        ActivityFixcharacterBinding activityFixcharacterBinding14 = this.binding;
                        if (activityFixcharacterBinding14 == null) {
                            qc.q.z("binding");
                            activityFixcharacterBinding14 = null;
                        }
                        View view4 = activityFixcharacterBinding14.levelIconBackgroundView;
                        qc.q.h(view4, "levelIconBackgroundView");
                        setIconBackground(view4, androidx.core.content.a.c(this, R.color.red_500));
                        ActivityFixcharacterBinding activityFixcharacterBinding15 = this.binding;
                        if (activityFixcharacterBinding15 == null) {
                            qc.q.z("binding");
                        } else {
                            activityFixcharacterBinding2 = activityFixcharacterBinding15;
                        }
                        activityFixcharacterBinding2.levelIconView.setImageBitmap(HabiticaIconsHelper.imageOfWarriorLightBg());
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    public View getContentView(Integer num) {
        ActivityFixcharacterBinding inflate = ActivityFixcharacterBinding.inflate(getLayoutInflater());
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
        return Integer.valueOf((int) R.layout.activity_fixcharacter);
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        qc.q.z("userViewModel");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.fix_character_values);
        ActivityFixcharacterBinding activityFixcharacterBinding = this.binding;
        ActivityFixcharacterBinding activityFixcharacterBinding2 = null;
        if (activityFixcharacterBinding == null) {
            qc.q.z("binding");
            activityFixcharacterBinding = null;
        }
        setupToolbar(activityFixcharacterBinding.toolbar);
        getUserViewModel().getUser().j(this, new FixCharacterValuesActivity$sam$androidx_lifecycle_Observer$0(new FixCharacterValuesActivity$onCreate$1(this)));
        ActivityFixcharacterBinding activityFixcharacterBinding3 = this.binding;
        if (activityFixcharacterBinding3 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding3 = null;
        }
        View view = activityFixcharacterBinding3.healthIconBackgroundView;
        qc.q.h(view, "healthIconBackgroundView");
        setIconBackground(view, androidx.core.content.a.c(this, R.color.red_500));
        ActivityFixcharacterBinding activityFixcharacterBinding4 = this.binding;
        if (activityFixcharacterBinding4 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding4 = null;
        }
        View view2 = activityFixcharacterBinding4.experienceIconBackgroundView;
        qc.q.h(view2, "experienceIconBackgroundView");
        setIconBackground(view2, androidx.core.content.a.c(this, R.color.yellow_500));
        ActivityFixcharacterBinding activityFixcharacterBinding5 = this.binding;
        if (activityFixcharacterBinding5 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding5 = null;
        }
        View view3 = activityFixcharacterBinding5.manaIconBackgroundView;
        qc.q.h(view3, "manaIconBackgroundView");
        setIconBackground(view3, androidx.core.content.a.c(this, R.color.blue_500));
        ActivityFixcharacterBinding activityFixcharacterBinding6 = this.binding;
        if (activityFixcharacterBinding6 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding6 = null;
        }
        View view4 = activityFixcharacterBinding6.goldIconBackgroundView;
        qc.q.h(view4, "goldIconBackgroundView");
        setIconBackground(view4, androidx.core.content.a.c(this, R.color.yellow_500));
        ActivityFixcharacterBinding activityFixcharacterBinding7 = this.binding;
        if (activityFixcharacterBinding7 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding7 = null;
        }
        View view5 = activityFixcharacterBinding7.streakIconBackgroundView;
        qc.q.h(view5, "streakIconBackgroundView");
        setIconBackground(view5, androidx.core.content.a.c(this, R.color.separator));
        ActivityFixcharacterBinding activityFixcharacterBinding8 = this.binding;
        if (activityFixcharacterBinding8 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding8 = null;
        }
        activityFixcharacterBinding8.healthIconView.setImageBitmap(HabiticaIconsHelper.imageOfHeartLightBg());
        ActivityFixcharacterBinding activityFixcharacterBinding9 = this.binding;
        if (activityFixcharacterBinding9 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding9 = null;
        }
        activityFixcharacterBinding9.experienceIconView.setImageBitmap(HabiticaIconsHelper.imageOfExperience());
        ActivityFixcharacterBinding activityFixcharacterBinding10 = this.binding;
        if (activityFixcharacterBinding10 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding10 = null;
        }
        activityFixcharacterBinding10.manaIconView.setImageBitmap(HabiticaIconsHelper.imageOfMagic());
        ActivityFixcharacterBinding activityFixcharacterBinding11 = this.binding;
        if (activityFixcharacterBinding11 == null) {
            qc.q.z("binding");
            activityFixcharacterBinding11 = null;
        }
        activityFixcharacterBinding11.goldIconView.setImageBitmap(HabiticaIconsHelper.imageOfGold());
        ActivityFixcharacterBinding activityFixcharacterBinding12 = this.binding;
        if (activityFixcharacterBinding12 == null) {
            qc.q.z("binding");
        } else {
            activityFixcharacterBinding2 = activityFixcharacterBinding12;
        }
        activityFixcharacterBinding2.streakIconView.setImageResource(R.drawable.achievement_thermometer);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        qc.q.i(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_save, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        qc.q.i(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_save_changes) {
            HashMap hashMap = new HashMap();
            ActivityFixcharacterBinding activityFixcharacterBinding = this.binding;
            ActivityFixcharacterBinding activityFixcharacterBinding2 = null;
            if (activityFixcharacterBinding == null) {
                qc.q.z("binding");
                activityFixcharacterBinding = null;
            }
            TextInputEditText textInputEditText = activityFixcharacterBinding.healthEditText;
            qc.q.h(textInputEditText, "healthEditText");
            hashMap.put("stats.hp", Double.valueOf(getDoubleValue(textInputEditText)));
            ActivityFixcharacterBinding activityFixcharacterBinding3 = this.binding;
            if (activityFixcharacterBinding3 == null) {
                qc.q.z("binding");
                activityFixcharacterBinding3 = null;
            }
            TextInputEditText textInputEditText2 = activityFixcharacterBinding3.experienceEditText;
            qc.q.h(textInputEditText2, "experienceEditText");
            hashMap.put("stats.exp", Double.valueOf(getDoubleValue(textInputEditText2)));
            ActivityFixcharacterBinding activityFixcharacterBinding4 = this.binding;
            if (activityFixcharacterBinding4 == null) {
                qc.q.z("binding");
                activityFixcharacterBinding4 = null;
            }
            TextInputEditText textInputEditText3 = activityFixcharacterBinding4.goldEditText;
            qc.q.h(textInputEditText3, "goldEditText");
            hashMap.put("stats.gp", Double.valueOf(getDoubleValue(textInputEditText3)));
            ActivityFixcharacterBinding activityFixcharacterBinding5 = this.binding;
            if (activityFixcharacterBinding5 == null) {
                qc.q.z("binding");
                activityFixcharacterBinding5 = null;
            }
            TextInputEditText textInputEditText4 = activityFixcharacterBinding5.manaEditText;
            qc.q.h(textInputEditText4, "manaEditText");
            hashMap.put("stats.mp", Double.valueOf(getDoubleValue(textInputEditText4)));
            ActivityFixcharacterBinding activityFixcharacterBinding6 = this.binding;
            if (activityFixcharacterBinding6 == null) {
                qc.q.z("binding");
                activityFixcharacterBinding6 = null;
            }
            TextInputEditText textInputEditText5 = activityFixcharacterBinding6.levelEditText;
            qc.q.h(textInputEditText5, "levelEditText");
            hashMap.put("stats.lvl", Integer.valueOf((int) getDoubleValue(textInputEditText5)));
            ActivityFixcharacterBinding activityFixcharacterBinding7 = this.binding;
            if (activityFixcharacterBinding7 == null) {
                qc.q.z("binding");
            } else {
                activityFixcharacterBinding2 = activityFixcharacterBinding7;
            }
            TextInputEditText textInputEditText6 = activityFixcharacterBinding2.streakEditText;
            qc.q.h(textInputEditText6, "streakEditText");
            hashMap.put("achievements.streak", Integer.valueOf((int) getDoubleValue(textInputEditText6)));
            getUserViewModel().updateUser(hashMap);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        qc.q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }
}
