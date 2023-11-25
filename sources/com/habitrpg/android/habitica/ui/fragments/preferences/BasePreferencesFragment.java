package com.habitrpg.android.habitica.ui.fragments.preferences;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.habitrpg.android.habitica.R;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import qc.q;

/* compiled from: BasePreferencesFragment.kt */
/* loaded from: classes4.dex */
public abstract class BasePreferencesFragment extends androidx.preference.h {
    public static final int $stable = 8;
    private User user;
    public UserRepository userRepository;
    public MainUserViewModel userViewModel;

    public User getUser$Habitica_2311256681_prodRelease() {
        return this.user;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public final MainUserViewModel getUserViewModel() {
        MainUserViewModel mainUserViewModel = this.userViewModel;
        if (mainUserViewModel != null) {
            return mainUserViewModel;
        }
        q.z("userViewModel");
        return null;
    }

    @Override // androidx.preference.h
    public void onCreatePreferences(Bundle bundle, String str) {
        setPreferencesFromResource(R.xml.preferences_fragment, str);
        setupPreferences();
    }

    @Override // androidx.preference.h, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        q.i(layoutInflater, "inflater");
        getUserViewModel().getUser().j(getViewLifecycleOwner(), new BasePreferencesFragment$sam$androidx_lifecycle_Observer$0(new BasePreferencesFragment$onCreateView$1(this)));
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        q.h(onCreateView, "onCreateView(...)");
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getUserRepository().close();
        super.onDestroy();
    }

    public void setUser(User user) {
        setUser$Habitica_2311256681_prodRelease(user);
    }

    public void setUser$Habitica_2311256681_prodRelease(User user) {
        this.user = user;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    public final void setUserViewModel(MainUserViewModel mainUserViewModel) {
        q.i(mainUserViewModel, "<set-?>");
        this.userViewModel = mainUserViewModel;
    }

    protected abstract void setupPreferences();
}
