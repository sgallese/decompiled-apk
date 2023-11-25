package com.habitrpg.android.habitica.modules;

import android.content.Context;
import com.habitrpg.android.habitica.data.SocialRepository;
import com.habitrpg.android.habitica.data.TaskRepository;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.TaskAlarmManager;
import com.habitrpg.android.habitica.ui.viewmodels.MainUserViewModel;
import qc.q;

/* compiled from: UserModule.kt */
/* loaded from: classes4.dex */
public final class UserModule {
    public static final int $stable = 0;

    public final TaskAlarmManager providesTaskAlarmManager(Context context, TaskRepository taskRepository, AuthenticationHandler authenticationHandler) {
        q.i(context, "context");
        q.i(taskRepository, "taskRepository");
        q.i(authenticationHandler, "authenticationHandler");
        return new TaskAlarmManager(context, taskRepository, authenticationHandler);
    }

    public final MainUserViewModel providesUserViewModel(AuthenticationHandler authenticationHandler, UserRepository userRepository, SocialRepository socialRepository) {
        q.i(authenticationHandler, "authenticationHandler");
        q.i(userRepository, "userRepository");
        q.i(socialRepository, "socialRepository");
        return new MainUserViewModel(authenticationHandler, userRepository, socialRepository);
    }
}
