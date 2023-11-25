package com.habitrpg.android.habitica.ui.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.PreferenceScreen;
import androidx.preference.h;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.ui.fragments.preferences.AccountPreferenceFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.EmailNotificationsPreferencesFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.PreferencesFragment;
import com.habitrpg.android.habitica.ui.fragments.preferences.PushNotificationsPreferencesFragment;
import com.habitrpg.android.habitica.ui.views.HabiticaSnackbar;
import com.habitrpg.android.habitica.ui.views.SnackbarActivity;

/* compiled from: PrefsActivity.kt */
/* loaded from: classes4.dex */
public final class PrefsActivity extends Hilt_PrefsActivity implements h.g, SnackbarActivity {
    public static final int $stable = 0;

    private final androidx.preference.h createNextPage(PreferenceScreen preferenceScreen) {
        String key = preferenceScreen.getKey();
        if (key != null) {
            int hashCode = key.hashCode();
            if (hashCode != -48500754) {
                if (hashCode != -30656852) {
                    if (hashCode == 1577112218 && key.equals("my_account")) {
                        return new AccountPreferenceFragment();
                    }
                } else if (key.equals("emailNotifications")) {
                    return new EmailNotificationsPreferencesFragment();
                }
            } else if (key.equals("pushNotifications")) {
                return new PushNotificationsPreferencesFragment();
            }
        }
        return null;
    }

    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity
    protected Integer getLayoutResId() {
        return Integer.valueOf((int) R.layout.activity_prefs);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.habitrpg.android.habitica.ui.activities.BaseActivity, androidx.fragment.app.q, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setupToolbar((Toolbar) findViewById(R.id.toolbar));
        getSupportFragmentManager().q().s(R.id.fragment_container, new PreferencesFragment()).j();
    }

    @Override // androidx.preference.h.g
    public boolean onPreferenceStartScreen(androidx.preference.h hVar, PreferenceScreen preferenceScreen) {
        qc.q.i(hVar, "preferenceFragment");
        qc.q.i(preferenceScreen, "preferenceScreen");
        androidx.preference.h createNextPage = createNextPage(preferenceScreen);
        if (createNextPage != null) {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.preference.h.ARG_PREFERENCE_ROOT, preferenceScreen.getKey());
            createNextPage.setArguments(bundle);
            getSupportFragmentManager().q().s(R.id.fragment_container, createNextPage).h(null).j();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        if (getSupportFragmentManager().r0() > 0) {
            onBackPressed();
            return true;
        }
        return super.onSupportNavigateUp();
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public void showSnackbar(Drawable drawable, CharSequence charSequence, CharSequence charSequence2, View view, Drawable drawable2, Integer num, String str, HabiticaSnackbar.SnackbarDisplayType snackbarDisplayType, boolean z10) {
        SnackbarActivity.DefaultImpls.showSnackbar(this, drawable, charSequence, charSequence2, view, drawable2, num, str, snackbarDisplayType, z10);
    }

    @Override // com.habitrpg.android.habitica.ui.views.SnackbarActivity
    public ViewGroup snackbarContainer() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.snackbar_container);
        qc.q.f(viewGroup);
        return viewGroup;
    }
}
