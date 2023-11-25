package com.habitrpg.android.habitica.ui.viewmodels;

import ad.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.common.habitica.helpers.ExceptionHandler;
import dc.f;
import dc.h;
import qc.q;

/* compiled from: BaseViewModel.kt */
/* loaded from: classes4.dex */
public abstract class BaseViewModel extends v0 {
    public static final int $stable = 8;
    private final f user$delegate;
    private final UserRepository userRepository;
    private final MainUserViewModel userViewModel;

    public BaseViewModel(UserRepository userRepository, MainUserViewModel mainUserViewModel) {
        f b10;
        q.i(userRepository, "userRepository");
        q.i(mainUserViewModel, "userViewModel");
        this.userRepository = userRepository;
        this.userViewModel = mainUserViewModel;
        b10 = h.b(new BaseViewModel$user$2(this));
        this.user$delegate = b10;
    }

    public final LiveData<User> getUser() {
        return (LiveData) this.user$delegate.getValue();
    }

    public final UserRepository getUserRepository() {
        return this.userRepository;
    }

    public final MainUserViewModel getUserViewModel() {
        return this.userViewModel;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.v0
    public void onCleared() {
        this.userRepository.close();
        super.onCleared();
    }

    public final void updateUser(String str, Object obj) {
        q.i(str, "path");
        q.i(obj, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        i.d(w0.a(this), ExceptionHandler.Companion.coroutine$default(ExceptionHandler.Companion, null, 1, null), null, new BaseViewModel$updateUser$1(this, str, obj, null), 2, null);
    }
}
