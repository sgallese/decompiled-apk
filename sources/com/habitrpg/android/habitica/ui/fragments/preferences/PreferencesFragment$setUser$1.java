package com.habitrpg.android.habitica.ui.fragments.preferences;

import ad.k0;
import android.content.Context;
import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.models.TeamPlan;
import com.habitrpg.android.habitica.models.user.Preferences;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.models.user.UserTaskPreferences;
import dc.n;
import dc.w;
import io.realm.x0;
import java.util.List;
import kotlin.coroutines.Continuation;
import pc.p;

/* compiled from: PreferencesFragment.kt */
@kotlin.coroutines.jvm.internal.f(c = "com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$setUser$1", f = "PreferencesFragment.kt", l = {503}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class PreferencesFragment$setUser$1 extends kotlin.coroutines.jvm.internal.l implements p<k0, Continuation<? super w>, Object> {
    final /* synthetic */ User $user;
    int label;
    final /* synthetic */ PreferencesFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferencesFragment$setUser$1(PreferencesFragment preferencesFragment, User user, Continuation<? super PreferencesFragment$setUser$1> continuation) {
        super(2, continuation);
        this.this$0 = preferencesFragment;
        this.$user = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        r0 = ec.b0.F0(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean invokeSuspend$lambda$0(com.habitrpg.android.habitica.models.user.User r0, com.habitrpg.android.habitica.models.TeamPlan r1, com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment r2, androidx.preference.Preference r3, java.lang.Object r4) {
        /*
            if (r0 == 0) goto L1a
            com.habitrpg.android.habitica.models.user.Preferences r0 = r0.getPreferences()
            if (r0 == 0) goto L1a
            com.habitrpg.android.habitica.models.user.UserTaskPreferences r0 = r0.getTasks()
            if (r0 == 0) goto L1a
            io.realm.x0 r0 = r0.getMirrorGroupTasks()
            if (r0 == 0) goto L1a
            java.util.List r0 = ec.r.F0(r0)
            if (r0 != 0) goto L1f
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L1f:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = qc.q.d(r4, r3)
            if (r3 == 0) goto L39
            java.lang.String r3 = r1.getId()
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L39
            java.lang.String r1 = r1.getId()
            r0.add(r1)
            goto L52
        L39:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = qc.q.d(r4, r3)
            if (r3 == 0) goto L52
            java.lang.String r3 = r1.getId()
            boolean r3 = r0.contains(r3)
            if (r3 == 0) goto L52
            java.lang.String r1 = r1.getId()
            r0.remove(r1)
        L52:
            androidx.lifecycle.q r1 = androidx.lifecycle.w.a(r2)
            com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$setUser$1$1$1 r3 = new com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$setUser$1$1$1
            r4 = 0
            r3.<init>(r2, r0, r4)
            r0 = 1
            com.habitrpg.common.habitica.helpers.ExceptionHandlerKt.launchCatching$default(r1, r4, r3, r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment$setUser$1.invokeSuspend$lambda$0(com.habitrpg.android.habitica.models.user.User, com.habitrpg.android.habitica.models.TeamPlan, com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment, androidx.preference.Preference, java.lang.Object):boolean");
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation<w> create(Object obj, Continuation<?> continuation) {
        return new PreferencesFragment$setUser$1(this.this$0, this.$user, continuation);
    }

    @Override // pc.p
    public final Object invoke(k0 k0Var, Continuation<? super w> continuation) {
        return ((PreferencesFragment$setUser$1) create(k0Var, continuation)).invokeSuspend(w.f13270a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d10;
        Preference preference;
        boolean z10;
        Preferences preferences;
        UserTaskPreferences tasks;
        x0<String> mirrorGroupTasks;
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
            dd.g<List<TeamPlan>> teamPlans = this.this$0.getUserRepository().getTeamPlans();
            this.label = 1;
            obj = dd.i.x(teamPlans, this);
            if (obj == d10) {
                return d10;
            }
        }
        List<TeamPlan> list = (List) obj;
        if (list == null) {
            return w.f13270a;
        }
        Context context = this.this$0.getContext();
        if (context == null) {
            return w.f13270a;
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) this.this$0.findPreference("groups_category");
        if (preferenceCategory != null) {
            preference = preferenceCategory.f("groups_footer");
        } else {
            preference = null;
        }
        if (preference != null) {
            preference.setOrder(9999);
        }
        if (preferenceCategory != null) {
            preferenceCategory.n();
        }
        if (list.isEmpty()) {
            if (preferenceCategory != null) {
                preferenceCategory.setVisible(false);
            }
        } else {
            if (preferenceCategory != null) {
                preferenceCategory.setVisible(true);
            }
            for (final TeamPlan teamPlan : list) {
                CheckBoxPreference checkBoxPreference = new CheckBoxPreference(context);
                checkBoxPreference.setLayoutResource(R.layout.preference_child_summary);
                checkBoxPreference.setTitle(this.this$0.getString(R.string.copy_shared_tasks));
                checkBoxPreference.setSummary(teamPlan.getSummary());
                checkBoxPreference.setKey("copy_tasks-" + teamPlan.getId());
                final User user = this.$user;
                final PreferencesFragment preferencesFragment = this.this$0;
                checkBoxPreference.setOnPreferenceChangeListener(new Preference.c() { // from class: com.habitrpg.android.habitica.ui.fragments.preferences.i
                    @Override // androidx.preference.Preference.c
                    public final boolean a(Preference preference2, Object obj2) {
                        boolean invokeSuspend$lambda$0;
                        invokeSuspend$lambda$0 = PreferencesFragment$setUser$1.invokeSuspend$lambda$0(User.this, teamPlan, preferencesFragment, preference2, obj2);
                        return invokeSuspend$lambda$0;
                    }
                });
                if (preferenceCategory != null) {
                    kotlin.coroutines.jvm.internal.b.a(preferenceCategory.d(checkBoxPreference));
                }
                User user2 = this.$user;
                if (user2 != null && (preferences = user2.getPreferences()) != null && (tasks = preferences.getTasks()) != null && (mirrorGroupTasks = tasks.getMirrorGroupTasks()) != null && mirrorGroupTasks.contains(teamPlan.getId())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                checkBoxPreference.d(z10);
            }
        }
        if (preference != null) {
            preferenceCategory.d(preference);
        }
        return w.f13270a;
    }
}
