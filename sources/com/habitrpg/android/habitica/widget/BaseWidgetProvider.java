package com.habitrpg.android.habitica.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.habitrpg.android.habitica.data.UserRepository;
import com.habitrpg.android.habitica.helpers.Analytics;
import com.habitrpg.android.habitica.helpers.EventCategory;
import com.habitrpg.android.habitica.helpers.HitType;
import com.habitrpg.android.habitica.interactors.NotifyUserUseCase;
import com.habitrpg.shared.habitica.models.responses.TaskScoringResult;
import java.util.HashMap;
import qc.q;

/* compiled from: BaseWidgetProvider.kt */
/* loaded from: classes4.dex */
public abstract class BaseWidgetProvider extends AppWidgetProvider {
    public static final int $stable = 8;
    private Context context;
    public UserRepository userRepository;

    private final int getCellsForSize(int i10) {
        int i11 = 2;
        while ((i11 * 70) - 30 < i10) {
            i11++;
        }
        return i11 - 1;
    }

    public abstract RemoteViews configureRemoteViews(RemoteViews remoteViews, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Context getContext() {
        return this.context;
    }

    public final UserRepository getUserRepository() {
        UserRepository userRepository = this.userRepository;
        if (userRepository != null) {
            return userRepository;
        }
        q.z("userRepository");
        return null;
    }

    public abstract int layoutResourceId();

    @Override // android.appwidget.AppWidgetProvider
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        q.i(context, "context");
        q.i(appWidgetManager, "appWidgetManager");
        q.i(bundle, "newOptions");
        this.context = context;
        Bundle appWidgetOptions = appWidgetManager.getAppWidgetOptions(i10);
        q.f(appWidgetOptions);
        appWidgetManager.partiallyUpdateAppWidget(i10, sizeRemoteViews(context, appWidgetOptions, i10));
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDeleted(Context context, int[] iArr) {
        q.i(context, "context");
        q.i(iArr, "appWidgetIds");
        HashMap hashMap = new HashMap();
        String simpleName = getClass().getSimpleName();
        q.h(simpleName, "getSimpleName(...)");
        hashMap.put("identifier", simpleName);
        Analytics.sendEvent$default(Analytics.INSTANCE, "widgets", EventCategory.BEHAVIOUR, HitType.REMOVE_WIDGET, hashMap, null, 16, null);
        super.onDeleted(context, iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        q.i(context, "context");
        super.onEnabled(context);
        HashMap hashMap = new HashMap();
        String simpleName = getClass().getSimpleName();
        q.h(simpleName, "getSimpleName(...)");
        hashMap.put("identifier", simpleName);
        Analytics.sendEvent$default(Analytics.INSTANCE, "widgets", EventCategory.BEHAVIOUR, HitType.CREATE_WIDGET, hashMap, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setUserRepository(UserRepository userRepository) {
        q.i(userRepository, "<set-?>");
        this.userRepository = userRepository;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void showToastForTaskDirection(Context context, TaskScoringResult taskScoringResult) {
        q.i(context, "context");
        if (taskScoringResult != null) {
            Toast.makeText(context, NotifyUserUseCase.Companion.getNotificationAndAddStatsToUserAsText(Double.valueOf(taskScoringResult.getExperienceDelta()), Double.valueOf(taskScoringResult.getHealthDelta()), Double.valueOf(taskScoringResult.getGoldDelta()), Double.valueOf(taskScoringResult.getManaDelta())).f4048a, 1).show();
        }
    }

    public final RemoteViews sizeRemoteViews(Context context, Bundle bundle, int i10) {
        String str;
        q.i(bundle, "options");
        this.context = context;
        int i11 = bundle.getInt("appWidgetMinWidth");
        int cellsForSize = getCellsForSize(bundle.getInt("appWidgetMinHeight"));
        int cellsForSize2 = getCellsForSize(i11);
        if (context != null) {
            str = context.getPackageName();
        } else {
            str = null;
        }
        return configureRemoteViews(new RemoteViews(str, layoutResourceId()), i10, cellsForSize2, cellsForSize);
    }
}
