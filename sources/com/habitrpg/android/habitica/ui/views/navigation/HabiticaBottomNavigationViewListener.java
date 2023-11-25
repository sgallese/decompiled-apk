package com.habitrpg.android.habitica.ui.views.navigation;

import com.habitrpg.shared.habitica.models.tasks.TaskType;

/* compiled from: HabiticaBottomNavigationView.kt */
/* loaded from: classes4.dex */
public interface HabiticaBottomNavigationViewListener {
    void onAdd(TaskType taskType);

    void onTabSelected(TaskType taskType, boolean z10);
}
