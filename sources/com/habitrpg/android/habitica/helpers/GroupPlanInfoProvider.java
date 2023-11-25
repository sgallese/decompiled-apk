package com.habitrpg.android.habitica.helpers;

import android.content.res.Resources;
import com.habitrpg.android.habitica.models.tasks.Task;
import java.util.List;
import kotlin.coroutines.Continuation;

/* compiled from: GroupPlanInfoProvider.kt */
/* loaded from: classes4.dex */
public interface GroupPlanInfoProvider {
    String assignedTextForTask(Resources resources, List<String> list);

    Object canAddTasks(Continuation<? super Boolean> continuation);

    Object canEditTask(Task task, Continuation<? super Boolean> continuation);

    boolean canScoreTask(Task task);
}
