package com.habitrpg.android.habitica.ui.fragments.skills;

import ad.i;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.databinding.FragmentRecyclerviewBinding;
import com.habitrpg.android.habitica.models.Skill;
import com.habitrpg.android.habitica.models.responses.SkillResponse;
import com.habitrpg.android.habitica.models.user.Items;
import com.habitrpg.android.habitica.models.user.OwnedItem;
import com.habitrpg.android.habitica.models.user.Stats;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.activities.MainActivity;
import com.habitrpg.android.habitica.ui.activities.SkillMemberActivity;
import com.habitrpg.android.habitica.ui.activities.SkillTasksActivity;
import com.habitrpg.android.habitica.ui.adapter.SkillsRecyclerViewAdapter;
import com.habitrpg.android.habitica.ui.fragments.NavigationDrawerFragment;
import com.habitrpg.android.habitica.ui.helpers.RecyclerViewEmptySupport;
import com.habitrpg.android.habitica.ui.helpers.SafeDefaultItemAnimator;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import com.habitrpg.android.habitica.ui.views.HabiticaIconsHelper;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import com.habitrpg.common.habitica.helpers.ExceptionHandlerKt;
import ec.s;
import f.d;
import io.realm.x0;
import java.util.List;
import qc.q;

/* compiled from: SkillsFragment.kt */
/* loaded from: classes4.dex */
public final class SkillsFragment extends Hilt_SkillsFragment<FragmentRecyclerviewBinding> {
    public static final int $stable = 8;
    private SkillsRecyclerViewAdapter adapter;
    private FragmentRecyclerviewBinding binding;
    private final androidx.activity.result.b<Intent> memberSelectionResult;
    private Skill selectedSkill;
    private final androidx.activity.result.b<Intent> taskSelectionResult;
    public MainUserViewModel userViewModel;

    public SkillsFragment() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.skills.a
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                SkillsFragment.taskSelectionResult$lambda$1(SkillsFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult, "registerForActivityResult(...)");
        this.taskSelectionResult = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new d(), new androidx.activity.result.a() { // from class: com.habitrpg.android.habitica.ui.fragments.skills.b
            @Override // androidx.activity.result.a
            public final void a(Object obj) {
                SkillsFragment.memberSelectionResult$lambda$2(SkillsFragment.this, (ActivityResult) obj);
            }
        });
        q.h(registerForActivityResult2, "registerForActivityResult(...)");
        this.memberSelectionResult = registerForActivityResult2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUserLoadSkills(User user) {
        x0<OwnedItem> x0Var;
        int i10;
        Integer lvl;
        double d10;
        Double mp;
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter = this.adapter;
        if (skillsRecyclerViewAdapter == null) {
            return;
        }
        if (skillsRecyclerViewAdapter != null) {
            Stats stats = user.getStats();
            if (stats != null && (mp = stats.getMp()) != null) {
                d10 = mp.doubleValue();
            } else {
                d10 = 0.0d;
            }
            skillsRecyclerViewAdapter.setMana(d10);
        }
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter2 = this.adapter;
        if (skillsRecyclerViewAdapter2 != null) {
            Stats stats2 = user.getStats();
            if (stats2 != null && (lvl = stats2.getLvl()) != null) {
                i10 = lvl.intValue();
            } else {
                i10 = 0;
            }
            skillsRecyclerViewAdapter2.setLevel(i10);
        }
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter3 = this.adapter;
        if (skillsRecyclerViewAdapter3 != null) {
            Items items = user.getItems();
            if (items != null) {
                x0Var = items.getSpecial();
            } else {
                x0Var = null;
            }
            skillsRecyclerViewAdapter3.setSpecialItems(x0Var);
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SkillsFragment$checkUserLoadSkills$1(this, user, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void displaySkillResult(Skill skill, SkillResponse skillResponse) {
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        double d10;
        Stats stats;
        Double mp;
        if (!isAdded()) {
            return;
        }
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter = this.adapter;
        if (skillsRecyclerViewAdapter != null) {
            User user = skillResponse.getUser();
            if (user != null && (stats = user.getStats()) != null && (mp = stats.getMp()) != null) {
                d10 = mp.doubleValue();
            } else {
                d10 = 0.0d;
            }
            skillsRecyclerViewAdapter.setMana(d10);
        }
        MainActivity mainActivity = getMainActivity();
        if (mainActivity == null) {
            return;
        }
        if (skill != null) {
            str = skill.getHabitClass();
        } else {
            str = null;
        }
        if (q.d("special", str)) {
            HabiticaSnackbar.Companion companion = HabiticaSnackbar.Companion;
            ViewGroup snackbarContainer = mainActivity.getSnackbarContainer();
            Context context = getContext();
            if (context != null) {
                str4 = context.getString(R.string.used_skill_without_mana, skill.getText());
            } else {
                str4 = null;
            }
            companion.showSnackbar(snackbarContainer, str4, HabiticaSnackbar.SnackbarDisplayType.BLUE, (r16 & 8) != 0 ? false : false, (r16 & 16) != 0 ? false : false, (r16 & 32) != 0 ? 0 : 0);
        } else {
            Context context2 = getContext();
            if (context2 != null) {
                HabiticaSnackbar.Companion companion2 = HabiticaSnackbar.Companion;
                ViewGroup snackbarContainer2 = mainActivity.getSnackbarContainer();
                Context context3 = getContext();
                if (context3 != null) {
                    Object[] objArr = new Object[1];
                    if (skill != null) {
                        str3 = skill.getText();
                    } else {
                        str3 = null;
                    }
                    objArr[0] = str3;
                    str2 = context3.getString(R.string.used_skill_without_mana, objArr);
                } else {
                    str2 = null;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(getResources(), HabiticaIconsHelper.imageOfMagic());
                Integer valueOf = Integer.valueOf(androidx.core.content.a.c(context2, R.color.blue_10));
                if (skill != null) {
                    num = skill.getMana();
                } else {
                    num = null;
                }
                companion2.showSnackbar(snackbarContainer2, null, str2, bitmapDrawable, valueOf, "-" + num, HabiticaSnackbar.SnackbarDisplayType.BLUE, (r25 & 128) != 0 ? false : false, (r25 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : false, (r25 & 512) != 0 ? 0 : 0);
            }
        }
        if (skillResponse.getDamage() > 0.0f) {
            i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SkillsFragment$displaySkillResult$2(this, mainActivity, skillResponse, null), 2, null);
        }
        i.d(w.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new SkillsFragment$displaySkillResult$3(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void memberSelectionResult$lambda$2(SkillsFragment skillsFragment, ActivityResult activityResult) {
        String str;
        q.i(skillsFragment, "this$0");
        if (activityResult.b() == -1) {
            Skill skill = skillsFragment.selectedSkill;
            Intent a10 = activityResult.a();
            if (a10 != null) {
                str = a10.getStringExtra("member_id");
            } else {
                str = null;
            }
            skillsFragment.useSkill(skill, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSkillSelected(Skill skill) {
        if (q.d("special", skill.getHabitClass())) {
            this.selectedSkill = skill;
            this.memberSelectionResult.a(new Intent(getMainActivity(), SkillMemberActivity.class));
        } else if (q.d(skill.getTarget(), "task")) {
            this.selectedSkill = skill;
            this.taskSelectionResult.a(new Intent(getMainActivity(), SkillTasksActivity.class));
        } else {
            useSkill$default(this, skill, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void taskSelectionResult$lambda$1(SkillsFragment skillsFragment, ActivityResult activityResult) {
        String str;
        q.i(skillsFragment, "this$0");
        if (activityResult.b() == -1) {
            Skill skill = skillsFragment.selectedSkill;
            Intent a10 = activityResult.a();
            if (a10 != null) {
                str = a10.getStringExtra("taskID");
            } else {
                str = null;
            }
            skillsFragment.useSkill(skill, str);
        }
    }

    private final void useSkill(Skill skill, String str) {
        if (skill == null) {
            return;
        }
        ExceptionHandlerKt.launchCatching$default(w.a(this), null, new SkillsFragment$useSkill$1(str, this, skill, null), 1, null);
    }

    static /* synthetic */ void useSkill$default(SkillsFragment skillsFragment, Skill skill, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        skillsFragment.useSkill(skill, str);
    }

    public final SkillsRecyclerViewAdapter getAdapter$Habitica_2311256681_prodRelease() {
        return this.adapter;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseMainFragment, com.habitrpg.android.habitica.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        List<String> d10;
        q.i(layoutInflater, "inflater");
        SkillsRecyclerViewAdapter skillsRecyclerViewAdapter = new SkillsRecyclerViewAdapter();
        this.adapter = skillsRecyclerViewAdapter;
        skillsRecyclerViewAdapter.setOnUseSkill(new SkillsFragment$onCreateView$1(this));
        setTutorialStepIdentifier(NavigationDrawerFragment.SIDEBAR_SKILLS);
        String string = getString(R.string.tutorial_skills);
        q.h(string, "getString(...)");
        d10 = s.d(string);
        setTutorialTexts(d10);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerViewEmptySupport recyclerViewEmptySupport;
        RecyclerViewEmptySupport recyclerViewEmptySupport2;
        q.i(view, "view");
        super.onViewCreated(view, bundle);
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new SkillsFragment$sam$androidx_lifecycle_Observer$0(new SkillsFragment$onViewCreated$1(this)));
        FragmentRecyclerviewBinding binding = getBinding();
        RecyclerViewEmptySupport recyclerViewEmptySupport3 = null;
        if (binding != null) {
            recyclerViewEmptySupport = binding.recyclerView;
        } else {
            recyclerViewEmptySupport = null;
        }
        if (recyclerViewEmptySupport != null) {
            recyclerViewEmptySupport.setLayoutManager(new LinearLayoutManager(getMainActivity()));
        }
        FragmentRecyclerviewBinding binding2 = getBinding();
        if (binding2 != null) {
            recyclerViewEmptySupport2 = binding2.recyclerView;
        } else {
            recyclerViewEmptySupport2 = null;
        }
        if (recyclerViewEmptySupport2 != null) {
            recyclerViewEmptySupport2.setAdapter(this.adapter);
        }
        FragmentRecyclerviewBinding binding3 = getBinding();
        if (binding3 != null) {
            recyclerViewEmptySupport3 = binding3.recyclerView;
        }
        if (recyclerViewEmptySupport3 != null) {
            recyclerViewEmptySupport3.setItemAnimator(new SafeDefaultItemAnimator());
        }
    }

    public final void setAdapter$Habitica_2311256681_prodRelease(SkillsRecyclerViewAdapter skillsRecyclerViewAdapter) {
        this.adapter = skillsRecyclerViewAdapter;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRecyclerviewBinding createBinding(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q.i(layoutInflater, "inflater");
        FragmentRecyclerviewBinding inflate = FragmentRecyclerviewBinding.inflate(layoutInflater, viewGroup, false);
        q.h(inflate, "inflate(...)");
        return inflate;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public FragmentRecyclerviewBinding getBinding() {
        return this.binding;
    }

    @Override // com.habitrpg.android.habitica.ui.fragments.BaseFragment
    public void setBinding(FragmentRecyclerviewBinding fragmentRecyclerviewBinding) {
        this.binding = fragmentRecyclerviewBinding;
    }
}
