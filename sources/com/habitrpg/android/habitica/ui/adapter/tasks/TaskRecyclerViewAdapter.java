package com.habitrpg.android.habitica.ui.adapter.tasks;

import android.view.View;
import com.habitrpg.android.habitica.models.tasks.ChecklistItem;
import com.habitrpg.android.habitica.models.tasks.Task;
import com.habitrpg.android.habitica.models.user.User;
import com.habitrpg.shared.habitica.models.responses.TaskDirection;
import dc.w;
import java.util.List;
import pc.l;
import pc.p;

/* compiled from: TaskRecyclerViewAdapter.kt */
/* loaded from: classes4.dex */
public interface TaskRecyclerViewAdapter {
    void filter();

    l<Boolean, w> getAdventureGuideOpenEvents();

    l<Task, w> getBrokenTaskEvents();

    p<Task, ChecklistItem, w> getChecklistItemScoreEvents();

    List<Task> getData();

    l<String, w> getErrorButtonEvents();

    int getItemViewType(int i10);

    boolean getShowAdventureGuide();

    String getTaskDisplayMode();

    p<Task, View, w> getTaskOpenEvents();

    p<Task, TaskDirection, w> getTaskScoreEvents();

    User getUser();

    void notifyDataSetChanged();

    void notifyItemMoved(int i10, int i11);

    void setAdventureGuideOpenEvents(l<? super Boolean, w> lVar);

    void setBrokenTaskEvents(l<? super Task, w> lVar);

    void setChecklistItemScoreEvents(p<? super Task, ? super ChecklistItem, w> pVar);

    void setData(List<? extends Task> list);

    void setErrorButtonEvents(l<? super String, w> lVar);

    void setShowAdventureGuide(boolean z10);

    void setTaskDisplayMode(String str);

    void setTaskOpenEvents(p<? super Task, ? super View, w> pVar);

    void setTaskScoreEvents(p<? super Task, ? super TaskDirection, w> pVar);

    void setUser(User user);

    void updateUnfilteredData(List<? extends Task> list);
}
